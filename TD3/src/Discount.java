public class Discount {
    private int value;

    public Discount(int value) {
        if(value<0){
            throw new IllegalArgumentException("The value is negative");
        }
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o){
        if(o.getClass()!=Discount.class){
            return false;
        }
        Discount d=(Discount)o;
        return this.getValue()==d.getValue();
    }
}
