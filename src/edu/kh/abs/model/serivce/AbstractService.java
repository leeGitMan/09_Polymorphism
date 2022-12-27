package edu.kh.abs.model.serivce;


import edu.kh.abs.model.vo.Animal;
import edu.kh.abs.model.vo.Cat;
import edu.kh.abs.model.vo.Dog;
import edu.kh.abs.model.vo.Whale;
import edu.kh.abs.model.vo.Chicken;
import edu.kh.abs.model.vo.Eagle;
import edu.kh.abs.model.vo.Penguin;
import edu.kh.abs.model.vo.Shark;
import edu.kh.abs.model.vo.TypeMammalia;
import edu.kh.abs.model.vo.TypeBirds;
import edu.kh.abs.model.vo.TypePsices;

public class AbstractService {
	
	// Chicken
	// Eagle
	// Penguin
	// Shark
	// whale
	
	
	
	
	// TypeBirds
	// TypeMammalia
	// TypePisces
	
	public void ex1() {
		
		// 포유류
		Dog dog = new Dog();
		Cat cat = new Cat();
		Whale whale = new Whale();
		
		// 조류
		Chicken chicken = new Chicken();
		Eagle eagle = new Eagle();
		Penguin penguin = new Penguin();
		
		// 어류
		Shark shark = new Shark();
		
		
		
		
		/*
		dog.cry();
		dog.eat();
		dog.move();
		
		System.out.println();
		
		cat.cry();
		cat.eat();
		cat.move();
		
		System.out.println();
		*/
		
		// Animal ani = Animal();
		// 추상 클래스로 만들어진 Animal은 객체화가 안된다.
		// 타입으로써의 역할은 수행 하지만 객체로서의 역할은 못한다.
		
		
		TypeMammalia[] mammalia = new TypeMammalia[] {cat,dog,whale}; 
		TypeBirds[] birds = new TypeBirds[] {chicken, eagle, penguin};
		TypePsices[] psices = new TypePsices[] {shark};
		
		
		
		//Animal[] animal = new Animal[] {cat, dog, whale, chicken, penguin, eagle, shark};
		Animal[][] animal = new Animal[][] {mammalia, birds, psices}; // -- > 2차원 객체배열
	
		for(int i = 0; i < animal.length; i++) {
			for(int  j = 0; j < animal[i].length; j++) {
				
			
			animal[i][j].cry();
			System.out.println();
			
			animal[i][j].eat();
			System.out.println();
			
			animal[i][j].move();
			System.out.println();
			
			// 만약 animal중에 타입이 고양이 일 때
			// 수유를 한다는 breastfeed()를 출력 하고 싶다.
			
			
			if(animal[i][j] instanceof Cat) { 
				System.out.println("=============");
				((Cat)animal[i][j]).breastfeed();
				System.out.println("=============");
				
				// 고양이가 소속되어있는 포유류만 가지고 있던 수유를 하다 메서드를 출력
				// Cat 클래스에서 오버라이딩으로 재정의된 내용이 출력된다.
			}
			
			if(animal[i][j] instanceof Shark) {
				System.out.println("=============");
				Shark s1 = (Shark) animal[i][j];
				s1.swimming(); 
				System.out.println("=============");
			}
			
			if(animal[i][j] instanceof Eagle) {
				System.out.println("==============");
				Eagle e1 = (Eagle) animal[i][j];
				e1.fly(); // TypeBirds에서 일반 메서드로 정의한 내용
				System.out.println("==============");
			}
			}
		}
	}
}
