public class FunctionManager {

    int sum(int a, int b) {
        return a + b;
    }

    double mul(double a, double b) {
        return a * b;
    }

    void floatIsGreater(float first, float second) {
        System.out.println(first > second ? "yes" : "no");
    }

    void maximumFromThreeFloats(float first, float second, float third) {
        System.out.println(first > second ? first : (second > third ? second : third));
    }

    int printMaxElem(int array[]) {
        int max = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                max = array[i + 1];
            }
        }
        return max;
    }

}
