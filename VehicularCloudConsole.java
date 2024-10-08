/* Project: Project Milestone 2: GUI
* Class: VehicularCloudConsole.java
* Author: Albert Legacki, Allan Ilyasov, Thomas Javier Santos Yciano, Bryan Fung, Matthew Martinez 
* Date: October 7, 2024
* This program is a GUI for the Vehicular Cloud Console. It allows the user to 
  input information about a client or owner.
*/

import javax.swing.*;
import java.awt.*;

public class VehicularCloudConsole extends JFrame {
    private JFrame frame;
    private JPanel mainPanel;
    private JPanel clientPanel;
    private JPanel ownerPanel;
    private JTextField clientIdField;
    private JTextField jobDurationField;
    private JTextField jobDeadlineField;
    private JTextField ownerIdField;
    private JTextField vehicleField;
    private JTextField residencyField;
    private CardLayout cardLayout;


    // VehicularCloudConsole constructor
    public VehicularCloudConsole() {
        frame = new JFrame("Vehicular Cloud Console");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);
        frame.setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        ImageIcon icon = new ImageIcon("images/cloudconsole.png");
        frame.setIconImage(icon.getImage());


        // Client panel
        clientPanel = new JPanel(new GridLayout(0, 2));

        clientPanel.add(new JLabel("Client ID:"));
        clientIdField = new JTextField();
        clientPanel.add(clientIdField);

        clientPanel.add(new JLabel("Approximate Job Duration:"));
        jobDurationField = new JTextField();
        clientPanel.add(jobDurationField);

        clientPanel.add(new JLabel("Job Deadline:"));
        jobDeadlineField = new JTextField();
        clientPanel.add(jobDeadlineField);

        mainPanel.add(clientPanel, "Client");


        // Owner panel
        ownerPanel = new JPanel(new GridLayout(0, 2));

        ownerPanel.add(new JLabel("Owner ID:"));
        ownerIdField = new JTextField();
        ownerPanel.add(ownerIdField);

        ownerPanel.add(new JLabel("Vehicle Information:"));
        vehicleField = new JTextField();
        ownerPanel.add(vehicleField);

        ownerPanel.add(new JLabel("Approximate Residency Time:"));
        residencyField = new JTextField();
        ownerPanel.add(residencyField);

        mainPanel.add(ownerPanel, "Owner");

        frame.add(mainPanel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(VehicularCloudConsole::new);
    }
}