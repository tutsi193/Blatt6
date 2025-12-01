package h1;

public class H1_main {
	public static void main(String[] args) {
		System.out.println(isMirrorArray(new int[] {7,3,6} , new int[] {9,8,7}));
	}
	
	public static boolean isMirrorArray(int[] a, int[] b) {
		if (a.length != b.length) {
			return false;
		}
		for(int i = 0; i < a.length; i++) {
			if (a[i] != b[b.length - 1 -i]) {
				return false;
			}
		}
		return true;
	}
}
