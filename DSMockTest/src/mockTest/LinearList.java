package mockTest;

public class LinearList {
	private Node head;

	public LinearList() {
		head=null;
		
	}
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isFull() {
		Node temp = new Node();
		if(temp == null) 
		{
			return true;
		}
		else 
		{
			temp = null;
			return false;
		}
	}
	

	//add nodes at the back of the list
	public void insert(Car c) {
		if(isFull() )
		{
			System.out.println("This list is full");
		}
		else {
			Node nextItem = new Node();
			nextItem.setData(c);
			if(isEmpty() )
			{
				head = nextItem;
			}
			else
			{
				Node current = head;
				while(current.getNext() != null) {
					current = current.getNext();
			}
				current.setNext(nextItem);
			}
			
		}
	}
	
	
	public Car retrieve(String searchId) {
		if (isEmpty()) {						//check if list is empty
			return null; 						//if list is empty return nothing
			}
		else {
			Node temp = head; 					//create a Node called temp and assign it to the start of the list
			while(temp.getNext() != null) { 	//While the linked portion of the Node is not at the end of the list
				if (temp.getData().getLicenseNo().equals(searchId)) { 	//check if the License No is the same as one passed as parameter
					return temp.getData(); 		//Return the licenseNo
				}
				temp = temp.getNext(); 			//Move temp to the next linked portion of the list
			}
			return temp.getData(); 				//Return licenseNo
		}
	}	
		 
		
		public void show() {
			Node curr = head;
			while(curr != null)
			{
				curr.getData().display();
				curr=curr.getNext();
			}
		}
		  
		  
		//deletes all nodes
		public void destroy() {
			Car temp = null;
			do {
				temp=remove();
			}while(temp != null);
		}
		
		
		/*Another Way to delete all nodes
		 * public void destroy() { Node temp = new Node();
		 * 
		 * while(head!= null) {
		 * 
		 * temp=head; head=head.getNext(); temp=null; } }
		 */
		  
		  
		  
		  //deletes node at the front of the list 
		  			
				public Car remove() {
					if(isEmpty())
					{
						System.out.println("List is Empty");
						return null;
					}
					else 
					{
						Node temp = head;
						head=head.getNext();
						Car tempData = temp.getData(); //store temp into a variable "tempData "
						temp = null; //deleting data
						return tempData;
					}
				}
		 
}
