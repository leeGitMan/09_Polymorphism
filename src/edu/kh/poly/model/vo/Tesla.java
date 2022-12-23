package edu.kh.poly.model.vo;

public class Tesla extends Car {
	// 테슬라는 전기차
	// Car를 상속 받을 수 있도록 하자
	
	
	private int batteryCapacity;  // 배터리 용량
	
	
	public Tesla() { // 컨트롤 + 스페이스 + 엔터 누르면 바로 기본 생성자 생성
		
		super(); // 안 만들어도 컴파일러가 생성해주는데 그냥 생성해봄 깔깔
				 // Car
	}


	public Tesla(String engine, String fuel, int wheel, int batteryCapacity) {
		
		super(engine, fuel, wheel);
		this.batteryCapacity = batteryCapacity;
		
	}


	public int getBatteryCapacity() {
		return batteryCapacity;
	}


	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	// Car.toString() 오버라이딩
	@Override
	public String toString() {
		
		return super.toString() + " / " + batteryCapacity;
		
	}

	
	
	
}
