package com.project.model;

public class Coin {
	private int id;
	private String name;
	private double price;
	private String startDate;
	private double volume24;
	private String icon;
	
	
	public Coin(int id,String name,double price,String startDate,double volume24,String icon)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.startDate=startDate;
		this.volume24=volume24;
		this.icon=icon;
	}
	
	public Coin(String name,double price,String startDate, double volume24,String icon)
	{
		this.name=name;
		this.price=price;
		this.startDate=startDate;
		this.volume24=volume24;
		this.icon=icon;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public double getVolume24()
	{
		return volume24;
	}
	
	public String getStartDate()
	{
		return startDate;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	

}
