public class DayNineAlt {

    static boolean backspaceCompare(String S, String T)
    {
        int i = S.length() - 1, j = T.length() - 1;
        int skipS = 0, skipT = 0;

        while (i >= 0 || j >= 0)
        {
            while (i >= 0)
            {
                if(S.charAt(i) == '#')
                { skipS++; i--; }
                else if (skipS > 0 )
                { skipS--; i--; }
                else
                    break;
            }

            while (j >= 0)
            {
                if(T.charAt(j) == '#')
                { skipT++; j--; }
                else if (skipT > 0 )
                { skipT--; j--; }
                else
                    break;
            }

            if(i >= 0 && j >= 0 && S.charAt(i) != T.charAt(j))
                return false;
            if((i >= 0) != (j >= 0)) //If expecting to compare char vs nothing
                return false;

            i--; j--;
        }
        return true;
    }

    public static void main(String ar[])
    {
        System.out.println(backspaceCompare("xywrrmp", "xywrrmu#p"));
    }

}
