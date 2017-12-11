package org.lee.designpatern.iterator;

interface Aggregate {
	public void add(Object obj);

	public void remove(Object obj);

	public Iterator iterator();
}