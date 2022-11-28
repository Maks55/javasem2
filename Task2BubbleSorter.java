import java.util.Arrays;
import java.io.*;

public class Task2BubbleSorter {
    public static void main(String[] args) throws Exception {
        int [] mas = {11, 3, 14, 16, 7};

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                    String liner = Arrays.toString(mas);
                    newFile(liner);
                }
            }
        }
        String liner = Arrays.toString(mas);
        System.out.println(liner);
    }
    
    static void newFile(String liner) throws Exception {
        FileWriter nFile = new FileWriter("log.txt", true);
        BufferedWriter bufferWriter = new BufferedWriter(nFile);
        bufferWriter.write((liner)+"\n");
        bufferWriter.close();
        nFile.close();
    }       
}



