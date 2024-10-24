import java.util.Random;
import java.util.Scanner;

public class SiITYou extends Kingdom {
    public SiITYou() {
        super("Si IT You");
    }

    @Override
    public void enter() {
        System.out.println("\t\t\t\tWelcome to " + name + ", the land of coding challenges!");
    }

    @Override
    public void startQuest() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Kamadan kamadan = new Kamadan();
        Altreia altreia = new Altreia(); // Instantiate Altreia
        Ada objAda = new Ada();
        int choiceCharacter = 0;
        int roundCounter = 1; // Initialize roundCounter here

        System.out.println("Choose your character: ");
        System.out.println("1. Kamadan");
        System.out.println("2. Altreia");
        System.out.print("Enter choice: ");

        try {
            choiceCharacter = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input");
            scanner.next(); // Clear invalid input
        }

        if (choiceCharacter == 1) {
            System.out.println("You have chosen Kamadan");
        } else if (choiceCharacter == 2) {
            System.out.println("You have chosen Altreia");
        } else {
            System.out.println("Invalid choice! Defaulting to Kamadan.");
            choiceCharacter = 1; 
        }

        Hero currentHero = (choiceCharacter == 1) ? kamadan : altreia;

        while (objAda.getHealth() > 0 && currentHero.getHealth() > 0) {
            System.out.print("\nRound: " + roundCounter); // Print round number

            System.out.println("\n" + currentHero.getName() + "'s HP: " + currentHero.getHealth() + " | Mana: " + currentHero.getMana());
            System.out.println(objAda.getName() + "'s HP: " + objAda.getHealth());

            System.out.println("\nChoose your attack:");
            if (choiceCharacter == 1) {
                System.out.println("1. Syntax Sleuth (30 damage, 20 mana)");
                System.out.println("2. Logic Master (40 damage, 60 mana)");
                System.out.println("3. Loop Ninja (30 damage, 20 mana)");
            } else {
                System.out.println("1. Code Catalyst (30 damage, 15 mana)");
                System.out.println("2. Focus Shield (35 damage, 50 mana)");
                System.out.println("3. Syntax Strike (45 damage, 70 mana)");
            }

            System.out.print("Enter Attack: ");
            int choiceAttack = scanner.nextInt();

            int attackDamage = currentHero.attack(choiceAttack);
            if (attackDamage == -1) {
                simulateTyping("Invalid choice! No damage dealt, and " + objAda.getName() + " takes the chance to attack.");
                if (objAda.getHealth() > 0) {
                    int adaSkill = random.nextInt(2);
                    int enemyDamage = (adaSkill == 0) ? 20 : 40;
                    String skillUsed = (adaSkill == 0) ? objAda.getSkill1() : objAda.getSkill2();

                    simulateTyping(objAda.getName() + " uses " + skillUsed + "! It deals " + enemyDamage + " damage.");
                    currentHero.setHealth(currentHero.getHealth() - enemyDamage);
                }
                continue;
            } else if (attackDamage == -2) {
                System.out.println("Not enough mana! You cannot attack.");
            } else {
                objAda.setHealth(objAda.getHealth() - attackDamage);
                System.out.println("You deal " + attackDamage + " damage to " + objAda.getName() + "!");
            }

            roundCounter++; 

            if (objAda.getHealth() > 0) {
                int adaSkill = random.nextInt(2);
                int enemyDamage = (adaSkill == 0) ? 20 : 40;
                String skillUsed = (adaSkill == 0) ? objAda.getSkill1() : objAda.getSkill2();

                simulateTyping(objAda.getName() + " uses " + skillUsed + "! It deals " + enemyDamage + " damage.");
                currentHero.setHealth(currentHero.getHealth() - enemyDamage);
            }

            if (currentHero.getHealth() <= 0) {
                simulateTyping(currentHero.getName() + " collapses to the ground, her vision fading. The laughter of her foes echoes as the screen fades to black...");
                System.exit(0);
            }
        }

        simulateTyping("\n" + currentHero.getName() + "'s HP: " + currentHero.getHealth() + " | Mana: " + currentHero.getMana());
        simulateTyping("\nWith one final strike, " + currentHero.getName() + " defeats " + objAda.getName() + ". They stagger back, muttering in defeat...");

        System.out.println("You have leveled up! Choose an upgrade:");
        System.out.println("1. Increase MAXIMUM HEALTH (+50)");
        System.out.println("2. Increase MAXIMUM MANA (+50)");

        System.out.print("Enter your choice: ");
        int upgradeChoice = scanner.nextInt();
        switch (upgradeChoice) {
            case 1:
                currentHero.setHealth(Math.min(currentHero.getHealth() + 50, 250));
                simulateTyping(currentHero.getName() + " increases her HEALTH! UPDATED HEALTH: " + currentHero.getHealth());
                break;
            case 2:
                currentHero.setMana(Math.min(currentHero.getMana() + 50, 200));
                simulateTyping(currentHero.getName() + " increases her MANA! UPDATED MANA: " + currentHero.getMana());
                break;
            default:
                simulateTyping("Invalid choice! No upgrades applied.");
        }
    }

    private void simulateTyping(String message) {
        for (char c : message.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(10); 
            } catch (InterruptedException e) {
                System.err.println("An error occurred during the delay.");
            }
        }
        System.out.println();
    }
}
