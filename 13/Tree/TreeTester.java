/**
 * @(#)TreeTester.java
 *
 * TreeTester application
 *
 * @author
 * @version 1.00 2012/3/19
 */

import java.awt.*;
import javax.swing.*;

public class TreeTester {

    public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setSize(640, 480);

		TreeComponent tc = new TreeComponent();
		frame.add(tc);

		frame.setVisible(true);

    }
}
