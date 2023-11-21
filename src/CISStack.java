import java.util.Arrays;

public class CISStack {

    private int[] stack;
    private int size,pointer;

    public CISStack(int sz) {
        this.stack = new int[sz];
        this.size = 0;
        this.pointer=-1;
    }
    public void push(int val){
        pointer++;
        stack[pointer]=val;
        size++;
    }
    public int pop(){
        int val=stack[pointer];
        pointer--;
        size--;
        return val;
    }
    public boolean isEmpty(){
        return size==0;
    }

    public int size() {
        return size;
    }

    public String toString(){
        String s="";
        s+="CISStack{stack=[";
        for(int i=0;i<stack.length;i++){
            if(stack[i]==0){
                s+="null";
            }
            else s+=Integer.toString(stack[i]);
            if(i!=stack.length-1)s+=", ";
        }
        s+="], size=";
        s+=Integer.toString(size);
        s+=", pointer=";
        s+=Integer.toString(pointer);
        s+="}";
        return s;
    }

    // Array property.

    // Size property.

    // Pointer property

    // Constructor.

    // Push. This method pushes a value onto the top of the stack.

    // Pop. This method pops a value from the top of the stack.

    // isEmpty. Returns a boolean indicating whether the linked list is empty.

    // size. Returns the size of the queue.

    // toString. Returns a description of the queue in, for example, the following format:
    // CISStack{stack=[7, 11], size=2, pointer=1}

}
