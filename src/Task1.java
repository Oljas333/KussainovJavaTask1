import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Task1 extends JFrame {
    public Task1(GraphicsConfiguration gc) {
        super(gc);
    }

    public static void main(String[] args) {
        Task1 app = new Task1();
        app.setVisible(true);
    }

    private JButton button = new JButton("Результат");
    public JTextField input = new JTextField("", 5);
    public JTextField output = new JTextField("", 5);
    public JLabel labelInput = new JLabel("Ввод");
    public JLabel labelOutput = new JLabel("Вывод");

    public Task1() {
        super("Task1");
        this.setBounds(700, 450, 250, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        container.add(this.labelInput);
        container.add(this.input);
        container.add(this.labelOutput);
        container.add(this.output);

        button.addActionListener(new MyClass());
        container.add(this.button);
    }

    class MyClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button) {

                try {
                    output.setText(result(Integer.parseInt(input.getText())));
                } catch (Exception ex) {
                    output.setText("Ошибка.Введите число");
                }

                input.setText(null);

            }
        }
    }

    public static String result(int number) {
        String str = "";
        if (number > 7) {
            str = "Привет";
        } else if (number < 7) {
            str = "Число меньше 7";
        } else if (number == 7) {
            str = "Почти Привет";
        }

        return str;
    }
}
