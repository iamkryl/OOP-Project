public class Kamadan extends Hero {
    public Kamadan() {
        super("Kamadan", 250, 200);
    }

    @Override
    public int attack(int choice) {
        int damage;
        int manaCost;

        switch (choice) {
            case 1:
                damage = 30;
                manaCost = 20;
                break;
            case 2:
                damage = 40;
                manaCost = 60;
                break;
            case 3:
                damage = 30;
                manaCost = 20;
                break;
            default:
                return -1; // Invalid choice
        }

        if (getMana() >= manaCost) {
            setMana(getMana() - manaCost); // Deduct mana
            return damage; // Return the damage dealt
        } else {
            return -2; // Not enough mana
        }
    }
}
