import javax.xml.soap.Node;

class Data{
	
	Node head;
	Node tail;
	int totalNodes=0;
	
	public void Data(){
		Data a = new Data();
		head=tail;
		
	}
	
	public void add(int a){
	
		if(totalnodes==0,){
			a= head.data;
			totalNodes++;
		}
	 tail=tail.prev;
	 a=tail.data
	 totalNodes++;
			
	}
	
	public remove(){
		if(totalNodes==0){
			System.outprintln("No Data Found")
			new thrown exception
		}
		head.next=null;
		temp=head.data;
		head.data=null;
		head.prev=head.prev;
		head=head.prev;
		
		return temp;

}
	
	
	public getvalue (int Index){
		for (int i=0, i<index, i++){
			
			tail=tail.next;
			}
		return tail.data;
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}