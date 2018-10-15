package char01;

/**
 * @author: : zzy
 * Date: 2018/10/10
 * Time: 13:37
 * Description:
 */

public class MyArrayTest {
    public static void main(String[] args) {
      //  MyArray array=new MyArray ();
      //  array.insert (12);
       // array.insert (30);
       // array.insert (40);

       // array.display ();

      //  System.out.println (array.search (120));

        //System.out.println (array.get (-3));

      //  array.delete (1);

       // array.change (0,100);
        //array.display ();


        MyOldArray myOldArray=new MyOldArray ();
        myOldArray.insert (60);
        myOldArray.insert (30);
        myOldArray.insert (50);
        myOldArray.insert (60);
        myOldArray.display ();
        System.out.println (myOldArray.search (30));

    }

}
