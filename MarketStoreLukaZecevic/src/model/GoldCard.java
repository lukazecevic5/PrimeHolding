package model;

public class GoldCard extends DiscountCard{

	
	public GoldCard(String owner) {
		this.owner = owner;
		this.discountRate = 0.98;
	}
	
	
	@Override
	public double purchase(double value) {
			double div =  turnover/100;
			if(div!=0) {
				if(div>=8) {
					discountRate = 0.9;
				}else {
					discountRate = discountRate - div/100;
				}
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
