//Author Name: Nikhil Soni

import java.util.Scanner;

public class array_numbers {


    static void sort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter the how many elements: ");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];

        // code below is to take input from the user 
        System.out.print("Enter the numbers: ");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        
        // to display the current array
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        // to display the current array
        sort(arr, n);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }



    }
}
