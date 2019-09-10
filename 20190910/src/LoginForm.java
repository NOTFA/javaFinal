import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LoginForm extends JFrame implements ActionListener {

	private JTextField textField;
	private JTextField textField_1;
	private JButton btnCancel = new JButton("Cancel");
	private JButton btnLogin = new JButton("Login");

	@Override
	public void actionPerformed(ActionEvent e) {

		// System.out.println("e.getSource() = " + e.getSource());

		if (e.getSource() == btnCancel) {
			System.exit(0);
		} else {

			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "1234");
				pstmt = conn.prepareStatement("select * from member where id=? and pw=?");
				pstmt.setString(1, textField.getText());
				pstmt.setString(2, textField_1.getText());
				rs = pstmt.executeQuery();
				
				if(rs.next()) {
//					System.out.println("id = " +rs.getString(1));
//					System.out.println("pw = " +rs.getString(2));
					setVisible(false);
					new MainForm();
				}else {
					JOptionPane.showMessageDialog(null, "로그인 정보를 확인하시오");
				}

			} catch (Exception ex) {
				ex.printStackTrace();
			} finally {
				try {
					rs.close();
					pstmt.close();
					conn.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}

			boolean result = false;

			if (result) {
				setVisible(false);
				new MainForm();
			} else {
				JOptionPane.showMessageDialog(null, "로그인 정보를 확인하세요.");
			}
		}

	}

	LoginForm() {

		setLocationRelativeTo(null);

		setTitle("loginForm");

		setSize(388, 462);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(12, 10, 348, 133);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Login Form");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(96, 35, 170, 48);
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		panel_1.setBounds(12, 141, 348, 273);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);

		btnCancel.setFont(new Font("Bodoni MT Condensed", Font.PLAIN, 18));
		btnCancel.setBounds(187, 195, 107, 47);
		panel_1.add(btnCancel);

		btnLogin.setFont(new Font("Bodoni MT Condensed", Font.PLAIN, 18));
		btnLogin.setBounds(56, 195, 107, 47);
		panel_1.add(btnLogin);

		JLabel lblId = new JLabel("ID");
		lblId.setBounds(37, 58, 46, 48);
		panel_1.add(lblId);
		lblId.setForeground(Color.WHITE);
		lblId.setFont(new Font("굴림", Font.BOLD, 21));

		JLabel lblPw = new JLabel("PW");
		lblPw.setForeground(Color.WHITE);
		lblPw.setFont(new Font("굴림", Font.BOLD, 21));
		lblPw.setBounds(37, 116, 46, 48);
		panel_1.add(lblPw);

		textField = new JTextField();
		textField.setBounds(90, 62, 204, 47);
		panel_1.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(90, 120, 204, 47);
		panel_1.add(textField_1);
		setVisible(true);

		btnCancel.addActionListener(this);
		btnLogin.addActionListener(this);
	}

	public static void main(String[] args) {
		new LoginForm();
	}

}
