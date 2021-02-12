package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Admin;
import com.example.model.Feedback;
import com.example.model.User;
import com.example.model.UserBooking;
import com.example.model.Vehicle;
import com.example.model.Vendor;
import com.example.service.AdminService;
import com.example.service.UserBookingService;
import com.example.service.UserFeedbackService;
import com.example.service.UserService;
import com.example.service.VehicleService;
import com.example.service.VendorService;

@Controller
public class AppController {

	@Autowired
	UserService userService;
	
	@Autowired
	VendorService vendorService;
	
	@Autowired
	AdminService adminService;
	
	@Autowired
	VehicleService vehicleService;
	
	@Autowired
	UserBookingService userBookingService;
	
	@Autowired
	UserFeedbackService userFeedbackService;
	
	User userLogin;
	Vendor vendorLogin;
	
	
	//User Controller
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showWelcomePageUser(ModelMap model)
	{
		return "WelcomeUser";
	}

	@RequestMapping(value = "/userregister", method = RequestMethod.GET) 
	public String showUserRegister() 
	{ 
		return "User_Registration"; 
	}
	 
	@PostMapping("/userregister")
	public String showUserRegistrationPage(@ModelAttribute User user)
	{
		userService.addUser(user);
		return "WelcomeUser";
	}

	@RequestMapping(value = "/userlogin", method = RequestMethod.GET)
	public ModelAndView showUserLogin() 
	{
		ModelAndView model = new ModelAndView();
		model.setViewName("User_Login");
		return model;
	}
	
	@RequestMapping(value="/userlogin", method = RequestMethod.POST)
	public ModelAndView userloginValidate(@ModelAttribute User user,Vehicle vehicle, ModelAndView model)
	{
		userLogin = userService.loginUsers(user);
		System.out.println(userLogin);
		
		if(null!=userLogin)
		{
			model.setViewName("UserMainPage");
			
		}
			else
		{
			model = new ModelAndView("User_Login");
			model.addObject("errorMessage", "Incorrect Username or Password");
		}
		return model;
			
	}
	
	@RequestMapping(value="/feedback",method = RequestMethod.GET)
	public ModelAndView getFeedbackPage(ModelAndView model)
	{
		List<UserBooking> listVehicle = userBookingService.getAllAvailableVehicles(userLogin);
		model.addObject("listVehicle", listVehicle);
	    model.setViewName("FeedbackPage");
		return model;
	}
	
	@PostMapping("/postfeedback") 
	public String postFeedback(Feedback feedBack)
	{
		userFeedbackService.addFeedback(feedBack,userLogin);
		return "UserMainPage";
	}
	 
	@RequestMapping("/bookvehicle")
	public ModelAndView getAllAvailableVehicles(@ModelAttribute Vehicle vehicle,HttpServletRequest request,ModelAndView model)
	{
		List<Vehicle> vehicles = userService.getAllAvailableVehicles(vehicle);
		System.out.println(vehicles.size());
		if(null!=vehicles) 
		{
			model.addObject("vehicles", vehicles);
			model.setViewName("UserBookVehicle");
		}
		return model;
			  
	}
	
	@RequestMapping("/bookingdetails/{vehicleName}/{vendorName}/{vehiclePrice}")
	public String userBookingDetails(@PathVariable String vehicleName,@PathVariable String vendorName,@PathVariable String vehiclePrice, Vehicle vehicle)
	{
		userBookingService.addBookingDetails(vehicle,userLogin);
		return "WelcomeUser";
	}
	
	@RequestMapping("/logoutUser")
	public String logoutUser()
	{
		userLogin=null;
		return "WelcomeUser";
	}
	
	@RequestMapping("/contactus")
	public String contactUsUser()
	{
		return "ContactUs";
	}
	
	@RequestMapping("/aboutus")
	public String aboutUsUser()
	{
		return "AboutUs";
	}
	
	
	//Vendor Controller
	@RequestMapping(value = "/vendor", method = RequestMethod.GET)
	public String showWelcomePageVendor(ModelMap model)
	{
		return "WelcomeVendor";
	}
	@RequestMapping(value = "/vendorregister", method = RequestMethod.GET) 
	public String showVendorRegister() 
	{ 
		return "Vendor_Registration"; 
	}
	 
	@PostMapping("/vendorregister")
	public String showVendorRegistrationPage(@ModelAttribute Vendor vendor) 
	{
		vendorService.addVendor(vendor);
		return "WelcomeVendor";
	}

	@RequestMapping(value = "/vendorlogin", method = RequestMethod.GET)
	public ModelAndView showVendorLogin() 
	{
		ModelAndView model = new ModelAndView();
		model.setViewName("Vendor_Login");
		return model;
	}
	
	@RequestMapping("/vendorlogin")
	public ModelAndView vendorloginValidate(@ModelAttribute Vendor vendor,HttpServletRequest request,HttpServletResponse response)
	{
		ModelAndView mv = null;
		vendorLogin = vendorService.loginVendors(vendor);
		if(null!=vendorLogin)
		{
			mv = new ModelAndView("VendorMainPage");
		}
			else
		{
			mv = new ModelAndView("Vendor_Login");
			mv.addObject("errorMessage", "Incorrect Name or Password");
		}
		return mv;
	}
	
	@RequestMapping(value = "/addvehicledetails", method = RequestMethod.GET) 
	public String showVehicleRegister() 
	{ 
		return "AddVehicles"; 
	}
	
	@PostMapping("/addvehicledetails")
	public String showVehicleRegistrationPage(@ModelAttribute Vehicle vehicle,ModelAndView model) 
	{
		vehicleService.addVehicle(vehicle);
		return "VendorMainPage";
	} 
	
	@RequestMapping("/showvehicles")
	public ModelAndView showAllAvailableVehicles(@ModelAttribute Vendor vendor,HttpServletRequest request,ModelAndView model)
	{
		List<Vehicle> listVehicle = vehicleService.getAllVehicles(vendorLogin);
		if(null!=listVehicle) 
		{
			model.addObject("listVehicle", listVehicle);
			model.setViewName("ListofVehicles");
			return model;
		}
		else
		{
			model.setViewName("VendorMainPage");
			return model;
		}
			  
	}
	
	@RequestMapping(value="/deletevehicle/{vehicleName}",method = RequestMethod.GET) 
	public String deleteVehicleDetails(@PathVariable String vehicleName)
	{
		vehicleService.deleteVehicle(vehicleName);
		return "VendorMainPage";
	}
	
	@RequestMapping(value="/editvehicle/{vehicleName}",method = RequestMethod.GET) 
    public String edit(@PathVariable String vehicleName,ModelAndView model, @ModelAttribute("vehicle") Vehicle vehicle)
	{    
		List<Vehicle> vehicles = vehicleService.getVehicleByName(vehicleName);
		model.addObject("vehicle", vehicles);
        return "update_vehicle_details";
	}
	
    @RequestMapping(value="/update",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute("vehicle") Vehicle vehicle) 
    {
    	 vehicleService.updation(vehicle);
    	 return "VendorMainPage";
        
    }    
    
    @RequestMapping("/viewbookingdetailsVendor")
	public ModelAndView showAllBookingsVendor(@ModelAttribute Vendor vendor,HttpServletRequest request,ModelAndView model)
	{
		List<UserBooking> bookings = vendorService.showAllUserBookings(vendorLogin);
		System.out.println(bookings.size());
		model.addObject("bookings", bookings);
		model.setViewName("ListOfBookingsVendor");
		return model;
	}
    
    @RequestMapping("/logoutVendor")
	public String logoutVendor()
	{
		vendorLogin=null;
		return "WelcomeVendor";
	}
    
    @RequestMapping("/contactusvendor")
	public String contactUsVendor()
	{
		return "ContactUs";
	}
	
	
	//Admin Controller
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String showWelcomePageAdmin(ModelMap model)
	{
		return "WelcomeAdmin";
	}
    @RequestMapping(value = "/adminregister", method = RequestMethod.GET) 
	public String showAdminRegister() 
	{ 
		return "Admin_Registration"; 
	}
	 
	@PostMapping("/adminregister")
	public String showAdminRegistrationPage(@ModelAttribute Admin admin) 
	{
		adminService.addAdmin(admin);
		return "WelcomeAdmin";
	}

	@RequestMapping(value = "/adminlogin", method = RequestMethod.GET)
	public ModelAndView showAdminLogin() 
	{
		ModelAndView model = new ModelAndView();
		model.setViewName("Admin_Login");
		return model;
	}
	
	@RequestMapping(value="/adminlogin", method = RequestMethod.POST)
	public ModelAndView adminloginValidate(@ModelAttribute Admin admin,HttpServletRequest request,HttpServletResponse response)
	{
		ModelAndView mv = null;
		Admin admin1 = adminService.loginAdmins(admin);
		if(null!=admin1)
		{
			mv = new ModelAndView("AdminMainPage");
		}
			else
		{
			mv = new ModelAndView("Admin_Login");
			mv.addObject("errorMessage", "wrong creds");
		}
		return mv;
			
	}
	
	@RequestMapping("/showusers")
	public ModelAndView showAllUsersAdmin(@ModelAttribute User user,HttpServletRequest request,ModelAndView model)
	{
		List<User> users = adminService.showAllUsers(user);
		model.addObject("users", users);
		model.setViewName("ListOfUsers");

		return model;
		
	}
	
	@RequestMapping("/showvendors")
	public ModelAndView showAllVendorsAdmin(@ModelAttribute Vendor vendor,HttpServletRequest request,ModelAndView model)
	{
		List<Vendor> vendors = adminService.showAllVendors(vendor);
		model.addObject("vendors", vendors);
		model.setViewName("ListOfVendors");

		return model;
		
	}
	
	@RequestMapping(value="/deletevendor/{vendorName}",method = RequestMethod.GET) 
	public String deleteVendorDetailsAdmin(@PathVariable String vendorName)
	{
		adminService.deleteVendor(vendorName);
		return "AdminMainPage";
	}
	
	@RequestMapping("/showallvehicles")
	public ModelAndView showAllVehiclesAdmin(@ModelAttribute Vehicle vehicle,HttpServletRequest request,ModelAndView model)
	{
		List<Vehicle> vehicles = adminService.showAllVehicles(vehicle);
		model.addObject("vehicles", vehicles);
		model.setViewName("AllVehicles");

		return model;
		
	}
	
	@RequestMapping(value="/deletevehicles/{vehicleName}",method = RequestMethod.GET) 
	public String deleteVehicleDetailsAdmin(@PathVariable String vehicleName)
	{
		adminService.deleteVehicle(vehicleName);
		return "AdminMainPage";
	}
	
	@RequestMapping(value = "/addvendor", method = RequestMethod.GET) 
	public String showVendorRegisterAdmin() 
	{ 
		return "Vendor_Registration"; 
	}
	 
	@PostMapping("/addvendor")
	public String showVendorRegistrationPageAdmin(@ModelAttribute Vendor vendor) 
	{
		vendorService.addVendor(vendor);
		return "AdminMainPage";
	}
	
	@RequestMapping(value = "/addvehicle", method = RequestMethod.GET) 
	public String showVehicleRegisterAdmin() 
	{ 
		return "AddVehicleDetailsAdmin"; 
	}
	 
	@PostMapping("/addvehicle")
	public String showVehicleRegistrationPageAdmin(@ModelAttribute Vehicle vehicle) 
	{
		vehicleService.addVehicle(vehicle);
		return "AdminMainPage";
	}
	
	@RequestMapping("/viewbookingdetails")
	public ModelAndView showAllBookingsAdmin(@ModelAttribute UserBooking userBooking,HttpServletRequest request,ModelAndView model)
	{
		List<UserBooking> bookings = adminService.showAllUserBookings(userBooking);
		//System.out.println(bookings.get(0));
		model.addObject("bookings", bookings);
		model.setViewName("ListOfBookings");
		return model;
	}
	
	@RequestMapping("/viewuserfeedback")
	public ModelAndView showAllFeedbacksAdmin(@ModelAttribute Feedback feedBack,HttpServletRequest request,ModelAndView model)
	{
		List<Feedback> feedbacks = adminService.showAllUserFeedbacks(feedBack);
		model.addObject("feedbacks", feedbacks);
		model.setViewName("ListOfFeedbacks");
		return model;
	}
	
	@RequestMapping(value="/editvendor/{vendorName}",method = RequestMethod.GET) 
    public String editVendorAdmin(@PathVariable String vendorName,ModelAndView model, @ModelAttribute("vendor") Vendor vendor)
	{    
		List<Vendor> vendors = adminService.getVendorByName(vendorName);
		model.addObject("vendors", vendors);
        return "UpdateVendorDetailsAdmin";
	}
	
    @RequestMapping(value="/updateVendor",method = RequestMethod.POST)    
    public String editSaveVendorAdmin(@ModelAttribute("vendor") Vendor vendor) 
    {
    	 System.out.println(vendor.getVendorName());
    	 adminService.updateVendor(vendor);
    	 System.out.println(vendor.getEmailId());
    	 return "AdminMainPage";
        
    }  
    
    @RequestMapping(value="/editvehicles/{vehicleName}",method = RequestMethod.GET) 
    public String editVehicleAdmin(@PathVariable String vehicleName,ModelAndView model, @ModelAttribute("vehicle") Vehicle vehicle)
	{    
		List<Vehicle> vehicles = vehicleService.getVehicleByName(vehicleName);
		model.addObject("vehicle", vehicles);
        return "UpdateVehicleDetailsAdmin";
	}
	
    @RequestMapping(value="/updateVehicle",method = RequestMethod.POST)    
    public String editsaveVehicleAdmin(@ModelAttribute("vehicle") Vehicle vehicle) 
    {
    	 vehicleService.updation(vehicle);
    	 return "AdminMainPage";
        
    }    
    
    @RequestMapping("/logoutAdmin")
	public String logoutAdmin()
	{
		return "WelcomeAdmin";
	}
	
}
