package com.ckcho.sports;

import java.util.Scanner;

public class World {

	public static void main(String[] args) {
		Sports world = Sports.이피엘;
		System.out.println("CK월드에 오신걸 환영합니다");
		Sports shirts[] = Sports.values();
		
		
		/**
		 *  나중에 Enum List 사용하여 깔끔하게 정리
		 */
		String league = String.join("/",
				Sports.라리가.toString(),
				Sports.세리에.toString(),
				Sports.분데스리가.toString() );
	
		System.out.println(league);
		System.out.println("원하는 유니폼 종류를 입력: ");
		
		Scanner scanner = new Scanner(System.in);
		int 제품번호 = scanner.nextInt();
		System.out.println("제품번호" + 제품번호 + "를 선택하셨습니다");
		scanner.close();
		
		return ;
	}

}
	