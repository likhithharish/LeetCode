class RandomizedSet {
    public HashMap<Integer, Integer> map;
    public ArrayList<Integer> list;
    Random rand = new Random();

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val))        {
            return false;
        }
        map.put(val, list.size());
        list.add(list.size(), val);

        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        // Swap deleting elem with last elem in list.
        int lastElem = list.get(list.size()-1);
        int index = map.get(val);
        list.set(index, lastElem);
        map.put(lastElem, index);

        list.remove(list.size() -1);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */