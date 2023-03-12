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

class Animal{
    public void poly(AnimalBehaviour ab){
        // ab.herbivorous();
        ab.carnivourous();
        ab.omnivourous();
        System.out.println("*****************************************");
    }
}

public class Runtime{
    public static void main(String[] args){
        Domestic dm = new Domestic();
        WildAnimals wa = new WildAnimals();
        Animal a = new Animal();
        a.poly(dm);
        a.poly(wa);
    }
}
