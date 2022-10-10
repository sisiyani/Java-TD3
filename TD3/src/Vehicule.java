public abstract class Vehicule {
    private final String brand;
    private  long value;

    private final String plate;

    private Discount discount;

    protected Vehicule(String brand,long value) throws Exception {
        if (value<0){
            throw new IllegalArgumentException("The value cannot be negative\n");
        }
        if(brand==null){
            throw new NullPointerException("The brand is null");
        }

        this.brand = brand;
        this.plate=null;
        this.value = value;
        this.discount=null;
    }

    protected Vehicule(String brand, String plate,long value) throws Exception {
        if (value<0){
            throw new IllegalArgumentException("The value cannot be negative\n");
        }
        if(brand==null){
            throw new NullPointerException("The brand is null");
        }
        if(plate==null){
            throw new NullPointerException("The plate is null");
        }
        this.brand = brand;
        this.plate=plate;
        this.value = value;
        this.discount=null;
    }

    protected Vehicule(String brand,String plate, long value,int discount) throws Exception {
        if(brand==null){
            throw new NullPointerException("The brand is null");
        }

        if (value<0){
            throw new IllegalArgumentException("The value cannot be negative\n");
        }
        if(plate==null){
            throw new NullPointerException("The plate is null");
        }
        this.value=discount;
        this.brand = brand;
        this.plate=plate;

        this.discount=new Discount(discount);
    }

    protected Vehicule(String brand, long value,Discount discount) throws Exception {
        if(brand==null){
            throw new NullPointerException("The brand is null");
        }

        if (value<0){
            throw new IllegalArgumentException("The value cannot be negative\n");
        }
        if(discount!=null){
            this.value=discount.getValue();
        }
        else{
            this.value = value;
        }
        this.brand = brand;
        this.plate=null;
        this.discount=discount;
    }


    protected Vehicule(String brand,String plate, long value,Discount discount) throws Exception {
        if (value<0){
            throw new IllegalArgumentException("The value cannot be negative\n");
        }
        if(brand==null){
            throw new NullPointerException("The brand is null");
        }
        if(plate==null){
            throw new NullPointerException("The plate is null");
        }
        if(discount!=null){
            this.value=discount.getValue();
        }
        else{
            this.value = value;
        }
        this.plate=plate;
        this.brand = brand;
        this.discount=discount;
    }

    public String getPlate() {
        return plate;
    }

    public String getBrand() {
        return brand;
    }

    public long getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o){

        Vehicule c=(Vehicule)o;
        if(this.discount==null){
            return this.getBrand().equals(c.getBrand()) && this.getValue()==c.getValue() && this.getPlate().equals(c.getPlate() );
        }
        if(this.plate==null){
            return this.getBrand().equals(c.getBrand()) && this.getValue()==c.getValue() && this.getDiscount().equals(c.getDiscount());
        }
        return this.getBrand().equals(c.getBrand()) && this.getValue()==c.getValue() && this.getPlate().equals(c.getPlate() )&& this.getDiscount().equals(c.getDiscount());
    }

    public long realValue() {
         if(this.discount!=null){
             return discount.getValue();
         }
        return value;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount=discount;
        this.value=this.discount.getValue();

    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (this.getBrand().hashCode() );
        result = prime * result + ((int)this.getValue());
        result = prime * result + ((this.getDiscount() == null) ? 0 : this.getDiscount().getValue());
        result = prime * result + ((this.getPlate() == null) ? 0 : this.getPlate().hashCode());
        return result;
    }



}
