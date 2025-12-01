package h3;

public class H3_main {
	public static void main(String[] args) {
		System.out.println(compareArraysVal(new int[] {1,2,3,4,7},new int[] {2,3,1,4,5}));
	}
	public static boolean compareArraysVal(int[] a, int[] b) {
		if (a.length != b.length) {
			return false;
		}
		
		boolean[] vorhanden = new boolean[b.length];
		
		for (int i = 0; i < a.length; i++) {
			boolean gefunden = true;
			
			for(int j = 0; j < b.length; j++) {
				if(!vorhanden[j] && a[i] == b[j]) {
					vorhanden[j] = true;
					gefunden = true;
					break;
				}
			}
		}
		return true;
	}
}
