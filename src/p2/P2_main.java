package p2;

public class P2_main {
public static void main(String[] args) {
		
		System.out.println(pairwiseDifferent(new int[]{2,3,4,3}));
	}
	
	public static boolean pairwiseDifferent(int[] someNumbers) {
		for (int i= 0; i < someNumbers.length-1; i++) {
			for (int j = i+1; j < someNumbers.length; j++){
				if(someNumbers[i]==someNumbers[j]){
					return false;
				}
			}
			
		}
		return true;
	}
}
