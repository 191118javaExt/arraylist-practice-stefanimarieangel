package com.revature.list;

public class MyArrayList {

	private int size = 0;
	private int[] myArray = new int[100];

	public void add(int val) {
		// Create temp array with an extra slot
		if (size == myArray.length) {
			int[] temp = new int[size + 1];
			// Repopulate array with original values
			for (int i = 0; i < size; i++) {
				temp[i] = myArray[i];
			}
			// Add new Value
			temp[size] = val;
			size++;
			// change myArray to temp
			myArray = temp;
		} else {
			myArray[size] = val;
			size++;
		}
	}

	public void set(int index, int val) {
		// TODO Auto-generated method stub
		myArray[index] = val;
	}

	public void remove(int index) {
		int[] tempArr = new int[myArray.length - 1];
		for (int i = 0; i < index; i++) {
			tempArr[i] = myArray[i];
		}
		for (int i = index + 1; i < myArray.length; i++) {
			tempArr[i - 1] = myArray[i];
		}
		myArray = tempArr;

	}

	public int get(int index) {
		// TODO Auto-generated method stub
		return myArray[index];
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[" + myArray[0]);
		for (int i = 1; i < myArray.length; i++) {
			sb.append(", " + myArray[i]);
		}
		sb.append("]");

		String s = new String(sb);
		return s;
	}
}
