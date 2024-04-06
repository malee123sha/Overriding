public class School {
    public void learning()  {
        System.out.println(("Grade 10 Students"));
    }
}
class Class extends School {
    @Override
    public void learning() {
        System.out.println("Grade 12 Students");
    }
}
class Test {
    public static void main(String[] args) {
        Class c = new Class();
        c.learning();
    }
}

