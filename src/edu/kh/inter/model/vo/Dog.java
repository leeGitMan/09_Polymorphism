package edu.kh.inter.model.vo;

public class Dog extends TypeMammalia{
	
	
	@Override
	public void eat() {
		System.out.println("강아지가 밥을 먹는다.");
		
	}
	@Override
	public void cry() {
		System.out.println("강아지가 운다.");
		
	}
	@Override
	public void move() {
		System.out.println("강아지가 움직인다.");
		
		
	}
	@Override
	public void breastfeed() {
		System.out.println("개가 우유를 준다");
	}
	
}
