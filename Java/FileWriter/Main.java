
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {

        String filePath = "C:\\Users\\sundi\\Documents\\Coding-Diary\\Java\\FileWriter\\file.txt";
        String fileContent = """
                            E ihowa atua
                            o nga iwi matou ra
                            atawhakarangona
                            me aroha noa
                            """;
        
        try (FileWriter writer = new FileWriter(filePath)){
            writer.write(fileContent);
            System.out.println("File has been written");
        } catch (FileNotFoundException e) {
            System.out.println("Could not find file location");
        } catch(IOException e){
            System.out.println("Could not make file");
        }
    }
}