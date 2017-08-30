package com.zh.beans;

public class Calcul {

	private int first;
	private int second;
	private int result;
	private int type;
	
	public void calculate(){
		switch (type) {
		case 1:
			this.setResult(this.getFirst() + this.getSecond());
			break;
		case 2:
			this.setResult(this.getFirst() - this.getSecond());
			break;
		case 3:
			this.setResult(this.getFirst() * this.getSecond());
			break;
		case 4:
			this.setResult(this.getFirst() / this.getSecond());
			break;
		default:
			break;
		}		
	}
	
	public Calcul(){
		super();
		this.setResult(0);
	}	
	
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
}
