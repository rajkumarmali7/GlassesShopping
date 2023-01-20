package com.GlassesShoppingIndian.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GlassesShoppingIndian.entity.GlassesShopping;
import com.GlassesShoppingIndian.repository.GlassesShoppingRepository;

@Service
public class GlassesShoppingService {

	@Autowired
	GlassesShoppingRepository glassesShoppingRepository;

	public void saveSaleProduct(List<GlassesShopping> glassesShoppings) {

		for (GlassesShopping glassesShopping : glassesShoppings) {
			glassesShoppingRepository.save(glassesShopping);
		}

	}

//	public List<GlassesShopping> getAllGlasses() {
//	List<GlassesShopping> employeeList = new ArrayList<GlassesShopping>();
//	glassesShoppingRepository.findAll().forEach(li -> employeeList.add(li));
//	return employeeList;
//}
	public List<GlassesShopping> getAllGlasses() {
		List<GlassesShopping> glassesShopping = glassesShoppingRepository.findAll();
		return glassesShopping;
	}

}
