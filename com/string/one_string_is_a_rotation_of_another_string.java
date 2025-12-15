package com.string;

public class one_string_is_a_rotation_of_another_string {
	 public static void main(String[] args) {
			StringBuffer s1=new StringBuffer("ashu");
		
			String s2="huas";
			
			if(s1.length()!=s2.length()) {
				System.out.println("String not Same");
				return;
			}
			for(int i=0;i<s1.length();i++) {
				char ch=s1.charAt(0);
				for(int j=0;j<s1.length()-1;j++) {
					s1.setCharAt(j, s1.charAt(j+1));
				}
				s1.setCharAt(s1.length()-1, ch);
				String s3=s1.toString();
				if(s3.equals(s2)) {
					System.out.println("String are match "+s2+" "+s3);
					return;
				}
			}
		
			
		}

}
