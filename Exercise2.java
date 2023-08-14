public class Exercise2 {
    public static void main(String[] args) {

        for (int i = 100; i >= 0; i--) {
            multiplicity(i);
        }
    }

    public static int multiplicity(int i) {
        if (i % 4 == 0) {
            System.out.print(i + " ");
        }
        return 1;
    }
}

