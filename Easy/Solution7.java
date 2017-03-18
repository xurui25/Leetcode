package Easy;

public class Solution7 {
	public static int reverse(int x) {
        String str =  Integer.toString(x);
        StringBuilder newstr = new StringBuilder();
        int bouder = 0;
        if (x < 0) {
        	bouder = 1;
        	newstr.append("-");
        }
        for (int i = str.length() - 1; i >= bouder; i--) {
        	newstr.append(str.charAt(i));
        }
        int ans = 0;
        try {
        	ans = Integer.valueOf(newstr.toString());
        } catch(Exception e) {
        	ans = 0; 
        }
        return ans;
    }
	
	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
	}
}
