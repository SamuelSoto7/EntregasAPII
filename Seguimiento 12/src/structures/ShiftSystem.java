package structures;

public class ShiftSystem {
	private Node head;
	private Node tail;
	
	public static int counter;
	
	public ShiftSystem(){
		head=null;
		tail=null;
		
	}
	
	public boolean addShift() {
		
		boolean flag = false;
		nodeCounter();
		
		
		if(head == null) {
			Node firstNode = new Node(1);
			head = firstNode;
			tail = firstNode;
			head.setPrevious(tail);
			tail.setNext(head);
			
			return flag;
			
		} else {
			if(tail==null) {
				Node node = new Node((head.getValue()+1));
				head = node;
				tail = node;
				head.setPrevious(tail);
				tail.setNext(head);
				
				return flag;
				
			} else {
				if(counter<50) {
					Node node = null;
					
					if(head.getValue()<head.getNext().getValue()) {
						node = new Node((head.getNext().getValue()+1));
					} else {
						node = new Node((head.getValue()+1));
						
					}
					
					node.setNext(head);
					head.setPrevious(node);
					head = node;
					
					
					tail.setNext(head);
					head.setPrevious(tail);
					
					return flag;
					
				} else {
					flag = true;
					return flag;
				}
				
				
			}
		}
	}
	
	
	public void nodeCounter() {
		counter = 0;
		nodeCounter(head);
	}
	
	public void nodeCounter(Node current) {
		
		if(current==null) {
			return;
		}

		counter++;	
		
		if(current.getNext()!=head) {
			nodeCounter(current.getNext());
		}
	}

	
	
	public int printShift() {
		if(tail==null) {
			return -1;
		} else {
			return tail.getValue();
		}
		
	}
	

	
	
	public boolean passShift() {
		
		boolean flag = false;
		
		if(tail==null || tail.getNext()==tail) {
			return flag;
		} else {
			if(tail.getSkipValue()==0) {
				deleteActualShift();
				
				return flag;
				
			} else {
				Node aux = new Node(tail.getValue());
				aux.setNext(head);
				head.setPrevious(aux);
				head = aux;
				
				tail = tail.getPrevious();
				tail.setNext(head);
				head.setPrevious(tail);
				head.setSkipValue(((head.getSkipValue()-1)));
				
				flag = true;
				
				return flag;
			}
			
		}
	}
	
	public boolean deleteActualShift() {
		
		boolean flag = false;
	
		if(tail==null) {
			flag = true;
			return flag;
			
		} else {
			if(tail.getPrevious()== tail){
				tail = null;
				
				return flag;
				
			} else {
				tail = tail.getPrevious();
				head.setPrevious(tail);
				
				return flag;
			}
			
		}
	
	}
	
	
	
}