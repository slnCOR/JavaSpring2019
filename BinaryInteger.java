package BinaryInteger;

public class BinaryInteger {
	
	public char [] input = null;
	int binaryOutput;
	boolean inputError = false;
	
	public  BinaryInteger(String s) {
		
		for(int i=0;i<=s.length();i++) {
				while(inputError = false){
				char cont = s.charAt(i);
					switch (cont) {
						case 0: inputError = false;
						break;
						case 1: inputError= false;
						break;
						default: inputError = true;
					}
				}
			}binaryOutput = Integer.parseInt(s);
			String binaryUseful = String.format("%0"+ s.length() + "d", Integer.parseInt(s));
			System.out.println(binaryUseful);
			input = s.toCharArray();
		}
	
	
	public String toString() {
		String output = Integer.toString(binaryOutput);
		return output;
	}
	
	public int length() {
		int count=0;
		int num = binaryOutput;
		
		while(num != 0) {
			num/=10;
			++count;
		}return count;
	}
}
	


	
