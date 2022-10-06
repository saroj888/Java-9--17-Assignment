package assign_5;

record Student(String name,int id, int age){
    static int counter = 0;
    public Student(String name, int id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
            counter++;
    }

}
public class question11 {
    public static void main(String[] args) {
        Student student1 = new Student("Saroj",191,22);
        Student student2 = new Student("Ramu Kaka",102,21);
        System.out.println(student1);
        System.out.println(student1.age());
        System.out.println(student1.id());
        System.out.println(student1.name());
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student1.equals(student2));
        System.out.println(Student.counter);
    }
}
