/*
 * InputCheck.java
 * 
 * Copyright 2016 graf <graf@chillosphere.spacepotato>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.Scanner;
public class InputCheck {
	
	private String pass = "pass";
	
	private void InputCheckOne(){
		
		Scanner keys = new Scanner(System.in);
		System.out.println("Try and guess the keyword.");
		String input = keys.next();
		
		while (! input.equals(pass)) {
			System.out.println("Try another keyword.");
			input = keys.next();
			}
		System.out.println("Keywords match.");	
		}
		
	private void InputCheckTwo() {
		Scanner keys = new Scanner(System.in);
		System.out.println("Try and guess the keyword.");
		String input;
		do {
			input = keys.next();
			}
		while (! input.equals(pass));		
		System.out.println("Keywords match.");	
		}
		
			
	
	public static void main (String args[]) {
		
		InputCheck demo = new InputCheck();
		demo.InputCheckOne();
		demo.InputCheckTwo();
		
	}
}

