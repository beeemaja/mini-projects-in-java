package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    public int top;
    public int left;
    public int width;
    public int height;

    public void initialize(int top, int left){
        this.top = top;
        this.left = left;
        width = 0;
        height = 0;
    }

    public void initialize(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        height = width;
    }
    public void initialize(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public void initialize(Rectangle rectangle){
        this.height = rectangle.height;
    }
    public static void main(String[] args) {

    }
}
