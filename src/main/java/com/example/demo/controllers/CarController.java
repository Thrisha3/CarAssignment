package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.example.demo.model.Car;

import com.example.demo.repository.CarRepository;

@Controller
public class CarController {
	
	@Autowired
	private Car car;
	
	@Autowired
	private CarRepository repo;

	
	
	@ModelAttribute("carStatus")
	public String[] carStatus() {
		return new String[] {"sold","unsold","blocked"};
		
	}
	
	@ModelAttribute("models")
	public String[] models() {
		return new String[] {"Innova","swift","Ertiga",Zen,Scorpio,Santro};
		
	}
	@RequestMapping(value="/cars",method=RequestMethod.GET)
	public String initForm(Model model1) {
		model1.addAttribute("command", car);
		return "sellCar";
	}
	

	@RequestMapping(value="/cars",method=RequestMethod.POST)
	public String submitForm(@ModelAttribute("command") Car car,Model model1) {
		//System.out.println(customer);
		int rowAdded= repo.sellCar(car);	
		model1.addAttribute("rowAdded",rowAdded);
		return "sellCar";
	} 
	
	@RequestMapping(value="/cars/all",method=RequestMethod.GET)
	public String findAllCars(Model model1) {
		List<Car> list = repo.getAllCars();
		//System.out.println(list);
		model1.addAttribute("list",list);
		return "viewCars";
	}
	
	
	
	@RequestMapping(value="/cars/all/sale",method=RequestMethod.GET)
	public String findCarsSale(Model model1) {
		List<Car> list1 = repo.getCarsForSale();
		//System.out.println(list1);
		model1.addAttribute("list1",list1);
		return "viewCars";
	}
	
	@ModelAttribute("models")
	public String[] allmodels(){
		String[] allmodels = repo.getModel();
	
		return allmodels;

	}
	
	@RequestMapping(value="/cars/model",method=RequestMethod.GET)
	public String modelForm(Model model1)
	{
		model1.addAttribute("command",car);
		return "modelCars";
	}
	
   
	
	@RequestMapping(value="/cars/model", method=RequestMethod.POST)
	public String findCarsByModel(@ModelAttribute("command") @RequestParam("mode")String model, Model model1)
	
	{
		List<Car> list2 = repo.getCarsByModel(model);
		model1.addAttribute("list2",list2);
		return "viewCarsModel";
	}
	
}
