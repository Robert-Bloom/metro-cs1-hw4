import edu.princeton.cs.introcs.StdDraw;


public class circle2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int fill = Integer.parseInt(args[1]);
        double minrad = Double.parseDouble(args[2]);
        double maxrad = Double.parseDouble(args[3]);
        double radrange = maxrad - minrad;


        for(int i = 0 ; i < n; i++)
        {
            double x=  Math.random()/.5;
            double y = Math.random()/.5;
            double radius = minrad +(( Math.random()/10)*radrange);

            if(i% fill !=0)
            {

                StdDraw.setXscale(0,1.0);
                StdDraw.setYscale(0,1.0);
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledCircle(x, y, radius) ;
            }
            else
            {
                StdDraw.setXscale(0,1.0);
                StdDraw.setYscale(0,1.0);
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.filledCircle(x, y, radius);
            }
        }
    }
}