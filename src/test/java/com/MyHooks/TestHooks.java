package com.MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestHooks {
	
	@Before("@Smoke")
	public void setup() {
		System.out.println("Launch the browser");
	}
	
	@After("@Regression")
	public void teardown() {
		System.out.println("Close the browser");
	}
}