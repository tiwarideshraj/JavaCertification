public class ShapeByLoop {

    public void rightTrangle(int l) {
        System.out.println(" tringle ");
        for (int i=1;i<=l;i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
    public void oppRightTrangle(int l) {
        System.out.println(" opposite tringle ");
        int i, j;
        for (i = l; i >= 1; i--) {
            for (j = i; j >= 1; j--)
                System.out.print("* ");
            System.out.println();
        }
    }
        public void rectangle(int l) {
            System.out.println(" rectangle ");
            int i,j;
            for (i=l;i>=1;i--) {
                for (j = l; j >= 1; j--) {
                    if (i==l || i==1) {
                        System.out.print("* ");
                    }
                    else {
                        for (j = l; j >= 1; j--) {
                            if (j==l||j==1) {
                                System.out.print("* ");
                            }else {
                                System.out.print("  ");

                            }
                        }
                    }
                }
                System.out.println();
        }
    }
}
