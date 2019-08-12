package day04;

import java.util.Arrays;

public class Test04 {
public static void main (String[] args) {
	//배열 정의
	
	int[] scores ; // 배열 선언
	scores = new int[5]; // 배열 생성
	for(int i=0 ; i<5 ; i++ ) {
	System.out.print(scores[i]);
	 } 
	System.out.println();
	
	String[] name = new String[5];
	for	(int i=0 ; i<5 ; i++) {
	System.out.println(name[i]);
	}
	System.out.println("-----------------------------");
  
	scores[0]=99;
	scores[1]=100;
	scores[2]=69;
	scores[3]=79;
	scores[4]=89;
	
	name[0] = "홍길동";
	name[1] = "고길동";
	name[2] = "박길동";
	name[3] = "김길동";
	name[4] = "강길동";
	
	double avg = 0.0;
	double sum = 0;
	for (int i = 0; i < scores.length; i++) {
		sum += scores[i];
	}
	 avg = sum/scores.length;
	 System.out.println(Arrays.toString(scores));
	 System.out.println(Arrays.toString(name));
	 // 홍** 99점 평균이상
	 //System.out.printf("%d %f",sum,avg)
	 for (int i=0 ; i<name.length; i++) {
	 System.out.println(name[i].charAt(0)+"**  "+scores[i]+"  "+(scores[i] >= avg? "평균이상" : "평균미달"));
	 }
	}

}
