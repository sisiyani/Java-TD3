import java.util.ArrayList;
import java.util.Objects;

public class Garage {
    private ArrayList<Vehicule> cars;
    private final int id;
    private static int cpt=0;

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

    public long garageValue(){
        long sum=0;
        for(Vehicule car:cars){
            sum+=car.realValue();
        }
        return sum;
    }

    public Vehicule firstCarByBrand(String brand){
        for(Vehicule car:cars){
            if(car.getBrand()==brand){
                return car;
            }
        }
        return null;
    }

    public void remove(Car c){
        cars.remove(c);
    }

    public void protectionism(String brand){
        for(Vehicule car:cars){
            if(car.getBrand()==brand){
                cars.remove(car);
            }
        }
    }

    public void add(Vehicule vehicule) {
        cars.add(vehicule);
    }
}
