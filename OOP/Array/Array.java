import java.lang.management.MonitorInfo;
import java.util.*;
public class Array {
    public static void main(String[] args){

       /*  int yearsMarried[] ={4,3,10,12,6};

        for(int i = 0;i < yearsMarried.length;i++){
            int num1 = i +1;
            System.out.println("Family "+ num1 +" = " + yearsMarried[i]+" years");
        }*/
        
        /*int naturalNumbers[] =new int[101];
        int squareNumbers[] = new int[101];

        for (int i = 0;i <= 100;i++){
            naturalNumbers[i] = i; 
            squareNumbers[i] = (naturalNumbers[i] * naturalNumbers[i]);
            System.out.println("Square of " +  naturalNumbers[i]+" is "+ squareNumbers[i]);
        }*/

        /*int monthRevenue[][] = new int[12][2];

        for (int i=0;i<12;i++){
            monthRevenue[i][0] = i+1;
        }*/

        /*double data[] = {332.1,55.4,76.4,88.5,45.3,88.8,76.7};
		
		for(int i = 0; i<= data.length - 1 ;i++){
			System.out.println("Num " + (i + 1) + " = " + (data[i]));
		}*/
		
		/*int numArray[] = {12,45,54,2,7,33,65,4};
		
		int smallestNum = numArray[0];
		
		for (int i = 1; i <= numArray.length - 1;i++){
			if (smallestNum > numArray[i]){
				smallestNum = numArray[i];
			}
		}
		
		System.out.println("Smallest number: " + smallestNum);
		
		int highstNum = numArray[0];
		
		
		for (int i = 1; i<= numArray.length - 1;i++){
			if(highstNum < numArray[i]){
				highstNum = numArray[i];
			}
		}
		
		System.out.println("Highst number: " + highstNum);*/
		
		int number[] = {12,45,54,2,7,33,65,4};
		
		int ln = number[0];	
		int sn = number[0];
			
		
		for (int element: number) {
			if(element > ln) ln = element;
			if(element < sn) sn = element;
		}

			
		System.out.println("Lagest: " + ln);
		System.out.println("Smallest: " + sn);
    }
	

		
}
