package com.epsilon.training.sbcalculator.bean;

import org.springframework.stereotype.Component;

@Component
public class Calculator
{
	private int ip1;
	private int ip2;
	
	public Calculator()
	{
		System.out.println("Calculator instance is created");
	}
	
	public int getIp1() {
		return ip1;
	}
	public void setIp1(int ip1) {
		this.ip1 = ip1;
	}
	public int getIp2() {
		return ip2;
	}
	public void setIp2(int ip2) {
		this.ip2 = ip2;
	}
	
	public int addition(int i, int j)
	{
		return i+j;
	}
	public int substraction(int i, int j)
	{
		return i-j;
	}
	public int multiplication(int i, int j)
	{
		return i*j;
	}
	public int division(int i, int j)
	{
		return i/j;
	}
	public int modulo(int i, int j)
	{
		return i%j;
	}
}
