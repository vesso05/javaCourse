package solutions.exceptions;
import java.util.ArrayList;


public class LimitedArray {


    private ArrayList<String> myList;
    private int maxSize;


  public LimitedArray(int size)
  {

      myList = new ArrayList();
      maxSize = size;
  }


    /**
     * Adds a string element to the list
     * @param objectToAdd
     * @return
     */
    public boolean add (String objectToAdd)
    {
        if (myList.size() >= maxSize)
        {
            throw new IllegalStateException ("The array is full");
        }

        return myList.add(objectToAdd);
    }

    /**
     * Removes the last element of the list
     */
    public void remove()
    {

        if (myList.size() == 0)
        {

            throw new IllegalStateException("The array is already empty");

        }


        myList.remove(myList.size() -1 );
    }


    public void printAllElements()
    {
        for (String x: myList) {

            System.out.print(x);
            System.out.print(' ');

        }
    }

}
