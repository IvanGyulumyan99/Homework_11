public class Main {
    public static void main(String[] args) {
        //1
        int firstArray[] = {1,2,3,4,5,6,7,8};
        for(int elem:firstArray){
            System.out.print(elem + " ");
        }
        System.out.println();
        //2
        int secondArray[] = new int[10];
        //3
        int thirdArray[] = new int[1000];
        for(int i = 1; i <= 1000; i++){
            thirdArray[i-1] = i;
        }

    }
}
