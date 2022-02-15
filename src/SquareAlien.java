public class SquareAlien extends Alien{

    public SquareAlien(String planet, String name, int weight, double height){
        super(planet, name,  weight,  height);
    }

    @Override
    public void printHello(){
        System.out.println("Hello from SquareAlien");
    }

    @Override
    public double moveStep(){
        return  (height / 4);
    }

}
