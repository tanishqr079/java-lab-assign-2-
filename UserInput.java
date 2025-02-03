// UserInput.java 

import java.util.*;
class UserInput{
		int[] arrayInput(){
			Scanner Scan = new Scanner(System.in);
			int[] array = new int[5];
			System.out.println("enter 5 numbers:");

			for (int i=  0 ; i< array.length; i++){

					array[i] = Scan.nextInt();

			}
			return array;





            }

}