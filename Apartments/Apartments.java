import java.util.Scanner;

/* Author:     dmondal5302@gmail.com
Created on: 14-June-2020 */

public class Apartments {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        String[] first = scn.nextLine().split("\\s+");
        int n = Integer.parseInt(first[0]), 
            m = Integer.parseInt(first[1]), 
            k = Integer.parseInt(first[2]);

        String[] second = scn.nextLine().split("\\s+");
        int[] a = new int[n];
        int i=0;
        for(String x: second){
            a[i++] = Integer.parseInt(x);
        }

        String[] third = scn.nextLine().split("\\s+");
        int[] b = new int[m];
        i=0;
        for(String x: third){
            b[i++] = Integer.parseInt(x);
        }

        System.out.println("result-->" + numberOfApplicants(k,a,b));
    }

    private static int numberOfApplicants(int k, int[] a, int[] b) {

        int reg_applicant = 0;

        for(int i=0; i<a.length; i++){
            boolean flag = false;
            for(int j=0; j<b.length && b[j]>0; j++){
                System.out.println((a[i]+k) + ">=" + b[j] + "<=" + (a[i]-k));
                if(b[j]<=a[i]+k || b[j]>=a[i]-k){
                    flag = true;
                    System.out.println("ok");
                    b[j] = -1;
                    break;
                }
            }
            System.out.println("-----------");
            if(flag)
                reg_applicant++;
        }

        return reg_applicant;
    }
}