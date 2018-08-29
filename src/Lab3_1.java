import javax.swing.* ;

public class Lab3_1 {
    public static void main(String[] args) {

        /*String input = JOptionPane.showInputDialog("Press number 1 value", "0");
        JOptionPane.showMessageDialog(null, input, "title", JOptionPane.INFORMATION_MESSAGE);*/

        int ans = javax.swing.JOptionPane.showConfirmDialog(null, "Love ?", "Ask you", javax.swing.JOptionPane.YES_NO_OPTION);

        if (ans == javax.swing.JOptionPane.YES_OPTION) {
            javax.swing.JOptionPane.showMessageDialog(null, "I love you");
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Not love");
        }
    }
}