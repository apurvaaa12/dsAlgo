public class ArrayStack {
    private int size;
    int[] array;
    private int top;

    public ArrayStack(int capacity){
        this.size = capacity;
        array = new int[capacity];
        top = -1;
    }

    void push(int x){
        array[++top] = x;
    }

    int pop(){
        if(top == -1) return -1;
        int var = array[top];
        array[top--] = 0;
        return var;
    }

    int pop2(){
        return array[top--];
    }


    int top(){
        return array[top];
    }

    public static void main(String[ ] args){
        ArrayStack stack = new ArrayStack(10);
        System.out.println(stack.pop());
        stack.push(2);
        stack.push(5);

        System.out.println(stack.top());

    }
}
