package practic.practic4;

public class Dzpractic4_3_MergNumber {
    private String merging(String forMerging) {
        if (forMerging.matches("[0-9]*")) {
            return forMerging;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Dzpractic4_3_MergNumber mergingNumbers = new Dzpractic4_3_MergNumber();
        System.out.println(mergingNumbers.merging("-2.e10"));
    }
}
