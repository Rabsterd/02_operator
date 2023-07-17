package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int member = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.printf("1인당 사탕 개수 : %d\n남는 사탕 개수 : %d\n", candy / member, candy % member );
		
	}

	public void practice2() {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		
		System.out.print("반 : ");
		int clas = sc.nextInt();
		
		System.out.print("번호 : ");
		int number = sc.nextInt();
		
		String gender = "남학생";
		System.out.println("성별 : " + gender);
		
		System.out.print("성적 : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n", grade, clas, number, name, gender, score);
		
	}
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : " );
		int kor = sc.nextInt();
		
		System.out.print("영어 : " );
		int eng = sc.nextInt();
		
		System.out.print("수학 : " );
		int math = sc.nextInt();
		
		System.out.printf("합계 : %d\n", kor + eng + math);
		
		System.out.printf("평균 : %.1f", (kor + eng + math)/3.0);
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		boolean result = (kor >= 40) && (eng >= 40) && (math >= 40) && (avg >= 60);
		System.out.println(result ? "합격" : "불합격");
		
	}
}
