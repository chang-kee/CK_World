package com.ckcho.sports;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class World {

	public static void main(String[] args) {
		Sports aworld = Sports.라리가;
		System.out.println("CK월드에 오신걸 환영합니다");
		Sports shirts[] = Sports.values();
		
		
		/**
		 *  나중에 Enum List 사용하여 깔끔하게 정리
		 */
		String league = String.join("/",
				Sports.라리가.toString() + (Sports.라리가.ordinal() + 1),
				Sports.세리에.toString() + (Sports.세리에.ordinal() + 1),
				Sports.분데스리가.toString() +(Sports.분데스리가.ordinal() + 1) );
	
		System.out.println(league);
		int idx = LocalDate.now().getDayOfYear() % shirts.length;

		
		String weekDay = LocalDateTime.now().format(
				DateTimeFormatter.ofPattern("E") //  E =>Weekday
				.withLocale(Locale.KOREAN));
		System.out.println(weekDay + "요일 스페셜: " + shirts[idx]);		

		System.out.println("원하는 유니폼 종류를 입력: ");
		
		Scanner scanner = new Scanner(System.in);
		int 제품번호 = scanner.nextInt();

		
		Sports worlds = Sports.values()[제품번호 -1]; 
		switch (worlds) {
		case 라리가:
			System.out.println("라리가를 선택하셨습니다.");
			break;
		case 세리에:
			System.out.println("세리에를 선택하셨습니다.");
			break;
		case 분데스리가:
			System.out.println("분데스리가를 선택하셨습니다.");
			// break;
		default:
			break;
		}
		scanner.close();
		
		return ;
	}

}
	