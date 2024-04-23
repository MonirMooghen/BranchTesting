public class Dog extends Animal {

    @Override
    protected String makeSound(){
        return "woof";
    }

    @Override
    protected boolean foodType(String bone){
        return true;
    }
}
