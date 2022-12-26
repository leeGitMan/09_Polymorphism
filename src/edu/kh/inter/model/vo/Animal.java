package edu.kh.inter.model.vo;

public abstract class Animal {
	// abstract가 붙는 순간 객체화가 안되는 클래스 --> 인스턴스화가 안된다는 뜻
	// 단, 타입으로서의 의미는 그대로이다.
	// 추상 메서드가 있으면 추상 클래스가 있어야하는데,
	// 추상 클래스에 꼭 추상 메서드가 있어야 되는것도 아니다.
	
	

	public abstract void eat(); //--> 중괄호를 쓰면 안된다.
	// ---> 추상 메서드이고 먹기라는 메서드는 있찌만, 어떻게 동작할지 정의하지 않아야한다.
	// + 추상메서드가 있으면 추상 클래스여야한다.
	
	
	public abstract void cry(); 
	

	public abstract void move();



}
