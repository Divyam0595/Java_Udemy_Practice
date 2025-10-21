interface iMusicPlayer{
    void display();
}
interface iGPS {
    void screen();
    default void  display(){
        System.out.println("Default display");
    }

}
public  class InterfaceExample implements iGPS{

   // public void display(){
     //   System.out.println("Display");
    //}
    public void screen(){
        System.out.println("Screen");
    }


    public static void main(String args[]){
        InterfaceExample v= new InterfaceExample();
       v.display();
       v.screen();
       //iMusicPlayer m= new Vehicle();
       //m.display();
       iGPS g= new InterfaceExample();
       g.screen();
       g.display();

    }
}
