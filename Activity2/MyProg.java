package Activity2;

public class MyProg {
    public static void main(String[] args) {
        MyArrayList<Student> mal = new MyArrayList<>();
        mal.insertFirst(new Student(1, "John"));
        mal.insertFirst(new Student(2, "Mary"));
        mal.insertLast(new Student(3, "Mike"));
        mal.show();
        mal.deleteLast();
        mal.show();      
        mal.deleteFirst();
        mal.show();
    }
}
