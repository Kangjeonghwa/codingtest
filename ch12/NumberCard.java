package ch12;

import java.util.Arrays;
import java.util.Scanner;

public class NumberCard {
    public static int[] answer;
    public static int[] arr1;
    public static int[] arr2;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        arr1=new int[N];

        for(int i=0;i<N;i++){
            arr1[i]=sc.nextInt();
        }
        Arrays.sort(arr1);

        int M=sc.nextInt();
        arr2 = new int[M];

        for(int j=0;j<M;j++){
            arr2[j]=sc.nextInt();
        }

        answer=new int[M];

        for(int j=0;j<M;j++){
            if(find(arr2[j], 0, arr1.length)!=-1){
                answer[j]=1;
            }
        }
        for(int j=0;j<M;j++){
            System.out.print(answer[j]+" ");
        }
        

    }
    public static int find(int key, int low, int high){
        int mid;
        if(low <= high) {
			mid = (low + high) / 2;
			
			if(key == arr1[mid]) {  
				return mid;
			} else if(key < arr1[mid]) {
				return find(key ,low, mid-1); 
			} else {
				return find(key, mid+1, high); 
			}
		}
        return -1;
    }
}
