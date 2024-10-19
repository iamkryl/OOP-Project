import java.util.Scanner; // Import statement for Scanner

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StoryLine objStoryLine = new StoryLine();
        ThirdStreet objThirdStreet = new ThirdStreet();

        final String RED = "\u001B[31m";
        final String RESET = "\u001B[0m";
        boolean enterGame = true;

        final int consoleWidth = 80;
        System.out.println( "============================================================================================================================");
        System.out.println( "||                                             Welcome To No Way Out: The Final Test                                      ||");
        System.out.println( "============================================================================================================================");

        String asciiArt = """
                ███▄    █  ▒█████      █     █░ ▄▄▄     ▓██   ██▓    ▒█████   █    ██ ▄▄▄█████▓
                ██ ▀█   █ ▒██▒  ██▒   ▓█░ █ ░█░▒████▄    ▒██  ██▒   ▒██▒  ██▒ ██  ▓██▒▓  ██▒ ▓▒
                ▓██  ▀█ ██▒▒██░  ██▒   ▒█░ █ ░█ ▒██  ▀█▄   ▒██ ██░   ▒██░  ██▒▓██  ▒██░▒ ▓██░ ▒░
                ▓██▒  ▐▌██▒▒██   ██░   ░█░ █ ░█ ░██▄▄▄▄██  ░ ▐██▓░   ▒██   ██░▓▓█  ░██░░ ▓██▓ ░ 
                ▒██░   ▓██░░ ████▓▒░   ░░██▒██▓  ▓█   ▓██▒ ░ ██▒▓░   ░ ████▓▒░▒▒█████▓   ▒██▒ ░ 
                ░ ▒░   ▒ ▒ ░ ▒░▒░▒░    ░ ▓░▒ ▒   ▒▒   ▓▒█░  ██▒▒▒    ░ ▒░▒░▒░ ░▒▓▒ ▒ ▒   ▒ ░░   
                ░ ░░   ░ ▒░  ░ ▒ ▒░      ▒ ░ ░    ▒   ▒▒ ░▓██ ░▒░      ░ ▒ ▒░ ░░▒░ ░ ░     ░    
                ░   ░   ░ ░ ░ ░ ▒       ░   ░    ░   ▒   ▒ ▒ ░░     ░ ░ ░ ▒   ░░░ ░ ░   ░      
                ░          ░ ░         ░          ░  ░░ ░            ░ ░     ░              
                ░                                   ░ ░                                 
                """;

        for (String line : asciiArt.split("\n")) {
            System.out.println(RED + "\t\t\t" + centerText(line, consoleWidth));
        }
        System.out.println(RESET); // Reset color after the ASCII art


        while (enterGame) {
            System.out.print("\t\t\t\tDo you want to enter the game? (Yes/No): ");
            String option = scan.nextLine();

            if (option.equalsIgnoreCase("Yes")) {
                while (enterGame) {
                System.out.print("\t\t\t\tDo you want to skip the storyline? (Yes/No): ");
                String optionStoryLine = scan.nextLine();

                    if (optionStoryLine.equalsIgnoreCase("Yes")) {
                        objStoryLine.questOne();
                        objThirdStreet.enter(); 
                        enterGame = false;
                    }else if (optionStoryLine.equalsIgnoreCase("No")) {
                        objStoryLine.prologue();
                        objStoryLine.questOne();
                        objThirdStreet.enter();
                        enterGame = false;
                    }else {
                        System.out.println("Invalid Input. Enter either YES/NO only.\n");
                    }
                }
            enterGame = false;
            } else if (option.equalsIgnoreCase("No")) {
                System.out.print("\t\t\t\tI WILL ALWAYS FIND MY WAY BACK TO YOU");
                break;
            } else {
                System.out.println("Invalid Input. Enter either YES/NO only.\n");
            }
        }
        scan.close();
    }

     private static String centerText(String text, int width) {
        int padding = (width - text.length()) / 2;
        return " ".repeat(Math.max(0, padding)) + text;
    }
}
