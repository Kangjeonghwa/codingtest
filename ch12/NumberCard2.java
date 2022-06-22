package ch12;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class NumberCard2 {
    public static int[] answer;
    public static int[] arr1;
    public static TreeMap<Integer, Integer> map;
    public static int[] arr2;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        arr1=new int[N];

        for(int i=0;i<N;i++){
            int a=sc.nextInt();
            arr1[i]=a;
            map.put(i, a);
        }
        Arrays.sort(arr1);

        int M=sc.nextInt();
        arr2=new int[M];

        for(int j=0;j<M;j++){
            arr2[j]=sc.nextInt();
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
