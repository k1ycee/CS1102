import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * This class contains a methods that takes a user input
 * userUrl and userfilenam, to scrape the web for the userUrl and put the result in
 * userfilename using I/O in java
 * @author ThankGod Chiagozie

 */

public class IOExperiment {


    public static void main(String [] args) {
//      Initialize input and output streams
        InputStream in;
        OutputStream out;

        Scanner userUrl = new Scanner(System.in);  // Collect user url
        System.out.println("Enter url:");
        String urlString = userUrl.nextLine();
        Scanner userFile = new Scanner(System.in);  // Collect filename for document from user
        System.out.println("Enter fileName:");
        String fileString = userFile.nextLine();
        try {
            URL url = new URL("https://" + urlString); // make url object
            in = url.openStream(); // pass result to the `in` variable
            out = new FileOutputStream(fileString); // pass [FileOutputStream] to the `out` variable
            copyStream(in, out);
            in.close();
            out.close();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void copyStream(InputStream in, OutputStream out)
            throws IOException {
        int oneByte = in.read();
        while (oneByte >= 0) { // negative value indicates end-of-stream
            out.write(oneByte);
            oneByte = in.read();
        }
    }
}
