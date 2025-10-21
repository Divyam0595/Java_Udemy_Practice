public class OverloadingMax {

    public static int  max(int a,int b,int c){
        return (a>b)&(a>c)?a:(b>c)?b:c;
    }
    public static void main(String args[]){
        System.out.println(max(9,8,10));
    }
}
