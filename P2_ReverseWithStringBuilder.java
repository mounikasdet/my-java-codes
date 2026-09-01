public class P2_ReverseWithStringBuilder {
    public static void main(String[] args) {
        String str = "Mounika";
        
        // Method 2: Using StringBuilder
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();
        
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + rev);
        
        // Also check Palindrome
        if(str.equalsIgnoreCase(rev)) {
            System.out.println("It is Palindrome");
        } else {
            System.out.println("It is NOT Palindrome");
        }
    }
}
