import java.util.concurrent.TimeUnit;
import java.awt.MouseInfo;

public abstract class logButtons {
    public static String logM() throws InterruptedException {
        while(true)
        {
        TimeUnit.SECONDS.sleep(1/2);
        double mouseX = MouseInfo.getPointerInfo().getLocation().getX();
        double mouseY = MouseInfo.getPointerInfo().getLocation().getY();
        
        String stringX = Double.toString(mouseX);
        String stringY = Double.toString(mouseY);
        
        return "(" + stringX + "; " + stringY + ")";
        }

    }
}
