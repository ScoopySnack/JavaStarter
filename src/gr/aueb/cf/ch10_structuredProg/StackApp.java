package gr.aueb.cf.ch10_structuredProg;

/**
 * Implementing a stack using an array. The stack will be able to push, pop, check if it is empty or full and print its elements.
 */
public class StackApp {
    static int[] myStack = new int[50];
    static int top = -1;

    public static void main(String[] args) {
        int num;

        try {
            push(1);
            push(2);
            push(3);
            num = pop();
            System.out.println("Popped: " + num); //3
            printStack(); //1 2
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }
    //!Inside the methods we do not print anything to the user. We throw exceptions instead.

    //Implementing the stack operations

    /**
     * Pushes a num to the top of the stack
     * @param  num  to be pushed
     */
    public static void push(int num) throws Exception {
        try {
            if (isFull()) throw new Exception("Error. Stack is full");
            myStack[++top] = num;
        } catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Pops an element from the top of the stack
     * @return the element that was popped
     */
    public static int pop() throws Exception {
        try {
            if (isEmpty()) throw new Exception("Error. Stack is empty");
            return myStack[top--];
        } catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Checks if the stack is empty
     * @return true if the stack is empty, false otherwise
     */
    public static boolean isEmpty(){
        return top == -1;
    }

    /**
     * Checks if the stack is full
     * @return true if the stack is full, false otherwise
     */
    public static boolean isFull(){
        return top == myStack.length - 1;
    }

    public static void printStack() throws Exception {
        try{
            if (isEmpty()) throw new Exception("Error. Stack is empty");
            for (int i = 0; i <= top; i++){
                System.out.println(myStack[i] + " ");
            }
        } catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }
}
