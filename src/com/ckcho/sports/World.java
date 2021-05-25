package com.ckcho.sports;

import java.util.Arrays;

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
	
		System.out.println(
				Arrays.toString(shirts));
		
		System.out.println(league);
		String[] leagues = league.split("/");
		return ;
	}

}
	