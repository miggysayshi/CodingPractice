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
        if(difference == 0){
            temp.add(candidates[tail]);
            res.add(temp);
            temp.remove(temp.size()-1);
            return;
        }
        else if(difference > 0){
            temp.add(candidates[tail]);
            back(candidates, difference, tail, res, temp);
        }
        for(int j=tail; j>0; j--){
            back(cadidates, difference, j, res, temp);
        }
        else if(difference < 0){
            return;
        }
    }
}
