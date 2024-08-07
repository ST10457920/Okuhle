public class Question2viii {
    public static void main(String[] args){
        int[][] intArr;
        intArr = new int[5][8];
        for(int a=0;a<intArr.length;a++){
            for(int b=0;b< intArr.length;b++){
                intArr[a][b] += a*b;
            }
        }

        for(int a=0;a<intArr.length;a++){
            int sum = 0;
            for(int b=0;b< intArr.length;b++){
                System.out.print(intArr[a][b]+" ");
                sum += intArr[a][b];
            }
            System.out.println(": "+sum);
        }
    }
}
