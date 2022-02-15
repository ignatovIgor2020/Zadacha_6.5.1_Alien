public class FourLegsAlien extends Alien {

    public FourLegsAlien(String planet, String name, int weight, double height){
        super(planet, name,  weight,  height);
    }

    @Override
    public void printHello(){
        System.out.println("Hello from FourLegsAlien");
    }

    @Override
    public double moveStep(){
        return  (height / 3);
    }
}
