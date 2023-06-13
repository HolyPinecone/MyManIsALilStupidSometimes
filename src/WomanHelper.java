import java.util.Scanner;
import java.util.Random;

public class WomanHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Do you know her mood? (yes/no)");
            String knowMood = scanner.nextLine().toLowerCase();

            String mood = "";
            if (knowMood.equals("yes")) {
                System.out.println("What is her mood?");
                mood = scanner.nextLine().toLowerCase();
            } else if (knowMood.equals("no")) {
                System.out.println("Is she quiet? (yes/no)");
                String isQuiet = scanner.nextLine().toLowerCase();

                if (isQuiet.equals("yes")) {
                    System.out.println("Is she mute? (yes/no)");
                    String isMute = scanner.nextLine().toLowerCase();

                    if (isMute.equals("yes")) {
                        System.out.println("Did she suddenly stop talking? (yes/no)");
                        String isSudden = scanner.nextLine().toLowerCase();
                        if (isSudden.equals("yes")) {
                            System.out.println("Her mood is angry:");
                            mood = "angry";
                        } else if (isSudden.equals("no")) {
                            System.out.println("She is just tired:");
                            mood = "tired";
                        }
                    } else if (isMute.equals("no")) {
                        System.out.println("Her mood is sad:");
                        mood = "sad";
                    }
                } else if (isQuiet.equals("no")) {
                    System.out.println("Is she insulting? (yes/no)");
                    String isInsulting = scanner.nextLine().toLowerCase();

                    if (isInsulting.equals("yes")) {
                        System.out.println("She is just being evil right now:");
                        mood = "evil";
                    } else if (isInsulting.equals("no")) {
                        System.out.println("Is she moving a lot? (yes/no)");
                        String isMoving = scanner.nextLine().toLowerCase();

                        if (isMoving.equals("yes")) {
                            System.out.println("She is hyper:");
                            mood = "hyper";
                        } else if (isMoving.equals("no")) {
                            System.out.println("Is she laughing? (yes/no)");
                            String isHappy = scanner.nextLine().toLowerCase();

                            if (isHappy.equals("yes")) {
                                System.out.println("Is she laughing nervously? (yes/no)");
                                String isLaughing = scanner.nextLine().toLowerCase();
                                if (isLaughing.equals("yes")) {
                                    System.out.println("Her mood is angry:");
                                    mood = "angry";
                                } else if (isLaughing.equals("no")) {
                                    System.out.println("Her mood is happy:");
                                    mood = "happy";
                                }
                            }
                        }
                    }
                }
            }

            String response = MoodAnalyzer.getResponse(mood, random);
            System.out.println(response);

            System.out.println("Do you want to analyze another mood? (yes/no)");
            String analyzeAnother = scanner.nextLine().toLowerCase();
            if (!analyzeAnother.equals("yes")) {
                break;
            }
        }
    }
}
