//클래스 이름 Student == 파일명,첫문자 대문자  
//접근 제한 : 클래스의 접근 (같은 패키지, 다른패키지에서 접근 )
//public,  default, private
public class Student {   //모델 클래스 학생한명 객체를 생성, 저장할 모델클래스
	//멤버변수영역, 인스턴스변수 
	//객체생성- 객체가 모두 가지는 공통 변수 선언 : 접근지정자 타입 변수명;
	//멤버변수 : 객체생성 후 사용 (new로 객체생성 ), 객체생성시에 자동 초기값으로 설정 
	//멤버변수 : 클래스 블럭안에 선언 , 클래스안의 함수에서 사용가능(전역변수), 클래스안의 생성자에서 모두 사용가능 
    String name;//이름   , 접근제한자가 생략된 경우 default 묵시적 접근제한자 사용 
	 //선언된 class 안에서만 사용 
	int age; //나이 
	String address;// 주소 
	
	//생성자(constructor)영역 : 클래스이름 동일하게 사용 , new 객체 생성시 호출, 멤버변수 초기값 설정에 사용 
//	public Student(){//접근제한자 클래스이름(매개변수 없음)  : 기본생성자  - 명시적작성, 묵시적 방법 (자동작성)
//	 System.out.println("생성자 호출됨 ====================");
//	 name="test";
//	 age=20;
//	 address="경기";
//	}   
	
	//묵시적 자동생성
	//public Student() {}
	//함수(메소드)영역
}
