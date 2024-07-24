package datastructures;
public class StackEx1 {
	private int maxSize;
	private int top;
	private int[] storeArray;
	public StackEx1(int size)
	{
	maxSize=size;
	storeArray = new int[maxSize];
	top = -1;
	}
    public boolean isFull()
    {
    return (top==maxSize-1);
    }
    public boolean isEmpty()
    {
    return (top==-1);
    }
    public void push(int value)
    {
    if(isFull())
    	{
    	System.out.println("Stack is full, unable to add:"+value);
    	}
    	else
    	{
    	storeArray[++top]=value;
    	}
    }
    public int pop()
    {
    if(isEmpty())
    	{
    	System.out.println("Stack is Empty");
    	return -1;
    	}
    	else
    	{
    	return storeArray[--top];
    	}
    }
    public int peek()
    {
    if(isEmpty())
    	{
    System.out.println("Stack is Empty");
    return -1;
    	}
    else
    	{
    return storeArray[top];
    	}
    }
    public int size()
    {
    return top+1;
    }
               public static void main(String[] args) {
            	   StackEx1 se=new StackEx1(5);
           		se.push(1);
           		System.out.println(se.peek());
           		se.push(2);
           		System.out.println(se.peek());
           		se.push(3);
           		System.out.println(se.peek());
           		//se.pop();
           		//System.out.println(se.size());
           		System.out.println(se.isFull());
           		se.push(4);
           		System.out.println(se.peek());
           		se.push(5);
           		System.out.println(se.peek());
           		System.out.println(se.isFull());
           		System.out.println(se.size());

           	}

           }
    
