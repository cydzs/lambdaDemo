package com.cydzs;

// 无返回值无参数
@FunctionalInterface
interface NrNp{
    void method();
}
// 无返回值1个参数
@FunctionalInterface
interface NrOp{
    void method(int a);
}
// 无返回值多个参数
@FunctionalInterface
interface NrMp{
    void method(int a,int b);
}
//有返回值无参数
@FunctionalInterface
interface ReNp{
    int method();
}
//有返回值一个参数
@FunctionalInterface
interface ReMp{
    int method(int a);
}
//5555
//有返回值多个参数
@FunctionalInterface
interface ReMps{
    int method(int a ,int b);
}
public class Test {
    public static void main(String[] args) {
        /**
        NrNp nrNp =()->{
            System.out.println("无返回值无参数");
        };**/
        NrNp nrNp =()-> System.out.println("无返回值无参数"); //简化版

        nrNp.method();

//        NrOp nrOp=(int a)->{
//            System.out.println("无返回值多个参数"+a);
//        };
        NrOp nrOp= a-> System.out.println("无返回值1个参数"+a); //简化版

        nrOp.method(10);

//        NrMp nrMp=(int a,int b)->{
//            System.out.println("无返回值多个参数"+a+"\t"+b);
//        };
        NrMp nrMp=(a, b)-> System.out.println("无返回值多个参数"+a+"\t"+b); //简化版

        nrMp.method(10,5);
        ReNp reNp =()->{
            System.out.println("有返回值无参数");
            return 10; //无简化
        };

        reNp.method();

        ReMp reMp = a->{
            System.out.println("有返回值一个参数"+a);
            return 10;
        };
        System.out.println(reMp.method(10));

        ReMps reMps = (a, b)->10;
        System.out.println(reMps.method(10,20));



    }

}
