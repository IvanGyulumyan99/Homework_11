public class Human {
    private String firstName;
    private String lastName;
    private int year;
    private char gender;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Human(String firstName, String lastName, int year, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.gender = gender;
    }

    public Human() {

    }

    void printMale(Human human) {
        System.out.println(human.getGender() == 'm' ? "yes" : "no");
    }

    void printOldestLastName(Human human[]) {
        String max = human[0].getLastName();
        for (int i = 0; i < human.length - 1; i++) {
            if (human[i].getYear() > human[i + 1].getYear()) {
                max = human[i + 1].getLastName();
            }
        }
        System.out.println(max);
    }
}
