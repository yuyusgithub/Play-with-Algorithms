package chapter01.selection_sort02_using_compare;

public class Student implements Comparable<Student> {

    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int compareTo(Student that) {

        if (this.score < that.score)
            return -1;
        else if (this.score > that.score)
            return 1;
        else
            return this.name.compareTo(that.name);
    }

    @Override
    public String toString() {
        return "Student: " + this.name + " " + Integer.toString(this.score);
    }


    public static void main(String[] args) {
        Integer i = 1;
        Integer k = 1;
        System.out.println(i.compareTo(k));

    }
}
