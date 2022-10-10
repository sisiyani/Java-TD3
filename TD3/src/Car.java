public class Car extends Vehicule{


    private int vetuste;

    public Car(String brand,String plate, long value) throws Exception {
        super(brand,plate,value);
        this.vetuste=0;
    }

    public Car(String brand,String plate, long value, int vetuste) throws Exception {
        super(brand,plate,value-(vetuste* 1000L));
        this.vetuste=vetuste;
    }

    public Car(String brand,String plate, long value, int vetuste,int discount) throws Exception {
        super(brand,plate,value-(vetuste* 1000L),discount);
        this.vetuste=vetuste;
    }

    public Car(String brand,String plate, long value, int vetuste,Discount discount) throws Exception {
        super(brand,plate,value-(vetuste* 1000L),discount);
        this.vetuste=vetuste;
    }

    public Car(String brand,String plate, long value,Discount discount) throws Exception {
        super(brand,plate,value,discount);
        this.vetuste=vetuste;
    }




    public int getVetuste() {
        return vetuste;
    }

    @Override
    public long realValue(){
            long res=this.getValue()-(vetuste* 1000L);
            if(this.getDiscount()!=null){
                return this.getDiscount().getValue();
            }
        return this.getValue()-(vetuste* 1000L);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + this.getBrand() + '\'' +
                ", value=" + this.getValue() +
                ",vetuste="+ vetuste+
                '}';
    }

    @Override
    public boolean equals(Object o){
        if(o.getClass()!= Car.class){
            return false;
        }
        Car c=(Car)o;
        System.out.println(super.equals(o));
        return super.equals(o) && this.getVetuste()==c.getVetuste();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (this.getBrand().hashCode() );
        result = prime * result + ((int)this.getValue());
        result = prime * result + this.vetuste;
        result = prime * result + ((this.getDiscount() == null) ? 0 : this.getDiscount().getValue());
        result = prime * result + ((this.getPlate() == null) ? 0 : this.getPlate().hashCode());
        return result;
    }


}

