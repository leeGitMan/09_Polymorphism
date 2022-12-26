package edu.kh.abs.model.vo;

public class Chicken extends TypeBirds{

	@Override
	public void eat() {
		System.out.println("닭이 모이를 쪼아 먹는다.");
		
	}

	@Override
	public void cry() {
		System.out.println("꼬끼오.");		
	}

	@Override
	public void move() {
		System.out.println("닭이 푸드덕");		
	}

}
