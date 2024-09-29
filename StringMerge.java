import java.util.Scanner;  

public class StringMerge {  
    public static String mergeStrings(String s1, String s2) {  
        String merged = "";  
        int len1 = s1.length();  
        int len2 = s2.length();  
        
       
        for (int i = 0; i < len1 || i < len2; i++) {  
            if (i < len1) {  
                merged += s1.charAt(i);   
            }  
            if (i < len2) {  
                merged += s2.charAt(i); 
            }  
        }  

        return merged; }

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Enter the first string (s1): ");  
        String s1 = scanner.nextLine();  

        System.out.print("Enter the second string (s2): ");  
        String s2 = scanner.nextLine();  

        String mergedString = mergeStrings(s1, s2);  
        System.out.println("Merged String: " + mergedString);  

        
    }  
}
