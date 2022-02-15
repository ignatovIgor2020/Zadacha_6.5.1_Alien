public class RoundAlien extends Alien{

    public RoundAlien(String planet, String name, int weight, double height){
        super(planet, name,  weight,  height);
    }

    @Override
    public void printHello(){
        System.out.println("Hello from roundAlien");
    }

    @Override
    public double moveStep(){
        return  (height * 2 * Math.PI);
    }
}
