class Solution {
    public int singleNumber(int[] nums) {
        // 오름차순으로 정렬
        Arrays.sort(nums);
        
        // index는 2개씩 뛰어넘으며 비교
        for(int i = 0 ; i < nums.length-1; i+=2){
            // 현재 index와 바로 다음 index가 같지않다면 해당 index는
            // 유일한 값이므로 정답으로써 출력함
            if(nums[i]!=nums[i+1]) return nums[i];
        }
          // for문 완료 후 아무것도 출력되지 않았다면
          // 살펴보지 않은 마지막 index가 유일한 값이 되므로 정답으로서 출력
          return nums[nums.length-1];
    }
}