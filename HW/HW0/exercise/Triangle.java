/*
 * @Author: Yu Zitong
 * @Date: 2018-08-29 16:07:16
 * @Last Modified by:   Yu Zitong
*/

import java.util.Scanner;

public class Triangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of stars in the finial line:");
        int line = sc.nextInt();

        int i = 1;
        int j = 0;
        while(i <= line){
            j = 0;
            while(j < i){
                System.out.print("*");
                j = j + 1;
            }
            System.out.println("");
            i = i + 1;
        }
    }
}