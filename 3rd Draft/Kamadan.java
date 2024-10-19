public class Kamadan extends Hero {
    public Kamadan() {
        super("Kamadan", 250, 200);
    }

    @Override
    public void displayInfo() {
        System.out.println("Hero: " + getName() + " | Health: " + getHealth() + " | Mana: " + getMana());
    }
}
