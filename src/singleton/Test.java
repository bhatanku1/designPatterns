package singleton;
//First comment
//Second commit
public class Test {
	public static void main(String[] a){
		Singleton singleton1 = Singleton.getSingleton();
		Singleton singleton2 = Singleton.getSingleton();
		singleton1.seta(3);
		System.out.println(singleton2.geta());
	}
	
}
