package Stack;

public class DynamicStack extends Stack {

//    public DynamicStack(){
//        super();
//    }
    public DynamicStack(int size){
        super(size);
    }
    @Override
    public boolean push(int item){
        if (this.isFull()){
            int[] temp=new int[arr.length*2];

        for (int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        arr=temp;
        }
        return super.push(65);
    }

}
