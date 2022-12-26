package edu.kh.inter.model.vo;

public class Eagle extends TypeBirds{

	@Override
	public void eat() {
		System.out.println("독수리가 쥐를 먹는다.");		
	}

	@Override
	public void cry() {
		System.out.println("독수리가 끼야호");		
	}

	@Override
	public void move() {
		System.out.println("독수리가 움지깅네");
	}

}
