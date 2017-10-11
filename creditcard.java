public class creditcard {

    public static void main(String[] args) {
        String input =(args[0]);

        int[] a = new int [10];
        int j = 1;
        int checksum=0;
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < 10 ; i++)
        {

           a[i] = Integer.parseInt(args[0].substring(i,j));
           j++;
        }
        for(int i = 0; i < 10 ; i++)
        {
            if(i/2 == 0 || i ==0)
            {
                checksum = checksum + a[i];
            }
            else
                sum1 =(a[i]*2)/10 ;
                sum2 =(a[i]*2)%10 ;
                checksum = checksum +sum1 + sum2;
        }
        checksum = checksum/10;

        System.out.println(input + checksum);
    }
}
