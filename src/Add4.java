import java.math.BigInteger;
import java.util.Scanner;

public class Add4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String e = s.nextLine().replaceAll("\\s+", "");
        BigInteger res = new BigInteger("0");
        BigInteger tmp = new BigInteger("0");
        char[] expr = e.toCharArray();
        StringBuilder temp = new StringBuilder(6);
        int len = expr.length;
        int j;
        for (int i = -1; i < len; i++) {
            j = i + 1;
            if (expr[j] == '-' || expr[j] == '+') {
                if (expr[j] == '-') {
                    temp.append('-');
                }
                j++;
            }
            while (j < len && expr[j] >= '0' && expr[j] <= '9') {
                temp.append(expr[j++]);
            }
            tmp = new BigInteger(temp.toString());
            temp = new StringBuilder(6);

            if (i == -1 || expr[i] == '+') {
                res = res.add(tmp);
            } else if (expr[i] == '-') {
                res = res.subtract(tmp);
            }
            i = j - 1;
        }
        System.out.println(res);
    }

    static void print(char[] temp) {
        int len = temp.length;
        System.out.println("len: " + len);
        for (int i = 0; i < len; i++) {
            System.out.print(temp[i]);
        }
    }
}
