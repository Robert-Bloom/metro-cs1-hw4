public class Calendar {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int d = 1;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        int da = d0 + 1;

        boolean isLeapYear;
        String month = "";


        isLeapYear = (y % 4 == 0);
        isLeapYear = isLeapYear && (y % 100 != 0);
        isLeapYear = isLeapYear || (y % 400 == 0);

        if (m == 1)
            month = "Jan";
        else if (m == 2)
            month = "Feb";
        else if (m == 3)
            month = "Mar";
        else if (m == 4)
            month = "Apr";
        else if (m == 5)
            month = "May";
        else if (m == 6)
            month = "Jun";
        else if (m == 7)
            month = "Jul";
        else if (m == 8)
            month = "Aug";
        else if (m == 9)
            month = "Sep";
        else if (m == 10)
            month = "Oct";
        else if (m == 11)
            month = "Nov";
        else
            month = "Dec";


        System.out.println(month + "\t" + y);
        System.out.println("Su\tM\tTu\tW\tTh\tF\tSa");

        if (d0 == 1)
            System.out.print("\t1");
        else if (d0 == 2)
            System.out.print("\t\t1");
        else if (d0 == 3)
            System.out.print("\t\t\t1");
        else if (d0 == 4)
            System.out.print("\t\t\t\t1");
        else if (d0 == 5)
            System.out.print("\t\t\t\t\t1");
        else if (d0 == 6)
            System.out.print("\t\t\t\t\t\t1");
        else
            System.out.print("1");

        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {

            for (int i = 2; i < 32; i++) {
                int da2 = 2;

                System.out.print("\t" + i);
                da++;
                da2++;
                if (da >= 7) {
                    System.out.println("\n");
                    da = 1;
                    da2++;
                }
            }
        } else if (m == 2) {
            if (isLeapYear) {
                for (int i = 2; i < 30; i++) {
                    int da2 = 2;

                    System.out.print("\t" + i);
                    da++;
                    da2++;
                    if (da >= 7) {
                        System.out.println("\n");
                        da = 1;
                        da2++;
                    }
                }
            } else {
                for (int i = 2; i < 29; i++) {
                    int da2 = 2;

                    System.out.print("\t" + i);
                    da++;
                    da2++;
                    if (da >= 7) {
                        System.out.println("\n");
                        da = 1;
                        da2++;
                    }
                }
            }
        } else {
            for (int i = 2; i < 31; i++) {
                int da2 = 2;

                System.out.print("\t" + i);
                da++;
                da2++;
                if (da >= 7) {
                    System.out.println("\n");
                    da = 1;
                    da2++;
                }
            }

        }

    }
}
