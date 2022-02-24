package com.bitcamp.web.test;

import java.util.Scanner;

public class HelloNameDemo {
    public static void main(String[] args){
        HelloNameApp hello = new HelloNameApp();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input ID: ");
        System.out.println("Input PW: ");
        System.out.println("Input Name: ");
        String id = scanner.next();
        String pw = scanner.next();
        String name = scanner.next();
        System.out.println("Output: ");
        hello.hello(id, pw, name);
    }
}
