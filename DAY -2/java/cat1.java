public class cat1 {
    String name;
    int age;

    public cat1(){
        this.name = "shyam";
        this.age = 19;
    }

    public static void main(String[] args) {
        cat1 myCat = new cat1();
        System.out.println("Cat's Name: " + myCat.name);
        System.out.println("Cat's Age: " + myCat.age);
    }
}
