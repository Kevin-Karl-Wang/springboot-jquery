package com.kevin.java8;


/**
 * Created by kevin on 2017/6/14.
 */
public class TestLambde {


    final static String salutation = "Hello! ";


    public static void main(String[] args) {
//
//        GreetingService service = message ->
//                System.out.println(salutation + message);
//
//        service.sayMessage("Runoob");
//
//
//        TestLambde testLambde = new TestLambde();
//        //类型声明
//        IntBinaryOperator addition = (int a, int b) -> a + b;
//
//        //不用类型声明
//        IntBinaryOperator subtraction = (a, b) -> a - b;
//
//        IntBinaryOperator multiplication = (int a, int b) -> {
//            return a * b;
//        };
//
//        IntBinaryOperator division = (int a, int b) -> a / b;


        System.out.println(3*0.1 == 0.3);

        float f=(float)3.4;

    }

    interface GreetingService {
        void sayMessage(String message);
    }

}
