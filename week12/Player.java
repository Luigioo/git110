import java.util.*;
public class Player{
    public String name = new String();
    public int choice;
    public boolean[] cards;

    public Player(String theName, boolean[] theCards){
        this.name = theName;
        this.cards = theCards.clone();
    }

    public void set(){
        for (int i=0; i<6; i++){
            System.out.println(this.cards[i]);
        }
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("\n" + this.name + " Please enter your choice of card:");
            this.choice = sc.nextInt();
        }while(this.choice<0 || this.choice>5 || !this.cards[this.choice]);
        
    }

    public void win(int otherChoice){
        this.cards[otherChoice] = true;
    }
    public void remove(){
        this.cards[this.choice] = false;
    }
}