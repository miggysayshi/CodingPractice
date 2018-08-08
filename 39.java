class Solution{
    public List<List<Integer>> combinationSum(int[] candidates, int target){
        for(int i=candidates.length(); i>0; i--){

        }
    }
    public void rec(int[] candidates, int target, int sum, int tail, List<List<Integer>> res, List<Integer> temp){
        int difference = target - candidates[tail];
        if(difference == 0){
            temp.add(candidates[tail]);
            res.add(temp);
            return;
        }
        else if(difference > 0){
            temp.add(candidates[tail]);
            rec(candidates, difference, tail, res, temp);
        }
        else if(difference < 0){
            if(tail>0) {
                tail--;
                rec(candidates, difference, tail, res, temp);
            }
            return;
        }

        for(int pointer=tail; pointer<candidates.length; pointer++){

        }
    }
}
