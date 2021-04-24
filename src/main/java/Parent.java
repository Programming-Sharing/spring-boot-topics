class Parent{
	public void method1() {
		System.out.println("Parent's method1");
	}
	
	public void method2() {
		System.out.println("Parent's method2");
		method1();
	}
}

class Children extends Parent{
	public void  method1() {
		System.out.println("Children's method1");
	}
	
	public static void main(String[] args) {
		Parent parent = new Children();
		parent.method2();
	}
}