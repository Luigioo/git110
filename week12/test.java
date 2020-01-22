import java.lang.Math;
import java.util.*;
public class test{

    public static void main(String args[]){

        Player p1 = new Player("Player 1", new boolean[] {true, false, true, false, true, false});
        Player p2 = new Player("Player 2", new boolean[] {false, true, false, true, false, true});

        Scanner sc = new Scanner(System.in);
        System.out.println("Select the category of stats: ");
        int select = sc.nextInt();
        
        p1.set();
        p2.set();

        Pool.compare(p1, p2, select);

        p1.set();
        p2.set();
        Pool.compare(p1, p2, select);

        sc.close();

    }
}
