    public static class HashMapList<K, E> {
        private HashMap<K, ArrayList<E>> hashMapList = new HashMap<>();
        
        public void put(K key, E value) {
            if(!hashMapList.containsKey(key)){
                hashMapList.put(key, new ArrayList<>());
            }
            hashMapList.get(key).add(value);
        }
        
        public void put(K key, ArrayList<E> list){
            hashMapList.put(key, list);
        }
        
        public ArrayList<E> get(K key) {
            return hashMapList.get(key);
        }
        
        
        public boolean containsKey(K key) {
            return hashMapList.containsKey(key);
        }
        
        public boolean containsValue(K key, E value) {
            if(containsKey(key)) {
                return hashMapList.get(key).contains(value);
            }
            else{
                return false;
            }
        }

        public Set<K> keySet() {
            return hashMapList.keySet();
        } 

        
        public void sorted() {
            hashMapList = hashMapList.entrySet().stream()
               .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
               .collect(Collectors.toMap(
                Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        }
        
        public void print(){
            System.out.println(hashMapList);
        }
    }
