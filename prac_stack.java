import java.util.*;

public class prac_stack {
    public static Stack<Integer> stack = new Stack<Integer>();
    public static int limit =5;

    public static void stack_push(Stack<Integer> stack)
    {
        for(int i=0;i<limit;i++)
        {
            stack.push(i);
        }
    }
    public static void stack_pop(Stack<Integer> stack)
    {
        System.out.println("Pop:-");
        for(int i=0;i<limit;i++)
        {
            Integer y =(Integer) stack.pop();
            System.out.println(y);
        }
    }
    public static void stack_search(Stack<Integer> stack,int element)
    {
            Integer a = (Integer) stack.search(element);
            if(a==-1)
            {
                System.out.println("element not found");
            }
            else{
                System.out.println("element is found at " + a+1);
            }
    }
    public static void stack_peek(Stack<Integer> stack)
    {
        Integer nint = (Integer) stack.peek();
        System.out.println("peek element is :-" + nint );
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack_push(stack);
        stack_pop(stack); 
 		stack_push(stack); 
 		stack_peek(stack); 
 		stack_search(stack, 2); 
 		stack_search(stack, 6); 

    }

}
// Java code for stack implementation 

// import java.io.*; 
// import java.util.*; 

// class Test 
// { 
// 	// Pushing element on the top of the stack 
// 	static void stack_push(Stack<Integer> stack) 
// 	{ 
// 		for(int i = 0; i < 5; i++) 
// 		{ 
// 			stack.push(i); 
// 		} 
// 	} 
	
// 	// Popping element from the top of the stack 
// 	static void stack_pop(Stack<Integer> stack) 
// 	{ 
// 		System.out.println("Pop :"); 

// 		for(int i = 0; i < 5; i++) 
// 		{ 
// 			Integer y = (Integer) stack.pop(); 
// 			System.out.println(y); 
// 		} 
// 	} 

// 	// Displaying element on the top of the stack 
// 	static void stack_peek(Stack<Integer> stack) 
// 	{ 
// 		Integer element = (Integer) stack.peek(); 
// 		System.out.println("Element on stack top : " + element); 
// 	} 
	
// 	// Searching element in the stack 
// 	static void stack_search(Stack<Integer> stack, int element) 
// 	{ 
// 		Integer pos = (Integer) stack.search(element); 

// 		if(pos == -1) 
// 			System.out.println("Element not found"); 
// 		else
// 			System.out.println("Element is found at position " + pos); 
// 	} 


// 	public static void main (String[] args) 
// 	{ 
// 		Stack<Integer> stack = new Stack<Integer>(); 

// 		stack_push(stack); 
// 		stack_pop(stack); 
// 		stack_push(stack); 
// 		stack_peek(stack); 
// 		stack_search(stack, 2); 
// 		stack_search(stack, 6); 
// 	} 
// } 
