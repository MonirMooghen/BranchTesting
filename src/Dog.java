public class Dog extends Animal {

    @Override
    protected String makeSound(){
        return "woof";
    }

    @Override
    protected boolean foodType(String bone){
        return true;
    }

    @Override
    protected String showMood(boolean isHappy){
        if (isHappy) {
            return "logrer";
        } else {
            return "knurrer";
        }
    }
}
