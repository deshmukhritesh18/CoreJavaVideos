package com.bnt.exception;

import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class TryWithResource {
	
	public static void main(String[] args) {
		try(Scanner sc =new Scanner(System.in)){
			int y=sc.nextInt();
		}catch(NullPointerException|ArithmeticException e) {
			System.out.println(e);
		}
	//	int x=sc.nextInt();

	}

	/*
	 * @Override public int size() { // TODO Auto-generated method stub return 0; }
	 * 
	 * @Override public boolean isEmpty() { // TODO Auto-generated method stub
	 * return false; }
	 * 
	 * @Override public boolean contains(Object o) { // TODO Auto-generated method
	 * stub return false; }
	 * 
	 * @Override public Iterator iterator() { // TODO Auto-generated method stub
	 * return null; }
	 * 
	 * @Override public Object[] toArray() { // TODO Auto-generated method stub
	 * return null; }
	 * 
	 * @Override public Object[] toArray(Object[] a) { // TODO Auto-generated method
	 * stub return null; }
	 * 
	 * @Override public boolean add(Object e) { // TODO Auto-generated method stub
	 * return false; }
	 * 
	 * @Override public boolean remove(Object o) { // TODO Auto-generated method
	 * stub return false; }
	 * 
	 * @Override public boolean containsAll(Collection c) { // TODO Auto-generated
	 * method stub return false; }
	 * 
	 * @Override public boolean addAll(Collection c) { // TODO Auto-generated method
	 * stub return false; }
	 * 
	 * @Override public boolean removeAll(Collection c) { // TODO Auto-generated
	 * method stub return false; }
	 * 
	 * @Override public boolean retainAll(Collection c) { // TODO Auto-generated
	 * method stub return false; }
	 * 
	 * @Override public void clear() { // TODO Auto-generated method stub
	 * 
	 * }
	 */
}
