/* Author:     dmondal5302@gmail.com
Created on: 14-June-2020 */
import java.util.Scanner;

public class DistinctNumbers {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Problem URL : https://cses.fi/problemset/task/1621");
        System.out.println("---------------------------------------------------");

        int number = scn.nextInt();
        scn.nextLine();
        String[] data = scn.nextLine().split("\\s+");

        int[] a = new int[number];
        for (int i = 0; i < number; i++) {
            a[i] = Integer.parseInt(data[i]);
        }

        System.out.println("distinct number: " + getDistinctNumber(a));
    }

    private static byte getDistinctNumber(int[] a) {
        byte distinctNo = 0;

        try{
            for(int i=0; i<a.length; i++){
                boolean flag = true;
                for(int j=i+1; j<a.length; j++){
                    if(a[i] == a[j]){
                        flag = false;
                        break;
                    }
                }
                if(flag)
                    distinctNo++;
            }
        }catch(Exception e){
            System.err.println("Something went wrong!!! Please check input pattern.");
        }

        return distinctNo;
    }
}