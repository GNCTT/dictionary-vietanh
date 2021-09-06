import java.lang.*;
public class DictionaryShow {
    public DictionaryShow(){

    }
    public void Show(){
        int size = DictionaryInput.list.size();
        System.out.printf("%-12s%-12s%s\n","so thu tu","tieng Anh","tieng Viet");
        for(int i=0;i<size;i++){
            System.out.printf("%-12s%-12s%s\n",i+1,DictionaryInput.list.get(i).word_target,DictionaryInput.list.get(i).word_explain);
        }
    }

}
