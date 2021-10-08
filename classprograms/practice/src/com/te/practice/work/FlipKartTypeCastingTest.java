package com.te.practice.work;

public class FlipKartTypeCastingTest {

	public static void main(String[] args) {
		
		//UpCasting : FlipKartPayment ---->FlipKartTypeCasting
		FlipKartTypeCasting fp1 = new FlipkartPayment(); 
		fp1.product();
		
		//DownCasting : FlipKartTypeCasting ----->AddToKart
		FlipkartAddToKart fp2 = (FlipkartAddToKart) fp1; 
		fp2.product();
		fp2.store();
		
		//DownCasting : AddToKart ----->FlipKartPayment
		FlipkartPayment fp3 = (FlipkartPayment) fp2; 
		fp3.product();
		fp3.store();
		fp3.payment();
		
		//DownCasting : FlipKartTypeCasting ---->FlipKartPayment 
		FlipkartPayment fp4 =(FlipkartPayment)fp1;
		fp4.product();
		fp4.store();
		fp4.payment();
		
		//UpCasting : AddToKart ---->FlipKartTypeCasting
		FlipKartTypeCasting fp5 = new FlipkartAddToKart();
		fp5.product();
		
		//DownCasting : FlipKartTypeCasting ----->AddToKart
		FlipkartAddToKart fp6 = (FlipkartAddToKart) fp1;
		fp6.product();
		fp6.store();
	}
}
