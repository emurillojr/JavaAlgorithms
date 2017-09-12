package stack.arraystack;

public class ArrayStack {
	private int[] data; // array
	private int size;
	private int top = -1;
	private int[] temp;

	public ArrayStack(int size) {
		this.size = size;
		data = new int[size];
	}

	// clear contents of the stack
	public void clear() {
		for (int i = top; i >= 0; i--) {
			pop();
		}
	}

	public void push(int element) {
		if (isStackFull()) {
			// 0 seconds
			temp = new int[data.length * 2];
			for (int i = 0; i < data.length; i++) {
				temp[i] = data[i];
			}
			data = temp;
			top++;
			data[top] = element;
			// data[++top] = element; same as time 29 + 30

			// 0 seconds as well
			// int[] tempArray = new int[stackSize * 2];
			// System.arraycopy(data, 0, tempArray, 0, data.length);
			// data = tempArray;
			// data[++top] = element;

		}

	}

	public int pop() {
		if (top >= 0) {
			return data[top--];
		} else {
			System.out.println("Sorry But the Stack is Empty");
			return -1;
		}
	}

	public int size() {
		int counter = 0;
		if (top >= 0)
			for (int i = 0; i <= top; i++) {
				counter++;
			}
		return counter;
	}

	public boolean find(int element) {
		for (int i = 0; i < data.length; i++)
			if (data[i] == element)
				return true; // return true if the number is in the stack

		return false;

	}

	public int indexOf(int element) {
		for (int i = 0; i < data.length; i++)
			if (data[i] == element)
				return i; // return the location (index of the number within the
							// stack)... else
		return -1; // return -1 if the element is not present
	}

	public boolean isEmpty() {
		if (top == 0) {
		}
		return true;
	}

	public int peek() {
		return data[top];
	}

	public void printAll() {
		if (top >= 0) {
			System.out.println("Elements in stack :");
			for (int i = 0; i <= top; i++) {
				System.out.println(data[i]);
			}
		} else {
			System.out.println("Stack is Empty");
		}
	}

	public boolean isStackFull() {
		return (top == -1);
	}

	// public void increaseSize() {
	// int[] tempArray = new int[data.length*2];
	// System.arraycopy(data, 0, tempArray, 0, data.length);
	// data = tempArray;
	// stackSize++;

	// temp = new int[data.length + 2];
	//
	//
	// for (int i = 0; i < data.length; i++) {
	// temp[i] = data[i];
	// }
	// data = temp;
	// }

}
