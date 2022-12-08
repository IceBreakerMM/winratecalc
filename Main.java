import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {
    // Initial number of battles and wins
    private int battles;
    private int wins;

    // Label to display the winrate
    private JLabel winrateLabel;

    public Main() {
        // Set the title of the window
        setTitle("Winrate Calculator");

        // Set the default close operation of the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the layout of the window
        setLayout(new GridBagLayout());

        // Create a constraint object to use for adding components to the window
        GridBagConstraints constraints = new GridBagConstraints();

        // Set the default values of the constraints
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.weightx = 100;
        constraints.weighty = 100;

        // Create a label to prompt the user for the number of battles
        JLabel battlesLabel = new JLabel("Enter the number of battles: ");

        // Add the label to the window
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        add(battlesLabel, constraints);

        // Create a text field for the user to enter the number of battles
        JTextField battlesField = new JTextField(10);

        // Add the text field to the window
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        add(battlesField, constraints);

        // Create a label to prompt the user for the number of wins
        JLabel winsLabel = new JLabel("Enter the number of wins: ");

        // Add the label to the window
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        add(winsLabel, constraints);

        // Create a text field for the user to enter the number of wins
        JTextField winsField = new JTextField(10);

        // Add the text field to the window
        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        add(winsField, constraints);

        // Create a label to display the winrate
        winrateLabel = new JLabel("Your current winrate is: 0.00%");

        // Add the label to the window
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 3;
        add(winrateLabel, constraints);

        // Create a panel to hold the buttons
        JPanel buttonPanel = new JPanel();

        // Set the layout of the button panel
        buttonPanel.setLayout(new FlowLayout());

        // Create a button to add a win
        JButton winButton = new JButton("Add Win");

        // Add an action listener to the button
        winButton.addActionListener(new ActionListener() {
            public void action
