package lv.rvt;

class Teacher extends Person {
    private int salary;

    public Teacher(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", earns " + salary + " euros/month";
    }
}
