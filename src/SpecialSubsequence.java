import java.util.Scanner;
public class SpecialSubsequence {
    static int findSubsequence(String input)
    {
        int result=0,a_count=0;
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)=='a')
            {
                a_count++;
            }
            else if (input.charAt(i)=='g') {
                result+=a_count;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String A=scanner.next();
        int count=findSubsequence(A);
        System.out.println(count);
    }
}
