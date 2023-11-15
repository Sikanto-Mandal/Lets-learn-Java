public class InvertedStar {
    public static void main(String argss[]) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");

            }
            for (int j = i; j >= 1; j--) {

                System.out.print(j);

                // if ((i == 1 || i == n) || (j == 1 || j == n)) {
                // System.out.print("*");
                // } else {
                // System.out.print(" ");
                // }

            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

            // System.out.print("*");

            // // if ((i + j) % 2 == 0) {
            // // System.out.print("1");
            // // } else {
            // // System.out.print("0");
            // // }

            // }
            // for (int j = 1; j <= ((n - i) * 2); j++) {
            // System.out.print(" ");
            // }
            // for (int j = 1; j <= i; j++) {
            // System.out.print("*");
            // }
            // System.out.println();
            // }
            // for (int i = n; i >= 1; i--) {
            // for (int j = 1; j <= i; j++) {
            // System.out.print("*");
            // }
            // for (int j = 1; j <= ((n - i) * 2); j++) {
            // System.out.print(" ");
            // }
            // for (int j = 1; j <= i; j++) {
            // System.out.print("*");
            // }
            // System.out.println();
        }

    }

}
