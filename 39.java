class Solution{
    public List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>>  res = new LinkedList<>();
        for(int i=candidates.length(); i>0; i--){
            List<Integer> temp = new LinkedList<>();
            back(candidates, target, difference, i, res, temp)
        }
    }
    public void back(int[] candidates, int target, int difference, int tail, List<List<Integer>> res, List<Integer> temp){
        int difference = target - candidates[tail];
        if(difference == 0){
            temp.add(candidates[tail]);
            res.add(temp);
            return;
        }
        else if(difference > 0){
            temp.add(candidates[tail]);
            back(candidates, difference, tail, res, temp);
        }
        else if(difference < 0){
            if(tail>0) {
                tail--;
                back(candidates, difference, tail, res, temp);
            }
            return;
        }
    }
}
