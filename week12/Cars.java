public class Cars{

    public String name = new String();
    public int[] stats = new int[2];

    
    public Cars(String theName, int theAge, int theSpeed){
        this.name = theName;
        this.stats[0] = theAge;
        this.stats[1] = theSpeed;
    }

    public void display(){
        System.out.printf("The name is: %s\n the age is: %d\nthe speed is: %d\n", this.name, this.stats[0], this.stats[1]);
    }

}