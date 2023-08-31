class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class Classes{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rume";
        s1.age = 26;
        Student s2 = new Student();
        s2.name = "Hasan";
        s2.age = 25;

        s1.printInfo();
        s2.printInfo();
    }
}
