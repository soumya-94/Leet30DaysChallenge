import java.util.*;

public class DaySix {

    public static void anagrams(String strings[])
    {
        if(strings.length == 0)
            System.out.println("No strings present");

        Map<String, List> solution = new HashMap<String, List>();

        for (String s : strings)
        {
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);

            if(solution.containsKey(key))
                solution.get(key).add(s);
            else
            {
                List<String> anas = new ArrayList<String>();
                anas.add(s);
                solution.put(key, anas);
            }
        }

        for(String s : solution.keySet())
        {
            List<String> values = solution.get(s);
            System.out.println(values);
        }

    }

    public static void main(String ar[])
    {
        String strings[] = {"eat", "tea", "tan", "ate", "nat", "bat"};

        anagrams(strings);

    }

}
