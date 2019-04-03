package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {
    IntArrayStack arr;
    IntLinkedList linked;

    public DefaultCountingOutRhymer() {
        this.linked = new IntLinkedList();
    }

    public static int getDefaultReturnValue() {
        return IntArrayStack.getDefaultReturnValue();
    }

    public static int getMaxStackSize() {
        return IntArrayStack.getMaxStackSize();
    }

    public boolean callCheck() {
        return linked.isEmpty();
    }

    public boolean isFull() {
        return linked.isFull();
    }

    protected void countIn(int in) {
        linked.push(in);
    }

    public int peekaboo() {
        return linked.top();
    }

    public int countOut() {
        return linked.pop();
    }

    public int getTotal() {
        return arr.getTotal();
    }

    public int[] getNumbers() {
        return arr.getNumbers();
    }
}
