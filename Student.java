public class Student {
    private String name;
    private int score;

    Student(String name, int score){
        this.name = name;
        this.score = score;
    }
    //setter methods
    void setName(String Name) {
        this.name = Name;
    }
    void setScore(int Score) {
        this.score = Score;
    }
    //getter methods
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }

    public String toString() {
        return name + " - " + score;
    }
}
