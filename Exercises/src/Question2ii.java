import java.util.Random;

public class Question2ii {
    public static void main(String[] args){
        String[] strArr;
        strArr = new String[50];
        for(int i= 0; i< strArr.length;i++){
           strArr[i] = "/";
        }
        for(int i= strArr.length-1;i>=0;--i){
           System.out.println(i+":"+strArr[i]);
        }
        Random rand = new Random ();
        int [] intArr = new int [50];
        for (int i = 0; i < intArr . length ; i ++) {
            intArr [ i ] = rand . nextInt (50) ;
        }
        for(int a=0;a< intArr.length-1;a++){
            for(int b=0;b< intArr.length-1-a;b++){
              if(intArr[b]>intArr[b+1]){
                  int temp = intArr[b];
                  intArr[b] = intArr[b+1];
                  intArr[b+1] = temp;
              }
            }
        }
    }
}
