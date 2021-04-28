package com.gaurav.linked.list;

import com.gaurav.linked.list.node.SingleNode;

public class SingleLinkedListCustom {

	private SingleNode head;
	private SingleNode tail;
	private int size;
	
	public SingleNode createSingleLinkedList(int nodeValue)
	{
		this.head=new SingleNode();
		SingleNode singleNode = new SingleNode();
		singleNode.setValue(nodeValue);
		singleNode.setNext(null);
		head=singleNode;
		tail=singleNode;
		size=1;
		return head;
	}

	public SingleNode getHead() {
		return head;
	}

	public void setHead(SingleNode head) {
		this.head = head;
	}

	public SingleNode getTail() {
		return tail;
	}

	public void setTail(SingleNode tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void insertInLinkedList(int nodeValue , int location)
	{
		SingleNode node = new SingleNode();
		node.setValue(nodeValue);
		
		if(head!=null)
		{
			if(location==0)
			{
				node.setNext(head);
				head=node;
				++size;
			}
			else if(location>=size)
			{
				node.setNext(null);
				tail.setNext(node);
				tail=node;
				++size;
			}
			else
			{
				SingleNode tempNode = head;
				for (int i = 0; i < location-1; i++) {
					tempNode=tempNode.getNext();
				}
				node.setNext(tempNode.getNext());
				tempNode.setNext(node);
				++size;
			}
		}
		else
		{
			System.out.println("Linked is not existed");
		}
	}
	
	public void traverseLinkedList()
	{
		if(head!=null)
		{
			SingleNode tempNode = head;
			for (int i = 0; i < size; i++) {
				System.out.println(tempNode.getValue());
				if (i != getSize() - 1) {
					System.out.print(" -> ");
				}
				tempNode=tempNode.getNext();
			}
		}
		else
		{
			System.out.println("Linked is not existed");
		}
		System.out.println("\n");
	}
	public void deleteLinkedList()
	{
		System.out.println("\n\nDeleting Linked List...");
		head=null;
		tail=null;
		size=0;
		System.out.println("Linked List deleted successfully !");
	}
	public boolean searchNode(int nodeValue)
	{
		if(head!=null)
		{
			SingleNode tempNode=head;
			for (int i = 0; i < size; i++) {
				if(nodeValue==tempNode.getValue())
				{
					System.out.println("node found at location" + i);
					return true;
				}
				tempNode=tempNode.getNext();
			}
		}
		else
		{
			System.out.println("Linked list doesn't exist");
			return false;
		}
		return false;
	}
	
	public void deleteNodeByValue(int nodeValue)
	{
		if(head!=null)
		{
			SingleNode node = head;
			for (int i = 0; i < size; i++) {
				if(nodeValue==node.getValue())
				{
					
				}
				node=node.getNext();
			}
			
		}
		else
		{
			System.out.println("Linked list doesn't exist");
		}
	}
	
	public void deleteNodeByLocation(int location)
	{
		if(head!=nu)
		{
			
		}
		else
		{
			System.out.println("Linked list doesn't exist");
		}
	}
}
