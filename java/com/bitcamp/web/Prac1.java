package com.example.test;

import java.util.Scanner;

/**
 * packageName: com.example.test
 * fileName   : Practice1
 * author     : Jangwonjong
 * date       : 2022-02-23
 * desc       : 자바 책 공부 (for문)
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-02-23     Jangwonjong       최초 생성
 * 1부터 100까지의 정수 중 3의 배수의 총합 구하는 코드 작성
 */
public class Prac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("3의 배수 총합 구하기");
        int sum = 0;

        for(int i=1;i<=100;i++){
            if(i%3==0){
                sum += i;
            }
        }
        System.out.println(sum);
    }

}
