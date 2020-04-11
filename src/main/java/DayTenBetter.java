class Node
{
    int data;
    Node next;
    Node() { data = -1; next = null;}
    Node(int d) { data = d; next = null;}
    void setData(int data) { this.data = data; }
    void setNext(Node next) { this.next = next; }
    Node getNext() { return next; }
    int getData() { return data; }
}

class Stack
{
    Node top;
    int minimum;
    void push(Node node)
    {
        int current = node.getData();
        if(top == null)
        {
            top = node;
            minimum = current;
        }
        else
        {
            if(current < minimum)
            {
                node.setData(2*current - minimum);
                minimum = current;
            }
            node.setNext(top);
            top = node;
        }
    }
    Node pop()
    {
        Node node = top;
        if(node != null)
        {
            int current = node.getData();
            if (current < minimum) {
                minimum = 2 * minimum - current;
                node.setData((current + minimum) / 2);
            }
            top = top.getNext();
        }
        return node;
    }
    Node top()
    {
        Node node = null;
        if (top != null) {
            node = new Node();
            int current = top.getData();
            node.setData(current < minimum ? minimum : current);
        }
        return node;
    }
    void printAll()
    {
        Node ptr = top;
        int min = minimum;
        if (ptr != null) { // if stack is not empty
            while (true) {
                int val = ptr.getData();
                if (val < min) {
                    min = 2 * min - val;
                    val = (val + min) / 2;
                }
                System.out.print(val + "  ");
                ptr = ptr.getNext();
                if (ptr == null)
                    break;
            }
            System.out.println();
        }
        else
            System.out.println("Empty!");
    }
    int getMin()
    {
        return minimum;
    }
    boolean isEmpty()
    {
        return top == null;
    }
}

public class DayTenBetter {

    public static void main(String[] args)
    {
        // Create a new stack
        Stack stack = new Stack();
        Node node;

        // Push the element into the stack
        stack.push(new Node(2));
        stack.push(new Node(0));
        stack.push(new Node(3));
        stack.push(new Node(0));

        // Calls the method to print the stack
        //System.out.println("Elements in the stack are:");
        //stack.printAll();

        // Print current minimum element if stack is
        // not empty
        System.out.println(stack.isEmpty() ? "\nEmpty Stack!" :
                "\nMinimum: " + stack.getMin());

        // Push new elements into the stack
       // stack.push(new Node(1));
        //stack.push(new Node(2));

        // Printing the stack
        //System.out.println("\nStack after adding new elements:");
        //stack.printAll();

        // Print current minimum element if stack is
        // not empty
        //System.out.println(stack.isEmpty() ? "\nEmpty Stack!" :
                //"\nMinimum: " + stack.getMin());

        // Pop elements from the stack
        node = stack.pop();
        System.out.println("\nElement Popped: "
                + (node == null ? "Empty!" : node.getData()));

        System.out.println(stack.isEmpty() ? "\nEmpty Stack!" :
                "\nMinimum: " + stack.getMin());
        node = stack.pop();
        System.out.println("\nElement Popped: "
                + (node == null ? "Empty!" : node.getData()));

        System.out.println(stack.isEmpty() ? "\nEmpty Stack!" :
                "\nMinimum: " + stack.getMin());
        node = stack.pop();
        System.out.println("Element Popped: "
                + (node == null ? "Empty!" : node.getData()));

        // Printing stack after popping elements
       // System.out.println("\nStack after removing top two elements:");
        //stack.printAll();

        // Printing current Minimum element in the stack
        System.out.println(stack.isEmpty() ? "\nEmpty Stack!" :
                "\nMinimum: " + stack.getMin());

        // Printing top element of the stack
        //node = stack.top();

        //System.out.println("\nTop: " + (node == null ?
                //"\nEmpty!" : node.getData()));
    }
}
