import java.awt.Desktop;
import java.io.File;

if (Desktop.isDesktopSupported()) {
//    Desktop.getDesktop().edit(new File("~/.zshrc"));
    Desktop.getDesktop().open(new File(".profile"));
} else {
    System.out.print("No nic. Bywa i tak.");
    Runtime.getRuntime().exec(new String[]{"cmd.exe","/c","text.txt"});
    Runtime.getRuntime().exec(new String[]{"/bin/bash","/etc/","passwd"});
}
/exit
