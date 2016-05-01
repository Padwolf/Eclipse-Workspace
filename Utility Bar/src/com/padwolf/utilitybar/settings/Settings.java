package com.padwolf.utilitybar.settings;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class Settings {
	
	public Settings(){
		File file = new File("settings.sdt");
		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			InputStream in = new BufferedInputStream(new FileInputStream(file));
			if (!file.exists()){
				file.createNewFile();
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}