public class P1_ReverseString {
        public static void main(String[] args) {
            String str = "Mounika";
            String rev = "";
            for(int i=str.length()-1; i>=0; i--) {
                rev = rev + str.charAt(i);
            }
            System.out.println(rev);
        }
    }
