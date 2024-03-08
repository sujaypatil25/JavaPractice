package org.example;

public class SwapTwoNumber {

    int a = 17;
    int b = 97;

    public void numbersToSwap(){
        System.out.println(a+" <--> "+b);
    }
    public void using3rdVarible() {
        int x=a;
        a=b;
        b=x;
        System.out.println(a+" <--> "+b);
    }

    public void usingPlusMinus(){
        a=a+b; //10+20
        b=a-b; //30-20
        a=a-b; //30-10
        System.out.println(a+" <--> "+b);
    }

    public void usingMultiplyDivide(){
        a=a*b; //10*20
        b=a/b; //200/20
        a=a/b; //200/10
        System.out.println(a+" <--> "+b);
    }
}
