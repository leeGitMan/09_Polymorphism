package edu.kh.inter.model.vo;

public class Shark extends TypePsices implements WaterLife{

	@Override
	public void swimming() {
		System.out.println("빠르게 수영한다");
	}

	@Override
	public void eat() {
		System.out.println("와그작 씹어먹는다.");
	}

	@Override
	public void cry() {
		System.out.println("상어도 울어?");
	}

	@Override
	public void move() {
		System.out.println("빠르게 수영하고 움직인다.");
	}

	@Override
	public void water() {
		System.out.println("상어는 물에서 가장 쎈 포식자이다.");
		
	}

}
