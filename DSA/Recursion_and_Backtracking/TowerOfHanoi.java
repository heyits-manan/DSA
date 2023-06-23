public class TowerOfHanoi {
    public static void main(String[] args) {
        int noOfDisks = 2;
        String src = "S", helper = "H", dest = "D";
        towerOfHanoi(noOfDisks, src, helper, dest);
    }

    static void towerOfHanoi(int noOfDisks, String src, String helper, String dest) {
        if (noOfDisks == 1) {
            System.out.println("Transfer disk" + noOfDisks + " from " + src + " to " + dest);
            return;
        }

        towerOfHanoi(noOfDisks - 1, src, dest, helper);
        System.out.println("Transfer disk" + noOfDisks + " from " + src + " to " + dest);
        towerOfHanoi(noOfDisks - 1, helper, src, dest);

    }
}
