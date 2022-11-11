package com.project.model;

public class Coin {
	private int id;
	private String name;
	private double price;
	private String startDate;
	private double volume24;
	
	
	public Coin(int id,String name,double price,String startDate,double volume24)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.startDate=startDate;
		this.volume24=volume24;
	}
	
	public Coin(String name,double price,String startDate, double volume24)
	{
		this.name=name;
		this.price=price;
		this.startDate=startDate;
		this.volume24=volume24;
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
	
	

}
