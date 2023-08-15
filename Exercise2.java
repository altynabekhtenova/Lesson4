public class Exercise2 {

    public static void main(String[] args) {

        for (int i = 100; i >= 0; i--) {
            if (multiplicity(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean multiplicity(int i) {
        return i % 4 == 0;
    }
}

