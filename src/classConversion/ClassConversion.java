package classConversion;

// 부모타입으로 자식개체를 참조하게 되면 부모가 가지고 있는 메소드만 사용할 수 있다
public class ClassConversion {
	public static void main(String[] args) {
		ParentClass c1 = new ChildClass();
		// 부모 클래스인 ParentClass를 data type으로 하고 자녀클래스인 ChildClass를 가리키고 있다
		// 이런것을 묵시적 형변환이라고 한다 - 더 큰 그릇에 작은 것을 담다
		c1.m1();
//		c1.m2();
		// 하지만 부모클래스에 속해있는 메소드는 실행이 가능한데 자녀클래스에 있던 메소드는 실행이 불가능하다
		ChildClass c2 = (ChildClass) c1;
		// 실행을 하려면 더 작은 ChildClass로 형변환을 해야 한다
		c2.m1();
		c2.m2();
		
// 애초에 형변환 자체가 가능했었던것이 더 작은 클래스를 가리키고 있었기 때문이다
	}
}
