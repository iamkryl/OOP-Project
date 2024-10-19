import java.util.concurrent.TimeUnit;
public class StoryLine {
    public void simulateTyping(String text) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                TimeUnit.MILLISECONDS.sleep(5); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void prologue() {
        System.out.println("\t\t\t\t==============================================================");
        simulateTyping("\t\t\t\t||    You have successfully entered the game as \"KAMADAN\".  ||\n");
        System.out.println("\t\t\t\t==============================================================\n\n");
        
        System.out.println( "============================================================================================================================");
        simulateTyping("||\t\t\t\t\t\tNo Way Out: The Final Test                                                ||\n");
        System.out.println( "============================================================================================================================");
           
        simulateTyping("""
            \t\t\tIn the stillness of the night, Kamadan, a diligent student struggling with her OOP
            \t\tstudies, sat in a cluttered room, illuminated only by the soft glow of her computer screen
            \t\tas fatigue weighed heavily on her eyelids at midnight. Desperate for a brief distraction,
            \t\tshe searched for online games and found one titled 'No Way Out: The Final Test,' which promised
            \t\tadventure and escape. Intrigued, she clicked the link, and suddenly, her screen burst into
            \t\tblinding white light, causing her heart to race with confusion and fear.\n
        """);
        

        simulateTyping("""
            \t\tMinutes passed in eerie silence, and when her screen showed no signs of life, she
            \t\tinstinctively pressed the "Esc" key, only to see a chilling message flicker: "There is no
            \t\tescaping now." Panic surged as she tried to turn off the AVR, but it was too late. The light
            \t\tfrom her monitor enveloped her, sucking her into the game. "Welcome to CIT-U, player 5!"
            \t\tthe screen announced, marking the start of Kamadan's challenging journey through three
            \t\tconnected kingdoms, each filled with secrets and trials that would test her coding skills,
            \t\tproblem-solving abilities, and resilience.\n
        """);


        simulateTyping("""
            \t\tKamadan found herself in the dimly lit alleys of Third Street, where the smell of alcohol
            \t\tand sadness filled the air. Due to her curiosity, she started to wander around the place and
            \t\tsaw a big piece of vandalism on the wall with the saying, "Study hard, party harder!"
            \t\tHere, she will encounter her first challenge: the Drunkard Minions—three chaotic foes who
            \t\twere once students like her, now trapped in a cycle of partying and regret.\n
        """);

        simulateTyping("""
            \t\tAs Kamadan navigated the dim streets of Third Street, her heart raced with nervousness amid
            \t\tthe thick air of alcohol and regret. She spotted three familiar figures: Boozy, Sloshed, and
            \t\tJager. Once fellow students, now trapped in a cycle of nightlife and despair. Just as she
            \t\tapproached, a large holographic screen lit up, presenting her first quest: "Escape the Haze of Regret.\n"
        """);
    }

    public void questOne() {
        System.out.println( "============================================================================================================================");
        simulateTyping("||                                          Quest #1: Escape the Haze of Regret.                                          ||\n");
        simulateTyping("||                      Objective: You must defeat the three minions by tackling coding challenges.                       ||\n");
        simulateTyping("||                                Each minion represents a coding struggle from your past.                                ||\n");
        System.out.println( "============================================================================================================================");

        simulateTyping("\tSuccess would not only mean overcoming challenges but also offer a chance to escape this strange game world.\n\n");
    }

    public void secondNarration(){
        simulateTyping("""
            \t\t\tBefore reaching the gates of SI IT YOU?, Kamadan discovered a sari-sari store, a 
            \t\tbeloved spot for local students. The store owner, Chizmosa, informed her that only those who
            \t\tdemonstrated their coding skills could advance, as two generals guarded the path ahead. As a
            \t\treward, Kamadan unlocked a new character, “Altreia,” to assist her on her journey. To enter SI
            \t\tIT YOU?, she needed to input her ID number before entering the next kingdom.\n
        """);
    }
}
