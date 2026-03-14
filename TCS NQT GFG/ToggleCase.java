import java.util.Scanner;
public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder toggled = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggled.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                toggled.append(Character.toUpperCase(c));
            } else {
                toggled.append(c); 
            }
        }
        System.out.println(toggled.toString());
    }
    //public String toggleCase(String s) {
    //     // code here
    //     StringBuilder st = new StringBuilder();
    //     for(char ch:s.toCharArray()){
    //         if(Character.isLowerCase(ch)) ch = (char)(ch-32);
    //         else if(Character.isUpperCase(ch)) ch=(char)(ch+32);
    //         st.append(ch);
    //     }
    //     return st.toString();
    // }
}
