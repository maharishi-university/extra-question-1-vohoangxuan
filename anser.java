class Test {
    public static void main(String[] args){
        addUpToTarget(new int[]{2,7,11,15}, 9);

    }

    static int[] addUpToTarget(int[] intArray, int target) {

        for(int i = 0; i < intArray.length; i++) {
            for(int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] + intArray[j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }

    static int[] addUpToTarget2(int[] intArray, int target) {

        
        for(int i = 0; i < intArray.length; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            int sub = target - intArray[i];
            if(map.get(sub) != null)
                    return new int[]{i, map.get(sub)};
            else
                map.put(target - intArray[i]);
            
        }
        return new int[]{-1, -1};
    }
}