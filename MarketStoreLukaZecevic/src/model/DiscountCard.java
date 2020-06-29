package model;

public abstract class DiscountCard {
	
	protected String owner;
	protected double turnover=0;
	protected double discountRate=1;
	
	public abstract double  purchase(double value);
	public abstract void setTurnover(double turnover);
	public abstract double getDiscountRate();
}
