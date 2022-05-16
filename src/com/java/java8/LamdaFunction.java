package com.java.java8;

public class LamdaFunction {

    public static void main(String[] args) {
        int width=10;

        //without lambda, Drawable implementation using anonymous class
        Dwrable d=new Dwrable(){
            public void draw(){System.out.println("Drawing "+width);}
        };
        d.draw();


        //with lambda
        Dwrable d2=()->{
            System.out.println("Drawing "+width);
        };
        d2.draw();
    }

}
