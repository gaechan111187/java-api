package lunch;

import java.util.Random;

public class LunchlRace {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("점심 경주");
		System.out.println("점심들 출발 준비...");
		Snail s1 = new Snail("맥도날드");
		Snail s2 = new Snail("칼국수");
		Snail s3 = new Snail("제육볶음");
		Snail s4 = new Snail("김밥천국");
		Snail s5 = new Snail("부대찌개");
		Snail s6 = new Snail("뷔패");
		Snail s7 = new Snail("교동짬뽕");

		for (int i = 5; i > 0; i--) {
			System.out.println(i+"초");
			Thread.sleep(1000);
			}
			System.out.println("경주 시작!!!!!!+\n");
			
		
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		s5.start();
		s6.start();
		s7.start();
		
		s1.join();
		s2.join();
		s3.join();
		s4.join();
		s5.join();
		s6.join();
		s7.join();
		
		System.out.println("점심 경주 종료");
		
	}
}
class Snail extends Thread{
	public Snail(String name){
		super(name);
	}
	public void run(){
		Random r = new Random();
		for (int i = 0; i < 30; i++) {
			int randomNum =r.nextInt(501);
				try {
					sleep(randomNum);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(getName()+"가 "+i+"미터 전진");
		}
		System.out.println(getName()+"가 결승점을 통과합니다.!!");
	}
}
class RaceGame{
	
}
