import edu.princeton.cs.introcs.StdDraw;

public class Histogram {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double low = Double.parseDouble(args[1]);
        double high = Double.parseDouble(args[2]);
        double[] data = new double[100];
        int[] arr = new int[n];
        double xaxis =0.1;
        double yaxis =0.1;
        double r1 =0.02;
        double r2;

        for(int i = 0; i < 100; i++)
        {
            double x = low+(Math.random()*(high-low));
            data[i]=x;
        }

        for(int j = 0; j < 100; j++)
        {
           double sect =(high-low)/n;

            int loc = (int) ((data[j]-low)/sect);

            arr[loc]++;
        }

        for(int k = 0; k < 100 ; k++)
        {
            //StdDraw.setCanvasSize(1000, 1000);
            r2 = arr[k]/100;
            StdDraw.rectangle(xaxis,yaxis,r2,r1);
            xaxis = xaxis + r2*2;
            System.out.println(arr[k]);
        }
    }
}
