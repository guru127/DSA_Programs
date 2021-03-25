package com.company.stack;

public class Stack {
    static  int size =100;
    int top;
    int[] a = new int[size];

    boolean isEmpty(){
        return top < -1;
    }
    Stack(){
        top=-1;
    }
    void push (int i){
        if(top>=size-1){
            System.out.println("Stack overflow");
            return;
        }
        else{
           a[++top]=i;
           return;
        }
    }
    int pop(){
        if(top<0){
            System.out.println("Stack underflow");
            return 0;
        }else{
           return a[top--];
        }
    }
    int peek(){
        if(top<0){
            System.out.println("Stack underflow");
            return 0;
        }else{
            return a[top];
        }
    }
    boolean isFull(){
        if (top>=size) {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }

}
