/**
 * 
 */
package com.nuts.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping(value ="/home")
	public List<String> getData(){
		List<String> myList = new ArrayList<String>();
		myList.add("one");
		myList.add("two");
		myList.add("three");
		myList.add("four");
		myList.add("five");
		myList.add("six");
		myList.add("seven");
		myList.add("eight");
		myList.add("nine");
		myList.add("ten");
		return myList;
		
	}

}
