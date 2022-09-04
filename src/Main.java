import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String ans = "";
        Dialog dialog = new English();

        Bank bank = new Bank();
        Konto konto1 = new Konto("Martin",100);
        Konto konto2 = new Konto("Berry",100);

        while (true) {
            System.out.println(dialog.hi());
//            System.out.println(dialog.changeLanguage());
//            ans = scanner.nextLine();


            if (Input.getString(dialog.changeLanguage()).equalsIgnoreCase("y")) {
//                System.out.println(dialog.selectLanguage());
//                ans = scanner.nextLine();

                switch (Input.getString(dialog.selectLanguage())) {
                    case "dk":
                        dialog = new Danish();
                        break;
                    case "eng":
                        dialog = new English();
                        break;
                    case "sve":
                        dialog = new Swedish();
                        break;
                    case "spa":
                        dialog = new Spansk();
                        break;
                    case "Hwa":
                        dialog = new Hawaiiansk();
                        break;
                    case "chi":
                        dialog = new Chinese();
                        break;
                    default:
                        dialog = new English();
                }
            } else {
                System.out.println("bye");
                break;
            }
        }
    }
}