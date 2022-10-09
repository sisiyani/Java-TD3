

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class DiscountTest {

    @Test
    public void testInvalidValue() {

        assertThrows(IllegalArgumentException.class, () -> new Discount(-1));
    }

    @Test
    public void testEquals() {
        Discount discount1 = new Discount(2300);
        Discount discount2 = new Discount(2300);
        assertEquals(discount1, discount2);
    }

    @Test
    public void vehiculeWithDiscount() throws Exception {
        Discount discount = new Discount(1000);
        Vehicule v1 = new Car("Peugeot", "42abc75", 1200, discount);
        Vehicule v2 = new Bike("Peugeot", discount);

        assertEquals(discount.getValue(), v1.getValue());
        assertEquals(discount.getValue(), v2.getValue());
    }

    @Test
    public void vehiculeWithDiscount2() throws Exception {
        Vehicule v1 = new Car("Peugeot", "42abc75", 1000, null);
        Vehicule v2 = new Bike("Peugeot", null);
        Discount discount = new Discount(1500);
        v1.setDiscount(discount);
        v2.setDiscount(discount);
        System.out.println(discount.getValue());
        System.out.println(v1.getValue());
        assertEquals(discount.getValue(), v1.getValue());
        assertEquals(discount.getValue(), v2.getValue());
    }

    @Test
    public void carEquals() throws Exception {
        Car car1 = new Car("Peugeot", "42abc75", 10000, new Discount(1500));
        Car car2 = new Car("Peugeot", "42abc75", 10000, new Discount(1500));
        assertEquals(car1, car2);
    }

    @Test
    public void bikeEquals() throws Exception {
        Bike bike1 = new Bike("Peugeot", new Discount(7000));
        Bike bike2 = new Bike("Peugeot", new Discount(7000));
        assertEquals(bike1, bike2);
    }

}
