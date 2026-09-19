package com.example.practice2;

import org.springframework.stereotype.Component;

@Component
public class AppInfo {
	public AppInfo(Practice2Properties properties) {
		System.out.println("App name: " + properties.getName());
	}
}
