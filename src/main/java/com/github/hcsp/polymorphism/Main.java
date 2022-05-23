package com.github.hcsp.polymorphism;

public class Main {
    // 实现一个"形状"的继承体系：
    // 形状Shape为父类
    // 正方形Square、长方形Rectangle、圆Circle为子类
    // 子类覆盖父类求面积的多态方法getArea()
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {new Square(1.0), new Rectangle(1.0, 2.0), new Circle(1.0)};
        for (Shape shape : shapes) {
            System.out.println("" + shape.getClass().getSimpleName() + "的面积是：" + shape.getArea());
        }
    }
}
