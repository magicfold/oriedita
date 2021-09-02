package origami_editor.editor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class OpenFrame extends JDialog {
    private JCheckBox selectAnd3ClickCheckBox;
    private JButton o_F_checkButton;
    private JButton foldableLinePlusGridInputButton;
    private JButton select_polygonButton;
    private JButton unselect_polygonButton;
    private JButton select_lXButton;
    private JButton unselect_lXButton;
    private JButton del_lButton;
    private JButton del_l_XButton;
    private JPanel panel;

    public OpenFrame(String name, App app) {
        super(app, name);

        setContentPane($$$getRootComponent$$$());

        addWindowListener(new WindowAdapter() {//Toggle between enabling and disabling decorations for this frame.
            public void windowClosing(WindowEvent evt) {
                app.showAddFrame = false;
                dispose();
            }
        });

        o_F_checkButton.addActionListener(e -> {
            app.setHelp("af_O_F_check");

            app.mouseMode = MouseMode.FLAT_FOLDABLE_CHECK_63;
            System.out.println("mouseMode = " + app.mouseMode);
            app.Button_shared_operation();
            app.repaint();
        });
        foldableLinePlusGridInputButton.addActionListener(e -> {
            app.setHelp("oritatami_kanousen_and_kousitenkei");

            app.mouseMode = MouseMode.FOLDABLE_LINE_INPUT_39;
            app.iro_sitei_ato_ni_jissisuru_sagyou_bangou = MouseMode.FOLDABLE_LINE_INPUT_39;
            System.out.println("mouseMode = " + app.mouseMode);

            app.es1.unselect_all();
            app.Button_shared_operation();
            app.repaint();
        });
        select_polygonButton.addActionListener(e -> {
            app.setHelp("af_select_polygon");

            app.mouseMode = MouseMode.SELECT_POLYGON_66;
            System.out.println("mouseMode = " + app.mouseMode);
            app.Button_shared_operation();
            app.repaint();
        });
        unselect_polygonButton.addActionListener(e -> {
            app.setHelp("af_unselect_polygon");

            app.mouseMode = MouseMode.UNSELECT_POLYGON_67;
            System.out.println("mouseMode = " + app.mouseMode);
            app.Button_shared_operation();
            app.repaint();
        });
        select_lXButton.addActionListener(e -> {
            app.setHelp("af_select_lX");

            app.mouseMode = MouseMode.SELECT_LINE_INTERSECTING_68;
            System.out.println("mouseMode = " + app.mouseMode);
            app.Button_shared_operation();
            app.repaint();
        });
        unselect_lXButton.addActionListener(e -> {
            app.setHelp("af_unselect_lX");

            app.mouseMode = MouseMode.UNSELECT_LINE_INTERSECTING_69;
            System.out.println("mouseMode = " + app.mouseMode);
            app.Button_shared_operation();
            app.repaint();
        });
        del_lButton.addActionListener(e -> {
            app.setHelp("af_Del_l");

            app.mouseMode = MouseMode.CREASE_DELETE_OVERLAPPING_64;
            System.out.println("mouseMode = " + app.mouseMode);
            app.Button_shared_operation();
            app.repaint();
        });
        del_l_XButton.addActionListener(e -> {
            app.setHelp("af_Del_l_X");

            app.mouseMode = MouseMode.CREASE_DELETE_INTERSECTING_65;
            System.out.println("mouseMode = " + app.mouseMode);
            app.Button_shared_operation();
            app.repaint();
        });

        selectAnd3ClickCheckBox.addActionListener(e -> {
            app.setHelp("ckbox_add_frame_SelectAnd3click");
        });

        selectAnd3ClickCheckBox.setSelected(app.ckbox_add_frame_SelectAnd3click_isSelected);//Select whether to display

        pack();

        setLocation(
                (int) (app.getLocation().getX()) + app.getSize().width - getSize().width - 131
                ,
                (int) (app.getLocation().getY()) + app.getSize().height - getSize().height - 44
        );

        setResizable(false);

        setVisible(true);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        panel.add(panel1);
        selectAnd3ClickCheckBox = new JCheckBox();
        selectAnd3ClickCheckBox.setText("sel<=>mcm");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panel1.add(selectAnd3ClickCheckBox, gbc);
        o_F_checkButton = new JButton();
        o_F_checkButton.setText("O_F_check");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(o_F_checkButton, gbc);
        foldableLinePlusGridInputButton = new JButton();
        foldableLinePlusGridInputButton.setIcon(new ImageIcon(getClass().getResource("/ppp/oritatami_kanousen_and_kousitenkei.png")));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(foldableLinePlusGridInputButton, gbc);
        select_polygonButton = new JButton();
        select_polygonButton.setBackground(new Color(-16711936));
        select_polygonButton.setText("select_polygon");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(select_polygonButton, gbc);
        unselect_polygonButton = new JButton();
        unselect_polygonButton.setBackground(new Color(-16711936));
        unselect_polygonButton.setText("unselect_polygon");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(unselect_polygonButton, gbc);
        select_lXButton = new JButton();
        select_lXButton.setBackground(new Color(-16711936));
        select_lXButton.setText("select_lX");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(select_lXButton, gbc);
        unselect_lXButton = new JButton();
        unselect_lXButton.setBackground(new Color(-16711936));
        unselect_lXButton.setText("unselect_lX");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(unselect_lXButton, gbc);
        del_lButton = new JButton();
        del_lButton.setText("Del_l");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(del_lButton, gbc);
        del_l_XButton = new JButton();
        del_l_XButton.setText("Del_l_X");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(del_l_XButton, gbc);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel;
    }

}
