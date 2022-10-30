package HW5;

public class Dog {
    private String name;
    private int age;
    private String color;
    private int height;

    public Dog() {
        System.out.println("Creating object of the class Dog.");
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        this.color = "black";
        this.height = 70;
    }

    public Dog(String name, int age, String color, int height) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}