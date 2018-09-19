import java.util.Scanner;

public class lukasz {
    public static void main(String[] args) {
        System.out.println(" podaj liczbe : ");
        Scanner scanner = new Scanner(System.in);
        String bla = scanner.next();
        System.out.println(" podaj tekst : ");
        Scanner scanner1 = new Scanner(System.in);
        String bla1 = scanner.next();
        System.out.println(" czy wydrukowac dany tekst? 1 = tak 2 = nie ");
        Scanner scanner3 = new Scanner(System.in);
        String bla2 = scanner.next();
        {
            if( bla2 >2 )
            {
                System.out.println("default");
            }
        }
        System.out.println(" a "+bla);
    }
}
