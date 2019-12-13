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

    void printBothName(Human first, Human second) {
        System.out.println(first.getFirstName() + ", " + second.getFirstName());
    }

    void printFirstNameIfTrueElsePrintLastName(boolean bool, Human human) {
        System.out.println(bool ? human.getFirstName() : human.getLastName());
    }

    void sortByAge(Human array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1].getYear() < array[j].getYear()) {
                    Human temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (Human elem : array) {
            System.out.print("First name: " + elem.getFirstName());
            System.out.print(", Last name: " + elem.getLastName());
            System.out.print(", Age: " + (2019 - elem.getYear()));
            System.out.print(", Gender: " + elem.getGender());
            System.out.println();
        }
    }
}
