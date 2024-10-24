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

    private static void upgrade(){
            System.out.println("You have leveled up! Choose an upgrade:");
            System.out.println("1. Increase MAXIMUM HEALTH (+50)");
            System.out.println("2. Increase MAXIMUM MANA (+50)");

            System.out.print("Enter your choice: ");
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
            int choiceCharacter = 0;

            Enemy[] enemies = {
                new Ada(),
                new Turing(),
            };

            
            System.out.println("Choose your character: ");
            System.out.println("1. Kamadan");
            System.out.println("2. Althreia");
            System.out.print("Enter choice: ");
            
            try {
                choiceCharacter = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input");
                scanner.next();
            }

            for (int i = 0; i < enemies.length; i++) {
            Enemy enemy = enemies[i];
            if(choiceCharacter == 1){
                int roundCounter = 1;
                System.out.println("You have chosen Kamadan");
                
                while (enemy.getHealth() > 0 && kamadan.getHealth() > 0) {
                    System.out.print("\nRound: " + roundCounter); // Print round number
                    System.out.println("\nKamadan's HP: " + kamadan.getHealth() + " | Mana: " + kamadan.getMana());
                    System.out.println(enemy.getName() + "'s HP: " + enemy.getHealth());
                   
                    System.out.println("\nChoose your attack:");
                    System.out.println("1. Syntax Sleuth (30 damage, 20 mana)");
                    System.out.println("2. Logic Master (40 damage, 60 mana)");
                    System.out.println("3. Loop Ninja (30 damage, 20 mana)");

                    System.out.print("Enter Attack: ");
                    int choiceAttack = scanner.nextInt();

                    int attackDamage = kamadan.attack(choiceAttack);
                    if (attackDamage == -1) {
                        simulateTyping("Invalid choice! No damage dealt, and " + enemy.getName() + " takes the chance to attack.");
                        if (enemy.getHealth() > 0) {
                            int adaSkill = random.nextInt(2);//Either ang first skill or ang second
                            int enemyDamage;//first skill damage(20) second skill damage (40)
                            String skillUsed;//ngalan sa skill after mapili sa randomizer either ang 1 or 2
                            
                            if(adaSkill == 0){
                                enemyDamage = 20;
                                skillUsed = enemy.getSkill1();
                            }else{
                                enemyDamage = 40;
                                skillUsed = enemy.getSkill2();
                            }

                            simulateTyping(enemy.getName() + " uses " + skillUsed + "! It deals " + enemyDamage + " damage.");
                            kamadan.setHealth(kamadan.getHealth() - enemyDamage);
                        }
                        continue;
                    } else if (attackDamage == -2) {
                        System.out.println("Not enough mana! You cannot attack.");
                    } else {
                        enemy.setHealth(enemy.getHealth() - attackDamage); 
                        System.out.println("You deal " + attackDamage + " damage to " + enemy.getName() + "!");
                    }

                    roundCounter++;

                    if (enemy.getHealth() > 0) {
                       if (enemy.getHealth() > 0) {
                            int adaSkill = random.nextInt(2);//Either ang first skill or ang second
                            int enemyDamage;//first skill damage(20) second skill damage (40)
                            String skillUsed;//ngalan sa skill after mapili sa randomizer either ang 1 or 2
                            
                            if(adaSkill == 0){
                                enemyDamage = 20;
                                skillUsed = enemy.getSkill1();
                            }else{
                                enemyDamage = 40;
                                skillUsed = enemy.getSkill2();
                            }

                            simulateTyping(enemy.getName() + " uses " + skillUsed + "! It deals " + enemyDamage + " damage.");
                            kamadan.setHealth(kamadan.getHealth() - enemyDamage);
                        }

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
                }
                simulateTyping("\nKamadan's HP: " + kamadan.getHealth() + " | Mana: " + kamadan.getMana());
                simulateTyping("\nWith one final strike, Kamadan defeats " + enemy.getName() + ". They stagger back, muttering in defeat...");
                upgrade();
                int upgradeChoice = scanner.nextInt();
                switch(upgradeChoice) {
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

                    if (i + 1 < enemies.length) {
                        enemy = enemies[i + 1]; // Move to the next enemy
                        simulateTyping("'You have defeated " + enemy.getName() + ",' a voice announces. 'Prepare for your next challenge: " + enemy.getName() + ".'");
                    } 
            }else if (choiceCharacter == 2){
                System.out.println("You have chosen Althreia");
               int roundCounter = 1;
                while (enemy.getHealth() > 0 && objAltreia.getHealth() > 0) {
                    System.out.print("\nRound: " + roundCounter); // Print round number
                    System.out.println("\nAltreia's HP: " + objAltreia.getHealth() + " | Mana: " + objAltreia.getMana());
                    System.out.println(enemy.getName() + "'s HP: " + enemy.getHealth());
                    
                    System.out.println("\nChoose your attack:");
                    System.out.println("1. Code Catalyst (20 damage, 15 mana)");
                    System.out.println("2. Focus Shield (35 damage, 50 mana)");
                    System.out.println("3. Syntax Strike (45 damage, 70 mana)");

                    System.out.print("Enter Attack: ");
                    int choiceAttack = scanner.nextInt();

                    int attackDamage = objAltreia.attack(choiceAttack);
                    if (attackDamage == -1) {
                        simulateTyping("Invalid choice! No damage dealt, and " + enemy.getName() + " takes the chance to attack.");
                        if (enemy.getHealth() > 0) {
                            int adaSkill = random.nextInt(2);//Either ang first skill or ang second
                            int enemyDamage;//first skill damage(20) second skill damage (40)
                            String skillUsed;//ngalan sa skill after mapili sa randomizer either ang 1 or 2
                            
                            if(adaSkill == 0){
                                enemyDamage = 20;
                                skillUsed = enemy.getSkill1();
                            }else{
                                enemyDamage = 40;
                                skillUsed = enemy.getSkill2();
                            }
                            simulateTyping(enemy.getName() + " uses " + skillUsed + "! It deals " + enemyDamage + " damage.");
                            objAltreia.setHealth(objAltreia.getHealth() - enemyDamage);
                        }
                        continue;
                    } else if (attackDamage == -2) {
                        System.out.println("Not enough mana! You cannot attack.");
                    } else {
                        enemy.setHealth(enemy.getHealth() - attackDamage); 
                        System.out.println("You deal " + attackDamage + " damage to " + enemy.getName() + "!");
                    }
                    
                    roundCounter++;
                    if (enemy.getHealth() > 0) {
                       if (enemy.getHealth() > 0) {
                            int adaSkill = random.nextInt(2);//Either ang first skill or ang second
                            int enemyDamage;//first skill damage(20) second skill damage (40)
                            String skillUsed;//ngalan sa skill after mapili sa randomizer either ang 1 or 2
                            
                            if(adaSkill == 0){
                                enemyDamage = 20;
                                skillUsed = enemy.getSkill1();
                            }else{
                                enemyDamage = 40;
                                skillUsed = enemy.getSkill2();
                            }
                            simulateTyping(enemy.getName() + " uses " + skillUsed + "! It deals " + enemyDamage + " damage.");
                            objAltreia.setHealth(objAltreia.getHealth() - enemyDamage);
                        }

                        if (objAltreia.getHealth() <= 0) {
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
    
            
                }

                simulateTyping("\nAltreia's HP: " + objAltreia.getHealth() + " | Mana: " + objAltreia.getMana());
                simulateTyping("\nWith one final strike, Altreia defeats " + enemy.getName() + ". They stagger back, muttering in defeat...");
            

                upgrade();
                int upgradeChoice = scanner.nextInt();
                switch(upgradeChoice) {
                    case 1:
                        objAltreia.setHealth(Math.min(objAltreia.getHealth() + 50, 250)); 
                        simulateTyping("Altreia increases her HEALTH! UPDATED HEALTH: " + objAltreia.getHealth());
                        break;
                    case 2:
                        objAltreia.setMana(Math.min(objAltreia.getMana() + 50, 200)); 
                        simulateTyping("Altreia increases her MANA! UPDATED MANA: " + objAltreia.getMana());
                        break;
                    default:
                        simulateTyping("Invalid choice! No upgrades applied.");
                }
            }else{
                System.out.println("Invalid! Please Try Again!");
            }

        }
        }        
    }
