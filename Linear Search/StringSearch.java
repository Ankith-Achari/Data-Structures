import java.util.Arrays;

public class StringSearch {
    public static void main(String[] args) {
        String name = "Ankith Achari";

        System.out.println(Arrays.toString(name.toCharArray()));
        char target = 'c';
        boolean ans = search(name,target);
        System.out.println(ans);

    }
    static boolean search(String name,char target){
        if(name.length()==0){
            return false;
        }
        for (int i=0;i<name.length();i++){
            if(target==name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
