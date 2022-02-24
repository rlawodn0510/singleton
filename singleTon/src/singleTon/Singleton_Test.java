package singleTon;

// 싱글톤 테스트
public class Singleton_Test {
	
	// 인스턴스생성
	static private Singleton_Test instance;
	
	// 테스트 할 변수
	private int num;
	
	// 생성자에 변수 초기화
	public Singleton_Test() {
		num = 0;
	}
	
	// get, set
	public int getNum() {return num;}
	public void setNum(int num) {this.num = num;}

	// get인스턴스
	public static Singleton_Test getInstance() {
		
		// 인스턴스가 null 이면 생성
		if (instance == null) {
			instance = new Singleton_Test();
		}
		
		// 리턴값을 instance로
		return instance;
	}
}
