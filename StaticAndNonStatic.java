class AnotherClass {
    public static final int constantValue = 26;
    private static int count = 0;
    public AnotherClass() {
        count++;
    } 
    public static int instanceCount() {
        return count;
    }
}

public class StaticAndNonStatic {
    static int k = 8; //static variable (Access with ClassName)
    String name = "Raj"; //non-static variable (Access by creating its class instance)
    public static void main(String[] args) {
        String className = "StaticAndNonStatic"; //Local Variables must be non-static
        System.out.println("Static Variable: " + k);
        StaticAndNonStatic instance = new StaticAndNonStatic();
        System.out.println("Non-Static Variable: " + instance.name);
        instance.greeting("Karthik");
        StaticAndNonStatic.staticMethod();
        //Experiment with AnotherClass
        AnotherClass anotherClass1 = new AnotherClass();
        AnotherClass anotherClass2 = new AnotherClass();
        int count = AnotherClass.instanceCount();

        System.out.println("Number of AnotherClass Instance created: " + count);
    }
    public static void staticMethod() {
        System.out.println("Static Method");
    }
    public void greeting(String name) { //non-static method
        System.out.println("Hello, " + name);
    }
}
