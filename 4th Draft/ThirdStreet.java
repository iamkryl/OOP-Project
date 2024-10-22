import java.util.Random;
import java.util.Scanner;

public class ThirdStreet extends Kingdom {
    public ThirdStreet() {
        super("Third Street");
    }

    @Override
    public void enter() {
        System.out.println("\t\t\t   Welcome to " + name + ", the land of coding challenges!");
    }

    @Override
        public void startQuest() {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            Kamadan kamadan = new Kamadan();
            StoryLine objStoryLine = new StoryLine();

            Enemy[] enemies = {
                new Boozy(),
                new Sloshed(),
                new Jager()
            };

            for (int i = 0; i < enemies.length; i++) {
                Enemy enemy = enemies[i];
                int roundCounter = 1; // Initialize the round counter
                while (enemy.getHealth() > 0 && kamadan.getHealth() > 0) {
                    System.out.println("\nRound: " + roundCounter); // Display the current round
                    System.out.println("Kamadan's HP: " + kamadan.getHealth() + " | Mana: " + kamadan.getMana());
                    System.out.println(enemy.getName() + "'s HP: " + enemy.getHealth());
                    System.out.println("\nChoose your attack:");
                    System.out.println("1. Syntax Sleuth (30 damage, 20 mana)");
                    System.out.println("2. Logic Master (40 damage, 60 mana)");
                    System.out.println("3. Loop Ninja (30 damage, 20 mana)");

                    System.out.print("Attack Chosen: ");
                    int choice = scanner.nextInt();

                    int attackDamage = kamadan.attack(choice);
                    if (attackDamage == -1) {
                        simulateTyping("Invalid choice! No damage dealt, and " + enemy.getName() + " takes the chance to attack.");
                        if (enemy.getHealth() > 0) {
                            int enemyDamage = random.nextInt((i == 0 ? 21 : (i == 1 ? 41 : 36)));
                            simulateTyping(enemy.getName() + " uses " + enemy.getSkill() + "! It deals " + enemyDamage + " damage.");
                            kamadan.setHealth(kamadan.getHealth() - enemyDamage);
                        }
                        continue;
                    } else if (attackDamage == -2) {
                        System.out.println("Not enough mana! You cannot attack.");
                    } else {
                        enemy.setHealth(enemy.getHealth() - attackDamage); // Deal damage to enemy
                        System.out.println("You deal " + attackDamage + " damage to " + enemy.getName() + "!");
                    }

                    // Enemy attacks if still alive
                    if (enemy.getHealth() > 0) {
                        int enemyDamage = random.nextInt((i == 0 ? 21 : (i == 1 ? 41 : 36)));
                        simulateTyping(enemy.getName() + " uses " + enemy.getSkill() + "! It deals " + enemyDamage + " damage.");
                        kamadan.setHealth(kamadan.getHealth() - enemyDamage);

                        // Check if Kamadan's health is 0 after enemy attack
                        if (kamadan.getHealth() <= 0) {
                            simulateTyping("Kamadan collapses to the ground, her vision fading. The laughter of her foes echoes as the screen fades to black...");

                            System.out.println();
    
                            System.out.println(" ░▒▓██████▓▒░ ░▒▓██████▓▒░░▒▓██████████████▓▒░░▒▓████████▓▒░▒▓██████▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░▒▓███████▓▒░  ");
                            System.out.println("░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░     ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░ ");
                            System.out.println("░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░     ░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░ ");
                            System.out.println("░▒▓█▓▒▒▓███▓▒░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓██████▓▒░░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒▒▓█▓▒░░▒▓██████▓▒░ ░▒▓███████▓▒░  ");
                            System.out.println("░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░     ░▒▓█▓▒░░▒▓█▓▒░ ░▒▓█▓▓█▓▒░ ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░ ");
                            System.out.println("░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░     ░▒▓█▓▒░░▒▓█▓▒░ ░▒▓█▓▓█▓▒░ ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░ ");
                            System.out.println("░▒▓██████▓▒░░ ▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░▒▓██████▓▒░   ░▒▓██▓▒░  ░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░ ");
                            
                            System.exit(0);
                        }
                    }
    
                    roundCounter++; // Increment the round counter after each round
                }

                // After defeating an enemy
                simulateTyping("\nKamadan's HP: " + kamadan.getHealth() + " | Mana: " + kamadan.getMana());
                simulateTyping("\nWith one final strike, Kamadan defeats " + enemy.getName() + ". They stagger back, muttering in defeat...");

                // Level-up choice
                System.out.println("You have leveled up! Choose an upgrade:");
                System.out.println("1. Increase MAXIMUM HEALTH (+50)");
                System.out.println("2. Increase MAXIMUM MANA (+50)");

                System.out.print("Enter your choice: ");
                int upgradeChoice = scanner.nextInt();
                switch (upgradeChoice) {
                    case 1:
                        kamadan.setHealth(Math.min(kamadan.getHealth() + 50, 250)); 
                        simulateTyping("Kamadan increases her HEALTH! UPDATED HEALTH: " + kamadan.getHealth());
                        break;
                    case 2:
                        kamadan.setMana(Math.min(kamadan.getMana() + 50, 200)); 
                        simulateTyping("Kamadan increases her MANA! UPDATED MANA: " + kamadan.getMana());
                        break;
                    default:
                        simulateTyping("Invalid choice! No upgrades applied.");
                }

                if (i < enemies.length - 1) {
                    simulateTyping("'You have defeated " + enemy.getName() + ",' a voice announces. 'Prepare for your next challenge: " + enemies[i + 1].getName() + ".'");
                }
            }

            simulateTyping("\nKamadan stands victorious. The streets are quiet now.");
            simulateTyping("She takes a deep breath and prepares for the next trial.");
            System.out.println();
            System.out.println( "============================================================================================================================");

            objStoryLine.secondNarration();
            scanner.close();
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