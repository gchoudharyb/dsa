package com.gaurav.linked.list.example;

import com.gaurav.linked.list.SingleLinkedList;

import node.SingleNode;

public class FindMiddleOfLinkedList {
	public static void main(String[] args) {
		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.createSingleLinkedList(10);
		linkedList.insertInLinkedList(20, 1);
		linkedList.insertInLinkedList(22, 2);
		linkedList.insertInLinkedList(50, 3);
		linkedList.insertInLinkedList(40, 4);
		linkedList.traverseLinkedList();
		
		SingleNode tempNode = linkedList.getHead();
		for (int i = 0; i < linkedList.getSize()/2; i++) {
			
		}
		/*String s = "123";
		char r = s.charAt(4);
		System.out.println(r);*/
		System.out.println(test());
	}
	
	public static Object test()
	{
		Object x = new Object();
		Object [] y = new Object[1];
		y[0]=x;
		x=null;
		return y[0];
	}
	
}
