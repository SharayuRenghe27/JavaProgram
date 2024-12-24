package MastercodingIQ;

import java.util.Scanner;

public class vowelconsonants {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Tumchya priya mummy ch naav taka  - ");
        String s=  sc.next();
        s.toLowerCase();
        int vowels=0,cons=0;
//        int count=s.length();
        for (int i=0;i<s.length();i++)
        {
            char temp2 =s.charAt(i);
            System.out.println("char-> "+temp2);
             if (Character.isAlphabetic(temp2))
             {
                 if (temp2=='a'||temp2=='e'||temp2=='i'||temp2=='o'||temp2=='u')
                     vowels++;
                 else
                     cons++;

             }

        }
        System.out.printf("\n Vowels-%d  and  consonants -%d", vowels,cons);
        sc.close();
    }
}
