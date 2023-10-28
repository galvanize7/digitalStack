public class Session_01_Main {
    public static void main(String[] args) {
        char [] c = {'e', 'l', 'e', 'r', 'i', 'n'};
        var ans = reverseString(c);
        System.out.println(ans);
    }

    public static void showFizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if(i%3 == 0 && i%5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if(i%3 == 0) {
                System.out.println("Fizz");
            }
            else if(i%5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }

    public static String reverseString(char [] c) {
        int i = 0;
        int j = c.length - 1;
        while (i < j) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }
        return new String(c);
    }
}