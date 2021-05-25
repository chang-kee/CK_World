package com.ckcho.world;

import java.util.Arrays;

public class World {

	public static void main(String[] args) {
		Park world = Park.공원;
		System.out.println("CK월드에 오신걸 환영합니다");
		Park park[] = Park.values();
		String.join("/", park.toString());
		System.out.println(
				Arrays.toString(park));

	}

}
	