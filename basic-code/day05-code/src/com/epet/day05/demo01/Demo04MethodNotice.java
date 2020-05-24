package com.epet.day05.demo01;

public class Demo04MethodNotice {

    public static void main(String[] args) {

//        int b = SumTow(1, 12);
//
//        System.out.println(b);

//        StringTest();
        StringTes2();
    }

    public static int SumTow(int a, int b) {

        return a + b;

    }

    public static void StringTest() {


        String[] hello = new String[5];

        hello[0] = "hello ";

        System.out.println(hello[1]);
    }

    public static void StringTes2() {


        String[] hello = new String[]{"cc", "bb", "cc"};


        System.out.println(hello[1]);
    }
}
