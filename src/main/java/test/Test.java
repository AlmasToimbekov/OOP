package main.java.test;

import main.java.test.Exterior.Elements;
import main.java.test.Exterior.Engine;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Car simpleCar = new SimpleCar();
        simpleCar.exterior().setElement(Engine.getInstance("110"));

        List list = simpleCar.exterior().getElements();
        System.out.println(list.size());
    }
}
