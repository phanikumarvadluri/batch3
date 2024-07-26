package exceptionhandling.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    //
    public static void main(String[] args) {

        try {
            //ReadFile readFile = new ReadFile();
            new ReadFile().readText();
        } catch (FileNotFoundException e) {
            System.out.println("Filenot found!! Please chekc file is present");
        } catch (IOException e) {
            System.out.println("Filenot found!! Please chekc file is present");
        } catch (Exception e) {
            System.out.println("Filenot found!! Please chekc file is present");
        }


    }


    //mthod2
    public void readText() throws IOException {
        FileReader fileReader = null;
        BufferedReader bufferReader = null;
        //checked exception
        fileReader = new FileReader("C:\\Users\\Phani Kumar\\Downloads\\imageupload\\FirstApp\\src\\main\\java\\exceptionhandling\\phani.txt");
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


//method1
//    public void readText() {
//        try {
//            FileReader fileReader = null;
//            BufferedReader bufferReader = null;
//            //checked exception
//            fileReader = new FileReader("C:\\Users\\Phani Kumar\\Downloads\\imageupload\\FirstApp\\src\\main\\java\\exceptionhandling\\phani.txt");
//            bufferReader = new BufferedReader(fileReader);
//            String fileData = null;
//            // use while loop to read and print data from buffered reader
//            while (true) {
//                if (!((fileData = bufferReader.readLine()) != null)) break;
//                System.out.println(fileData);
//            }
//            bufferReader.close();
//        } catch (FileNotFoundException ex) {
//            System.out.println("Filenot found!! Please chekc file is present");
//        } catch (IOException ex) {
//            System.out.println("data----");
//        } catch (Exception ex) {
//            System.out.println("Generric-");
//        }
//    }

