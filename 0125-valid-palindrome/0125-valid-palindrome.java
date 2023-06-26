class Solution {
    public boolean isPalindrome(String s) {
        // 문자열을 소문자로 통일 후,
		// 정규식을 이용하여 0-9a-zA-Z 이외의 모든 것을 공백으로 치환
		String new_S = s.toLowerCase().replaceAll("[^0-9a-zA-Z]", "");
		
        // 문자열의 한 중간을 기준으로 하여 비교
		for(int i=0; i<new_S.length()/2; i++){
            // i번째 문자와 그 대칭점이 되는 문자가 같지않으면 palindrome이 아님
			if(new_S.charAt(i) != new_S.charAt(new_S.length()-i-1)){
		        return false;
		      }
		}
		return true;
    }
}