package com.Tabbusree.TechnicalAssessment3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoginUtility {
	String url;
	String email;
	String password;

	
	public LoginUtility(){
		data();
	}
	public void data() {
		File file = new File("C:\\Users\\tsridhar\\Tabbusree S.TechnicalAssessment3\\Tabbusree.TechnicalAssessment3\\src\\test\\resources\\TabbusreeData.properties");
		FileInputStream fio =null;
		try {
			fio = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		try {
			prop.load(fio);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		url = prop.getProperty("url");
		email = prop.getProperty("email");
	    password = prop.getProperty("password");

	}

}
