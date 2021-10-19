package singly.linked.list;

public class Node {
    public int value;
    public Node next;
    
    
    public Node(int value) {
        this.value = value;
        this.next= null;
    }
    
    public String printValue() {
    	return String.format("Value: %d",this.value);
    }
    
}
