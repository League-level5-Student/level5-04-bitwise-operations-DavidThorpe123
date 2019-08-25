package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public void printByteBinary(byte b) {
		
	}
	
	public void printShortBinary(short s) {
		
	}
	
	public static void printIntBinary(int i) {
	String binarynumber = " ";
	while(i >=1) {
		int q = i / 2;
		int r = i % 2;
		binarynumber += r;
		i = q;
	}
	System.out.println(binarynumber);
	}
	
	public void printLongBinary(long l) {
		
	}
	public static void main(String[] args) {
		printIntBinary(23);
	}
}
