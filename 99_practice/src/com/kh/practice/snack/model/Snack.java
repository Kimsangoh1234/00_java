package com.kh.practice.snack.model;

public class Snack {
//필드
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	
//메서드
	//Setter & Getter
	public int getNumOf() {
		return numOf;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getKind() {
		return kind;
	}
	public String getName() {
		return name;
	}
	public String getFlavor() {
		return flavor;
	}
	public int getPrice() {
		return price;
	}
	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}
	//생성자 : 기본
	public Snack() {
		
	}
	//생성자 : 필수
	public Snack(String kind, String name, String flavor, int numOf, int price) {
		this.kind=kind;
		this.name=name;
		this.flavor=flavor;
		this.numOf=numOf;
		this.price =price;
	}
	//return :String
	public String information() {
		return "종류	"+kind + ",이름 : "+name + ",맛 :" + flavor +", 개수 : "+numOf +", 가격 : "+price;
	}
	
	/*
	public void information() {
		System.out.println("종류 : " +kind);
		System.out.println("이름 : " +name);
		System.out.println("맛 : "+flavor);
		System.out.println("개수 : "+numOf);
		System.out.println("가격 : "+price);
	}
	*/
}
