package array;
import java.util.*;


public class ArraysEx2 {

	public static void main(String[] args) {
		//int arr[]= {11,30,15,7,90};
				//int arr[]= {20,11,98,34,22,76,42,10};
				Integer arr[]={20,11,98,34,22,76,42,10};
				Arrays.sort(arr,Collections.reverseOrder());
				for(int a:arr)
				{
					System.out.print(a+" ");
				}
				System.out.println(Arrays.toString(arr));
			/*	Arrays.sort(arr,3,8);
				for(int a:arr)
				{
					System.out.print(a+" ");
				}
				System.out.println(Arrays.toString(arr));*/
			}

		}
