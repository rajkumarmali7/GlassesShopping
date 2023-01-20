package com.GlassesShoppingIndian.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GlassesShoppingIndian.entity.GlassesShopping;
import com.GlassesShoppingIndian.service.GlassesShoppingService;

@RestController
@RequestMapping("/Glassesimage")
public class GlassesShoppingController {

	@Autowired
	GlassesShoppingService glassesShoppingService;

	@PostMapping("/save")
	public List<GlassesShopping> saveSale(@RequestBody List<GlassesShopping> glassesShoppings) {
		glassesShoppingService.saveSaleProduct(glassesShoppings);
		return glassesShoppings;
	}
	@GetMapping("/fetch")
	public ResponseEntity<List<GlassesShopping>> glassesFetch() {
	
		List<GlassesShopping> employeeList = glassesShoppingService.getAllGlasses();
		return new ResponseEntity<>(employeeList ,HttpStatus.OK);
	}

}
