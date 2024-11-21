import java.util.Random;
import java.util.Scanner;

public class SiITYou extends Kingdom {
    BackgroundMusic bgMusic = new BackgroundMusic("soundeffects/gameover.aiff"); 
    private Kamadan kamadan;
    private Altreia altreia;
    public SiITYou(Kamadan kamadan,Altreia altreia, BackgroundMusic bgMusic) {
        super("Si IT You", kamadan,altreia);
        this.kamadan = kamadan;
        this.bgMusic = bgMusic;
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

    private static void resetStats(Kamadan objKamadan, Altreia objAltreia, Shang objShang){
        objKamadan.setHealth(250);
        objKamadan.setMana(200);
        objAltreia.setHealth(230);
        objAltreia.setMana(250);
        objShang.setHealth(280);
        objShang.setMana(250);
    }

    private static void upgrade() {
        System.out.println("\nYou have leveled up! Choose an upgrade:");
        System.out.println("1. Increase MAXIMUM HEALTH (+50)");
        System.out.println("2. Increase MAXIMUM MANA (+50)");

        System.out.print("Enter your choice: ");
    }

    final String WHITE = "\u001B[97m";
    final String RED = "\u001B[31m";   
    final String GREEN = "\u001B[32m";  
    final String BLUE = "\u001B[34m";    
    final String RESET = "\u001B[0m";   
    final String YELLOW = "\u001B[33m";
    final String PURPLE = "\u001B[35m"; 
    final String DARK_BLUE = "\u001B[94m"; 
    final String VIOLET = "\u001B[95m"; 
    final String ORANGE = "\u001B[38;5;202m"; 
    final String LIGHT_GREEN = "\u001B[38;5;10m"; 
    @Override
    public void enter() {
        System.out.println("\t\t\t\t\tWelcome to " + name + ", the land of coding challenges!");
        System.out.println();
        System.out.println(PURPLE+"                          0000111101011100001000010"); 
        System.out.println(YELLOW+"                          001011000010000101"+RED+"0011101");
        System.out.println(VIOLET+"               1100000    "+YELLOW+"1111001110011001101001110101101000101101001");
        System.out.println("               1100000    "+RED+"1111001110011001101001"+YELLOW+"110101101000101101001");
        System.out.println(YELLOW+"               1100000    "+RED+"1111001110011001101001"+VIOLET+"1101011010001011010011"+RED+"1000101100010100001010000110100101"+GREEN+"000100010001");
        System.out.println(ORANGE+"         11001110"+RED+"1011"+ORANGE+"10110110010"+RED+"0101010010001001"+VIOLET+"11"+BLUE+"111011001011110111"+VIOLET+"00"+RED+"0000101"+ORANGE+"10010110"+RED+"011101111011100110000"+LIGHT_GREEN+"1011100110000");
        System.out.println(ORANGE+"         11"+BLUE+"00"+ORANGE+"1110"+RED+"1011"+ORANGE+"10110110010"+RED+"0101010010001001"+VIOLET+"11"+BLUE+"111011001011110111"+VIOLET+"00"+RED+"00000101"+ORANGE+"00"+DARK_BLUE+"101"+ORANGE+"10"+RED+"0111"+DARK_BLUE+"011"+RED+"11011"+DARK_BLUE+"100"+RED+"110"+BLUE+"000"+LIGHT_GREEN+"10111001100001");
        System.out.println(ORANGE+"         11"+BLUE+"00"+ORANGE+"1110"+RED+"1011"+ORANGE+"101101"+BLUE+"10010"+RED+"01010"+BLUE+"1001000"+RED+"1001"+VIOLET+"11"+BLUE+"111011001011110111"+VIOLET+"00"+RED+"00000101"+ORANGE+"00"+DARK_BLUE+"101"+ORANGE+"10"+RED+"0111"+DARK_BLUE+"011"+RED+"11011"+DARK_BLUE+"100"+RED+"11"+LIGHT_GREEN+"100001011100110000");
        System.out.println(ORANGE+"         11001110"+RED+"1011"+ORANGE+"101101"+BLUE+"10010"+RED+"01010"+BLUE+"1001000"+RED+"1001"+VIOLET+"11"+BLUE+"111011001011110111"+VIOLET+"00"+RED+"00000101"+ORANGE+"00"+ORANGE+"101"+ORANGE+"10"+RED+"0111"+YELLOW+"011"+RED+"11011"+YELLOW+"100"+RED+"1"+LIGHT_GREEN+"1000010111001100001");
        System.out.println(ORANGE+"         100011111010110010011010111000001100010"+ORANGE+"1110010111101000110100"+RED+"11101110"+ORANGE+"1000111"+RED+"0100101010010101"+GREEN+"0001011100011010101");
        System.out.println(ORANGE+"         101110111000101000010000000111100101111001100100000101101010110111010001001010011111110000"+GREEN+"1001100110100111100111");
        System.out.println(ORANGE+"         001011011000010101110111110110010110110"+VIOLET+"1100111011101100000001"+ORANGE+"0000011111101000011000011101"+GREEN+"110110011000111111001111");
        System.out.println(ORANGE+"         11001110"+RED+"1011"+ORANGE+"101101"+BLUE+"10010"+RED+"01010"+BLUE+"1001000"+RED+"1001"+VIOLET+"11"+RED+"1110110010111101"+RED+"11"+VIOLET+"00"+RED+"00000101"+ORANGE+"00"+ORANGE+"101"+ORANGE+"10"+RED+"0111011"+RED+"11011100"+RED+"1"+LIGHT_GREEN+"1000010111001100001111");
        System.out.println(ORANGE+"         11"+BLUE+"001110"+RED+"1011"+ORANGE+"101101"+BLUE+"10010"+RED+"01010"+BLUE+"1001000"+RED+"1001"+VIOLET+"11"+RED+"11"+BLUE+"10110010111101"+RED+"11"+VIOLET+"00"+RED+"00000101"+ORANGE+"00"+ORANGE+"101"+ORANGE+"10"+RED+"0111"+BLUE+"011"+RED+"11011"+BLUE+"100"+RED+"11000"+YELLOW+"      0110");
        System.out.println(ORANGE+"         11"+BLUE+"001110"+RED+"1011"+ORANGE+"101101"+BLUE+"10010"+RED+"01010"+BLUE+"1001000"+RED+"1001"+VIOLET+"11"+RED+"11"+BLUE+"1011"+YELLOW+"00101"+BLUE+"11101"+RED+"11"+VIOLET+"00"+RED+"00000101"+ORANGE+"00"+ORANGE+"101"+ORANGE+"10"+RED+"0111"+BLUE+"011"+RED+"11011"+BLUE+"100"+RED+"11000"+YELLOW+"      0110");
        System.out.println(ORANGE+"         11001110"+RED+"1011"+ORANGE+"101101"+BLUE+"10010"+RED+"01010"+BLUE+"1001000"+RED+"1001"+VIOLET+"11"+RED+"11"+BLUE+"1011"+YELLOW+"00101"+BLUE+"11101"+RED+"11"+VIOLET+"00"+RED+"00000101"+ORANGE+"00"+ORANGE+"101"+ORANGE+"10"+RED+"0111"+YELLOW+"011"+RED+"11011"+YELLOW+"100"+RED+"11000"+YELLOW+"      0110");
        System.out.println(ORANGE+"         00101101"+GREEN+"1000010101110111110110010110110"+VIOLET+"11"+WHITE+"001110111011000000"+VIOLET+"01"+GREEN+"0000011111101000011000011101"+RED+"110110"+GREEN+"0110001"+YELLOW+"0110"+GREEN+"1001111"+RESET);
    }

    @Override
    public void startQuest() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Altreia objAltreia = getAltreia();
        Kamadan objKamadan = getKamadan();
        Palangga objPalangga = new Palangga();
        StoryLine objStoryLine = new StoryLine();
        Shang objShang = new Shang();
        ThirdStreet objThirdStreet = new ThirdStreet(objKamadan, objAltreia,bgMusic);
        SiITYou objSiITYou = new SiITYou(objKamadan, objAltreia,bgMusic);
        SiCS objSiCS = new SiCS(objKamadan, objAltreia,bgMusic);    

        Enemy[] enemies = {
            new Ada(),
            new Turing()
        };
    
            for (int i = 0; i<enemies.length; i++) {
                Enemy enemy = enemies[i];
                boolean upgradeDone = false;
                int roundCounter = 1;
                int choiceCharacter = 0;
                
                while (enemy.getHealth() > 0 && (objKamadan.getHealth() > 0 || objAltreia.getHealth() > 0 || objPalangga.getHealth() > 0)) {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------------------");
                    System.out.print("|"+YELLOW+"      Kamadan's HP: " + objKamadan.getHealth() + ""+RESET+"    |"+YELLOW+" Mana: " + objKamadan.getMana() + ""+RESET+"     |"+YELLOW+" Syntax Sleuth"+RESET+" |"+YELLOW+" Logic Master"+RESET+"         |"+YELLOW+" Loop Ninja"+RESET+"       |"+YELLOW+" Mana Regeneration"+RESET+"  |");
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------------------");
                    System.out.print("|"+YELLOW+"      Altreia's HP: " + objAltreia.getHealth() + ""+RESET+"    |"+YELLOW+" Mana: " + objAltreia.getMana() + ""+RESET+"     |"+YELLOW+" Code Catalyst"+RESET+" |"+YELLOW+" Focus Shield"+RESET+"         |"+YELLOW+" Syntax Strike"+RESET+"    |"+YELLOW+" Mana Regeneration"+RESET+"  |");
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------------------");
                    System.out.print("|"+YELLOW+"      Palangga's HP: " + objPalangga.getHealth() + ""+RESET+"  |"+YELLOW+" Mana: " + objPalangga.getMana() + ""+RESET+"    |"+YELLOW+" LoveyDovey"+RESET+"    |"+YELLOW+" Nikaon Naka, Langga?"+RESET+" |"+YELLOW+" Tulog Na, Langga"+RESET+" |"+YELLOW+" I Love You, Langga"+RESET+" |");
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------------------");
                        
                    while (true) {
                        if (roundCounter > 1) {
                            System.out.println("\nChoose your character to attack for the next round:");
                        } else {
                            System.out.println("\nChoose your character to attack:");
                        }
                    
                        System.out.println("1. Kamadan");
                        System.out.println("2. Altreia");
                        System.out.println("3. Palangga");
                    
                        try {
                            System.out.print("Enter choice (1 or 2 or 3): ");
                            String input = scanner.nextLine().trim(); 
                    
                            
                            if (input.isEmpty()) {
                                System.out.println(RED + "Invalid input! Please enter a valid number." + RESET);
                                continue; 
                            }
                    
                            choiceCharacter = Integer.parseInt(input); 
                    
                            if ((choiceCharacter == 1 && objKamadan.getHealth() > 0) || 
                                (choiceCharacter == 2 && objAltreia.getHealth() > 0) || 
                                (choiceCharacter == 3 && objPalangga.getHealth() > 0)) {
                                break; 
                            } else {
                                System.out.println(RED + "Invalid choice. Please choose a character that exists." + RESET);
                            }
                        } catch (NumberFormatException e) {
                            System.out.println(RED + "Invalid input! Please enter a valid number." + RESET);
                        }
                    }
    
                    int choiceAttack = 0;
                    while (choiceAttack < 1 || choiceAttack > 4) {
                        
                        if (choiceCharacter == 1) {
                            System.out.println("\n------------------------------------------");
                            System.out.println("|"+YELLOW+"             SIITYOU KINGDOM            "+RESET+"|");
                            System.out.println("------------------------------------------");
                            System.out.println("Round: " + roundCounter);
                            System.out.println("You have entered as \'Kamadan\'");
                            System.out.print("Kamadan's HP: " + objKamadan.getHealth() + " | Mana: " + objKamadan.getMana() + "\n");
                            System.out.println("Enemy " + "("+ (i+1) +"/2) " + enemy.getName() + "'s HP: " + enemy.getHealth());

                            System.out.println("\nChoose your attack:");
                            System.out.println("1. Syntax Sleuth (30 damage, 20 mana)");
                            System.out.println("2. Logic Master (40 damage, 60 mana)");
                            System.out.println("3. Loop Ninja (30 damage, 20 mana)");
                            System.out.println("4. Mana Regeneration (15 damage, +20 mana)");
                        } else if(choiceCharacter == 2){
                            System.out.println("\n------------------------------------------");
                            System.out.println("|"+YELLOW+"             SIITYOU KINGDOM            "+RESET+"|");
                            System.out.println("------------------------------------------"+RESET);
                            System.out.println("Round: " + roundCounter);
                            System.out.println("You have entered as \'Altreia\'");
                            System.out.print("Altreia's HP: " + objAltreia.getHealth() + " | Mana: " + objAltreia.getMana() + "\n");
                            System.out.println("Enemy " + "("+ (i+1) +"/2) " + enemy.getName() + "'s HP: " + enemy.getHealth());

                            System.out.println("\nChoose your attack:");
                            System.out.println("1. Code Catalyst (20 damage, 15 mana)");
                            System.out.println("2. Focus Shield (35 damage, 50 mana)");
                            System.out.println("3. Syntax Strike (45 damage, 70 mana)");
                            System.out.println("4. Mana Regeneration (15 damage, +20 mana)");
                        } else {
                            System.out.println("\n------------------------------------------");
                            System.out.println("|"+YELLOW+"             SIITYOU KINGDOM            "+RESET+"|");
                            System.out.println("------------------------------------------"+RESET);
                            System.out.println("Round: " + roundCounter);
                            System.out.println("You have entered as \'Palangga\'");
                            System.out.print("Palangga's HP: " + objPalangga.getHealth() + " | Mana: " + objPalangga.getMana() + "\n");
                            System.out.println("Enemy " +"("+ (i+1) +"/2) " + enemy.getName() + "'s HP: " + enemy.getHealth());

                            System.out.println("\nChoose your attack:");
                            System.out.println("1. LoveyDovey (1000 damage, 0 mana)");
                            System.out.println("2. Nikaon Naka, Langga? (1000 damage, 0 mana)");
                            System.out.println("3. Tulog Na, Langga (1000 damage, 0 mana)");
                            System.out.println("4. I Love You, Langa (1000 damage, +20 mana)");
                        }

                        try {
                            System.out.print("\nEnter Attack: ");
                            String input = scanner.nextLine().trim(); 

                           
                            if (input.isEmpty()) {
                                System.out.println(RED + "Invalid input! Please enter a valid number." + RESET);
                                continue;
                            }

                            choiceAttack = Integer.parseInt(input); 

                            if (choiceAttack < 1 || choiceAttack > 4) {
                                System.out.println(RED + "Invalid Attack! Please enter a number between 1 and 4!" + RESET);
                            }
                        } catch (NumberFormatException e) {
                            System.out.println(RED + "Invalid input! Please enter a valid number." + RESET);
                        }
                    }
    
           
                    int attackDamage;
    
                    if (choiceCharacter == 1) {
                        attackDamage = objKamadan.attack(choiceAttack);
                    } else if(choiceCharacter == 2){
                        attackDamage = objAltreia.attack(choiceAttack);
                    }else{
                        attackDamage = objPalangga.attack(choiceAttack);
                    }
    
                    if (attackDamage >= 0) {
                        enemy.setHealth(enemy.getHealth() - attackDamage);
                        if(enemy.getHealth() < 0){
                            enemy.setHealth(0);
                        }
                        System.out.println(" You deal " + attackDamage + " damage to " + enemy.getName() + "!");
                        if(choiceCharacter == 1){
                            if(choiceAttack == 1){
                                System.out.println("You used Syntax Sleuth (30 damage, 20 mana)");
                            }else if(choiceAttack == 2){
                                System.out.println("You used Logic Master (40 damage, 60 mana)");
                            }else if(choiceAttack == 3){
                                System.out.println("You used Loop Ninja (30 damage, 20 mana)");
                            }else{
                                System.out.println("You used Mana Regeneration (15 damage, +20 mana)");
                            }
                        }else if(choiceCharacter == 2){
                            if(choiceAttack == 1){
                                System.out.println("You used Code Catalyst (20 damage, 15 mana)");
                            }else if(choiceAttack == 2){
                                System.out.println("You used Focus Shield (35 damage, 50 mana)");
                            }else if(choiceAttack == 3){
                                System.out.println("You used Syntax Strike (45 damage, 70 mana)");
                            }else{
                                System.out.println("You used Mana Regeneration (15 damage, +20 mana)");
                            }
                        }else{
                            if(choiceAttack == 1){
                                System.out.println("You used LoveyDovey (1000 damage, 0 mana)");
                            }else if(choiceAttack == 2){
                                System.out.println("You used Nikaon Naka, Langga? (1000 damage, 0 mana)");
                            }else if(choiceAttack == 3){
                                System.out.println("You used Tulog Na, Langga (1000 damage, 0 mana)");
                            }else{
                                System.out.println("You used I Love You, Langga (1000 damage, +20 mana)");
                            }
                        }
                    } else if (attackDamage == -1) {
                        simulateTyping(RED+"Invalid choice!"+RESET);
                    } else {
                        System.out.println(RED+"Not enough mana! You cannot attack."+RESET);
                    }
    
                    if (enemy.getHealth() > 0) {
                        int enemySkill = random.nextInt(2);
                        int enemyDamage;
                        String skillUsed;
                        
                       if(i == 0){
                            if(enemySkill == 0){
                                enemyDamage = random.nextInt(31);
                                skillUsed = enemy.getSkill1();
                            }else {
                                enemyDamage = random.nextInt(41);
                                skillUsed = enemy.getSkill2();
                            } 
                       }else{
                            if(enemySkill == 0){
                                enemyDamage = random.nextInt(26);
                                skillUsed = enemy.getSkill1();
                            }else {
                                enemyDamage = random.nextInt(41);
                                skillUsed = enemy.getSkill2();
                            } 
                       }
                        
                        simulateTyping(enemy.getName() + " uses " + skillUsed + "! It deals " + enemyDamage + " damage.");
    
    
                        if (choiceCharacter == 1) {
                            objKamadan.setHealth(objKamadan.getHealth() - enemyDamage);
                            if(objKamadan.getHealth() <= 0){
                                System.out.println("Kamadan collapses to the ground, her vision fading. The laughter of her foes echoes as the screen fades to black...");
                                objKamadan.setHealth(0);
                                
                            }
                        } else if(choiceCharacter == 2){
                            objAltreia.setHealth(objAltreia.getHealth() - enemyDamage);
                            if(objAltreia.getHealth() <= 0){
                                System.out.println("Altreia collapses to the ground, her vision fading. The laughter of her foes echoes as the screen fades to black...");
                                objAltreia.setHealth(0);
                            }
                        } else{
                            objPalangga.setHealth(objPalangga.getHealth() - enemyDamage);
                            if(objPalangga.getHealth() < 0){
                                System.out.println("Palangga collapses to the ground, her vision fading. The laughter of her foes echoes as the screen fades to black...");
                                objPalangga.setHealth(0);
                            }
                        }
                    }
    
                    if (objKamadan.getHealth() <= 0 && objAltreia.getHealth() <= 0) {
                        simulateTyping("Both Kamadan and Altreia collapse to the ground, their vision fading. The laughter of her foes echoes as the screen fades to black...");
                        System.out.println();
                        objStoryLine.gameover();
                                bgMusic.playGameOverSound();
                                try {
                                    Thread.sleep(7000); 
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                        
                        resetStats(objKamadan, objAltreia, objShang);
                        Main.startGame(scanner, objStoryLine, kamadan, altreia, bgMusic, objThirdStreet, objSiITYou, objSiCS);
                        System.exit(0);
                    }
    
                    roundCounter++;
                }
                
                if (choiceCharacter == 1 && objKamadan.getHealth() > 0 && objAltreia.getHealth() <= 0 && objPalangga.getHealth() > 0) {
                    simulateTyping("With one final strike, Kamadan and Palangga has defeated " + enemy.getName() + ". " + enemy.getName() + " staggers back, muttering in defeat...\n");
                } else if(choiceCharacter == 2 && objAltreia.getHealth() > 0 && objKamadan.getHealth() <= 0 && objPalangga.getHealth() > 0) {
                    simulateTyping("With one final strike, Altreia and Palangga has defeated " + enemy.getName() + ". " + enemy.getName() + " staggers back, muttering in defeat...\n");
                }else if(choiceCharacter == 3 && objPalangga.getHealth() > 0 && objKamadan.getHealth()<=0 && objAltreia.getHealth()<=0){
                    simulateTyping("With one final strike, Palangga has defeated " + enemy.getName() + ". " + enemy.getName() + " stagger back, muttering in defeat...\n");
                } else if(choiceCharacter == 3 && objPalangga.getHealth() > 0 && objKamadan.getHealth()<=0 && objAltreia.getHealth()>0){
                    simulateTyping("With one final strike, Palangga and Altreia has defeated " + enemy.getName() + ". " + enemy.getName() + " stagger back, muttering in defeat...\n");
                }else if(choiceCharacter == 3 && objPalangga.getHealth() > 0 && objKamadan.getHealth()>0 && objAltreia.getHealth()<=0){
                    simulateTyping("With one final strike, Palangga and Kamadan has defeated " + enemy.getName() + ". " + enemy.getName() + " stagger back, muttering in defeat...\n");
                }
                else{
                    simulateTyping("With one final strike, Kamadan, Altreia, and Palangga have defeated " + enemy.getName() + ". " + enemy.getName() + " stagger back, muttering in defeat...\n");
                }
    
                if(!upgradeDone){
                    int upgradeChoice;
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------------------");
                    System.out.print("|"+YELLOW+"      Kamadan's HP: " + objKamadan.getHealth() + ""+RESET+"    |"+YELLOW+" Mana: " + objKamadan.getMana() + ""+RESET+"     |"+YELLOW+" Syntax Sleuth"+RESET+" |"+YELLOW+" Logic Master"+RESET+"         |"+YELLOW+" Loop Ninja"+RESET+"       |"+YELLOW+" Mana Regeneration"+RESET+"  |");
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------------------");
                    System.out.print("|"+YELLOW+"      Altreia's HP: " + objAltreia.getHealth() + ""+RESET+"    |"+YELLOW+" Mana: " + objAltreia.getMana() + ""+RESET+"     |"+YELLOW+" Code Catalyst"+RESET+" |"+YELLOW+" Focus Shield"+RESET+"         |"+YELLOW+" Syntax Strike"+RESET+"    |"+YELLOW+" Mana Regeneration"+RESET+"  |");
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------------------");
                    System.out.print("|"+YELLOW+"      Palangga's HP: " + objPalangga.getHealth() + ""+RESET+"  |"+YELLOW+" Mana: " + objPalangga.getMana() + ""+RESET+"    |"+YELLOW+" LoveyDovey"+RESET+"    |"+YELLOW+" Nikaon Naka, Langga?"+RESET+" |"+YELLOW+" Tulog Na, Langga"+RESET+" |"+YELLOW+" I Love You, Langga"+RESET+" |");
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------------------");
                        
                    upgrade();

                    int chooseCharacter = 0;
                    upgradeChoice = 0;

                    
                    while (true) {
                        try {
                            String input = scanner.nextLine().trim(); 

                            
                            if (input.isEmpty()) {
                                System.out.println(RED + "Invalid input. Please try again." + RESET);
                                upgrade(); 
                                continue;
                            }

                            upgradeChoice = Integer.parseInt(input);

                            if (upgradeChoice == 1 || upgradeChoice == 2) {
                                break; 
                            } else {
                                System.out.println(RED + "Invalid Choice. Please Try Again." + RESET);
                                upgrade();    
                            }
                        } catch (NumberFormatException e) {
                            System.out.println(RED + "Invalid Input. Please Try Again." + RESET);
                            upgrade();
                        }
                    }

                    
                    while (true) {
                        try {
                            simulateTyping("\nWho do you want to upgrade?");
                            System.out.println("1. Kamadan");
                            System.out.println("2. Altreia");
                            System.out.println("3. Palangga");
                            System.out.print("Enter choice: ");
                            
                            String input = scanner.nextLine().trim(); 

                           
                            if (input.isEmpty()) {
                                System.out.println(RED + "Invalid input! Please enter a valid number." + RESET);
                                continue;
                            }

                            chooseCharacter = Integer.parseInt(input); 

                            if (chooseCharacter == 1) {
                                if (objKamadan.getHealth() > 0) {
                                    if (upgradeChoice == 1) { 
                                        objKamadan.setHealth(objKamadan.getHealth() + 50);
                                        if (objKamadan.getHealth() > 250) {
                                            objKamadan.setHealth(250);
                                        }
                                        simulateTyping("Kamadan increases her HEALTH! UPDATED HEALTH: " + objKamadan.getHealth());
                                    } else if (upgradeChoice == 2) { 
                                        objKamadan.setMana(objKamadan.getMana() + 50);
                                        if (objKamadan.getMana() > 200) {
                                            objKamadan.setMana(200);
                                        }
                                        simulateTyping("Kamadan increases her MANA! UPDATED MANA: " + objKamadan.getMana());
                                    }
                                    break;
                                } else {
                                    System.out.println("Kamadan has already been defeated. Upgrades cannot be applied.\n");
                                }
                            } else if (chooseCharacter == 2) {
                                if (objAltreia.getHealth() > 0) {
                                    if (upgradeChoice == 1) { 
                                        objAltreia.setHealth(objAltreia.getHealth() + 50);
                                        if (objAltreia.getHealth() > 230) {
                                            objAltreia.setHealth(230);
                                        }
                                        simulateTyping("Altreia increases her HEALTH! UPDATED HEALTH: " + objAltreia.getHealth());
                                    } else if (upgradeChoice == 2) { 
                                        objAltreia.setMana(objAltreia.getMana() + 50);
                                        if (objAltreia.getMana() > 250) {
                                            objAltreia.setMana(250);
                                        }
                                        simulateTyping("Altreia increases her MANA! UPDATED MANA: " + objAltreia.getMana());
                                    }
                                    break;
                                } else {
                                    System.out.println("Altreia has already been defeated. Upgrades cannot be applied.");
                                }
                            } else if (chooseCharacter == 3) {
                                if (objPalangga.getHealth() > 0) {
                                    if (upgradeChoice == 1) { 
                                        objPalangga.setHealth(objPalangga.getHealth() + 50);
                                        if (objPalangga.getHealth() > 1000) {
                                            objPalangga.setHealth(1000);
                                        }
                                        simulateTyping("Palangga increases her HEALTH! UPDATED HEALTH: " + objPalangga.getHealth());
                                    } else if (upgradeChoice == 2) { 
                                        objPalangga.setMana(objPalangga.getMana() + 50);
                                        if (objPalangga.getMana () > 1000) {
                                            objPalangga.setMana(1000);
                                        }
                                        simulateTyping("Palangga increases her MANA! UPDATED MANA: " + objPalangga.getMana());
                                    }
                                    break;
                                } else {
                                    System.out.println("Palangga has already been defeated. Upgrades cannot be applied.");
                                }
                            } else {
                                System.out.println(RED + "Invalid choice. Please try again." + RESET);
                            }
                        } catch (Exception e) {
                            System.out.println(RED + "Invalid input! Please enter a valid number." + RESET);
                        }
                    }
                
                }
    
            }
    
            objStoryLine.thirdNarration();
            objStoryLine.questThree();
        }
    }
