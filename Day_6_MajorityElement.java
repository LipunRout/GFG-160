class Solution {
    public List<Integer> findMajority(int[] nums) {
        int n = nums.length;
        int c1=0,c2=0;
        Integer stu1=null,stu2=null;
        for (int num : nums ){
            if (stu1!=null && num == stu1){
                c1++;
            }
            else if (stu2!=null && num == stu2){
                c2++;
            }
            else if (c1==0){
                stu1=num;
                c1=1;
            }
            else if (c2==0){
                stu2=num;
                c2=1;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int num : nums){
            if(num==stu1) c1++;
            else if(num==stu2) c2++;
        }
        List<Integer> res= new ArrayList<>();
        if(c1>n/3) res.add(stu1);
        if(c2>n/3) res.add(stu2);
        Collections.sort(res);
        return res;
    }
}
