public class Shang extends Hero {
    
    public Shang() {
        super("Shang", 280, 250); 
    }
    
    @Override
    public int attack(int choice) {
        int damage;
        int manaCost;

        switch (choice) {
            case 1:
                damage = 25;
                manaCost = 40;
                break;
            case 2:
                damage = 40;
                manaCost = 60;
                break;
            case 3:
                damage = 50;
                manaCost = 70;
                break;
            case 4:
                damage = 15;
                manaCost = 0;
                setMana(getMana() + 20);
                break;
            default:
                return -1; 
        }

        if (getMana() >= manaCost) {
            setMana(getMana() - manaCost); 
            return damage; 
        } else {
            return -2; 
        }
    }
}
