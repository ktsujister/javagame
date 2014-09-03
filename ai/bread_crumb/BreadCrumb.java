import java.awt.Container;

import javax.swing.JFrame;

/*
 * Created on 2005/04/16
 *
 */

/**
 * @author mori
 *
 */
public class BreadCrumb extends JFrame {
    public BreadCrumb() {
        // タイトルを設定
        setTitle("ブレッドクラム経路探索");

        // メインパネルを作成してフレームに追加
        MainPanel panel = new MainPanel();
        Container contentPane = getContentPane();
        contentPane.add(panel);

        // パネルサイズに合わせてフレームサイズを自動設定
        pack();
    }

    public static void main(String[] args) {
        BreadCrumb frame = new BreadCrumb();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
