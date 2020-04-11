import java.util.Stack;
class MinStack
{
    Stack<Integer> s;
    Integer minElement;

    MinStack()
    {
        s = new Stack<Integer>();
    }
    void getMin()
    {
        if (s.isEmpty())
        {
            System.out.println("Stack is empty");
            //return 0;
        }
        else
        {
            System.out.println("min is: "+minElement);
            //return minElement;
        }
    }
    void top()
    {
        if (s.isEmpty())
        {
            System.out.println("Stack is empty ");
            //return 0;
        }
        Integer t = s.peek();
        if(t < minElement) {
            System.out.println("top is: " + minElement);
            //return minElement;
        }
        else
        {
            System.out.println("top is: " + t);
            //return t;
        }
    }
    void pop()
    {
        if (s.isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }
        Integer t = s.pop();
        if( t < minElement)
        {
            System.out.println("element removed: " + minElement);
            minElement = 2*minElement - t;
        }
        else
            System.out.println("element removed: " + t);
    }

    void push(Integer x)
    {
        if(s.isEmpty())
        {
            minElement = x;
            s.push(x);
            System.out.println("element inserted: " + x);
            return;
        }
        else {
            if (x < minElement) {
                Integer item = 2 * x - minElement;
                s.push(item);
                System.out.println("element inserted: " + item);
                minElement = x;
            } else {
                push(x);
                System.out.println("element inserted: " + x);
            }
        }
    }

}

public class DayTen {

    public static void main(String ar[])
    {
        MinStack s = new MinStack();
        s.push(3);
        System.out.println("error");
        s.push(5);
        s.getMin();
        s.push(2);
        s.push(1);
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();
        s.top();
    }

}


