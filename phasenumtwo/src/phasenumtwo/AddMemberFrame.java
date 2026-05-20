package phasenumtwo;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddMemberFrame extends JFrame implements ActionListener {
    private Gym gym;

    private JTextField nameField;
    private JTextField ageField;
    private JTextField idField;
    private JTextField genderField;
    private JTextField heightField;
    private JTextField weightField;

    private JButton addButton;
    private JButton clearButton;

    public AddMemberFrame(Gym gym) {
        this.gym = gym;

        setTitle("Add Member - " + gym.getName());
        setSize(400, 350);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(7, 2, 5, 5));

        nameField = new JTextField();
        ageField = new JTextField();
        idField = new JTextField();
        genderField = new JTextField();
        heightField = new JTextField();
        weightField = new JTextField();

        addButton = new JButton("Add Member");
        clearButton = new JButton("Clear");

        add(new JLabel("Full Name:"));
        add(nameField);
        add(new JLabel("Age:"));
        add(ageField);
        add(new JLabel("ID:"));
        add(idField);
        add(new JLabel("Gender:"));
        add(genderField);
        add(new JLabel("Height in meters:"));
        add(heightField);
        add(new JLabel("Weight:"));
        add(weightField);
        add(addButton);
        add(clearButton);

        addButton.addActionListener(this);
        clearButton.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton) {
            clearFields();
            return;
        }

        try {
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            String id = idField.getText();
            String gender = genderField.getText();
            double height = Double.parseDouble(heightField.getText());
            double weight = Double.parseDouble(weightField.getText());

            Person person = new BodyBuilder(name, age, id, gender, height, weight);

            if (!person.isAdult() || !person.isMale()) {
                JOptionPane.showMessageDialog(this, "Sorry, the member does not meet the requirements.");
                return;
            }

            if (gym.addPerson(person)) {
                FileManager.savePersonsInfo(person, gym.getName());
                JOptionPane.showMessageDialog(this, "Member added successfully. BMI = " + ((BodyBuilder) person).calculateBmi());
                clearFields();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numeric values for age, height, and weight.");
        } catch (InvalidAgeException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Member was added, but saving to file failed.");
        }
    }

    private void clearFields() {
        nameField.setText("");
        ageField.setText("");
        idField.setText("");
        genderField.setText("");
        heightField.setText("");
        weightField.setText("");
    }
}
