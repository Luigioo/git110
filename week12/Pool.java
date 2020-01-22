public class Pool{
    

    static Cars[] pool = { 
        new Cars("Mancaster Baby", 18, 201),
        new Cars("Lancaster Dady", 45, 160),
        new Cars("Edinburg Son", 23, 300),
        new Cars("FBI Warnning", 61, 250),
        new Cars("London Husband", 34, 190),
        new Cars("York Momy", 49, 159)
    };

    public static void compare(Player p1, Player p2, int select){
        if(pool[p1.choice].stats[select] > pool[p2.choice].stats[select]){
            System.out.println(p1.name + " wins\n");
            p1.win(p2.choice);
            p2.remove();
        }
        else if(pool[p1.choice].stats[select] < pool[p2.choice].stats[select]){
            System.out.println(p2.name + " wins\n");
            p2.win(p1.choice);
            p1.remove();
        }
    }

}