import java.io.FileInputStream;
import java.util.*;
import java.io.*;

public class DictionaryInput {

    public static ArrayList<Word> list = new ArrayList<>();

    public DictionaryInput(){

    }
    public void insertFromCommaline(){
        Scanner sc = new Scanner(System.in);
        String word_target1 = sc.nextLine();
        String word_explain1 = sc.nextLine();
        Word addW = new Word(word_target1,word_explain1);
        list.add(addW);
    }
    public void insertFromFile() throws FileNotFoundException{
          File file = new File("C:\\Users\\ACER\\IdeaProjects\\dictionary\\dictionary.txt");
          Scanner scfile = new Scanner(file);
          while(scfile.hasNextLine()){
              String word_target1 = scfile.nextLine();
              String word_explain1 = scfile.nextLine();
              Word addW = new Word(word_target1,word_explain1);
              list.add(addW);
          }
    }
}

