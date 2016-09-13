import java.io.*;
public  class subbset {


	public static void main(String[] args) {
		
	}
	

		boolean isSubbset(int[] a1, int[] a2) {
		    a2 = Arrays.copyOf(a2, a2.length);
		    Arrays.sort(a2);
		    for(int e : a1) {
		        if (Arrays.binarySearch(a2, e) < 0) {
		            return false;
		        }
		    }
		
		    return true;
		}
		}
