package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public static void printByteBinary(byte b) {
		String binarynumber = " ";
		while(b >= 1) {
			byte q = (byte) (b / 2);
			byte r = (byte) (b % 2);
			binarynumber += r;
			b = q;
		}
		System.out.println(binarynumber);
	}
	
	public void printShortBinary(short s) {
		
	}
	
	public static void printIntBinary(int i) {
	String binarynumber = " ";
	while(i >= 1) {
		int q = i / 2;
		int r = i % 2;
		binarynumber += r;
		i = q;
	}
	System.out.println(binarynumber);
	}
	
	public static void printLongBinary(long l) {
		String binarynumber = " ";
		while(l >= 1) {
			int q = (int) (l / 2);
			int r = (int) (l % 2);
			binarynumber += r;
			l = q;
		}
		System.out.println(binarynumber);
		}
	
	public static void main(String[] args) {
		printIntBinary(23);
		printByteBinary((byte) 8);
		printLongBinary(2300);
		System.out.println("kjslfd");
	}
}
