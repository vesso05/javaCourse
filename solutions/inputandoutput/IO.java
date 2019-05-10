package solutions.inputandoutput;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class IO {

    private String str_input;
    private String input;
    private int int_input;
    private char char_input;
    private float float_input;




    public void readString()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        this.str_input = in.nextLine();
        in.close();

    }


    public void readInt()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer");
        this.int_input = in.nextInt();
        in.close();

    }

    public void readChar()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a char");
        this.char_input = in.nextLine().charAt(0);
        in.close();


    }

    public void readFloat()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a float number");
        this.float_input = in.nextFloat();
        in.close();

    }


    public void readAndWriteToFile(String fileName) {

        String fN = fileName;
        try{

            File file = new File(fN);
            PrintWriter pw = new PrintWriter(file);


            Scanner in = new Scanner(System.in);
            System.out.println("Enter a text");
            this.input = in.nextLine();



            while (this.input.charAt(0) != '.')
            {
                pw.write(this.input);

                this.input = in.nextLine();
            }

            in.close();
            pw.close();


        } catch (Exception e) {

        }



    }


    public void readAndReverse(String filename) throws IOException
    {

        FileReader fr = new FileReader(filename);
        BufferedReader in = new BufferedReader(fr);

        ArrayList<String> list = new ArrayList();

        String sCurrentLine;

        while ((sCurrentLine = in.readLine()) != null) {

            String reverse = new StringBuilder(sCurrentLine).reverse().toString();
            list.add(reverse);
            System.out.print(reverse);
            System.out.print("\n");

        }

        fr.close();
        in.close();

        File fout = new File(filename);
        FileOutputStream fos = new FileOutputStream(fout);

        OutputStreamWriter osw = new OutputStreamWriter(fos);

        for (String x: list) {

           osw.write(x+"\n");

        }

         osw.close();

    }


    public char getChar_input() {
        return char_input;
    }

    public static void main(String[] args) throws IOException {


    }
}
