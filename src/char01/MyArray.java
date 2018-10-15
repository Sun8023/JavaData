package char01;

/**
 * @author: : zzy
 * Date: 2018/10/10
 * Time: 13:32
 * Description:
 */
public class MyArray {
    private long[] arr;
    private int elements;

    public MyArray(){
        arr=new long[50];
    }

    public MyArray(int maxsize){
        arr=new long[maxsize];
    }


    /**
     * 添加数据
     */
    public void insert(long value){
        arr[elements]=value;
        elements++;
    }

    /**
     * 显示数组元素
     */
    public void display(){
        System.out.print ("[");
        for (int i = 0; i <elements ; i++) {
            System.out.print (arr[i]+" ");
        }
        System.out.println ("]");
    }

    /**
     * 查找数据
     * @param value
     */
    public int search(long value){
        int i;
        for ( i = 0; i <elements ; i++) {
            if(value == arr[i]){
                break;
            }
        }
        if (i==elements){
            return -1;
        }else {
            return i;
        }
    }


    /**
     * 查找数据根据索引来查
     */
    public long get(int index){
        if (index>=elements||index<0){
            throw new ArrayIndexOutOfBoundsException ();
        }else{
            return arr[index];
        }
    }

    /**
     * 删除数据
     */
    public void delete(int index){
        if (index>=elements||index<0){
            throw new ArrayIndexOutOfBoundsException ();
        }else{
            for (int i = index; i <elements ; i++) {
                arr[index]=arr[index+1];
            }
            elements--;
        }
    }

    /**
     * 更新数据
     */

    public void change(int index,int newvalue){
        if (index>=elements||index<0){
            throw new ArrayIndexOutOfBoundsException ();
        }else{
            arr[index]=newvalue;
        }
    }
}
