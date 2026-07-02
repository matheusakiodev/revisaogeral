package OOP.WritingFiles;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class WritingFiles {
    public static void main(String[] args) {

//        How to write a file using Java (4 popular options)
//        FileWriter = Good for small or medium-sized text files
//        BufferedWriter = Better performance for large amounts of text
//        PrintWriter = Best for structured data, like reports or logs
//        FileOutputStream = Best for binary files (e.g. images, audio files)

        // How to write a file using Java (4 popular options)

        String filePath = "C:\\Users\\Akio\\Desktop\\test123.txt";
        String textContent = """
                Roses are red
                Violets are blue
                Still learning Java
                Cause I'm gonna get you
                """;


        try(FileWriter writer = new FileWriter(filePath)) {
            writer.write(textContent);
            System.out.println("File has been written!");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file location");
        }
        catch(IOException e){ // momentarily using a IOException
            System.out.println("Could not write file");
        }


    }
}
