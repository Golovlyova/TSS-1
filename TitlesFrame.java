/*
 * Decompiled with CFR 0_118.
 */
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

class TitlesFrame /*main method*/
extends JFrame {
    private TitlesFrame() {
        this.initUI();
    }

    private void initUI() {
        this.setTitle("\u041a\u0440\u0438\u0432\u044b\u0435 \u0444\u0438\u0433\u0443\u0440\u044b");
        this.setDefaultCloseOperation(3);
        this.add(new TitlesPanel());
        this.setSize(350, 350);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        /*override*/
        SwingUtilities.invokeLater(() -> {
            TitlesFrame ps = new TitlesFrame();
            ps.setVisible(true);
        });
    }

}

