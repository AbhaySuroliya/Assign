package com.springboot.LastAssignment.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.LastAssignment.model.Products;
import com.springboot.LastAssignment.repository.HomeRepository;

@Controller
@RequestMapping("/")
public class HomeController {

	HomeRepository repo;
	@RequestMapping(method=RequestMethod.GET)
	public String home() {
		return "home";
	}
	@RequestMapping(value="/addPro",method=RequestMethod.GET)
	public String added() {
		return "add";
	}
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String add(HttpServletRequest req) {
		int id= Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String decs=req.getParameter("desp");
         Products p=new Products(id,name,decs);
		repo.save(p);
	 return "home";	
	}
	@RequestMapping(value="/deletePro",method=RequestMethod.GET)
	public String deleted() {
		return "delete";
	}
	@RequestMapping("/delete")
	public String delete(HttpServletRequest req) {
		int id= Integer.parseInt(req.getParameter("id"));
		repo.deleteById(id);
	 return "home";	
	}
	@RequestMapping("/part")
	public Products part(HttpServletRequest req) {
		int id= Integer.parseInt(req.getParameter("id"));
		return repo.getById(id);
	}
	@RequestMapping("/show")
	public List<Products> show() {
		List<Products> p=repo.findAll();
		return p;
	}
}
