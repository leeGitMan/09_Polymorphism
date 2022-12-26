package edu.kh.poly.model.service;

import edu.kh.poly.model.vo.Car;
import edu.kh.poly.model.vo.Spark;
import edu.kh.poly.model.vo.Tesla;

public class PolyService {
	
	// ***** 다형성의 업캐스팅을 알아보자 ******
	
	public void ex1() {
		// 다형성 확인 예제
		
		// Car 객체 생성
		Car car = new Car();
		
		// 부모 타입 참조변수에 부모 객체를 대입
		
		
		// Tesla 객체 생성
		
		Tesla te = new Tesla();
		
		// 자식타입 참조변수에 자식 객체를 대입
		
		Spark sp = new Spark();
		
		
		
		// ****** 업캐스팅 구간(주의) ******
		
		Car car2 = new Tesla();
		// Tesla 객체를 참조하는 변수타입이 Car(부모)이기 때문에
		// Tesla 객체가 Car(부모) 객체로 변화
		// 부모 타입 참조변수 car2 = 자식객체(Tesla)
		// 업캐스팅이 일어남
		// 부모 타입 참조변수 = 자식객체
		// 자식이 부모로 변했다?
		
		
		Car car3 = new Spark();
		// 위 Tesla 예시와 같다
		
		
		// ****** 다형성 업캐스팅 작성법 ******
		
		// 1. 자식 객체가 부모 객체로 변했기 때문에
		// 	  ** 자식만의 고유한 필드, 메서드를 사용할 수 없다. **
		
		
		// 1-1) car (부모 = 부모)
		car.setEngine("v6 6기통 엔진");
		car.setFuel("휘발유");
		car.setWheel(4);
		
		// car 메소드(-> 부모) 부모는 부모꺼 사용 가능
		
		
		// 1-2) te (자식 = 자식)
		te.setEngine("전기모터");
		te.setFuel("전기");
		te.setWheel(4);
		te.setBatteryCapacity(100000);
		
		// te 메소드(-> 자식) 자식은 자식꺼 다 사용 가능
		
		
		
		// 1-3) car2 ((Car)부모에 자식(Tesla)을 넣음)
		car2.setEngine("전기모터");
		car2.setFuel("전기");
		car2.setWheel(4);
		// car2.setBatteryCapacity(100000);  --> 에러 --> 자식의 고유 필드를 사용할 수 없다.
		// -> Car 타입에는 setBatterCapacity 메서드가 정의 안되어있다.
		
		
		
		// 1-4) car3 ((Car)부모 -> 자식(Spark)을 넣은 상태)
		car3.setEngine("경차엔진");
		car3.setFuel("휘발유");
		car3.setWheel(4);
		// car3.setDiscountOffer(0.5); --> 에러 --> 자식의 고유 필드 사용불가
		// -> Car 타입에는 setDiscountOffer 메서드가 정의 되어있지 않다.
		
		
		// ****** 다형성 업캐스팅 작성 시 주의사항 ******
		
		// ============================================================================
		
		// 2) 다형성을 이용한 객체 배열
		// 객체 배열 : 같은 (객체 참조) 자료형의 변수를 하나의 묶음으로 다루는 것
					// 같은 객체 --> 부모 타입으로 바꾸는 것
					// 부모 타입 참조 자료형
			// + 다형성 적용 -> (부모 타입 참조) 자료형의 변수를 하나의 묶음으로 다루는 것
		
		
		Car[] arr = new Car[3]; // 부모타입 참조변수 배열 선언 및 할당
								// 각 배열의 요소가 원래는 Car	타입 참조 변수여야함.
		
		arr[0] = car; // Car 주소 *** Car 객체 (Car주소는 Car타입 객체)
		// arr[0] Car 참조 변수
		
		arr[1] = car2; // 업 캐스팅 되어서 문제가 발생 X 자식이 부모로 되었기 때문에 가능 Tesla 주소 == Tesla 객체
		// arr[1] Car 참조 변수
		
		arr[2] = car3; // Spark 주소 == Spark 객체
		// arr[2] Car 참조 변수
		
		// 상속 + 다형성
		// 상속 특징 : 일련의 클래스들에 대한 공통적인 규약 정의
		// 			--> Car 상속 클래스는 모두 getEngine()을 가지고 있다를 정의 --> 공통적인 규약
		// 다형성(업캐스팅) : 부모 타입 참조변수 arr[i]로 자식 객체를 참조할 수 있다.
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 인덱스의 엔진" + arr[i].getEngine());
		}
	}
	
	public void ex2() {
		
		// 2) 다형성(업캐스팅)을 이용해서 *** 매개변수 *** 사용법
		
		Tesla t = new Tesla("전기모터", "전기", 4, 10000);
												// 배터리용량
				
		Spark s = new Spark("경차엔진", "휘발유", 4, 0.5);
												// 할인율
		
		Car c = new Car("경유 엔진" , "경유", 12); 
										// 바퀴 12개짜리 트럭
		// 다형성 적용 안되어있는 상태

		printCar(t);
		printCar(s);
		printCar(c);
		//printCar2(t);  
		//printCar2(s); 에러! 테슬라 타입의 메서드이기때문에.
		//printCar2(c); 에러! 테슬라 타입의 메서드이기때문에.
		
		System.out.println("=================================");
		System.out.println();
		
		
		// 4) 다형성을 이용한 반환형 사용법
		
		// Car[] arr = {new Car(),  new Tesla(),   new Spark();}
		Car[] arr = {createCar(1), createCar(2), createCar(3) };
		// 				Car			Car				Car
		// 							Tesla 			Spark
		
		
		// arr[1] = new Tesla();
		// arr[2] = new Spark();
		
		// arr[0]; // Car
		// arr[1]; // Tesla
		// arr[2]; // Spark
		
		
		// instanceOf 연산자 : 객체의 자료형을 검사하는 연산자
		// -> 참조하는 객체가 특정 자료형이거나 부모쪽 상속 관계인지를 확인하는 것
		
		// arr[1]이 참조하는 객체가 Tesla면 true, 아니면 false
		System.out.println(arr[1] instanceof Tesla); // true
		
		
		System.out.println(arr[1] instanceof Spark); // false
		System.out.println(arr[1] instanceof Car); // true
		// --> Car에게 상속되어있기 떄문에 true가 나옴
		
		System.out.println("=================================");
		System.out.println();
		
		
		// instanceof 조건에서 사용할 때,
		// 부모타입 검사는 제일 마지막에 진행
		// 왜냐하면 Car를 먼저 해버리면 T가 들어오든, S가 들어오든 결과값이 모두 True이기에 검사 진행 불가
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] instanceof Tesla) {
				System.out.println("테슬라 객체 입니다");
				
			}else if(arr[i] instanceof Spark) {
				System.out.println("스파크 객체 입니다.");
			}else {
				System.out.println("Car 객체 입니다");
			}
		}
	}
	
	// ***** 다형성의 다운 캐스팅을 알아보자 ******
	public void ex3() {
		
		// 다운 캐스팅이란?
		// 부모 타입 참조변수가 자식 객체를 참조하는
		// *** 업캐스팅 상태 *** 에서만 진행할 수 있는 기술로
		// 부모타입을 자식타입으로 강제 형변환 해서
		// 자식 객체의 필드와 메서드를 사용할 수 있도록 하는 것.
		
		// 그럼 Tesla타입이 되었기 떄문에 처음 상속받은 그 상태처럼 Car 필드와 메서드도 사용가능?
		
		
		Car c1 = new Tesla("전기모터" , "전기" , 4, 100000);
		
		// c1.getBatterCapacity(); --> 당연히 안됨 현재 부모타입의 객체이기 때문에
		// 가능하게 하려면
		
		System.out.println(c1.toString());
		
		
		//System.out.println( ((Tesla)c1).getBatteryCapacity() );
		
		
		// 주의!
		// "." 연산자가 (Tesla) 형변환 연산자보다 우선순위가 높음
		// 먼저 c1을 Tesla로 형변환 해주고, 그리고 getBatteryCapacity를 호출해야함
		
		// <효율적인 다운 캐스팅 방법>
		// * 얕은 복사의 개념을 이용해보자.
		// 얕은 복사는 주소 값을 복사하는 것
		
		Tesla t1 = (Tesla)c1;
				//(Tesla)를 뺴면 c1은 Car타입이었음.
				// 자식 참조변수로 부모 객체를 참조? 안됨
				// 부모 참조변수로 자식 객체를 참조할 수 있었음.
				// c1이 참조하는 게 Tesla라는 걸 알기 때문에, Tesla로 강제 형변환 가능
				// Tesla = Tesla 같은 자료형 연산 가능하니, 같은 주소를 복사시켜버림(얕은복사)
		
		
		System.out.println(t1.getBatteryCapacity());
		
	}
	
	
	// !!! 다운 캐스팅 주의사항 !!!
	public void ex4() {
		// 다운 캐스팅 중 오류 사항이 있을 수 있다.
		
		Car c1 = new Tesla();
		//Car c1 = new Spark();
		
		// Spark s1 = (Spark)c1; // 다운 캐스팅 --> 형변환 예외 오류
		
		
		// 문제점 1.
		// Spark가 Tesla를 참조함,  부모를 공유할 뿐 다른 건 겹치지 않음.
		// -> java.lang.ClassCastException ( 형변환 예외 )
		// -> c1이 참조하는 객체는 Tesla인데,
		//	  Spark 참조변수로 참조하려고 하면, 예외가 발생된다.
		// -> 다운 캐스팅 주의사항 : 강제 형변환을 잘못하면 안됨.
		
		
		// instanceof와 같이 사용
		// 조건이 맞을 때 다운 캐스팅 해라
		
		if(c1 instanceof Spark) {
			Spark s1 = (Spark)c1; // 맞을 때 다운 캐스팅
			System.out.println("성공");
		}else {
			System.out.println("실패(Spark 타입이 아님.)");
		}
	}

	
	// ***** 바인딩을 알아보자 ******
	
	public void ex5() {
		
		// Binding
		// - 실제 실행할 메소드 코드와 호출하는 코드를 연결 시키는 것
		
		Car c1 = new Car("경유 엔진", "경유", 8);
		
		System.out.println(c1.getEngine());
		// Car 객체에 있는 getEngine() 메소드를 호출 == 바인딩
		// String edu.kh.poly.model.vo.Car.getEngine()
		
		// 프로그램 "실행 전"
		// - 컴파일러는 getEngine() 메소드가 Car에 있는 걸로 인식해서
		// c1.getEngine() 호출 코드와
		// String edu.kh.poly.model.vo.Car.getEngine() 메소드 코드를
		// 연결시킨 것이 '정적 바인딩' 이다.
		
		System.out.println(c1.toString());
		// Car 참조변수 c1을 이용해서
		// Car 객체에 있는 오버라이딩 된 toString() 메소드를 호출
		
		
		// ** 다형성 적용 시 바인딩 **
		
		Car c2 = new Spark("경차 엔진", "휘발유", 4, 0.5);
		// 업 캐스팅 되어있는 상태 --> 부모 부분만 참조 쌉가능
		
		
		System.out.println(c2.toString());
		// String edu.kh.poly.model.vo.Car.toString()
		// 참조변수 c2가 Car타입이므로
		// toString() 도 Car의 toString()을 호출 함 - 정적 바인딩
		
		// 실행해보면, 자식(Spark)의 toString()이 호출 되는 것을 확인!
		// -> 컴파일시에는 부모(Car)와 바인딩 == [정적 바인딩]
		// -> 실행시에는 자식(Spark)의 오버라이딩된 메소드와 바인딩 == [동적 바인딩]
		
		
		// ** 동적 바인딩 활용 방법 **
		Car[] arr = {
				new Car("경유 엔진", "경유", 12),
				new Tesla("전기 모터", "전기" , 4, 100000),
				new Spark("경차 엔진", "휘발유", 4, 0.4)
		};
		
		// arr 배열요소가 참조하는 모든 객체의 필드 값을 출력
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 요소 : " + arr[i].toString());
			// 실행 전 : String edu.kh.poly.model.vo.Car.toString() == 정적 바인딩 상태
			// 실행 후 : 각 객체의 오버라이딩이 적용된 toString()이 호출됨 == 동적 바인딩
		}
		
		// ** 동적 바인딩 장점 **
		// up casting 상태의 참조변수를
		// 별도의 down casting 없이 자식의 오버라이딩 된 메서드를 수행할 수 있다.
		

	}
	
	
	// 전달 받은 Car or 자식객체의 엔진, 연료, 바퀴갯수를 출력하는 메서드
	public void printCar(Car temp) {
		System.out.println("엔진 : " + temp.getEngine());
		System.out.println("연료 : " + temp.getFuel());
		System.out.println("바퀴 개수 : " + temp.getWheel() + "개");
		System.out.println();
	}
	
	//public void printCar2(Tesla temp) {
	// Tesla 타입의 매개변수만 받을 수 있다.
	//}
	
	// createCar() 메서드
	// 전달 받은 매개변수에 따라서, Car or 자식객체 생성하는 메서드
	// 생성된 객체의 주소를 반환
	
	public Car createCar(int num) {
		
		Car result = null;
		// null == 아무것도 참조하고 있지 않은 상태
		
		switch(num) {
		case 1 : result = new Car(); break;
		case 2 : result = new Tesla(); break;
		case 3 : result = new Spark(); break;
		default : System.out.println("안 써도 되는데 씀"); break;
		}
		
		return result;
		
		// 반환형이 Car이지만,
		// case가 2번 혹은 3번이면
		// Car의 자식객체 주소가 반환된다.
		
	}
	
	
	
}
