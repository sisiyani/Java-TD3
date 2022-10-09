public class Bike extends Vehicule{


    public Bike(String brand,String plate,Discount discount) throws Exception {
        super(brand,plate,100L,discount);
    }

    public Bike(String brand,Discount discount) throws Exception {
        super(brand,100L,discount);
    }

    @Override
    public boolean equals(Object o){
        if(o.getClass()!= Bike.class){
            return false;
        }
        Vehicule c=(Vehicule)o;
        return this.getBrand().equals(c.getBrand()) && this.getValue()==c.getValue() && this.getPlate()==c.getPlate() ;
    }

}
