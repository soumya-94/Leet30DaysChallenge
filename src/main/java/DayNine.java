import java.util.Stack;

public class DayNine {

    static String regenerate(String str)
    {
        Stack<Character> q = new Stack<Character>();
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) != '#')
                q.push(str.charAt(i));
            else if( !q.isEmpty())
                q.pop();
        }
        return String.valueOf(q);
    }

    static boolean backspaceCompare(String S, String T)
    {
        return regenerate(S).equals(regenerate(T));
    }

    public static void main(String ar[])
    {
        System.out.println(backspaceCompare("a#c", "b"));
    }

}
