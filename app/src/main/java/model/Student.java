package model;

public class Student {
    private String name;
    private int avg;
    private boolean isTopStudent;

    public Student(int avg, String name, boolean b) {
        this.avg = avg;
        this.name = name;
        isTopStudent = b;
    }

    public String getName() {
        return name;
    }

    public int getAvg() {
        return avg;
    }

    public boolean isTopStudent() {
        return isTopStudent;
    }
}
