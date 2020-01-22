public class Person{

    String name = "default name";
    int age = 0;

    public Person(String theName, int theAge){
        this.name = theName;
        this.age = theAge;
    }

    public void display(){
        System.out.println("the name is: " + this.name + "\nand the age is: " + this.age);
    }

    public void birthday(){
        this.age++;
    }

    public void changeName(String newName){
        this.name = newName;
    }


}