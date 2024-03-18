package com.voya.food;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Waiter {
	@Autowired
	@Qualifier("chinese")
	IFoodMenu chineseMenu;
	
	@Autowired
	@Qualifier("italian")
	IFoodMenu italianMenu;
	
	@Autowired
	@Qualifier("indian")
	IFoodMenu indianMenu;
	
	List<String> viewMenuCard(String choice) {
		if(choice.equals("indian")) {
			indianMenu.showMenu();
		}
		if(choice.equals("italian")) {
			italianMenu.showMenu();
		}
		if(choice.equals("chinese")) {
			chineseMenu.showMenu();
		}
		
		return null;
	}

}
