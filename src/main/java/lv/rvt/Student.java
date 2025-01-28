package lv.rvt;

class Student extends Person {
    private int studyCredits;

    public Student(String name, int age) {
        super(name, age);
        this.studyCredits = 0;
    }

    public void study() {
        studyCredits++;
    }

    public int getStudyCredits() {
        return studyCredits;
    }
    @Override
public String toString() {
    return super.toString() + ", " + studyCredits + " study credits";
}
}

