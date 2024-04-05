import java.io.IOException;
import java.util.Scanner;
public class Chatbot {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chatbot: Hi! How can i assist you today? ");
        String userInput;
        do {
            System.out.println("User: ");
            userInput = scanner.nextLine();
            String botResponse = generateResponse(userInput);
            System.out.println("Chatbot: "+ botResponse);
        }while (!userInput.equalsIgnoreCase("exit"));
        System.out.println("Chatbot: Goodbye have a great day !");
        scanner.close();
    }

    public static String generateResponse(String userinput){
        String response;
        switch (userinput.toLowerCase()){
            case "hi":
            case "hello":
                response = "hello there";
            break;
            case "how are you":
                response = "I am good";
            case "what is your name":
                response = " I am jarvis";
            case "open notepad":
                openApplication("notepad");
                response = "Notepad Opened";
            break;
            case "exit":
                response = "sure exiting now";
            break;
            default:
                response = "I am not able to understand that as of now";
            break;
        }
        return response;
    }

    private static void openApplication(String appName){
        try{
            Runtime.getRuntime().exec(appName);
        }catch (IOException e){
            System.out.println("Error:" + e.getMessage());
        }
    }
}
