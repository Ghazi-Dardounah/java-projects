package phasenumtwo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ShowMembersFrame extends JFrame implements ActionListener {
    private JTextArea outputArea;
    private JButton loadButton;

    public ShowMembersFrame() {
        setTitle("Saved Members");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        outputArea = new JTextArea();
        outputArea.setEditable(false);

        loadButton = new JButton("Load Saved Members");
        loadButton.addActionListener(this);

        add(new JScrollPane(outputArea), BorderLayout.CENTER);
        add(loadButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            outputArea.setText(FileManager.readPersonsInfo());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Could not read Persons.txt.");
        }
    }
}
