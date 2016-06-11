package singleton;

public class Singleton {
	private volatile static  Singleton singleton;
	private int a;
	private Singleton() {
	}
	public static Singleton getSingleton(){
		if(singleton == null){
			singleton = new Singleton();
		}
		return singleton;
	}
	public int geta(){
		return a;
	}
	public void seta(int a){
		this.a = a;
	}
	
}
