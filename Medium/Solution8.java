package Medium;

public class Solution8 {
	public static int myAtoi(String str) {
		StringBuilder newstr = new StringBuilder();
		for (int i = 0; i< str.length(); i++) {
			char item = str.charAt(i);
			if (item == ' ' && newstr.length() == 0) {
				continue;
			} else if ((item == '-' || item == '+') && newstr.length() == 0){
				newstr.append(item);
			} else if (item <= '9' && item >= '0') {
				newstr.append(item);
			} else {
				return getInteger(newstr.toString());
			}
		}
		return getInteger(newstr.toString());
	}
	
	public static int getInteger(String str) {
		int ans = 0;
		if (str == null || str.length() == 0) {
			return 0;
		} else {
			if (str.length() == 1 && (str.charAt(0) == '-' || str.charAt(0) == '+')) {
				return 0;
			}
			int tag = 1;
			if (str.charAt(0) == '-') {
				tag = 0;
			}
			try {
				ans = Integer.valueOf(str);
			} catch(Exception e) {
				if (tag == 0) {
					ans = Integer.MIN_VALUE;
				} else {
					ans = Integer.MAX_VALUE;
				}
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		String s = "";
		System.out.println(s.length());
		System.out.println(myAtoi(""));
	}
}
