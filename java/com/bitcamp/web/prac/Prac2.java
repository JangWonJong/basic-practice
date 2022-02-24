package com.bitcamp.web.prac;

/**
 * packageName: com.example.test
 * fileName   : Practice2
 * author     : Jangwonjong
 * date       : 2022-02-23
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-02-23     Jangwonjong       최초 생성
 * while문과 Math.random()메소드 이용
 * 2개의 주사위 던졌을 떄 나오는 눈 (눈1),(눈2)형태로 출력
 * 눈의 합이 5가 아니면 계속 주사위 실행
 * 눈의 합이 5이면 멈추는 코드 작성 14,23,32,41
 */
public class Prac2 {
    public static void main(String[] args) {

        while (true){
            int num1 = (int) (Math.random()*6)+1;
            int num2 = (int) (Math.random()*6)+1;
            int sum = num1 + num2;
            System.out.println(num1 +","+ num2+"\n"+sum);

            if (sum==5){break;}

        }
    }
}
