import java.util.*; 

public class palindrome {
	public static void main(String [] args){
		System.out.println(findLargestPalindrome("GreggerG")); 
		
	}
	
	public static String findLargestPalindrome(String pal){
		int length = pal.length(); 
		int mid = length / 2; 
		int begin = 0; 
		for (int i = 0; i < mid; ++i){
			if(findPalindrome(pal.substring(begin, length))){
				return pal.substring(begin, length); 
			}
			
			length--; 
			begin++; 
		}
		
		return "NOPE"; 
	}
	
	
	public static boolean findPalindrome(String pal){
		int begin, end;
		end = pal.length() - 1;
		begin = 0 ; 
		while(end != begin){
			if(pal.charAt(begin) != pal.charAt(end)){
				break; 
			}
			if (end == begin + 1){
				return true; 
			}
			
			end--; 
			begin++; 
		}
		
		return false; 
	}
}
