package com.bitcamp.web;

import java.util.Scanner;

public class Practice4 {
    int num1 = 0;
    int num2 = 0;
    String opcode = "";
    int num3 = 0;
    int num4 = 0;
    int num5 = 0;
    int num6 = 0;


    void calc(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자");
        num1 = scanner.nextInt();
        System.out.println("두번째 숫자");
        num2 = scanner.nextInt();
        System.out.println("연산기호");
        opcode = scanner.next();
        num3 = num1 + num2;
        num4 = num1 - num2;
        num5 = num1 * num2;
        num6 = num1 / num2;
        if (num3 == num1 + num2){
            System.out.println(num3);
            }else {

        }



    }
}
