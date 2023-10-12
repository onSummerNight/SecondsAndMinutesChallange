public class Main {
    public static void main(String[] args) {

        getDurationString(3945);
        getDurationString(65,45);
    }

    public static void getDurationString(int onSecond){
        if (onSecond < 0) {
            System.out.println("Invalid Value For Second");
        } else {
            int inMinute = onSecond / 60;
            int inSecond = onSecond % 60;
            getDurationString(inMinute, inSecond);
        }
    }

    public static void getDurationString(int onMinute, int onSecond) {
        if ((onMinute < 0) && (onSecond < 0))  {
            System.out.println("Invalid Value For Second");
        } else {
            int inHour   = onMinute / 60;
            int inMinute = onMinute % 60;
            int inSecond = onSecond % 60;
            System.out.println(inHour + "h " + inMinute + "m " + inSecond + "s");
        }

    }

    }
