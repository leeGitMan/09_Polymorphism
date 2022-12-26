package edu.kh.abs.model.vo;

public class Cat extends TypeMammalia{
	
	
	@Override
	public void eat() {
		System.out.println("고양이처럼 먹는다.");
		
	}
	@Override
	public void cry() {
		System.out.println("고양이처럼 운다.");
		
	}
	@Override
	public void move() {
		System.out.println("고양이처럼 움직인다.");
		
	}
	@Override
	public void breastfeed() {
		System.out.println("고양이가 우유를 준다");
	}
	
	
	// 추상클래스쪽에 정리가 덜 된 메서드들이 있기에, 추상클래스를 상속 받는 cat클래스는
	// 메서드를 정리를 할 필요가 있다.

}
