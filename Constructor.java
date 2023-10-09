//Constructor = Used to create objects and intialize objects
//Practiced Topics = Constructor, Constructor Chaining, Default & Parameterized Constructors, Constructor Overloading

class Parent {
    String name;
    int age;
    Parent() {
        System.out.println("Parent: Constructor");
    }
    Parent(int age) {
        this.age = age;
    }
    void run() {
        System.out.println("Parent: Runs Slowly");
    }
}

class Child extends Parent {
    String hobby;
    Child() {
        super(); //calls the super class constructor
        System.out.println("Child: Constructor");
    }
    Child(String hobby) {
        super(55);
        this.hobby = hobby;
    }
    Child(int age) {
        this("Karthik", "Rathinavel");
        System.out.println("Parent Age: " + age);
    }
    Child(String firstName, String lastName) {
        System.out.println("Full Name: " + firstName + " " + lastName);
    }
    @Override
    public void run() {
        System.out.println("Child: Runs Fastly");
    }
}

class Constructor {
    public static void main(String[] args) {
        Child child1 = new Child();
        Child child2 = new Child("Video Games");
        System.out.println("Child1 Hobby: " + child1.hobby + " - Child2 Hobby: " + child2.hobby);
        Child child3 = new Child(55);
    }
}
