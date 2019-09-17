package searchAndReplace;

//Necessary imports
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class searchAndReplace {

//By Kirill David Sorokin
	
	//Global variables for the visuals
	private JFrame frame;
	private JTextField originalTxtField;
	private JTextField newTxtField;
	private JTextField searchTxtField;
	private JTextField replacewTxtField;

	//Launches the application
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					searchAndReplace window = new searchAndReplace();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Creates the application
	public searchAndReplace() {
		initialize();
	}

	//Contents of the Frame
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Search and Replace");
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setAlwaysOnTop(true);
		frame.setResizable(false);
		frame.setBounds(100, 100, 608, 328);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Original text field visuals
		originalTxtField = new JTextField();
		originalTxtField.setHorizontalAlignment(SwingConstants.LEFT);
		originalTxtField.setBounds(16, 37, 271, 203);
		frame.getContentPane().add(originalTxtField);
		originalTxtField.setColumns(10);
		
		//New text field visuals
		newTxtField = new JTextField();
		newTxtField.setEditable(false);
		newTxtField.setHorizontalAlignment(SwingConstants.LEFT);
		newTxtField.setColumns(10);
		newTxtField.setBounds(318, 37, 271, 203);
		frame.getContentPane().add(newTxtField);
		
		//'Original' label
		JLabel originalLbl = new JLabel("Original");
		originalLbl.setHorizontalAlignment(SwingConstants.CENTER);
		originalLbl.setBounds(16, 21, 271, 16);
		frame.getContentPane().add(originalLbl);
		
		//'New' label
		JLabel newLbl = new JLabel("New");
		newLbl.setHorizontalAlignment(SwingConstants.CENTER);
		newLbl.setBounds(318, 21, 271, 16);
		frame.getContentPane().add(newLbl);
		
		//Search and Replace button functionalities
		JButton searchAndReplaceBtn = new JButton("Search and Replace");
		searchAndReplaceBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String str = new String(originalTxtField.getText());
					String str2 = new String(searchTxtField.getText());
					String str3 = new String(replacewTxtField.getText());
					String str4 = new String(str.replace(str2, str3));
					newTxtField.setText(str4);
			}
		});
		searchAndReplaceBtn.setBounds(318, 241, 271, 26);
		frame.getContentPane().add(searchAndReplaceBtn);
		
		//Text box for searching for the text
		searchTxtField = new JTextField();
		searchTxtField.setBounds(122, 240, 130, 26);
		frame.getContentPane().add(searchTxtField);
		searchTxtField.setColumns(10);
		
		//Text box for replacing the find text
		replacewTxtField = new JTextField();
		replacewTxtField.setColumns(10);
		replacewTxtField.setBounds(122, 264, 130, 26);
		frame.getContentPane().add(replacewTxtField);
		
		//'Search' label visuals
		JLabel searchLbl = new JLabel("Search for...");
		searchLbl.setBounds(26, 245, 119, 16);
		frame.getContentPane().add(searchLbl);
		
		//'Replace with' label visuals
		JLabel replaceWithLbl = new JLabel("Replace with...");
		replaceWithLbl.setBounds(26, 269, 119, 16);
		frame.getContentPane().add(replaceWithLbl);
		
		//Clear button functionalities
		JButton clearBtn = new JButton("Clear");
		clearBtn.setBounds(318, 265, 271, 26);
		frame.getContentPane().add(clearBtn);
	}
}
