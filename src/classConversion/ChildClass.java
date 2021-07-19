package classConversion;

// ParentClass를 상속 받는 ChildClass가 있다
// ChildClass에도 m2라는 메소드가 한개있다
public class ChildClass extends ParentClass{
	public void m2 () {
		System.out.println("ChildClass의 m2 메소드가 실행");
	}
}
