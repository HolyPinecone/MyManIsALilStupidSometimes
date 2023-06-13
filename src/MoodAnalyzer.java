import java.util.Random;

public class MoodAnalyzer {
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
            case "tired":
                String[] tiredOptions = {
                        "bro she tired, let her sleep",
                        "wake up with caution if she is asleep",
                        "just be quiet broooo"
                };
                response = getRandomOption(tiredOptions, random);
                break;
            default:
                response = "Bro, u might die or have the best time of your life";
                break;
        }

        return response;
    }

    public static String getRandomOption(String[] options, Random random) {
        int randomIndex = random.nextInt(options.length);
        return options[randomIndex];
    }
}
