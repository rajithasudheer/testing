package corejava;

public class findlargestsmallest_number {

	public static void main(String[] args) {
		int numbers[]=new int[] {23,76,897,54,4};
 
		int smallest = numbers[0];//4
		int largest = numbers[0];//897
		System.out.println("Array lenth is:"+numbers.length);
		for (int i = 1; i < numbers.length; i++) {
			if(numbers[i]>largest)//
			{
				largest=numbers[i];
			}
			else if(numbers[i]<smallest)//
			{
		smallest=numbers[i];
			}
		}//for loop end
		
		System.out.println("largest value is;"+largest);
		System.out.println("smallest value is;"+smallest);
		}
		
		
	}


