public class Arraylist_scratch {

    private int capacity;
    private int size;
    private Object[] A;

    Arraylist_scratch (){
        size=0;
        capacity=1;
        A=createArray(capacity);
    }

    private Object[] createArray(int capacity){


        return new Object[capacity];
    }

    public void add(Object item){
        if(size==capacity){
            capacity=capacity*2;
                change(capacity*2);
        }

        A[size]=item;
            size++;



        System.out.println(item);
    }

    private void change(int newCapacity){
        Object[] B=createArray(newCapacity);
        for(int i=0;i<size;i++){
            B[i]=A[i];
        }
        A=B;
    }

    public Object get(int index){

        return index;
    }


    public int returnSize(){
        return size;
    }


    //soting the given array if elements are integers
    public int[] sortArr(int[] A){

        int item;
        int i=0,j;
        for (i=1;i<A.length;i++){
            item=A[i];
            j=i-1;
            while(j>=0 && A[j]>item){
                A[j+1]=A[j];
            }
            A[j+1]=item;
        }
        return A;
    }

    //Set Functionality
    public Object setArray(int index,Object item){
        A[index]=item;
        return A;


    }

    //printArray
    public void printArray(){
        for(int i=0;i<size;i++){
            System.out.print(A[i]+" ");
        }

    }
    public void removeElements(int index){
        for(int i=index;i<size-2;i++){
            A[i]=A[i+1];
        }

    }

    public static void main(String[] args) {
        Arraylist_scratch  obj=new Arraylist_scratch();
        for(int i=0;i<10;i++){
            obj.add(i);
        }
        //System.out.println(obj.returnSize());
        //Set an item if you want
        obj.setArray(1,34);
        obj.printArray();
        obj.removeElements(2);
        obj.printArray();





    }
}
