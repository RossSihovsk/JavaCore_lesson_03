package less_03;

public class Rectangle {
    private  double width;
    private double height;

    public  Rectangle()
    {};

    public  Rectangle(int w, int h)
    {
       this.width = w;
      this.height = h;
    };

    public  void SQuare()
    {

        System.out.println("Площа прямокутника = " + width*height);
    }
    public  void Per(){
        System.out.println("Периметр прямокутника = " + (width+height)*2);
    }


}
