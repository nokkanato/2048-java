import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GameFrame extends JFrame {
    private JLabel positionLabel;
    private JButton resetButton;

    int width = 4, height = 4;
    public GameFrame(String name){
        super(name);
        createAndDisplayGUI();

    }

    public void createAndDisplayGUI() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // Create background//
        JPanel contentPane = new JPanel();
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        contentPane.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));

        //Header
        JPanel topPanel = new JPanel();
        topPanel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
        JPanel labelPanel = new JPanel();
        positionLabel = new JLabel("press", JLabel.CENTER);
        JPanel buttonLeftPanel = new JPanel();
        resetButton = new JButton("Reset");
        resetButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                positionLabel.setText("not reset");
            }
        });
        contentPane.add(topPanel);

        // create button// inside bg
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(height, width, 10, 10));
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                JButton button = new JButton("(" + i + ", " + j + ")");
                button.setActionCommand("(" + i + ", " + j + ")");
                button.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                        JButton but = (JButton) ae.getSource();
                        positionLabel.setText(
                                but.getActionCommand() + "press");
                    }
                });
                buttonPanel.add(button);
            }
        }

        //add button to panel
        contentPane.add(buttonPanel);




        // Set panel
        setContentPane(contentPane);
        pack();
        setLocationByPlatform(true);
        setVisible(true);


    }
}
