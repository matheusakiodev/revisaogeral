package OOP.WritingFiles;
import java.io.FileWriter;
import java.io.IOException;


public class WritingFiles {
    public static void main(String[] args) {

//        How to write a file using Java (4 popular options)
//        FileWriter = Good for smal or medium-sized text files
//        BufferedWriter = Better performance for large amounts of text
//        PrintWriter = Best for structured data, like reports or logs
//        FileOutputStream = Best for binary files (e.g. images, audio files)



        try(FileWriter writer = new FileWriter("test.txt")){
            writer.write("I like pizza!");
            System.out.println("File has been written!");
        }
        catch(IOException e){
            System.out.println("Could not write file");
        }


    }
}
