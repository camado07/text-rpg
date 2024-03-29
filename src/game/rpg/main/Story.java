package game.rpg.main;

// class that does nothing but storing methods to print out every part of the story
public class Story {

    public static void printIntro() {
        GameLogic.clearConsole();
        GameLogic.printSeparator(30);
        System.out.println("STORY");
        GameLogic.printSeparator(30);
        System.out.println("You are the last survivor of a village ravaged by the evil emperor's henchmen.");
        System.out.println("Determined to avenge your loved ones, you embark on a journey to defeat the emperor " +
                "and restore peace to the land.");
        GameLogic.anythingToContinue();
    }

    public static void printFirstActIntro() {
        GameLogic.clearConsole();
        GameLogic.printSeparator(30);
        System.out.println("ACT I - INTRO");
        GameLogic.printSeparator(30);
        System.out.println("You venture into the nearby woods, determined to reach the everlasting mountains.");
        System.out.println("Legend has it that nobody has returned from these treacherous mountains alive.");
        System.out.println("Undeterred, you press on, driven by the desire for vengeance.");
        GameLogic.anythingToContinue();
    }

    public static void printFirstActOutro() {
        GameLogic.clearConsole();
        GameLogic.printSeparator(30);
        System.out.println("ACT I - OUTRO");
        GameLogic.printSeparator(30);
        System.out.println("Congratulations! You have crossed the everlasting mountains, a feat few dare to attempt.");
        System.out.println("As you descend from the peaks, you feel a newfound strength coursing through your veins.");
        System.out.println("Your journey has only just begun.");
        GameLogic.anythingToContinue();
    }

    public static void printSecondActIntro() {
        GameLogic.clearConsole();
        GameLogic.printSeparator(30);
        System.out.println("ACT II - INTRO");
        GameLogic.printSeparator(30);
        System.out.println("You traverse the once-thriving countryside, now marred by darkness.");
        System.out.println("Gold collected from defeated monsters serves as a reminder of your resilience.");
        System.out.println("Ahead lies the haunted landlines, guarding the path to the evil emperor's castle.");
        GameLogic.anythingToContinue();
    }

    public static void printSecondActOutro() {
        GameLogic.clearConsole();
        GameLogic.printSeparator(30);
        System.out.println("ACT II - OUTRO");
        GameLogic.printSeparator(30);
        System.out.println("You emerge triumphant from the haunted landlines, one step closer to your ultimate goal.");
        System.out.println("The castle of the evil emperor looms in the distance, a beacon of darkness.");
        System.out.println("With determination in your heart, you prepare for the final showdown.");
        GameLogic.anythingToContinue();
    }

    public static void printThirdActIntro() {
        GameLogic.clearConsole();
        GameLogic.printSeparator(30);
        System.out.println("ACT III - INTRO");
        GameLogic.printSeparator(30);
        System.out.println("The imposing black castle stands before you, a testament to the emperor's tyranny.");
        System.out.println("Disguised as a mercenary, you infiltrate the castle, knowing the risks.");
        System.out.println("Your courage will be tested as you confront the emperor and his minions.");
        GameLogic.anythingToContinue();
    }

    public static void printThirdActOutro() {
        GameLogic.clearConsole();
        GameLogic.printSeparator(30);
        System.out.println("ACT III - OUTRO");
        GameLogic.printSeparator(30);
        System.out.println("You stand victorious, having vanquished the evil emperor and his minions.");
        System.out.println("The throne room awaits, the final battleground in your quest for justice.");
        GameLogic.anythingToContinue();
    }

    public static void printFourthActIntro() {
        GameLogic.clearConsole();
        GameLogic.printSeparator(30);
        System.out.println("ACT IV - INTRO");
        GameLogic.printSeparator(30);
        System.out.println("The throne room is shrouded in darkness, the air thick with anticipation.");
        System.out.println("The evil emperor brandishes his weapon, ready to strike.");
        System.out.println("With unwavering resolve, you face your ultimate challenge.");
        GameLogic.anythingToContinue();
    }

    public static void printEnd(Player player) {
        GameLogic.clearConsole();
        GameLogic.printSeparator(30);
        System.out.println("Congratulations, " + player.name + "! You have defeated the evil emperor and saved the world!");
        GameLogic.printSeparator(30);
        System.out.println("This game was developed by Christian Amado.");
        System.out.println("Thank you for playing!");
    }
}