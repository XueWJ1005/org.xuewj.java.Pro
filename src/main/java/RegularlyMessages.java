import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.KeyEvent;

public class RegularlyMessages {

    public static void main(String[] args) throws AWTException {
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable tText = null;
        Toolkit tolkit = Toolkit.getDefaultToolkit();
        String[] lists = {"周二下午", "周三下午","周四下午", "周五下午","周二下午", "周三下午","周四下午", "周五下午",};
        Robot robot = new Robot();
        //延迟
        robot.delay(100);
        //循环
        for (int i = 0; i < 100000; i++) {
            tText = new StringSelection(lists[i]);
//            tText = new StringSelection("");
            clip.setContents(tText, null);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);

            robot.keyRelease(KeyEvent.VK_CONTROL);

            robot.delay(0);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.delay(500);

        }
    }

}
