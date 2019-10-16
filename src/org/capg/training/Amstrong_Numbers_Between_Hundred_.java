package org.capg.training;

public class Amstrong_Numbers_Between_Hundred_ {
	
		public static void main1(String[] args)
		{
		int n, count = 0, a, b, c, sum = 0;
		System.out.println("Armstrong numbers from 100 to 999 are:");
		for (int i = 100; i <= 999; i++) {
			n = i;
			while (n > 0) {
				b = n % 10;
				sum = sum + (b * b * b);
				n = n / 10;
			}
			if (sum == i) {
				System.out.println(i + " ");
			}
			sum = 0;
		}
	}

		int size;
			int arr[];
			int top;
		
			void Stack_Using_Array(int size) {
				this.size = size;
				this.arr = new int[size];
				this.top = -1;
			}
		
			public void push(int pushedElement) {
				if (!isFull()) {
					top++;
					arr[top] = pushedElement;
					System.out.println("Pushed element:" + pushedElement);
				} else {
					System.out.println("Stack is full !");
				}
			}
		
			public int pop() {
				if (!isEmpty()) {
					int returnedTop = top;
					top--;
					System.out.println("Popped element :" + arr[returnedTop]);
					return arr[returnedTop];
		
				} else {
					System.out.println("Stack is empty !");
					return -1;
				}
			}
		
			public int peek() {
				if(!this.isEmpty())
					return arr[top];
				else
				{
					System.out.println("Stack is Empty");
					return -1;
				}
			}
		
			public boolean isEmpty() {
				return (top == -1);
			}
		
			public boolean isFull() {
				return (size - 1 == top);
			}
		
			public static void main(String[] args) {
				Stack_Using_Array stack_Using_Array = new Stack_Using_Array(10);
				stack_Using_Array.pop();
				System.out.println("=================");
				stack_Using_Array.push(10);
				stack_Using_Array.push(30);
				stack_Using_Array.push(50);
				stack_Using_Array.push(40);
				System.out.println("=================");
				stack_Using_Array.pop();
				stack_Using_Array.pop();
				stack_Using_Array.pop();
				System.out.println("=================");
			}
		}
		
		
	


