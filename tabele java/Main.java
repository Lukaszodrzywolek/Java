import java.sql.SQLOutput;

public class Main {

    public static void main (String[]args)
    {
        int tab[] = new int[7];
        tab[0] = 6;
        tab[1] = 9;
        tab[2] = 2;
        tab[3] = 6;
        tab[4] = 4;
        for(int i = 0; i<tab.length; i++)
        {
            System.out.println("Element tablicy =" + tab[i]);

        }
        for (int x : tab)
            {
                System.out.println(x);
            }
            int n = 10;
        while(n>0)
        {
            System.out.println("cokolwiek " + n);
            n--;
        }
        do{
            System.out.println("tekst");
            n++;
        }
        while (n<5);
        {
            System.out.println("koniec");
        }
        int table[] = {2,3,4};
        for (int y : table)
        {
            System.out.println(y);
        }



    }

}
