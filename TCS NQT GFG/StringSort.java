import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        java.util.Arrays.sort(chars);
        System.out.println("Sorted string: " + new String(chars));
    }

    // String sort(String s) {
    //     // code here
    //     //     int[] count = new int[26];
    //     // for(char c : s.toCharArray()) {
    //     //     count[c - 'a']++;
    //     // }
    //     // StringBuilder result = new StringBuilder();
    //     // for(int i=0;i<26;i++){
    //     //     while(count[i]>0){
    //     //         result.append((char)(i+'a'));
    //     //         count[i]--;
    //     //     }
    //     // }
    //     // return result.toString();
    //     char[] arr = s.toCharArray();
    //     Arrays.sort(arr);
    //     String sorting = new String(arr);
    //     return sorting;
    // }
}
