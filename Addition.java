import javax.swing.JOptionPane;
public class Addition{
    public static void main(String[] args)
    {
        String firstNumber = JOptionPane.showInputDialog("enter first integer");
        String secondNumber = JOptionPane.showInputDialog("enter second integer");

        // conver string inputs to int valies for use in a calculation
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);
        int sum = number1 + number2;

        // display result in a JOptionPane message dialog
        JOptionPane.showMessageDialog(null,"The sum is "+sum,"Sum of two integers",JOptionPane.PLAIN_MESSAGE);
    }
    
}