package solutions.inputandoutput;

import java.io.*;


public class DataClass {
    /**
     * Saves the provided object "o" in the output stream.
     */
    public void saveObject (OutputStream fileOut,Object o) throws IOException {

        try {
            //FileOutputStream fileOut =
            //         new FileOutputStream("/tmp/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(o);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in project dir");
        } catch (IOException i) {
            i.printStackTrace();
        }



    }
    /**
     * Reads an object from the provided InputStreams and returns it as result.
     */
    public Object getObject (InputStream fileIn) throws IOException {

        Employee e = null;
        try {
            // FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            System.out.println("IOException");

        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");

        }


        return e;

    }

}
class Employee implements java.io.Serializable {
    public String name;
    public String address;
    public transient int SSN;
    public int number;

    public void mailCheck() {
        System.out.println("Mailing a check to " + name + " " + address);
    }
}
