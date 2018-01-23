package com.chenyu;

/**
 * @author yu_chen
 * @create 2018-01-22 14:18
 **/
public class Client {

    public static void main(String[] args) {
        Student build = Student.builder().id("aa").name("asd").build();
        System.out.println(build.toString());

        String s = Student.builder().toString();
        System.out.println(s);
    }
}
