package model;

public class BronzeCard extends DiscountCard {

	
	
	
	public BronzeCard(String owner) {
		this.owner = owner;
	}
	
	
	@Override
	public double purchase(double value) {
			if(turnover<100) {
				discountRate = 1;
			}
			else if(turnover>=100 && turnover<=300) {
				discountRate = 0.99;
			}
			else {
				discountRate = 0.975;
			}
		return value*discountRate;
		}


	@Override
	public void setTurnover(double turnover) {
		this.turnover = turnover;
		
	}


	@Override
	public double getDiscountRate() {
		return discountRate;
	}
	
}
