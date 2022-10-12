public class Dog {

    private String breed, color, name;

    public Dog(String breed, String color, String name) {
        this.breed = breed;
        this.color = color;
        this.name = name;
    }

    public void bark() {
        System.out.println("Bark!");
    }

    public void rollInTheMud() {
        color = "Brown";
        System.out.println("You rolled in the mud! Your coat color is now: " + color);
    }

    public void getAdopted( String name ) {
        this.name = name;
        System.out.println("You just got adopted. Your new name is: " + name);
    }
}
