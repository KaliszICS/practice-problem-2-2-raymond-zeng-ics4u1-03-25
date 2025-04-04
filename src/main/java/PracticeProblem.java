import java.util.Arrays;
public class PracticeProblem {

	public static void main(String args[]) {
		
	}
	public static int[]compareSearch(int[] array, int number){
		int loops1 = 0;
		int loops2 = 0;
		Arrays.sort(array);

		for (int i = 0;i < array.length;i++){
			loops1++;
		if (array[i] == number){
			break;
		}
		}

		int low = 0;
		int high = array.length - 1;
		int mid = (low + high)/2;
		
		while (low <= high) { 
			if (array[mid] < number) {
				low = mid + 1;
				mid = (high + low) / 2;
				loops2 ++;
			}

			else if (array[mid] > number) {
				high = mid - 1;
				mid = (high + low) / 2;
				loops2 ++;
			}
			else {
				low = high + 1;
				loops2 ++;
			}
		}
	int [] numarr = {loops1, loops2};
	return numarr;
}
	public static int[]compareStringSearch(String[] array, String text){
		int loops1 = 0;
		int loops2 = 0;
		Arrays.sort(array);

		for (int i = 0;i < array.length;i++){
			array[i].toLowerCase();
		}
		for (int i = 0;i < array.length;i++){
			loops1++;
		if (array[i].equals(text)){
			break;
		}
	}

		int low = 0;
		int high = array.length - 1;
		int mid = (low + high)/2;
	
		while (low <= high) { 
		loops2++;
			int comparison = array[mid].compareTo(text);
			if (comparison < 0) {
				low = mid + 1;
				mid = (high + low) / 2;
			}
			else if (comparison > 0) {
				high = mid - 1;
				mid = (high + low) / 2;
			}
			else {
				low = high + 1;
			}
		}

	int [] stringArr = {loops1, loops2};
	return stringArr;
}
}