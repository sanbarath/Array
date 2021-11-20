package org.bank;

import java.io.File;
import java.io.IOException;

public class AxisBank extends BankInfo {
	
	
	/*@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Method overriding");
		System.out.println("15%");
	}*/
	
	public static void main(String[] args) throws IOException {
		
		AxisBank a = new AxisBank();
		
		//a.fixed();
		//a.saving();
		//a.deposit();//overriding class
	
	
	File f = new File("D:\\Test.pdf");	
	f.createNewFile();
	
	}

}
