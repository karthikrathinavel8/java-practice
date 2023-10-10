//Typecasting = process of converting one datatype into another
//Assign a value from one primitive type to another / Assign a value from one non-primitive type to another
class Parent {
    String name;
    public void greeting() {
        System.out.println("Hello");
    }
}
class Child extends Parent {
    @Override
    public void greeting() {
        System.out.println("Hey");
    }
    public void action() {
        System.out.println("Learning Java");
    }
}
public class TypeCasting {
    public static void main(String[] args) {
        //Widening Casting: Implicit casting = No data loss
        //Casting Order: double -> float -> long -> int -> short -> byte
        double d = 1;
        System.out.println("Widening Casting: " + d);
        //Narrowing Casting: Explicit casting = Data loss occurs
        int a = (int) 1.2;
        System.out.println("Narrowing Casting: " + a);

        //There are 2 types of casting related to non-primitive: Upcasting and Downcasting
        //Upcasting: Typecasting of child object to parent object [can be done implicit]
        Parent parentType = new Child();//can only access parent class members
        getParentType(parentType);

        
    }
    public static void getParentType(Parent parent) {
        parent.greeting();
        //Downcasting: Typecasting of parent object to child object [cannot be implicit]
        if(parent instanceof Child) { //To avoid ClassCastException
            Child childType = (Child) parent; //can access subclass method now
            childType.action();
        }
    }
}
