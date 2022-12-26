package edu.kh.inter.model.vo;

public class Penguin extends TypeBirds implements WaterLife{
	// 인터페이스는 다중상속이 가능하다 

	@Override
	public void eat() {
		System.out.println("펭귄이 밥을 먹네.");
	}

	@Override
	public void cry() {
		System.out.println("펭귄은 어떻게 우나?");
	}

	@Override
	public void move() {
		System.out.println("뒤뚱뒤뚱 펭귄");
	}

	@Override
	public void water() {
		System.out.println("펭귄은 다이빙을 해서 물 속으로 들어간다.");
	}

	
}
