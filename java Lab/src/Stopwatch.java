import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Stopwatch extends JFrame {

    private Timer timer;
    private int seconds;
    private JLabel timeLabel;

    public Stopwatch() {
        setTitle("Stopwatch");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        // Initialize components
        timeLabel = new JLabel("00:00:00");
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timeLabel.setFont(timeLabel.getFont().deriveFont(32.0f));

        JButton startButton = new JButton("Start");
        JButton stopButton = new JButton("Stop");
        JButton resetButton = new JButton("Reset");

        // Set layout
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // Add components to the frame
        add(timeLabel);
        add(startButton);
        add(stopButton);
        add(resetButton);

        // Event listeners
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                start();
            }
        });

        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stop();
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reset();
            }
        });
    }

    private void start() {
        if (timer == null) {
            timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    seconds++;
                    updateTimeLabel();
                }
            });
            timer.start();
        }
    }

    private void stop() {
        if (timer != null) {
            timer.stop();
            timer = null;
        }
    }

    private void reset() {
        stop();
        seconds = 0;
        updateTimeLabel();
    }

    private void updateTimeLabel() {
        int hr = seconds / 3600;
        int min = (seconds % 3600) / 60;
        int sec = seconds % 60;

        DecimalFormat df = new DecimalFormat("00");
        String time = df.format(hr) + ":" + df.format(min) + ":" + df.format(sec);
        timeLabel.setText(time);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Stopwatch().setVisible(true);
            }
        });
    }
}
