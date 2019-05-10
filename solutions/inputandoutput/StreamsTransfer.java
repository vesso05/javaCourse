package solutions.inputandoutput;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class StreamsTransfer {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Number of bytes to transfer? ");
        int length = in.nextInt();
        System.out.println("Number of offset? ");
        int offset = in.nextInt();


        try {
            copy(System.in, System.out, offset, length);
        } catch (IOException ex) {
            System.err.println(ex);
        }

    }

    public static void copy(InputStream in, OutputStream out, int offset, int length) throws IOException {

        System.out.println("Enter Input: ");

        byte[] buffer = new byte[1024];

        while (true) {
            int bytesRead = in.read(buffer);

            if (bytesRead == 1) {

                break;
            }

            System.out.println("Output: ");
            out.write(buffer, offset, length);

        }
    }
}
