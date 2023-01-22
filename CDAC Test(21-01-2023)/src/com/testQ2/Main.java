package com.testQ2;

public class Main {
	public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(8);
        stack.push(9);
        System.out.println("Peek Element:"+stack.peek()); 
        System.out.println("Pop Element:"+stack.pop()); 
        System.out.println("Pop Element:"+stack.pop()); 
        System.out.println("Empty Element:"+stack.isEmpty()); 
}
}