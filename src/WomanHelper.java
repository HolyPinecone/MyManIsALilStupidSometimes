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
                        System.out.println("Her mood is angry:");
                        mood = "angry";
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
                            System.out.println("Her mood is happy!:");
                            mood = "happy";
                        }
                    }
                }
            }
            String response = getResponse(mood, random);
            System.out.println(response);

            System.out.println("Do you want to analyze another mood? (yes/no)");
            String analyzeAnother = scanner.nextLine().toLowerCase();
            if (!analyzeAnother.equals("yes")) {
                break;
            }
        }
    }

    public static String getResponse(String mood, Random random) {

        String response = "";
        switch (mood) {
            case "happy":
                String[] happyOptions = {
                        "Broooo, you think this is ever gonna happen? LMAO",
                        "Well, she is gonna tell you anyway because she can not shut up."
                };
                response = getRandomOption(happyOptions, random);
                break;
            case "sad":
                String[] sadOptions = {
                        "Bro, tell her to stop being a pussy",
                        "Buy her chocolate, she is on her periods probably",
                        "Tell her to man up",
                        "Give her a hug maybe, idk LMAO",
                        "Ask her what is going on and don't get an answer cus she is gonna say 'I'm Fine' anyway."
                };
                response = getRandomOption(sadOptions, random);
                break;
            case "angry":
                String[] angryOptions = {
                        "Just buy her food, she's a fat fuck",
                        "Man, you better run for your god damn life",
                        "Don't look into her eyes, she will devour your soul",
                        "Broooo, u better think hard of what you have done"
                };
                response = getRandomOption(angryOptions, random);
                break;
            case "hyper":
                String[] hyperOptions = {
                        "Bro, she is drunk, I swear to God",
                        "Run, she is not gonna shut up today"
                };
                response = getRandomOption(hyperOptions, random);
                break;
            case "evil":
                String[] evilOptions = {
                        "Maybe the force be with you, man. You are fucked",
                        "Just remember she is evil by nature, she does not mean anything she says"
                };
                response = getRandomOption(evilOptions, random);
                break;
            default:
                response = "BRO u fucked up";
                break;
        }

        return response;
    }

    public static String getRandomOption(String[] options, Random random) {
        int randomIndex = random.nextInt(options.length);
        return options[randomIndex];
    }
}
