package day18_collection;

public class MyStack<E> {
	E[] stack;
	int top = 0;
	
	MyStack(){
		stack = (E[]) new Object[10]; 
	}
	
	MyStack(int size) {
		if (top < 0)
			stack = (E[]) new Object[10];
		else
			stack = (E[]) new Object[size];
		
	}
	
	void push (int data) {
		
		stack(pop) = data
			top ++
	}
	
	Boolean isEmpty() {
		return top == 0 ? true : false ;

	}
	Boolean isEmpty() {
		return top == 0 ? true : false ;
	}
	
	
}
