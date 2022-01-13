package recursion;

public class PermutationOfString {
    public static void permute(String str, int i) {
        if(i == str.length()-1) {
                System.out.println(str);
            return;
        }

        for(int j=i; j< str.length(); j++) {
            str = swap(str, i, j);
            permute(str, i+1);
            str = swap(str, i, j);

        }
    }

    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        permute("abc" , 0);
    }
}
