package three;

import java.util.ArrayList;


public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      tv는 총 3개있다
//      
//      본인이 맘에 드는 tv명을 짓는다
//      
//      tv는 처음 생성되면 서로 다른 값을 할당한다
//      
//      모든 값이 설정되면
//      list에 담는다
//      
//      list에서 값을 꺼내와서
//      각 tv마다 서로 다른 메서드를 수행하시오
//      그 결과를 각각에 출력한다
      Tv tv1 = new Tv("브라운관 tv", 0, false, 1);
      Tv tv2 = new Tv("LCD tv", 10, true, 1);
      Tv tv3 = new Tv("OLED tv", 1, true, 1);
      
      
      ArrayList<Tv> tvList = new ArrayList<Tv>();
      
      tvList.add(tv1);
      tvList.add(tv2);
      tvList.add(tv3);

      
      for (int i = 0; i < tvList.size(); i++) {
         System.out.println("----------------");
         tvList.get(i).info();
         System.out.println("----------------");
      }
      tvList.get(0).power();
      System.out.println(tvList.get(1).getName() + " 볼륨을 올립니다.");
      tv2.volumeUp();
      System.out.println(tvList.get(2).getName() + " 볼륨을 내립니다.");
      tv3.volumeDown();
      for (int i = 0; i < tvList.size(); i++) {
         System.out.println("=======볼륨 조절 후========");
         tvList.get(i).info();
         System.out.println("=======================");

//		ArrayList<Tv> tvList = new ArrayList<Tv>();
//
//		Tv tv = null;
//		
//
//		for (int i = 0; i < 100; i++) {
//			tv = new Tv("이젠TV", 3, true, 7);
//			tvList.add(tv);
//		}
//
//		System.out.println("tvList의 크기" + tvList.size());
//
//		for (int i = 0; i < tvList.size(); i++) {
//			tv = tvList.get(i);
//
//			tv.volumeUp();
//			tv.info();
		}

	}

}
