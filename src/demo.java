import java.text.DecimalFormat;

public class demo {
    public static void main(String[] args) {
        DecimalFormat formatter = new DecimalFormat("###,###,###");

        System.out.println(formatter.format(1000000000));
    }
}
