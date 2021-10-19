package singly.linked.list;

public class SinglyLinkedList {
	public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    
    public void remove() {
    	Node runner = this.head;
    	Node prev = runner;
    	while(runner.next != null) {
    		prev= runner;
            runner = runner.next;
        }
    	
    	prev.next= null;
    	runner= null;
    	
    }
    
    public void printValues() {
    	Node runner = this.head;
    	int i=0;
    	while(runner != null) {
    		System.out.format("\nNode %d, %s", i,runner.printValue());
            runner = runner.next;
    		i+=1;
        }
    	
    }
    
    public Node find(int val) {
    	
    	Node runner = this.head;
    	while(runner != null) {
    		if (runner.value == val) {
    			return runner;
    		}
            runner = runner.next;
        }
    	
    	System.out.println("The value was not found. The last Node was returned");
    	return runner;
    	
    }
    
    
    public void removeAt(int index) {
    	Node runner = this.head;
    	Node prev = runner;
    	int i=0;
    	
    	if(index==0) {
    		this.head=this.head.next;
    		runner= null;
    		
    		
    	}
    	
    	else {
    	while(runner != null) {
    		if(i==index) {
    			prev.next= runner.next;
    			runner= null;
    			break;
    		}
    		prev= runner;
            runner = runner.next;
            i+=1;
        }
    	
    }
    	
    	
    }
    	
    
    
}
