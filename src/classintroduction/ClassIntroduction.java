package classintroduction;

public class ClassIntroduction {

    public static void main(String[] args) {
        int [] list = new int[10];
        for (int i = 0; i <= 9; i++){
            list[i] = i;
        }
        int [] newList = list;
       
System.out.print(list[8]+  "  " + newList[1]);
    
    
    }
    
}
