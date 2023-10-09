class Parent {
    void personality() {
        System.out.println("Parent: Personality");
    }
}
class Child extends Parent{
    Child() {
       System.out.println("Child: Constructor");
    }
    //displayName: Overloaded method
    void displayName(String name) {
        System.out.println("Nickname: " + name);
    }
    void displayName(String firstName, String lastName) {
        System.out.println("FullName: " + firstName + " " + lastName);
    }
    @Override
    public void personality() {
        System.out.println("Child: Personality");
    }
}
public class MethodOverloadingOverriding {

    static {
        MethodOverloadingOverriding.main(null); //can call main method explicitly
    }
    public static void main(String[] args) {
        System.out.println("MAIN METHOD");
        Child child = new Child();
        child.displayName("Nick");
        child.displayName("Karthik", "Rathinavel");
        Parent parent = new Parent();
        parent.personality();
        child.personality(); //overrided method
    }

}
