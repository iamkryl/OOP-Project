import java.util.Random;
import java.util.Scanner;

public class SiITYou extends Kingdom {
    public SiITYou() {
        super("Si IT You");
    }

    private void simulateTyping(String message) {
        for (char c : message.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                System.err.println("An error occurred during the delay.");
            }
        }
        System.out.println();
    }

    private static void upgrade(Scanner scanner, Kamadan kamadan, Altreia altreia) {
        System.out.println("==============================================================");
        System.out.println("You have leveled up! Choose a character to upgrade:  ");
        System.out.println("1. Kamadan                                           ");
        System.out.println("2. Altreia                                           ");
        System.out.print("  Enter your choice: ");
        int characterChoice = scanner.nextInt();
        System.out.println("------------------------------------------------------");
        System.out.println("Choose an upgrade:");
        System.out.println("1. Increase MAXIMUM HEALTH (+50)");
        System.out.println("2. Increase MAXIMUM MANA (+50)");
        System.out.print("Enter your choice: ");
        int upgradeChoice = scanner.nextInt();
        System.out.println("==============================================================");


        switch (characterChoice) {
            case 1: // Kamadan
                if (upgradeChoice == 1) {
                    kamadan.setHealth(Math.min(kamadan.getHealth() + 50, 250));
                    System.out.println("Kamadan's HEALTH increased! UPDATED HEALTH: " + kamadan.getHealth());
                } else if (upgradeChoice == 2) {
                    kamadan.setMana(Math.min(kamadan.getMana() + 50, 200));
                    System.out.println("Kamadan's MANA increased! UPDATED MANA: " + kamadan.getMana());
                } else {
                    System.out.println("Invalid choice! No upgrades applied.");
                }
                break;
            case 2: // Altreia
                if (upgradeChoice == 1) {
                    altreia.setHealth(Math.min(altreia.getHealth() + 50, 250));
                    System.out.println("Altreia's HEALTH increased! UPDATED HEALTH: " + altreia.getHealth());
                } else if (upgradeChoice == 2) {
                    altreia.setMana(Math.min(altreia.getMana() + 50, 200));
                    System.out.println("Altreia's MANA increased! UPDATED MANA: " + altreia.getMana());
                } else {
                    System.out.println("Invalid choice! No upgrades applied.");
                }
                break;
            default:
                System.out.println("Invalid character choice! No upgrades applied.");
        }
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
        Altreia objAltreia = new Altreia();
        StoryLine objStoryLine = new StoryLine();
        int choiceCharacter = 0;

        Enemy[] enemies = {
            new Ada(),
            new Turing(),
        };

        for (int i = 0; i < enemies.length; i++) {
            Enemy enemy = enemies[i];
            boolean doneInput = false;
            int roundCounter = 1;

            System.out.println("\n-----------------------------------------------------------------------------------------");
            System.out.print("|      Kamadan's HP: " + kamadan.getHealth() + " | Mana: " + kamadan.getMana() + "     | Syntax Sleuth | Logic Master | Loop Ninja    |");
            System.out.println("\n-----------------------------------------------------------------------------------------");
            System.out.print("|      Altreia's HP: " + objAltreia.getHealth() + " | Mana: " + objAltreia.getMana() + "     | Code Catalyst | Focus Shield | Syntax Strike |");
            System.out.println("\n-----------------------------------------------------------------------------------------");

            while (!doneInput) {
                System.out.println("\nChoose your character: ");
                System.out.println("1. Kamadan");
                System.out.println("2. Altreia");
                System.out.print("Enter choice: ");

                try {
                    choiceCharacter = scanner.nextInt();
                    if (choiceCharacter == 1 || choiceCharacter == 2) {
                        doneInput = true;
                    } else {
                        System.out.println("Invalid input. Please enter 1 or 2.");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Try again.");
                    scanner.next();
                }
            }

            while (enemy.getHealth() > 0 && (choiceCharacter == 1 && kamadan.getHealth() > 0 || choiceCharacter == 2 && objAltreia.getHealth() > 0)) {
                System.out.println("\n------------------------------------------");
                System.out.println("|             SIITYOU KINGDOM            |");
                System.out.println("------------------------------------------");
                System.out.println("Round: " + roundCounter);

                if (choiceCharacter == 1) {
                    System.out.println("You have entered as \'Kamadan\'");
                    System.out.print("Kamadan's HP: " + kamadan.getHealth() + " | Mana: " + kamadan.getMana());
                } else {
                    System.out.println("You have entered as \'Altreia\'");
                    System.out.println("Altreia's HP: " + objAltreia.getHealth() + " | Mana: " + objAltreia.getMana());
                }
                System.out.println("\n" + enemy.getName() + "'s HP: " + enemy.getHealth());

                System.out.println("\nChoose your attack:");
                if (choiceCharacter == 1) {
                    System.out.println("1. Syntax Sleuth (30 damage, 20 mana)");
                    System.out.println("2. Logic Master (40 damage, 60 mana)");
                    System.out.println("3. Loop Ninja (30 damage, 20 mana)");
                } else {
                    System.out.println("1. Code Catalyst (20 damage, 25 mana)");
                    System.out.println("2. Focus Shield (35 damage, 40 mana)");
                    System.out.println("3. Syntax Strike (45 damage, 55 mana)");
                }

                System.out.print("\nEnter Attack: ");
                int choiceAttack = scanner.nextInt();
                int attackDamage;

                if (choiceCharacter == 1) {
                    attackDamage = kamadan.attack(choiceAttack);
                } else {
                    attackDamage = objAltreia.attack(choiceAttack);
                }

                if (attackDamage == -1) {
                    simulateTyping("Invalid choice! No damage dealt, and " + enemy.getName() + " takes the chance to attack.");
                } else if (attackDamage == -2) {
                    System.out.println("Not enough mana! You cannot attack.");
                } else {
                    enemy.setHealth(enemy.getHealth() - attackDamage); 
                    System.out.println("You deal " + attackDamage + " damage to " + enemy.getName() + "!");
                }

                if (enemy.getHealth() > 0) {
                    int adaSkill = random.nextInt(2);
                    int enemyDamage = (adaSkill == 0) ? 20 : 40;
                    String skillUsed = (adaSkill == 0) ? enemy.getSkill1() : enemy.getSkill2();

                    simulateTyping(enemy.getName() + " uses " + skillUsed + "! It deals " + enemyDamage + " damage.\n");

                    if (choiceCharacter == 1) {
                        kamadan.setHealth(kamadan.getHealth() - enemyDamage);
                    } else {
                        objAltreia.setHealth(objAltreia.getHealth() - enemyDamage);
                    }

                    roundCounter++;
                    if (choiceCharacter == 1 && kamadan.getHealth() <= 0){
                        simulateTyping("Kamadan collapses to the ground, her vision fading...");
                        objStoryLine.gameover();
                        System.exit(0);
                    } else if (choiceCharacter == 2 && objAltreia.getHealth() <= 0){
                        simulateTyping("Altreia collapses to the ground, her vision fading...");
                        objStoryLine.gameover();
                        System.exit(0);
                    } else{
                        doneInput = false;
                        while (!doneInput) {
                            System.out.println("Choose your character for the next round:");
                            System.out.println("1. Kamadan");
                            System.out.println("2. Altreia");
                            System.out.print("Enter choice: ");
        
                            try {
                                choiceCharacter = scanner.nextInt();
                                if (choiceCharacter == 1 || choiceCharacter == 2) {
                                    doneInput = true;
                                } else {
                                    System.out.println("Invalid input. Please enter 1 or 2.\n");
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                scanner.next();
                            }
                        }
                    }                   
                }
            }

            simulateTyping("With one final strike, Kamadan and Altreia both defeat " + enemy.getName() + "...\n");
            upgrade(scanner, kamadan, objAltreia);
        }
        System.out.println("");
        objStoryLine.shangUnlock();
        objStoryLine.thirdNarration();
        objStoryLine.questThree();
    }
}
