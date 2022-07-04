import java.util.*;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp=0;
           int n=sc.nextInt();
            String []arr=new String[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.next();
            }
            int m=sc.nextInt();
            String []arr2=new String[m];
            for(int i=0;i<m;i++){
                arr2[i]=sc.next();
            }
            for(int i=0 ;i<m;i++){
                for(int j=0;j<n;j++){
                    if (arr2[i].equals(arr[j]))
                        temp++;
                }
                System.out.println(temp);
                temp=0;

            }
          
        }
  
    }
