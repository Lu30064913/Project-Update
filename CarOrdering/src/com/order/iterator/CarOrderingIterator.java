package com.order.iterator;

import java.lang.reflect.Type;
import java.util.Iterator;

public class CarOrderingIterator<Type> {

	private Type[] listObj;
	private int Size;

	public CarOrderingIterator(Type[] listObj) {
		this.listObj = listObj;
		this.Size = listObj.length;
	}

	public Iterator<Type> iterator() {
		Iterator<Type> iterator = new Iterator<Type>() {
			private int position = 0;

			@Override
			public boolean hasNext() {
				return position < Size && listObj[position] != null;
			}

			@Override
			public Type next() {
				return listObj[position++];
			}

		};
		return iterator;
	}
}