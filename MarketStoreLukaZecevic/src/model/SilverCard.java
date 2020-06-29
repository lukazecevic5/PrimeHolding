package model;

public  class SilverCard extends DiscountCard {

	
	
	public SilverCard(String owner) {
		this.owner = owner;
		this.discountRate = 0.98;
	}
	
	
	@Override
	public double purchase(double value) {
			if(value>300) {
				discountRate = 0.965;
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
