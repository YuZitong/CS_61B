/*
 * @Author: Yu Zitong
 * @Date: 2018-08-26 15:06:22
 * @Last Modified by:   Yu Zitong
*/

public class HelloNumbers {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 10) {
            y = y + x;
            System.out.print(y + " ");
            x = x + 1;
        }
        System.out.print('\n');
    }
}