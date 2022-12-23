package edu.kh.poly.model.vo;

public class Car {
	
	/* 자동차가 가지고 있는 것 */
	
	
	private String engine;
	private String fuel;
	private int wheel;
	
	
	public Car() { // 기본 생성자
		super(); // 부모 생성자 Object로 넘어감
		// 안 적으면 컴파일러가 자동으로 만들어준다.
	}
	
	public Car(String engine, String fuel, int wheel) {
		
		// 매개 변수 생성자
		super();
		this.engine = engine;
		this.fuel = fuel;
		this.wheel = wheel;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	
	// Object.toString() --> 오버라이딩
	@Override
	public String toString() {
		
		return engine + " / " + fuel + " / " + wheel;
			//	엔진				연료				바퀴개수
	}
	
	
}
