package com.bitcamp.web.test;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String nick = scanner.next();
        int age = scanner.nextInt();
        System.out.println("안녕 내 이름은 " +name+ "이야" );
        System.out.println(nick + "이라고도해");
        System.out.println("내 나이는" +age+ "이야" );

    }
}
