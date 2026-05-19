class LRUCache {
  private int capacity = 0;
  private ArrayList<int[]> cache; // [key, value]

  public LRUCache(int capacity) {
    this.capacity = capacity;
    this.cache = new ArrayList<>();
  }

  public int get(int key) {
    for (int i = 0; i < cache.size(); i++) {
      if (cache.get(i)[0] == key) {
        int[] pair = cache.remove(i);
        cache.add(pair);
        return pair[1];
      }
    }

    return -1;
  }

  public void put(int key, int value) {
    for (int i = 0; i < cache.size(); i++) {
      if (cache.get(i)[0] == key) {
        int[] pair = cache.remove(i);
        pair[1] = value;
        cache.add(pair);

        return;
      }
    }

    if (cache.size() == capacity) {
      cache.removeFirst();
    }

    cache.add(new int[] {key, value});
  }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */