

public class Main {
    public static void main(String[] args) {
        //1
        int firstArray[] = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int elem : firstArray) {
            System.out.print(elem + " ");
        }
        System.out.println();
        //2
        int secondArray[] = new int[10];
        //3
        int thirdArray[] = new int[1000];
        for (int i = 1; i <= 1000; i++) {
            thirdArray[i - 1] = i;
        }
        //4
        byte fourthArray[] = new byte[30];
        int indexForFourthArray = 0;
        for (byte i = -30; i < 31; i += 2) {
            if (i != 0) {
                fourthArray[indexForFourthArray] = i;
                indexForFourthArray++;
            }
        }
        //5
        short fifthArray[] = new short[150];
        int indexForFifthArray = 0;
        for (short i = 1; i < 301; i += 2) {
            fifthArray[indexForFifthArray] = i;
            indexForFifthArray++;
        }
        //6
        int sixthArray[] = {1, 5, 10, 22, 25, 30};
        for (int elem : sixthArray) {
            if (elem % 5 == 0) {
                System.out.print(elem + " ");
            }
        }
        System.out.println();
        //7
        double seventhArray[] = {1.1, 3, -26.7, 38.12, 42.4};
        for (double elem : seventhArray) {
            if (elem > 24.56) {
                System.out.print(elem + " ");
            }
        }
        System.out.println();
        //8
        float eighthArray[] = {-37.1234f, -28.4563f, 0.5432f, 28.123441f, 39.123123f};
        for (float elem : eighthArray) {
            if (elem > -34.655f && elem < 35.56f) {
                System.out.print(elem + " ");
            }
        }
        System.out.println();

        //9
        double ninthArray[] = {6.2, 6.1, 2.3, -8.4, 10.4, 44};
        for (int i = 0; i < ninthArray.length - 1; i++) {
            for (int j = 0; j < ninthArray.length - i - 1; j++) {
                if (ninthArray[j + 1] < ninthArray[j]) {
                    double temp = ninthArray[j];
                    ninthArray[j] = ninthArray[j + 1];
                    ninthArray[j + 1] = temp;
                }
            }
        }
        for (double elem : ninthArray) {
            System.out.print(elem + " ");
        }
        System.out.println();
        for (int i = 0; i < ninthArray.length - 1; i++) {
            for (int j = 0; j < ninthArray.length - i - 1; j++) {
                if (ninthArray[j + 1] > ninthArray[j]) {
                    double temp = ninthArray[j];
                    ninthArray[j] = ninthArray[j + 1];
                    ninthArray[j + 1] = temp;
                }
            }
        }
        for (double elem : ninthArray) {
            System.out.print(elem + " ");
        }
        System.out.println();

        //10
        int counter = 0;
        String tenthString = "13456ewsdfvxcxzaaaqweqr1r12341zaa";
        for (int i = 0; i < tenthString.length(); i++) {
            if (tenthString.charAt(i) == 'a') {
                counter++;
            }
        }
        System.out.println(counter);

        //11
        String eleventhString = "123aaaba";
        boolean isThereB = false;
        for (int i = 0; i < eleventhString.length(); i++) {
            if (eleventhString.charAt(i) == 'b') {
                isThereB = true;
                break;
            }
        }
        System.out.println(isThereB ? "yes" : "no");

        //12
        int twelfthArray[] = {1, 2, 3, 4, 8, 16, 23, 32};
        for (int elem : twelfthArray) {
            if ((elem & elem - 1) == 0) {
                System.out.print(elem + " ");
            }
        }
        System.out.println();
        FunctionManager a = new FunctionManager();

        //2.1
        System.out.println(a.sum(1, 2));

        //2.2
        System.out.println(a.mul(1.3, 1.3));

        //2.3
        a.floatIsGreater(3.123f, 1.2314f);

        //2.4
        a.maximumFromThreeFloats(2f, 3f, 1f);

        //2.5
        Human h = new Human();
        Human Ivan = new Human("Ivan", "Gyulumyan", 1999, 'm');
        Human Maria = new Human("Maria", "Ispiryan", 2003, 'f');
        Human Ethan = new Human("Ethan", "Wilde", 1995, 'f');
        Human Narek = new Human("Narek", "Gukasyan", 1998, 'm');
        h.printMale(Maria);

        //2.6
        Human arrayOfHumans[] = {Ivan, Maria, Ethan, Narek};
        h.printOldestLastName(arrayOfHumans);

        //2.7
        h.printBothName(Ivan, Maria);

        //2.8
        h.printFirstNameIfTrueElsePrintLastName(true, Ivan);

        //2.9
        int array[] = {4, 3, 2, 1, 6, 4, 2, 4, 7, 8, 16};
        System.out.println(a.printMaxElem(array));

        //2.10
        float floatsArray[] = {4f, 6f, 1f, 12f, 5f, 2f, -1f, -5f, 12f, 12f, 12f, 12f};
        System.out.println(a.minimalElementsIndex(floatsArray));

        System.out.println("a");
        System.out.println("b");
        System.out.println("c");
        System.out.println("d");
        System.out.println("e");
    }
}
