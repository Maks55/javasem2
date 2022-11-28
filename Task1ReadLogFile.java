import java.io.*;

public class Task1ReadLogFile {
    public static void main(String[] args) throws IOException {
        File file = new File ("log.txt");
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();
        while (line != null) {
            int index1 = line.lastIndexOf("INFO");
            int index2 = line.lastIndexOf("DEBUG");
            if (index1 != -1 | index2 != -1) {
                System.out.println(line);
            }
            line = reader.readLine();
        }
    }
}