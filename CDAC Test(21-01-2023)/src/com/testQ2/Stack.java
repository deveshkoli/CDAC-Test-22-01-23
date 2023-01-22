package com.testQ2;
import java.util.LinkedList;

public class Stack {
    private LinkedList<Integer> stack;

    public Stack() {
        stack = new LinkedList<Integer>();
    }

    public void push(int data) {
        stack.addFirst(data);
    }

    public int pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stack.removeFirst();
    }

    public int peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stack.getFirst();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
    }
