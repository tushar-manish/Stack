public class Stack_implement {
    Node top;

    Stack_implement(){
        top = null;
    }

    public boolean isempty(){
        return top==null;
    }

    public void push(int data){
        Node ns = new Node(data);
        ns.next = top;
        top = ns;
    }

    public void pop(){
        if(!isempty()){
            top = top.next;
        }
    }

    public int peek(){
        return top.data;
    }
}
