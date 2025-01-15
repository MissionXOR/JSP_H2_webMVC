package com.JspH2webMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.JspH2webMVC.entity.product;
import com.JspH2webMVC.repo.productRepository;

@Controller
public class controller {

	@Autowired
	productRepository repository;
	
	@GetMapping("/")
	public String loadindex(Model model) {
		
		product p=new product();
		
		model.addAttribute("product", p);
		return "index";
	}
	
	@PostMapping("/save")
	public String handlesave(product p , Model model)
	{
	  product pt=	repository.save(p);
	
		return "index";
	}
	
	@GetMapping("/view")
	public String  viewproduct(Model model) {
		
		model.addAttribute("products", repository.findAll());
		return "viewProduct";
	}
}
