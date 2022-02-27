import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.UUID;

public class Main {
    private static String password = "Cheese";

    public static void main(String[] args) throws IOException{
        promtForNames();
    }

    /**
     * Input username and password here.
     */
    public static void promtForNames(){
        System.out.print("Enter your name: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String jariable = null;
        try{
            jariable = reader.readLine();
            if(jariable.equals("Josh")){
                System.out.println("Welcome " + jariable);
                System.out.print("Enter your password: ");
                BufferedReader readerPass = new BufferedReader(new InputStreamReader(System.in));
                if(readerPass.readLine().equals(password)){
                    Test2 ble = new Test2();
                    TestExtension abl = new TestExtension();
                    ble.setUsername(jariable);
                    System.out.println("Player Ble's name is: " + ble.getUsername());
                    Random number = new Random();
                    System.out.println(number.nextInt());
                    UUID name = UUID.randomUUID();
                    System.out.println(name);
                } else{
                    System.out.println("Wrong!");
                }
            } else{
                System.out.println("You're not Josh!");
            }
        } catch(IOException ioException) {
            System.err.println("Oops!");
        }
    }
}
