package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int SIZE_OF_NUMBERS_ARRAY = 12;
    private static final int TOTAL_VALUE = -1;
    private static final int MAX_CAPACITY = 11;
    private final int[] numbers = new int[SIZE_OF_NUMBERS_ARRAY];

    private int total = TOTAL_VALUE;

    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public int getTotal(){
        return total;
    }

    public void setTotal(int total){
        this.total = total;
    }

    protected boolean callCheck() {
        return total == TOTAL_VALUE;
    }

    public boolean isFull() {
        return total == MAX_CAPACITY;
    }

    protected int peekaboo() {
        if (callCheck())
            return TOTAL_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return TOTAL_VALUE;
        return numbers[total--];
    }

}
