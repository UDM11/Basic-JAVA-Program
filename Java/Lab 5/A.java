class A{
	void msg(){
		System.out.println("Hello");
	}
}
class B{
	void msg(){
		System.out.println("Wellcome");
	}
}
class C extends A,B{
	public static void main(String args[]){
		C obj = new C();
		obj.msg();
	}
}