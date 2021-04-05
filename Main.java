/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
interface RegularPolygon
    {
        int getNumSides();
        int SideLength(int sidelen);
    }
    
class EquiTriangle implements RegularPolygon
    {
        private static int side = 3;
        private int sidelen;
        
        EquiTriangle(int sidelen)
        {
            this.sidelen=sidelen;
        }
        
        public int getNumSides()
        {
            return side;
        }
        
        public int SideLength(int sidelen)
        {
            return sidelen;
        }
        
        public static int totalSides(int sidelen)
        {
            return sidelen*3;
        }
        
        public int getperimeter(int sidelen)
        {
            return sidelen*3;
        }
        
        public double getInteriorangle()
        {
            return (((3-2)*3.14)/3);
        }
            
    }
 
class Square implements RegularPolygon
    {
        private static int side = 4;
        private int sidelen;
        
        Square(int sidelen)
        {
            this.sidelen=sidelen;
        }
        
        public int getNumSides()
        {
            return side;
        }
        
        public int SideLength(int sidelen)
        {
            return sidelen;
        }
        
        public static int totalSides(int sidelen)
        {
            return sidelen*4;
        }
                
        public int getperimeter(int sidelen)
        {
            return sidelen*4;
        }
        
        public double getInteriorangle()
        {
            return (((4-2)*3.14)/4);
        }
    }    
        
public class Main
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length of the side of triangle");
            int sl=sc.nextInt();
            EquiTriangle e = new EquiTriangle(sl);
            System.out.println("The number of sides in a triangle is "+e.getNumSides());
            System.out.println("The length of sides of the eq. triangle is "+e.SideLength(sl));
            System.out.println("The total of all sides in the triangle is "+e.totalSides(sl));
            System.out.println("The Perimeter and Interior angle of the triangle is "+e.getperimeter(sl)+ "& "+e.getInteriorangle());
            
            System.out.println("Enter the length of the side of Square");
            int sls=sc.nextInt();
            Square s = new Square(sls);
            System.out.println("The number of sides in a Square is "+s.getNumSides());
            System.out.println("The length of sides of the Square is "+s.SideLength(sls));
             System.out.println("The total of all sides in the square is "+s.totalSides(sls));
            System.out.println("The Perimeter and Interior angle of the square is "+s.getperimeter(sls)+ "& "+s.getInteriorangle());
        }
    }