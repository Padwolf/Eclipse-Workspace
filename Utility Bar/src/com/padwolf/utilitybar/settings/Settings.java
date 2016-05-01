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
			if (!file.exists()){
				file.createNewFile();
				PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
				InputStream in = new BufferedInputStream(new FileInputStream(file));
				out.println("screen-side=left");
				out.println("width=150");
				out.flush();
				out.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}