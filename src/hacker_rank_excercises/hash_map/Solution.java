package hacker_rank_excercises.hash_map;

import java.util.HashMap;
import java.util.Scanner;

class Solution{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        HashMap<String, Integer> persons = new HashMap<>();
        for(int i=0;i<n;i++)
        {

            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            persons.put(name,phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            Integer seekNumberByName = persons.get(s);
            if(seekNumberByName.equals(0)){
                System.out.println("Not Found");

            }
            else {
                System.out.println(s + "=" + seekNumberByName);
            }
        }
    }
}

