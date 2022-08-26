import java.util.Arrays;
import java.util.Scanner;

public class Assignment3 {
    
    // Question 1 WAP to reverse a String.
    
    public void question1(){
        String s  = "iNeuron";
        String ch = "";
        for(int i = s.length()-1;i>=0;i--){
            ch = ch + s.charAt(i);
        }
        System.out.println(ch);
        }

        // Question 2 WAP to reverse a sentence while preserving the position.
        // Solution 1
    public void question2(){
        String s = "Think Twice";
        String rs = "";
        String res = "";
        for(int i = s.length()-1;i>=0;i--){
            rs = rs + s.charAt(i);
        }
        String a[] = rs.split(" ");
        for(int i = a.length-1;i>= 0;i--){
            res = res + a[i] + " ";
        }
            System.out.println(res);
        }
    // Solution 2
    public void temp(){
        String s  = "Think Twice";
        String rs  = "";
        String a [] = s.split(" ");
        for(int i = 0;i<a.length;i++){
            String temp = a[i];
            for(int j = temp.length()-1;j>=0;j--){
                rs = rs + temp.charAt(j);
            }
            rs = rs + " ";
            }
            System.out.println(rs);
    }


// Question 3


    public void question3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String: ");
        String str1 = sc.nextLine();
        System.out.println("Enter second string to check the anagram:");
        String str2 = sc.nextLine();
        sc.close();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
    
        if(str1.length() == str2.length()) {
    
          char[] charArray1 = str1.toCharArray();
          char[] charArray2 = str2.toCharArray();
    
          Arrays.sort(charArray1);
          Arrays.sort(charArray2);
    
          boolean result = Arrays.equals(charArray1, charArray2);
    
          if(result) {
            System.out.println(str1 + " and " + str2 + " are anagram.");
          }
          else {
            System.out.println(str1 + " and " + str2 + " are not anagram.");
          }
        }
        else {
          System.out.println(str1 + " and " + str2 + " are not anagram.");
        }
    }

// question 4


    public void question4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Some string to check if string in pangram: ");
        String str = sc.nextLine();
        boolean[] alphaList = new boolean[26];
        int index = 0;
        int flag = 1;
        for (int i = 0; i < str.length(); i++) {
           if ( str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
              index = str.charAt(i) - 'A';
           }else if( str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
              index = str.charAt(i) - 'a';
        }
        alphaList[index] = true;
     }
     for (int i = 0; i <= 25; i++) {
        if (alphaList[i] == false)
        flag = 0;
     }
     System.out.print("String: " + str);
     if (flag == 1)
        System.out.print("\nThe above string is a pangram.");
     else
        System.out.print("\nThe above string is not a pangram.");
     }

  
  // Question 5
  
  
     public void question5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some string:");
        String s=sc.nextLine();
        s = s.replaceAll("\\s+","");
        int count = 0 ;
    
        for (int i = 0; i < s.length(); i++) {
    
            for (int j = 0; j < s.length(); j++) {
    
                if(s.charAt(i)==s.charAt(j))
                {
                    count++;
    
                }
            }   
            System.out.println(s.charAt(i)+": "+count);
            String d=String.valueOf(s.charAt(i)).trim();
            s=s.replaceAll(d,"");
            count = 0;
    
        }
     }


// Question 6


     public void question6(){
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string : ");
      String str = sc.nextLine();
      char charArray[] = str.toCharArray();
      Arrays.sort(charArray);
      System.out.println(new String(charArray));
     }


// Question 7


     public void question7(){
        int vowels = 0, cons = 0;    
            
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some String: ");
        String str = sc.nextLine();    
            
       
        str = str.toLowerCase();    
            
        for(int i = 0; i < str.length(); i++) {    
              
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
                //Increments the vowel counter    
                vowels++;    
            }    
              
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
             
                cons++;    
            }    
        }    
        System.out.println("Number of vowels: " + vowels);    
        System.out.println("Number of consonants: " + cons);    
     }



// Question 8


     public void question8(){
		int i, alph, digi, spl;
		alph = digi = spl = 0;
		char ch;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Please Enter Alpha Numeric Special String =  ");
		String aldisp_str = sc.nextLine();
		
		for(i = 0; i < aldisp_str.length(); i++)
		{
			ch = aldisp_str.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
				alph++;
			}
			else if(ch >= '0' && ch <= '9') {
				digi++;
			}
			else {
				spl++;
			}
		}		
		System.out.println("\nNumber of Alphabet Characters  =  " + alph);
		System.out.println("Number of Digit Characters     =  " + digi);
		System.out.println("Number of Special Characters   =  " + spl);
     }
    public static void main(String[] args) {
        Assignment3 a3 = new Assignment3();
        a3.question1();
        a3.question2();
        a3.temp();
        a3.question3();
        a3.question4();
        a3.question5();
        a3.question6();
        a3.question7();
        a3.question8();
    }
    
}
