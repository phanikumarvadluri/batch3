package exceptionhandling.exceptionhandling.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    // Checked exception compiler giving error, either handle using try and catch or throws Exception
    public void readFile() throws IOException {
        FileReader fileReader = null;
        BufferedReader bufferReader = null;
        fileReader = new FileReader("C:\\Users\\Phani Kumar\\IdeaProjects\\batch3\\src\\exceptionhandling\\exceptionhandling\\exception\\test.txt");
        bufferReader = new BufferedReader(fileReader);

        String fileData = null;
        // use while loop to read and print data from buffered reader
        while (true) {
            if (!((fileData = bufferReader.readLine()) != null)) break;
            System.out.println(fileData);
        }
        bufferReader.close();
    }
}
