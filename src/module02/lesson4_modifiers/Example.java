package module02.lesson4_modifiers;

public class Example {

    String name;
    public int age;
    protected String color;
    private String breed;

    public Example() {

    }

    public Example(String name, int age, String color, String breed) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    static final String TYPE;

    static {
        // static initializer
        TYPE = "type";
    }

    {
        // nonStatic initializer
    }

    static int count;

    static void staticPrint(String str) {
        System.out.println(str);
        count++;
        // age;
        System.out.println(count);

    }

    void nonStaticPrint(String str) {
        System.out.println(str);
        count++;
        System.out.println(count);
        age = 23;
        this.name = "name";
    }

    public static void main(String[] args) {
        Example example = new Example();
        Example example1 = new Example();
        example.name = "example";
        example1.name = "example2";
        Example.count = 1;

        example.nonStaticPrint("string");
        staticPrint("example1");
        int a = 0;
        System.out.println(a);

    }

}
