class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        if(num==0){count=0;}
        else{
		for(int i=1; ; i++){
			if(num%2==0) {
				num=num/2;
				count+=1;}
			else if(num%2==1) {
				num=num-1;
				count+=1;
			}if (num == 0) {
				break;
			}
			}}
            return count;
    }
}