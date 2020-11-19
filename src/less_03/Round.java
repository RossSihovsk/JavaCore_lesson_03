
package less_03;

public class Round {
    double diametr;
    double radius;

    public Round(double rad, double diam ){
        radius = rad;
        diametr= diam;
    }

    public  void rSquare()
    {
        System.out.println("Площа кола = " + Math.PI*(diametr/2)*(diametr/2));
    }



    public  void rlength()
    {

        System.out.println("Довжина кола кола = " + Math.PI*radius*2 );
    }

}
