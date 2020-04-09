
class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class DayEight {

    ListNode head;

    public void printMiddle()
    {
        ListNode slow = head;
        ListNode fast = head;

        if(head != null)
        {
            while (fast != null && fast.next != null)
            {
                fast = fast.next.next;
                slow = slow.next;
            }
            System.out.println("Middle value is "+slow.val);
        }
    }

    public void push(int data)
    {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    public static void main(String ar[])
    {
        DayEight obj = new DayEight();

        for(int i=1; i<=6; i++)
            obj.push(i);

        obj.printMiddle();

    }

}
