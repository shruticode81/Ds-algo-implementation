package dsa.implementation.practice.hashing;

public class HashTable {
    private HashNode[] buckets;
    private int numOfBuckets;
    private int size;

    public HashTable(){
        this(10);
    }

    public HashTable(int capacity) {
        this.numOfBuckets=capacity;
        this.buckets = new HashNode[capacity];
        this.size=0;
    }

    private class HashNode {
        private Integer key;
        private String value;
        private HashNode next;

        private HashNode(Integer key, String value) {
            this.key=key;
            this.value=value;
        }
    }

    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size==0 ;
    }

    public void put(Integer key, String value) {
        if(key==null || value==null) {
            throw new IllegalArgumentException("key or value is null!!");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while(head!=null){
            if(head.key.equals(key)) {
                head.value=value;
                return;
            }
            head=head.next;
        }
        size++;
        head=buckets[bucketIndex];
        HashNode node = new HashNode(key, value);
        node.next=head;
        buckets[bucketIndex]=node;
    }

    public String get(Integer key ) {
        if( key == null) {
            throw new IllegalArgumentException("Key is null");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        if(head==null){return null;}
        while(head!=null) {
            if(head.key.equals(key)) {
                return head.value;
            }
            head=head.next;
        }
        return null;
    }

    public String remove(Integer key) {
        if( key == null) {
            throw new IllegalArgumentException("Key is null");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        if(head==null){
            return null;
        }
        HashNode prev=null;
        while(head!=null) {
            if(head.key.equals(key)){
                break;
            }
            prev=head;
            head=head.next;
        }

        size--;
        if(prev!=null) {
            prev.next=head.next;
        }else {
            buckets[bucketIndex]=head.next;
        }
        return head.value;
    }

    private int getBucketIndex(Integer key) {
        return key % numOfBuckets;
    }

    public static void main(String[] args){
        HashTable table = new HashTable(10);
        table.put(21, "Ram");
        table.put(31, "shruti");
        System.out.println(table.get(21));

        System.out.println(table.size());
    }
}
