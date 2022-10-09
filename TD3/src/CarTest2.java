


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.jupiter.api.Test;


public class CarTest2 {

    @Test
    public void testEquals() throws Exception {
        Car car1 = new Car("BMW", "42abc75", 15000);
        Car car2 = new Car("BMW", "42abc75", 15000);
        assertTrue(car1.equals(car2));
    }

    @Test
    public void testEquals2() throws Exception {
        Car c = new Car("BMW", "42abc75", 15000);
        assertFalse(c.equals(new String()));
    }

    @Test
    public void testContains1() throws Exception {
        Car car1 = new Car("BMW", "42abc75", 15000);
        Car car2 = new Car("BMW", "42abc75", 15000);
        ArrayList<Car> list = new ArrayList<>();
        list.add(car1);
        assertTrue(list.contains(car2));
    }

    @Test
    public void testContains2() throws Exception {
        Car car1 = new Car("BMW", "42abc75", 15000);
        Car car2 = new Car("BMW", "42abc75", 15000);
        HashSet<Car> set = new HashSet<>();
        set.add(car1);
        assertTrue(set.contains(car2));
    }

    @Test
    public void testNotContains1a() throws Exception {
        Car car1 = new Car("BMW", "42abc75", 15000);
        Car car2 = new Car("BMW", "42abc75", 25000);
        ArrayList<Car> list = new ArrayList<>();
        list.add(car1);
        assertTrue(!list.contains(car2));
    }

    @Test
    public void testNotContains1b() throws Exception {
        Car car1 = new Car("BMW", "42abc75", 15000);
        Car car2 = new Car("bmw", "42abc75", 15000);
        ArrayList<Car> list = new ArrayList<>();
        list.add(car1);
        assertTrue(!list.contains(car2));
    }

    @Test
    public void testNotContains2a() throws Exception {
        Car car1 = new Car("BMW", "42abc75", 15000);
        Car car2 = new Car("BMW", "42abc75", 25000);
        HashSet<Car> set = new HashSet<>();
        set.add(car1);
        assertTrue(!set.contains(car2));
    }

    @Test
    public void testNotContains2b() throws Exception {
        Car car1 = new Car("BMW", "42abc75", 15000);
        Car car2 = new Car("bmw", "42abc75", 15000);
        HashSet<Car> set = new HashSet<>();
        set.add(car1);
        assertTrue(!set.contains(car2));
    }



}
