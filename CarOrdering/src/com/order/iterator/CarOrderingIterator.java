package com.order.iterator;

import java.lang.reflect.Type;

public class CarOrderingIterator<Type> {

	private Type[] listObj;
	private int Size;
	private int position = 0;

	public CarOrderingIterator(Type[] listObj) {
		this.listObj = listObj;
		this.Size = listObj.length;
	}
	
	public boolean hasNext() {
		return position < Size && listObj[position] != null;
	}
	
	public Type next() {
		return listObj[position++];
	}

}