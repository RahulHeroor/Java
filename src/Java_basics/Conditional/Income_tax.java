package Java_basics.Conditional;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Income_tax {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Income Tax Calculator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);

            JPanel panel = new JPanel();
            frame.add(panel);
            placeComponents(panel);

            frame.setVisible(true);
        });
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel incomeLabel = new JLabel("Enter Income:");
        incomeLabel.setBounds(10, 20, 80, 25);
        panel.add(incomeLabel);

        JTextField incomeText = new JTextField(20);
        incomeText.setBounds(100, 20, 165, 25);
        panel.add(incomeText);

        JButton calculateButton = new JButton("Calculate Tax");
        calculateButton.setBounds(10, 80, 150, 25);
        panel.add(calculateButton);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double income = Double.parseDouble(incomeText.getText());
                    double tax = calculateTax(income);

                    JOptionPane.showMessageDialog(null, "Income Tax: $" + tax);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number for income.");
                }
            }
        });
    }

    private static double calculateTax(double income) {
        // Simplified tax calculation logic (adjust as needed)
        if (income <= 50000) {
            return 0.1 * income;
        } else {
            return 0.2 * income;
        }
    }
}
