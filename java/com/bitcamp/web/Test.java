package com.example.test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * packageName: com.example.test
 * fileName   : TEst
 * author     : Jangwonjong
 * date       : 2022-02-23
 * desc       :
 * ======================================
 * DATE          AUTHOR            N FileWriter f1 = new FileWriter("data.txt");
 *        f1.write("Hello");
 *        f1.write("Java");
 *        f1.close();OTE
 * ======================================
 * 2022-02-23     Jangwonjong       최초 생성
 */
public class Test {
    public static void main(String[] args) throws IOException {
        //class : System, Math, FileWriter
        //instance : f1, f2

        System.out.println(Math.PI);
        System.out.println(Math.floor(1.8));
        System.out.println(Math.ceil(1.8));

       FileWriter f1 = new FileWriter("data.txt");
       f1.write("Hello");
       f1.write("Java");
       f1.close();

        FileWriter f2 = new FileWriter("data2.txt");
        f2.write("Hello");
        f2.write("Java2");
        f2.close();

    }
}
