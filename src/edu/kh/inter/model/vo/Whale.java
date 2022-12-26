package edu.kh.inter.model.vo;

public class Whale extends TypeMammalia implements WaterLife{

	@Override
	public void breastfeed() {
		System.out.println("고래가 수유를 한다");
	}

	@Override
	public void eat() {
		System.out.println("고래가 입을 벌려 먹는다");
	}

	@Override
	public void cry() {
		System.out.println("고래가 운다");
	}

	@Override
	public void move() {
		System.out.println("고래가 느리게 움직인다.");
	}

	@Override
	public void water() {
		System.out.println("고래는 물속에서 숨 잘 쉰다.");		
	}

	

}
