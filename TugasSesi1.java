
package tugas;
import javax.swing.JOptionPane;
/**
 *
 * @author YASIRMUBAROK_20210040069_TI21E
 */
public class TugasSesi1 {
    public static void main(String[] args) {
        //1
        JOptionPane.showMessageDialog(null, "Belajar Java");
        JOptionPane.showMessageDialog(null, "Sangat Mmudah sekali");
        JOptionPane.showMessageDialog(null, "dan sangat menyenangkan");
        
        //2
        String input = JOptionPane.showInputDialog("Matkul apa yang anda pelajari?");
        JOptionPane.showMessageDialog(null, "Belajar" +input+ "sangat mudah");
    }
}
