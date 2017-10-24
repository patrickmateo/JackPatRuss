package JackPatRuss;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginSys extends JFrame implements ActionListener {

    ArrayDB a = new ArrayDB();

    JPanel pnlLogin = new JPanel();
    JLabel lblUsername = new JLabel();
    JLabel lblPassword = new JLabel();
    JTextField txtUsername = new JTextField();
    JPasswordField txtPassword = new JPasswordField();
    JButton btnLogin = new JButton();
    JButton btnClear = new JButton();

    private void initComponents() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        //setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("frmLogin"); // NOI18N
        setResizable(false);

        lblUsername.setText("Username :");
        lblPassword.setText("Password :");
        btnLogin.setText("Login");
        btnClear.setText("Clear");

        GroupLayout pnlLoginLayout = new GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
                pnlLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnlLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblPassword, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblUsername, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(btnLogin)
                                .addComponent(btnClear))
                        .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlLoginLayout.setVerticalGroup(
                pnlLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlLoginLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lblUsername, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnLogin))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlLoginLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPassword, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnClear))
                        .addGap(19, 19, 19))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(pnlLogin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(pnlLogin, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleName("frmLogin");

        pack();
        setLocationRelativeTo(null);
    }

    public void clearText() {
        txtUsername.setText("");
        txtPassword.setText("");
    }

    public void loginChecker() {

        String dtaUID = txtUsername.getText();
        String searchedId = dtaUID;
        int row = -1;//index of row or -1 if not found

        //search for the row based on the ID in the first column
        for (int i = 0; i < a.dtaUsers.getRowCount(); ++i) {
            if (a.dtaUsers.getValueAt(i, 0).equals(searchedId)) {
                row = i;
                break;
            }
        }

        if (row != -1) {
            String UID = String.valueOf(a.dtaUsers.getValueAt(row, 0));
            String UP = String.valueOf(a.dtaUsers.getValueAt(row, 1));
            String UType = String.valueOf(a.dtaUsers.getValueAt(row, 5));
            
            
            if (txtPassword.getText().equals(UP)){
                System.out.println("login successful");
                LibSys x = new LibSys();
         x.setVisible(true);
         this.setVisible(false);
                
            }else{
                System.out.println("wrong password");
                JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again.", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            System.out.println("not found");

        }

        /*if (txtUsername.getText().equals("admin") && txtPassword.getText().equals("admin")) {
         LibSys x = new LibSys();
         x.setVisible(true);
         this.setVisible(false);
         } else {
         JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again.", "Login Failed", JOptionPane.ERROR_MESSAGE);
         }*/
    }

    public void nimbus(){
        
        try {
            javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels=javax.swing.UIManager.getInstalledLookAndFeels();
            for (int idx=0; idx<installedLookAndFeels.length; idx++)
                if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
                    javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
                    break;
                }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginSys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginSys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginSys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginSys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginSys().setVisible(true);
            }
        });
        
        
    }
    
    
    
    public LoginSys() {
        initComponents();
        adminActionListener();
        //nimbus();
    }

    public void adminActionListener() {
        btnLogin.addActionListener(this);
        btnClear.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnLogin) {
            loginChecker();
        }
        if (ae.getSource() == btnClear) {
            clearText();
        }
    }

}
