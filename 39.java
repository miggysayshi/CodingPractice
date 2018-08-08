class Solution{
    public List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>>  res = new LinkedList<>();
        for(int i=candidates.length; i>0; i--){
            List<Integer> temp = new LinkedList<>();
            back(candidates, target, i, res, temp);
        }
        return res;
    }
    public void back(int[] candidates, int target, int tail, List<List<Integer>> res, List<Integer> temp){
        int difference = target - candidates[tail];
        if (difference < 0) return;     //cutting branch
        if(difference == 0){
            temp.add(candidates[tail]);
            res.add(new ArrayList<Integer>(temp));
            temp.remove(temp.size()-1);
            return;
        }
        else if(difference > 0){
            temp.add(candidates[tail]);
            for(int j=tail-1; j>0; j--){
                back(candidates, difference, j, res, temp);
            }
        }
        temp.remove(temp.size()-1);
    }
}
