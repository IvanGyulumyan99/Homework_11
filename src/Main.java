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
    }
}
