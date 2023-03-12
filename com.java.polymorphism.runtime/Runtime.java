class AnimalBehaviour{
    public void herbivorous(){
        System.out.println("Pure vegeterian animal");
    }
    public void carnivourous(){
        System.out.println("Pure Non-Vegeterian animal");
    }
    public void omnivourous(){
        System.out.println("Both eats veg as well as non-veg");
    }
}
class Domestic extends AnimalBehaviour{
    public void omnivourous(){
        System.out.println("Mostly vegereterian but occassionaly nonveg fine");
    }
}
class WildAnimals extends AnimalBehaviour{
    public void carnivourous(){
        System.out.println("Mostly nonvegeterian but some are herbivorous");
    }
}

public class Runtime{
    public static void main(String[] args){
        Domestic dm = new Domestic();
        AnimalBehaviour ab; //Parent class reference
        ab = dm;
        ab.herbivorous();
        ab.omnivourous();
        System.out.println("**************************************************");
        WildAnimals wa = new WildAnimals();
        ab = wa;// single ref many forms polymorphism
        ab.carnivourous();
        ab.herbivorous();

    }
}