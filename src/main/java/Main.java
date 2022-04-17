public class Main {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();
        String binA = "1001"; //9
        String binB = "1010"; //10
        String binC = "0100"; //4
        System.out.println(binOps.sum(binA, binB)); //19 -> 10011
        System.out.println(binOps.mult(binB, binC)); //40 -> 101000
    }
}
