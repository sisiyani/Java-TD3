import java.util.*;

public class Garage {
    private List<Vehicule> cars;
    private final int id;
    private static int cpt=0;

    public static Comparator<Vehicule> Comparator = new Comparator<Vehicule>() {

        @Override
        public int compare(Vehicule e1, Vehicule e2) {
            return (int) (e1.hashCode() - e2.hashCode());
        }
    };

    public Garage() {
        cpt++;
        this.cars = new ArrayList<>();
        this.id=cpt;
    }

    public void adding_car(Vehicule car){
        Objects.requireNonNull(car,"car must not be null\n");
        cars.add(car);

    }

    public int getId() {
        return id;
    }

    public String toString(){
        StringBuilder str= new StringBuilder("Garage id: "+this.getId()+"\n");
        return str.toString();
    }

    public long getValue(){
        long sum=0;
        for(Vehicule car:cars){
            sum+=car.realValue();
        }
        return sum;
    }

    public Vehicule firstCarByBrand(String brand){
        if(brand==null){
            throw new NullPointerException("the brand is null\n");
        }
        for(Vehicule car:cars){
            if(car.getBrand()==brand){
                return car;
            }
        }
        return null;
    }

    public void remove(Vehicule c){
        if(!cars.remove(c)){
            throw new IllegalStateException("This car is not present");
        }
    }

    public void protectionism(String brand){
        for(int i=cars.size()-1;i>-1;i--){
            if(cars.get(i).getBrand().equals(brand)){
                cars.remove(cars.get(i));
            }
        }
    }

    public void add(Vehicule vehicule) {
        if(vehicule ==null){
            throw new NullPointerException("vehicule null");
        }
        cars.add(vehicule);
        cars.sort(Comparator);


    }

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass()!=Garage.class){
            return false;
        }
        Garage a=(Garage) obj;
        List<Vehicule> acars=a.getCars();
        for(int i=0;i<cpt;i++){
            if(!cars.get(i).equals(acars.get(i))){
                return false;
            }
        }
        return true;
    }

    public List<Vehicule> getCars() {
        return cars;
    }

    public void compare(List<Vehicule> v){
        v.sort(Comparator);
        this.cars.sort(Comparator);

    }
}
