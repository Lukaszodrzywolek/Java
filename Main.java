import java.util.Scanner;
public class Main {
    public static void main(String args[])

    {
        System.out.print(" liczba pierwsza = ");
        Scanner scanner = new Scanner(System.in);
int l1 = scanner.nextInt();

        {
            System.out.print(" liczba druga = ");

        }
        Scanner asd = new Scanner(System.in);
        int l2 = asd.nextInt();
        System.out.println(" suma tych liczb = "+ (l1+l2) );
        System.out.print(" liczba trzecia = ");

        Scanner dupa = new Scanner(System.in);
        int l3 = dupa.nextInt();
        System.out.println(" ");
        System.out.println(" liczba trzecia pomnozona przez sume liczb pierwszej i drugiej = " + ((l1+l2)*l3));
        Scanner string = new Scanner(System.in);
        System.out.print("podaj swoje imie: ");
         String x  = string.next();
        System.out.println(" podaj adres zamieszkania: ");
        Scanner string1  = new Scanner(System.in);
        String adres = string.next();
        System.out.println("Masz na imie :" + x + " i mieszkasz pod adresem "+ adres);




    }
}