package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static final int RETURN_VALUE = -1;
	private Node last;
	private int i;

	public static int getReturnValue() {
		return RETURN_VALUE;
	}

	public void push(final int i) {
		if (getLast() == null)
			setLast(new Node(i));
		else {
			getLast().setNext(new Node(i));
			getLast().getNext().setPrev(getLast());
			setLast(getLast().getNext());
		}
	}

	public boolean isEmpty() {
		return getLast() == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return getReturnValue();
		return getLast().getValue();
	}

	public int pop() {
		if (isEmpty())
			return getReturnValue();
		final int ret = getLast().getValue();
		setLast(getLast().getPrev());
		return ret;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}
