public class Cat extends Animal {

    @Override
    protected String makeSound() {
        return "miaw";
    }

    @Override
    protected boolean foodType(String fish) {
        return true;
    }
}
