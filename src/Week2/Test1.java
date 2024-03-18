package Week2;

public class Test1 {
    private static final int QUARTER_WAY = 2;
    private static final int HALF_WAY = 3;
    private static final int ALL_THE_WAY = 6;

    public static void main(String[] args) {
        int numberOfValues = 0;
        int total = 0;
        boolean madeIt;
        do {
            while (numberOfValues < HALF_WAY) {
                total += numberOfValues;
                numberOfValues++;
            }
            madeIt = (total - numberOfValues) % 2 == 0;
            numberOfValues -= QUARTER_WAY;
            System.out.println(total + " " + numberOfValues + " " + madeIt);
        } while (total < ALL_THE_WAY);
            }
}

