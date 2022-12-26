package edu.kh.abs.model.vo;

public class Penguin extends TypeBirds{

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

}
