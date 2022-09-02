import java.util.Scanner;

public class Input {

    public static String getString(String s) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(s + " : ");
        return scanner.nextLine();


    }

    public static int getInt(String s){

        int svar = 0;
        while (true) {
            try {

                svar = Integer.parseInt(getString(s));
                break;

            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Det skal være et tal !");
            }

        }
        return svar;
    }
}
