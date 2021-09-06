import java.io.*;

public class Dictionary {
    public static void main(String args[]) throws FileNotFoundException{
        DictionaryInput dcinput = new DictionaryInput();
        dcinput.insertFromFile();
        DictionaryShow dcShow  =new DictionaryShow();
        dcShow.Show();
    }
}