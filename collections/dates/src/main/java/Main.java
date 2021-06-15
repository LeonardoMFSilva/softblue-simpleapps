import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {
        Date now = new Date();
        System.out.println(now);

        long time = now.getTime();
        System.out.println(time);

        Calendar cal = Calendar.getInstance();
        cal.set(2030, 1, 20, 14, 30, 25);
        System.out.println(cal);
        System.out.println(cal.getTime()); //getTime precisa ser usado para o valor ser mostrado, se não, será apresentado o objeto alocado na memoria
        cal.set(Calendar.YEAR, 2040);
        cal.set(Calendar.SECOND, 20);
        System.out.println(cal.getTime());
        cal.add(Calendar.MONTH, 1);
        cal.add(Calendar.YEAR, -2);
        System.out.println(cal.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = sdf.parse("03/12/2000 15:30:20");
        System.out.println(d);

        String s = sdf.format(d);
        System.out.println(s);

        cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR, 48);
        System.out.println(cal.getTime());
    }
}
