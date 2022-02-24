package singleTon;

public class Main {
	public static void main(String[] args) {
		
		// test1,2,3
		Singleton_Test test1 = Singleton_Test.getInstance();
		Singleton_Test test2 = Singleton_Test.getInstance();
		Singleton_Test test3 = Singleton_Test.getInstance();
		
		// 현재의 값을 프린트
		System.out.println("test1 = " + test1.getNum());
		System.out.println("test2 = " + test2.getNum());
		System.out.println("test3 = " + test3.getNum());
		
		// 테스트1 값에 5를 세팅
		System.out.println();
		test1.setNum(5);
		// 5,5,5
		System.out.println("test1 = " + test1.getNum());
		System.out.println("test2 = " + test2.getNum());
		System.out.println("test3 = " + test3.getNum());
		
		// 테스트1 값에 10를 세팅
		System.out.println();
		test2.setNum(10);
		// 10,10,10
		System.out.println("test1 = " + test1.getNum());
		System.out.println("test2 = " + test2.getNum());
		System.out.println("test3 = " + test3.getNum());
		
		// 테스트1 값에 15를 세팅
		System.out.println();
		test3.setNum(15);
		// 15,15,15
		System.out.println("test1 = " + test1.getNum());
		System.out.println("test2 = " + test2.getNum());
		System.out.println("test3 = " + test3.getNum());
	}
}
