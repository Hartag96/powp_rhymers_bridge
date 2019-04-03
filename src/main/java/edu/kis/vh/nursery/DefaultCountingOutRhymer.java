package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    IntArrayStack arr;

    public DefaultCountingOutRhymer(IntArrayStack arr) {
        this.arr = arr;
    }

    public DefaultCountingOutRhymer() {
        this.arr = new IntArrayStack();
    }

    public static int getDefaultReturnValue() {
        return IntArrayStack.getDefaultReturnValue();
    }

    public static int getMaxStackSize() {
        return IntArrayStack.getMaxStackSize();
    }

    public boolean callCheck() {
        return arr.callCheck();
    }

    public boolean isFull() {
        return arr.isFull();
    }

    protected void countIn(int in) {
        arr.countIn(in);
    }

    public int peekaboo() {
        return arr.peekaboo();
    }

    public int countOut() {
        return arr.countOut();
    }

    public int getTotal() {
        return arr.getTotal();
    }

    public int[] getNumbers() {
        return arr.getNumbers();
    }
}
