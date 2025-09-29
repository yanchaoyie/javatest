package com.ycy.OverrideExercise;

public class Main {
    public static void main(String[] args) {
        A a = new B();
        a.sum();
        a.sum1();
    }
}

class A{
    public int i = 10;

    public void sum(){
        System.out.println(i + 10);
    }

    public void sum1(){
        System.out.println(10 + getI());
    }

    public int getI(){
        return i;
    }

}

class B extends A{
    public int i = 20;

//    public void sum(){
//        System.out.println(i + 10);
//    }

//    public void sum1(){
//        System.out.println(20 + getI());
//    }

    public int getI(){
        return i;
    }

}