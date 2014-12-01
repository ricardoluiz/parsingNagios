package com.cancaonova.parsing.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {

	public Properties getProp() throws IOException {
		Properties props = new Properties();
		FileInputStream file = new FileInputStream("./properties/application.properties");
		props.load(file);
		return props;
	}
	
}
