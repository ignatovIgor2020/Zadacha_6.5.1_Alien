public class Alien {
    private String planet = new String("");
    private String name = new String("");
    int weight;
    double height;
    int koeficent=0;
    boolean vegaterian = true;
    public Alien(String planet, String name,int weight, double height){
        this.planet = planet;
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    public  void setVegaterian(boolean vegaterian){
        this.vegaterian = vegaterian;
    }

    public void printInfo(){
        System.out.println("Alien name is " + name + " planet is " + planet + " weight is " + weight + " height is " + height);
    }

    public double dinnerEatValue(){
        if(planet.equals("Nibury"))
            koeficent = 2;
        else
            koeficent = 1;
        if(vegaterian)
            return (height*weight * 0.03 * koeficent);
        else
            return (height*weight * 0.01 * koeficent);

    }
    public String getName(){
        return name;
    }
    public double moveStep(){
        return  (height * 0.2);
    }

    public void  printHello(){
        System.out.println("Hello");
    }
}
