package main;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

import model.BronzeCard;
import model.GoldCard;
import model.SilverCard;

public class Main {

	public static void main(String[] args) {
		int num=0;
		Scanner scr = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.println("1 for BronzeCard\n2 for SilverCard\n3 for GoldCard\n0 for end");
			
			try {
				 num = Integer.parseInt(scr.nextLine());
				}
			catch(Exception e) {
				System.out.println("Write round number");
				continue;
				}
			
			if(num==0) {
				System.out.println("End");
				break;
			}
			if(num<1 && num>3) {
				System.out.println("Write number between 0 and 3");
				continue;
			}
			
			
			
			
		
			double turnover = getDoubleFromConsole("Turnover");
			double purchaseValue = getDoubleFromConsole("Purchase Value");
			double total;
			double discountRate;
			double discountPercentage;
			double discount;
			
			switch (num) {
				case 1:
					System.out.println("Bronze:");
					BronzeCard bronze = new BronzeCard("Luka Zecevic");
					bronze.setTurnover(turnover);
					System.out.format("Purchase value: $%.2f\n",purchaseValue);
					total = bronze.purchase(purchaseValue);
					discountRate = bronze.getDiscountRate();
					discountPercentage = (1 - discountRate)*100;
					System.out.format("Discount rate: %.1f",discountPercentage);
					System.out.println("%");
					discount = purchaseValue - total;
					System.out.format("Discount: $%.2f\n" , discount);
					System.out.format("Total: $%.2f\n" , total);
					break;
		
				case 2:
					System.out.println("Silver:");
					SilverCard silver = new SilverCard("Luka Zecevic");
					silver.setTurnover(turnover);
					System.out.format("Purchase value: $%.2f\n",purchaseValue);
					total = silver.purchase(purchaseValue);
					discountRate = silver.getDiscountRate();
					discountPercentage = (1 - discountRate)*100;
					System.out.format("Discount rate: %.1f",discountPercentage);
					System.out.println("%");
					discount = purchaseValue - total;
					System.out.format("Discount: $%.2f\n" , discount);
					System.out.format("Total: $%.2f\n" , total);
					break;
					
				case 3:
					System.out.println("Gold:");
					GoldCard gold = new GoldCard("Luka Zecevic");
					gold.setTurnover(turnover);
					System.out.format("Purchase value: $%.2f\n",purchaseValue);
					total = gold.purchase(purchaseValue);
					discountRate = gold.getDiscountRate();
					discountPercentage = (1 - discountRate)*100;
					System.out.format("Discount rate: %.1f",discountPercentage);
					System.out.println("%");
					discount = purchaseValue - total;
					System.out.format("Discount: $%.2f\n" , discount);
					System.out.format("Total: $%.2f\n" , total);
					break;
			}
		
		}
	}
	
	
	
	
	private static double getDoubleFromConsole(String message) {
		double d=0;
		Scanner scr = new Scanner(System.in);
		while(true) {
			System.out.println("Write " + message +":");
			try {
				 d = Integer.parseInt(scr.nextLine());
				}
			catch(Exception e) {
				System.out.println("Write ammount");
				continue;
				}
			break;
			}
		return d;
	}

}
