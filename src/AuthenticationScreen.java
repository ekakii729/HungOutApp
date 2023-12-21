/*
 * Creator(s): Diep Long, Abhay Manoj
 * Date of Creation: December 20th, 2023
 * Purpose: This is a base authentication screen to be added onto
 */

import java.awt.Font;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public abstract class AuthenticationScreen extends JFrame {

    private final JPanel MAIN_PANEL = new JPanel(null); // main panel of the screen
    private final Font TAHOMA_FONT = new Font("Tahoma", Font.PLAIN, 18); // font that is used throughout
    private JButton mainButton; // main button of the screen
    private JButton optionalButton; // optional button of the screen

    /** Method Name: drawScreen
     * @Author Diep Long, Abhay Manoj
     * @Date December 20, 2023
     * @Modified December 20, 2023
     * @Description Initializes the screen
     * @Parameters title - the title of the window
     * @Returns N/A, Data Type: Void
     * @Dependencies: Swing
     * @Throws/Exceptions: N/A
     */

    public void drawScreen(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 0, 450, 350);
        //setResizable(false);
    }

    /** Method Name: drawMainPanel
     * @Author Diep Long, Abhay Manoj
     * @Date December 20, 2023
     * @Modified December 20, 2023
     * @Description Draws the main panel
     * @Parameters N/A
     * @Returns N/A, Data Type: Void
     * @Dependencies: Swing
     * @Throws/Exceptions: N/A
     */

    public void drawMainPanel() {
        MAIN_PANEL.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(MAIN_PANEL);
    }

    /** Method Name: drawHeader
     * @Author Diep Long, Abhay Manoj
     * @Date December 20, 2023
     * @Modified December 20, 2023
     * @Description Draws the header
     * @Parameters N/A
     * @Returns N/A, Data Type: Void
     * @Dependencies: Swing, AWT
     * @Throws/Exceptions: N/A
     */

    public void drawHeader(String text) {
        Font headerFont = new Font("TW Cen MT", Font.BOLD, 44); // font used in the header
        JLabel headerLabel = new JLabel(text, SwingConstants.CENTER); // displays the header text
        headerLabel.setFont(headerFont);
        headerLabel.setBounds(40, 35, 347, 49);
        MAIN_PANEL.add(headerLabel);
    }

    /** Method Name: drawUserNameSection
     * @Author Diep Long, Abhay Manoj
     * @Date December 20, 2023
     * @Modified December 20, 2023
     * @Description Draws the username section
     * @Parameters N/A
     * @Returns N/A, Data Type: Void
     * @Dependencies: N/A
     * @Throws/Exceptions: N/A
     */

    public void drawUserNameSection() {
        drawUserNameLabel();
        drawUserNameTextField();
    }

    /** Method Name: drawPasswordSection
     * @Author Diep Long, Abhay Manoj
     * @Date December 20, 2023
     * @Modified December 20, 2023
     * @Description Draws the password section
     * @Parameters N/A
     * @Returns N/A, Data Type: Void
     * @Dependencies: N/A
     * @Throws/Exceptions: N/A
     */

    public void drawPasswordSection() {
        drawPasswordLabel();
        drawPasswordField();
    }

    /** Method Name: drawMainButton
     * @Author Diep Long, Abhay Manoj
     * @Date December 20, 2023
     * @Modified December 20, 2023
     * @Description Draws the main button
     * @Parameters text - text for the button
     * @Returns N/A, Data Type: Void
     * @Dependencies: Swing, AWT
     * @Throws/Exceptions: N/A
     */

    public void drawMainButton(String text) {
        mainButton = createButton(text, 34,249,132,37);
        mainButton.addActionListener(e -> mainButtonAction());
        MAIN_PANEL.add(mainButton);
    }

    /** Method Name: drawOptionalButton
     * @Author Diep Long, Abhay Manoj
     * @Date December 20, 2023
     * @Modified December 20, 2023
     * @Description Draws the optional button
     * @Parameters text - text for the button
     * @Returns N/A, Data Type: Void
     * @Dependencies: Swing, AWT
     * @Throws/Exceptions: N/A
     */

    public void drawOptionalButton(String text) {
        optionalButton = createButton(text, 175,249,220,37);
        optionalButton.addActionListener(e -> optionalButtonAction());
        MAIN_PANEL.add(optionalButton);
    }

    /** Method Name: mainButtonAction
     * @Author Diep Long, Abhay Manoj
     * @Date December 20, 2023
     * @Modified December 20, 2023
     * @Description Contains the action for the main button
     * @Parameters N/A
     * @Returns N/A, Data Type: Void
     * @Dependencies: N/A
     * @Throws/Exceptions: N/A
     */

    abstract public void mainButtonAction();

    /** Method Name: mainButtonAction
     * @Author Diep Long, Abhay Manoj
     * @Date December 20, 2023
     * @Modified December 20, 2023
     * @Description Contains the action for the optional button
     * @Parameters N/A
     * @Returns N/A, Data Type: Void
     * @Dependencies: N/A
     * @Throws/Exceptions: N/A
     */

    abstract public void optionalButtonAction();

    /** Method Name: createButton
     * @Author Diep Long, Abhay Manoj
     * @Date December 20, 2023
     * @Modified December 20, 2023
     * @Description Creates a button with text, sets font, and bounds
     * @Parameters text - text on the button, x - x position of the button, y - y position of the button, width - width of the button, height - height of the button
     * @Returns A Button following parameters given, Data Type: JButton
     * @Dependencies: Swing, AWT
     * @Throws/Exceptions: N/A
     */

    private JButton createButton(String text, int x, int y, int width, int height) {
        JButton button = new JButton(text);
        button.setFont(TAHOMA_FONT);
        button.setBounds(x,y,width,height);
        return button;
    }

    /** Method Name: drawPasswordLabel
     * @Author Diep Long, Abhay Manoj
     * @Date December 20, 2023
     * @Modified December 20, 2023
     * @Description Draws the label for the password
     * @Parameters N/A
     * @Returns N/A, Data Type: Void
     * @Dependencies: Swing, AWT
     * @Throws/Exceptions: N/A
     */

    private void drawPasswordLabel() {
        JLabel passwordLabel = new JLabel("Password:"); // displays the password text
        passwordLabel.setFont(TAHOMA_FONT);
        passwordLabel.setBounds(34,153,90,31);
        MAIN_PANEL.add(passwordLabel);
    }

    /** Method Name: drawPasswordField
     * @Author Diep Long, Abhay Manoj
     * @Date December 20, 2023
     * @Modified December 20, 2023
     * @Description Draws the field for the password
     * @Parameters N/A
     * @Returns N/A, Data Type: Void
     * @Dependencies: Swing
     * @Throws/Exceptions: N/A
     */

    private void drawPasswordField() {
        JPasswordField passwordField = new JPasswordField(); // takes in password input
        passwordField.setBounds(215,153,181,37);
        MAIN_PANEL.add(passwordField);
    }

    /** Method Name: drawUserNameLabel
     * @Author Diep Long, Abhay Manoj
     * @Date December 20, 2023
     * @Modified December 20, 2023
     * @Description Draws the label for the username
     * @Parameters N/A
     * @Returns N/A, Data Type: Void
     * @Dependencies: Swing, AWT
     * @Throws/Exceptions: N/A
     */

    private void drawUserNameLabel() {
        JLabel userNameLabel = new JLabel("User name:"); // displays the username text
        userNameLabel.setFont(TAHOMA_FONT);
        userNameLabel.setBounds(34,103,105,31);
        MAIN_PANEL.add(userNameLabel);
    }

    /** Method Name: drawUserNameTextField
     * @Author Diep Long, Abhay Manoj
     * @Date December 20, 2023
     * @Modified December 20, 2023
     * @Description Draws the field for the username
     * @Parameters N/A
     * @Returns N/A, Data Type: Void
     * @Dependencies: Swing
     * @Throws/Exceptions: N/A
     */

    private void drawUserNameTextField() {
        JTextField userNameTextField = new JTextField(); // takes in username input
        userNameTextField.setBounds(215,103,181,37);
        userNameTextField.setColumns(10);
        MAIN_PANEL.add(userNameTextField);
    }

    public JPanel getMainPanel() { return MAIN_PANEL; }

    public JButton getMainButton() { return mainButton; }

    public JButton getOptionalButton() { return optionalButton; }

    public Font getFont() { return TAHOMA_FONT; }

}
