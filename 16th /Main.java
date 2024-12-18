import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StoryLine objStoryLine = new StoryLine();
        Kamadan kamadan = new Kamadan();
        Altreia altreia = new Altreia();
        BackgroundMusic bgMusic = new BackgroundMusic("resources\\music.aiff");
        ThirdStreet objThirdStreet = new ThirdStreet(kamadan, altreia, bgMusic);
        SiITYou objSiITYou = new SiITYou(kamadan, altreia, bgMusic);
        SiCS objSiCS = new SiCS(kamadan, altreia, bgMusic);

        startGame(scanner, objStoryLine, kamadan, altreia, bgMusic, objThirdStreet, objSiITYou, objSiCS);
    }

    public static void startGame(Scanner scanner, StoryLine objStoryLine, Kamadan kamadan, Altreia altreia,
                                   BackgroundMusic bgMusic, ThirdStreet objThirdStreet, SiITYou objSiITYou,
                                   SiCS objSiCS) {
        objStoryLine.gameLogo();
        boolean enterGame = true;
        boolean musicPromptDisplayed = false;
        boolean isMusicPlaying = true;
        bgMusic.play();

        while (enterGame) {
            if (!musicPromptDisplayed) {
                try {
                    boolean validInput = false;

                    while (!validInput) {
                        System.out.print("\t\t\t\t\tDo you want to stop the background music? (Yes/No): ");
                        String stopMusicOption = scanner.nextLine();

                        if (stopMusicOption.equalsIgnoreCase("Yes")) {
                            if (isMusicPlaying) {
                                bgMusic.stop();
                                isMusicPlaying = false; 
                            }
                            validInput = true;
                            musicPromptDisplayed = true; 
                        } else if (stopMusicOption.equalsIgnoreCase("No")) {
                            validInput = true;
                            musicPromptDisplayed = true; 
                        } else {
                            System.out.println("\t\t\t\t\tInvalid Input. Enter either YES/NO only\n");
                        }
                    }
                } catch (Exception e) {
                    System.out.println("\t\t\t\t\tAn error occurred. Please try again.");
                    e.printStackTrace();
                }
            }

            System.out.print("\t\t\t\t\tDo you want to enter the game? (Yes/No): ");
            String option = scanner.nextLine();

            if (option.equalsIgnoreCase("Yes")) {
                while (true) {
                    System.out.print("\t\t\t\t\tDo you want to skip the storyline? (Yes/No): ");
                    String optionStoryLine = scanner.nextLine();
                    try {
                        if (optionStoryLine.equalsIgnoreCase("Yes")) {
                            objStoryLine.questOne();
                            objThirdStreet.enter();
                            objThirdStreet.startQuest();
                            objSiITYou.enter();
                            objSiITYou.startQuest();
                            objSiCS.enter();
                            objSiCS.startQuest();
                            enterGame = false; // Exit the game
                            break; // Exit the inner loop
                        } else if (optionStoryLine.equalsIgnoreCase("No")) {
                            objStoryLine.prologue();
                            objStoryLine.questOne();
                            objThirdStreet.enter();
                            objThirdStreet.startQuest();
                            objSiITYou.enter();
                            objSiITYou.startQuest();
                            objSiCS.enter();
                            objSiCS.startQuest();
                            enterGame = false;
                            break; // Exit the inner loop
                        } else {
                            System.out.println("\t\t\t\t\tInvalid Input. Enter either YES/NO only\n");
                        }
                    } catch (Exception e) {
                        scanner.nextLine();
                    }
                }
            } else if (option.equalsIgnoreCase("No")) {
                objStoryLine.displayNo();
                enterGame = false; // Exit the game
            } else {
                System.out.println("\t\t\t\t\tInvalid Input. Enter either YES/NO only\n");
            }
        }

        if (isMusicPlaying) {
            bgMusic.stop();
        }
    }
}
