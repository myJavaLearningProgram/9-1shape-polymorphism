package com.github.hcsp.polymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void behaveCorrectly() {
        Shape square = new Square(1d);
        Assertions.assertEquals(1d, square.getArea());

        Shape rect = new Rectangle(1d, 2d);
        Assertions.assertEquals(2d, rect.getArea());

        Shape circle = new Circle(2d);
        Assertions.assertEquals(Math.PI, circle.getArea());
    }
}
