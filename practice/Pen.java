package practice;

public class Pen {
public void playMusic(){
    System.out.println("Play music");
}
public String getPen(int n){
    if(n>=10)
    return "Pen";
    return "Nothing";
}

    public static void main(String[] args) {
        Pen obj1=new Pen();
        obj1.playMusic();
        String  str=obj1.getPen(12);
        System.out.println(str);
    }
}
