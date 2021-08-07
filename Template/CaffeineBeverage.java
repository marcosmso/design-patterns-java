// The Template Method Pattern defines the skeleton of an algorithm in a method,
// deferring some steps to subclasses. Template Method lets subclasses redefine certain
// steps of an algorithm without changing the algorithm’s structure.

public abstract class CaffeineBeverage {

    void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()){
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    public void pourInCup(){
        System.out.println("Pouring into cup");
    }

    public void boilWater(){
        System.out.println("Boiling water");
    }

    boolean customerWantsCondiments(){
        return true;
    }
    
}
