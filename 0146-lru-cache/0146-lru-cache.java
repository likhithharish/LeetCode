class Node{
    int key;
    int value;
    Node next;
    Node prev;
    
    Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}

class LRUCache {
    private HashMap<Integer, Node> map= new HashMap<>();
    private int capacity,count;
    private Node head,tail;// they refer null only head.next (start of list) , tail.prev(end of list)

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
        head.prev = null;
        tail.next = null;
        count = 0;
    }
    
    public int get(int key) {
        if(map.get(key)!=null){
            Node node = map.get(key);
            int result = node.value;
            // most recent access - delete from its location and add to the front
            deleteNode(node);
            addToHead(node);
            return result;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.get(key) ==null){
            // Node not present - check curr capacity and add if space present or delete tail and this node to head.
            Node node = new Node(key,value);
            map.put(key, node);
            if(count<capacity){
                // capacity there - adding to head
                count++;
                addToHead(node);
            }else{
                //remove the tail node (from map and list) and new node to head
                map.remove(tail.prev.key);
                deleteNode(tail.prev);
                addToHead(node);
            }
        }else{
            //already present - add it to head by updating the value.
            Node node = map.get(key);
            node.value = value;
            deleteNode(node);
            addToHead(node);
        }
    }
    
    public void deleteNode(Node node){
        Node next = node.next;
        Node prev = node.prev;
        prev.next = next;
        next.prev = prev;
    }
    
    public void addToHead(Node node){
        node.next = head.next;
        node.next.prev = node;
        node.prev = head;
        head.next = node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */