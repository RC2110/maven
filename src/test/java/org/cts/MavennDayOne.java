package org.cts;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MavennDayOne {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = s.nextLine();
		System.out.println("Enter your Trainer's name");
		String trainerName = s.nextLine();
		System.out.println("Batch Details");
		String batchName = s.nextLine();
		System.out.println("Learning mode");
		String learnMode = s.nextLine();
		
		List<String> l = new LinkedList();
		l.add(name);
		l.add(trainerName);
		l.add(batchName);
		l.add(learnMode);
		
		for(int i=0; i<l.size();i++) {
			String value = l.get(i);
			System.out.println(value);
		}
		
		
		
	}

}
