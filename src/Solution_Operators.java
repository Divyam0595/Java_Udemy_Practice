public class Solution_Operators {
    public static void main(String args[]){
        //areaTriangle();
        //areaTriangle_3differentSides();
        //cuboid();
        //IncrementDecrement();
        BitwiseOperators();

    }

    public static void areaTriangle(){
        float h=100f;
        float b= 50f;
        System.out.println((b*h)/2f);
    }
    public static void areaTriangle_3differentSides(){
        int a=5;
        int b= 6;
        int c= 7;

        float s= (a+b+c)/2f;
        System.out.println(Math.sqrt(s*((s-a)*(s-b)*(s-c))));


    }
    public static void cuboid(){
        int l=10,b=5,h=7;
        int t=2*((l*h)+(l*b)+(b*h));
        int v= l*b*h;
        System.out.println(t+" and "+v);
    }
    public static void IncrementDecrement(){
        int x=5;
        int y=x++;
         x=5;
        int z=++x;
        System.out.println(x+ " "+y+" "+z);

    }
    public static void BitwiseOperators(){

    }

}
