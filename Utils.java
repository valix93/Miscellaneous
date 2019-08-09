import android.graphics.Color;

import java.util.Random;

public class Utils {
    public static int getRandomColor() {
        Random color = new Random();

        int randomColor = Color.rgb(color.nextInt(256), color.nextInt(256),
                color.nextInt(256));

        return randomColor;
    }
}
