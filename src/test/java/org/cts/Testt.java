package org.cts;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Testt {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/YYYY");
		String format = sdf.format(date);
		System.out.println(format);
		
		
	}
}

