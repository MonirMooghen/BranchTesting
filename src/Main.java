public class Main {
    public static void main(String[] args) {
        Dog muffer = new Dog();
        Cat pishi = new Cat();

        System.out.println(pishi.makeSound());
        System.out.println(muffer.makeSound());
        System.out.println(pishi.foodType("fish"));
        System.out.println(muffer.foodType("bone"));
    }
}