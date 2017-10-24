package JackPatRuss;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class UserMaintenance extends JFrame implements ActionListener {

    String UID, UP, UFN, UMN, USN, UType;
    String checker = "off";

    ArrayDB a = new ArrayDB();

    JPanel pnlUserDB = new JPanel();
    JScrollPane scrPnlUser = new JScrollPane();
    JPanel pnlUserDetails = new JPanel();
    JLabel lblUserID = new JLabel();
    JLabel lblUserType = new JLabel();
    JLabel lblUserPassword = new JLabel();
    JLabel lblUserFirstName = new JLabel();
    JLabel lblUserSurname = new JLabel();
    JLabel lblUserMiddleName = new JLabel();
    JTextField txtUserID = new JTextField();
    JTextField txtUserFirstName = new JTextField();
    JTextField txtUserMiddleName = new JTextField();
    JTextField txtUserSurname = new JTextField();
    JComboBox cmbType = new JComboBox();
    JButton btnAdd = new JButton();
    JButton btnEdit = new JButton();
    JButton btnDelete = new JButton();
    JButton btnExit = new JButton();
    JPasswordField txtUserPassword = new JPasswordField();
    JMenuBar mainBar = new JMenuBar();
    JMenu mnuFile = new JMenu();
    JMenuItem mnuSignout = new JMenuItem();
    JMenuItem mnuExit = new JMenuItem();
    JMenu mnuEdit = new JMenu();
    JMenuItem mnuBooks = new JMenuItem();
    JMenu mnuHelp = new JMenu();
    JMenuItem mnuAbout = new JMenuItem();

    JTable tblUser = new JTable(a.dtaUsers) {
        private static final long serialVersionUID = 1L;

        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    ;

    };
    
    private void initComponents() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("JACKPATRUSS User Maintenance");
        setResizable(false);

        pnlUserDB.setBorder(BorderFactory.createTitledBorder("User Database"));
        scrPnlUser.setViewportView(tblUser);

        GroupLayout pnlUserDBLayout = new GroupLayout(pnlUserDB);
        pnlUserDB.setLayout(pnlUserDBLayout);
        pnlUserDBLayout.setHorizontalGroup(
                pnlUserDBLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(pnlUserDBLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrPnlUser)
                        .addContainerGap())
        );
        pnlUserDBLayout.setVerticalGroup(
                pnlUserDBLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(pnlUserDBLayout.createSequentialGroup()
                        .addComponent(scrPnlUser, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                        .addContainerGap())
        );

        pnlUserDetails.setBorder(BorderFactory.createTitledBorder("User Details"));
        lblUserID.setText("User ID :");
        lblUserType.setText("Type :");
        lblUserPassword.setText("Password :");
        lblUserFirstName.setText("Firstname :");
        lblUserSurname.setText("Surname :");
        lblUserMiddleName.setText("Middlename :");
        cmbType.setModel(new DefaultComboBoxModel(new String[]{"User", "Admin"}));
        btnAdd.setText("Add");
        btnEdit.setText("Edit");
        btnDelete.setText("Delete");
        btnExit.setText("Exit");

        GroupLayout pnlUserDetailsLayout = new GroupLayout(pnlUserDetails);
        pnlUserDetails.setLayout(pnlUserDetailsLayout);
        pnlUserDetailsLayout.setHorizontalGroup(
                pnlUserDetailsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(pnlUserDetailsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlUserDetailsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(pnlUserDetailsLayout.createSequentialGroup()
                                        .addComponent(lblUserFirstName, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtUserFirstName, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlUserDetailsLayout.createSequentialGroup()
                                        .addComponent(lblUserMiddleName, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtUserMiddleName, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlUserDetailsLayout.createSequentialGroup()
                                        .addComponent(lblUserSurname, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtUserSurname, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlUserDetailsLayout.createSequentialGroup()
                                        .addGroup(pnlUserDetailsLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(GroupLayout.Alignment.LEADING, pnlUserDetailsLayout.createSequentialGroup()
                                                        .addComponent(lblUserPassword, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtUserPassword))
                                                .addGroup(GroupLayout.Alignment.LEADING, pnlUserDetailsLayout.createSequentialGroup()
                                                        .addComponent(lblUserID, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtUserID, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(lblUserType, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbType, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(pnlUserDetailsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEdit, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
        );
        pnlUserDetailsLayout.setVerticalGroup(
                pnlUserDetailsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(pnlUserDetailsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlUserDetailsLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(pnlUserDetailsLayout.createSequentialGroup()
                                        .addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnEdit, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17)
                                        .addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlUserDetailsLayout.createSequentialGroup()
                                        .addGroup(pnlUserDetailsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(lblUserID, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblUserType, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtUserID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cmbType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnlUserDetailsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(lblUserPassword, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtUserPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlUserDetailsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(lblUserFirstName, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtUserFirstName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnlUserDetailsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(txtUserMiddleName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblUserMiddleName, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnlUserDetailsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(lblUserSurname, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtUserSurname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(22, Short.MAX_VALUE))
        );

        mnuFile.setText("File");
        mnuSignout.setText("Signout");
        mnuFile.add(mnuSignout);
        mnuExit.setText("Exit");
        mnuFile.add(mnuExit);
        mainBar.add(mnuFile);
        mnuEdit.setText("Edit");
        mnuBooks.setText("Books");
        mnuEdit.add(mnuBooks);
        mainBar.add(mnuEdit);
        mnuHelp.setText("Help");
        mnuAbout.setText("About");
        mnuHelp.add(mnuAbout);
        mainBar.add(mnuHelp);
        setJMenuBar(mainBar);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(pnlUserDB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(pnlUserDetails, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlUserDetails, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlUserDB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }

    public UserMaintenance() {
        initComponents();
        adminActionListener();
        enabledFalse();
    }

    public void adminActionListener() {
        btnAdd.addActionListener(this);
        btnEdit.addActionListener(this);
        btnDelete.addActionListener(this);
        btnExit.addActionListener(this);
        mnuExit.addActionListener(this);
        mnuAbout.addActionListener(this);
        mnuBooks.addActionListener(this);
        mnuSignout.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnAdd) {
            addUsers();
        }
        if (ae.getSource() == btnEdit) {
            editUsers();
        }
        if (ae.getSource() == btnDelete) {
            deleteUsers();
        }
        if (ae.getSource() == btnExit) {
            exit();
        }
        if (ae.getSource() == mnuExit) {
            exit();
        }
        if (ae.getSource() == mnuAbout) {
            aboutUs();
        }
        if (ae.getSource() == mnuBooks) {
            LibSys x = new LibSys();
            x.show();
            this.hide();
        }
        if (ae.getSource() == mnuSignout) {
            logOff();
        }
        
    }
    
     public void logOff(){
         int confirm = JOptionPane.showOptionDialog(null,
                "Do you want to signout?",
                "Confirmation", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (confirm == JOptionPane.YES_OPTION) {
           LoginSys x = new LoginSys();
           x.show();
           this.hide();
        }
    }
    
    
    

    public void exit(){
         int confirm = JOptionPane.showOptionDialog(null,
                "Do you want to close this application?",
                "Exit Confirmation", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
        
        
    }
    
    
    public void aboutUs(){
        JOptionPane.showMessageDialog(null, " This program is developed by : "
                + "\n John Patrick Mateo"
                + "\n Jacinto Serraon"
                + "\n Russel Cuevas"
                + "\n 2014 All Rights Reserved.",
                "About",JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    
    
    
    public void deleteUsers() {

        if (btnDelete.getText().equals("Delete")) {
            int ans = JOptionPane.showConfirmDialog(null,
                    "Do you want to delete the record?", "Warning", JOptionPane.YES_NO_OPTION);
            if (ans == 0) {
                String searchedId = UID;
                int row = -1;//index of row or -1 if not found

                //search for the row based on the ID in the first column
                for (int i = 0; i < a.dtaUsers.getRowCount(); ++i) {
                    if (a.dtaUsers.getValueAt(i, 0).equals(searchedId)) {
                        row = i;
                        break;
                    }
                }

                if (row != -1) {

                    System.out.println("deleting...");
                    a.dtaUsers.removeRow(row);
                    btnEdit.setText("Edit");
                    btnAdd.setEnabled(true);
                    btnExit.setEnabled(true);
                    JOptionPane.showMessageDialog(null, "Record Deleted!");
                    enabledFalse();
                    clearText();
                }
            }
        } else {
            btnAdd.setText("Add");
            btnEdit.setText("Edit");
            btnDelete.setText("Delete");
            clearText();
            enabledFalse();
        }

    }
    
    
    public void editUsers() {

        if (btnEdit.getText().equals("Edit")) {
            String IDCatcher = JOptionPane.showInputDialog("Please enter the ID Number you want to edit");

            String searchedId = IDCatcher;
            int row = -1;//index of row or -1 if not found

            //search for the row based on the ID in the first column
            for (int i = 0; i < a.dtaUsers.getRowCount(); ++i) {
                if (a.dtaUsers.getValueAt(i, 0).equals(searchedId)) {
                    row = i;
                    break;
                }
            }

            if (row != -1) {
                System.out.println("found!");
                btnEdit.setText("Update");
                btnAdd.setEnabled(false);
                btnExit.setEnabled(false);
                btnDelete.setEnabled(true);
                enabledTrue();
                System.out.println("UID: " + a.dtaUsers.getValueAt(row, 0));
                System.out.println("UP: " + a.dtaUsers.getValueAt(row, 1));
                System.out.println("UFN: " + a.dtaUsers.getValueAt(row, 2));
                System.out.println("UMN: " + a.dtaUsers.getValueAt(row, 3));
                System.out.println("USN: " + a.dtaUsers.getValueAt(row, 4));
                System.out.println("UType: " + a.dtaUsers.getValueAt(row, 5));

                UID = String.valueOf(a.dtaUsers.getValueAt(row, 0));
                UP = String.valueOf(a.dtaUsers.getValueAt(row, 1));
                UFN = String.valueOf(a.dtaUsers.getValueAt(row, 2));
                UMN = String.valueOf(a.dtaUsers.getValueAt(row, 3));
                USN = String.valueOf(a.dtaUsers.getValueAt(row, 4));
                UType = String.valueOf(a.dtaUsers.getValueAt(row, 5));

                txtUserID.setText(UID);
                txtUserPassword.setText(UP);
                txtUserFirstName.setText(UFN);
                txtUserMiddleName.setText(UMN);
                txtUserSurname.setText(USN);
                cmbType.setSelectedItem(UType);
            } else {
                JOptionPane.showMessageDialog(null,
                        "File not found!", "Invalid", JOptionPane.ERROR_MESSAGE);
            }
        } else if (btnEdit.getText().equals("Update")) {
            int ans = JOptionPane.showConfirmDialog(null,
                    "Would you like to update the record?", "Warning", JOptionPane.YES_NO_OPTION);
            if (ans == 0) {

                if (txtUserID.getText().equals("") || txtUserPassword.getText().equals("")
                        || txtUserFirstName.getText().equals("") || txtUserMiddleName.getText().equals("")
                        || txtUserSurname.getText().equals("")) {
                    JOptionPane.showMessageDialog(null,
                            "Please fillup the details first!", "Invalid", JOptionPane.ERROR_MESSAGE);
                } else {

                    String searchedId = UID;
                    int row = -1;//index of row or -1 if not found

                    //search for the row based on the ID in the first column
                    for (int i = 0; i < a.dtaUsers.getRowCount(); ++i) {
                        if (a.dtaUsers.getValueAt(i, 0).equals(searchedId)) {
                            row = i;
                            break;
                        }
                    }

                    if (row != -1) {

                        String dtaUID = txtUserID.getText();
                        String dtaUP = txtUserPassword.getText();
                        String dtaUFN = txtUserFirstName.getText();
                        String dtaUMN = txtUserMiddleName.getText();
                        String dtaUSN = txtUserSurname.getText();
                        String dtaType = (String) cmbType.getSelectedItem();

                        System.out.println("Updating...");
                        a.dtaUsers.removeRow(row);
                        a.dtaUsers.addRow(new Object[]{dtaUID, dtaUP, dtaUFN, dtaUMN, dtaUSN, dtaType});
                        btnEdit.setText("Edit");
                        btnAdd.setEnabled(true);
                        btnExit.setEnabled(true);
                        JOptionPane.showMessageDialog(null, "Record Updated!");
                        enabledFalse();
                        clearText();
                    }
                }
            }
        } else {
            clearText();
        }
    }

    public void addUsers() {

        if (btnAdd.getText().equals("Add")) {
            int ans = JOptionPane.showConfirmDialog(null,
                    "Do you want to new record?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (ans == 0) {
                btnAdd.setText("Save");
                btnEdit.setText("Clear");
                btnDelete.setText("Cancel");
                btnDelete.setEnabled(true);
                btnExit.setEnabled(false);
                enabledTrue();
            }
        } else {

            if (txtUserID.getText().equals("") || txtUserPassword.getText().equals("")
                    || txtUserFirstName.getText().equals("") || txtUserMiddleName.getText().equals("")
                    || txtUserSurname.getText().equals("")) {
                JOptionPane.showMessageDialog(null,
                        "Please fillup the details first!", "Invalid", JOptionPane.ERROR_MESSAGE);
            } else {

                String dtaUID = txtUserID.getText();
                String dtaUP = txtUserPassword.getText();
                String dtaUFN = txtUserFirstName.getText();
                String dtaUMN = txtUserMiddleName.getText();
                String dtaUSN = txtUserSurname.getText();
                String dtaType = (String) cmbType.getSelectedItem();

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
                    System.out.println("found!");
                    JOptionPane.showMessageDialog(null,
                            "Cannot add same ID Number!", "Invalid", JOptionPane.ERROR_MESSAGE);

                } else {
                    System.out.println("not found");
                    a.dtaUsers.addRow(new Object[]{dtaUID, dtaUP, dtaUFN, dtaUMN, dtaUSN, dtaType});
                    JOptionPane.showMessageDialog(null, "Record Added!");
                    btnAdd.setText("Add");
                    btnEdit.setText("Edit");
                    btnDelete.setText("Delete");
                    enabledFalse();
                    clearText();
                }
            }
            System.out.println(a.dtaUsers.getDataVector());

        }
    }

    public void clearText() {
        txtUserID.setText("");
        txtUserPassword.setText("");
        txtUserFirstName.setText("");
        txtUserMiddleName.setText("");
        txtUserSurname.setText("");
    }

    public void enabledFalse() {
        checker = "off";
        txtUserID.setEnabled(false);
        txtUserPassword.setEnabled(false);
        txtUserFirstName.setEnabled(false);
        txtUserMiddleName.setEnabled(false);
        txtUserSurname.setEnabled(false);
        cmbType.setEnabled(false);
        btnDelete.setEnabled(false);
        btnAdd.setEnabled(true);
        btnExit.setEnabled(true);
    }

    public void enabledTrue() {
        checker = "on";
        txtUserID.setEnabled(true);
        txtUserPassword.setEnabled(true);
        txtUserFirstName.setEnabled(true);
        txtUserMiddleName.setEnabled(true);
        txtUserSurname.setEnabled(true);
        cmbType.setEnabled(true);

    }

}
