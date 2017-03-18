package Medium;

public class Solution6 {
	public static String convert(String s, int numRows) {
		StringBuilder[] newStr = new StringBuilder[numRows];
		
		for (int i = 0; i < numRows; i++) {
			newStr[i] = new StringBuilder();
		}
		
		int i = 0;
		while (i < s.length()) {
			for (int j = 0; j < numRows; j++) {
				if (i >= s.length()) {
					break;
				}
				newStr[j].append(s.charAt(i));
				i++;
			}
			for (int k = numRows - 2; k > 0; k--) {
				if (i >= s.length()) {
					break;
				}
				newStr[k].append(s.charAt(i));
				i++;
			}
		}
		
		StringBuilder res = new StringBuilder();
		for (int k = 0; k < numRows; k++) {
			res.append(newStr[k]);
		}
		
		return res.toString();
	}
	
	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		System.out.println(convert(s, 2));
	}
}
