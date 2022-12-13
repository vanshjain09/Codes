public class DynamicStack extends Stack{
    //stack which never becomes full
    //so when it got full we double the length of array or stack
    DynamicStack(){
        super();
    }
    DynamicStack(int size){
        super(size);
    }
    @Override
    public boolean push(int element){
        if(isFull()){
            int temp[] = new int[data.length*2];
            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }data=temp;
            }
        return super.push(element);
    }
    public static void main(String[] args) {
        DynamicStack ds = new DynamicStack();
        for(int i=0;i<20;i++){
            ds.push(i);
        }
        for(int i=0;i<20;i++){
           System.out.println(ds.pop());
        }
    }
}
