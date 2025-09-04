class Node{
    int val;
    int key;
    Node prev;
    Node next;
    public Node(int key, int val){
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}
class LRUCache {
    HashMap<Integer, Node> map;
    int cap;
    Node oldest;
    Node latest;
    public LRUCache(int capacity) {
        this.cap = capacity;
        map = new HashMap<>();
        this.oldest = new Node(0,0);
        this.latest = new Node(0,0);
        this.oldest.next = this.latest;
        this.latest.prev = this.oldest;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        Node node = new Node(key,value);
        map.put(key,node);
        insert(node);
        if(map.size()>cap){
            Node lru = oldest.next;
            remove(lru);
            map.remove(lru.key);
        }
    }
    public void insert(Node node){
        Node prev = latest.prev;
        Node next = latest;
        prev.next = next.prev = node;
        node.next = next;
        node.prev = prev;
    }
    public void remove(Node node){
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */