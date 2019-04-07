package test;

public class StackOfInteger {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 99999;
    
    public StackOfInteger() {
        this(DEFAULT_CAPACITY);
    }
    public StackOfInteger(int capacity) {
        elements = new int[capacity];
    }
    
    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }
    
    public int pop() {
        return elements[--size];
    }
    
    public int peek() {
        return elements[size - 1];
    }
    
    public boolean empty() {
        return size == 0;
    }
    
    public int getSize() {
        return size;
    }
    
    public void PrimeN(int n){
        int [] P = {2,3,5,7,11,13,17,19,23};
        int N = n;
        for(int i = 0; i <P.length;){
            if(N%P[i]==0){
                N/=P[i];
            elements[size++] = P[i];
            }
            else{
            i++;
            }
        }
    }
    
    public void PrimeAnderN(int t){
        int [] P = {2,3,5,7,11,13,17,19,23};
        int [] E = new int [t] ;
        for(int i = 0 ; i <E.length;i++){
            E[i]=i+1;
        }
        for(int i = 0 ; i <E.length;i++){
            for(int p = 0 ; p <P.length;p++){
            if(E[i]%P[p]==0&&E[i]!=P[p]){
                E[i]=0;
            }
            }
        }
        for(int i = 1 ; i <E.length;i++){
            
            if(E[i]!=0){
            elements[size++] = E[i];
            }
        }
        
        PrintInvers();
    }
    
    public void PrintInvers(){
        for(int i = size-1; i >= 0; i--)
            System.out.print(elements[i]+" ");
        System.out.print("\n");
        emptyNaw();
    }
    
    public void emptyNaw() {
        size = 0;
    }
}
