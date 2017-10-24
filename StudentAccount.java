package JackPatRuss;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class StudentAccount extends JFrame implements ActionListener {

    String UserIDCatcher = "1210111";

    ArrayDB a = new ArrayDB();

    JPanel pnlAccount = new JPanel();
    JLabel lblFirstName = new JLabel();
    JLabel lblMiddleName = new JLabel();
    JLabel lblSurname = new JLabel();
    JLabel lblPassword = new JLabel();
    JTextField txtFirstname = new JTextField();
    JTextField txtMiddlename = new JTextField();
    JTextField txtSurname = new JTextField();
    JButton btnUpdate = new JButton();
    JButton btnExit = new JButton();
    JPasswordField txtPassword = new JPasswordField();
    JPanel pnlSearch = new JPanel();
    JButton btnSearch = new JButton();
    JComboBox cmbSearch = new JComboBox();
    JTextField txtSearch = new JTextField();
    JMenuBar mainBar = new JMenuBar();
    JMenu mnuFile = new JMenu();
    JMenuItem mnuSignout = new JMenuItem();
    JMenuItem mnuExit = new JMenuItem();
    JMenu mnuHelp = new JMenu();
    JMenuItem mnuAbout = new JMenuItem();

    private void initComponents() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("JACKPATRUSS Books Rental System");
        setResizable(false);

        pnlAccount.setBorder(BorderFactory.createTitledBorder("Account Details"));
        lblFirstName.setText("Firstname :");
        lblMiddleName.setText("Middlename :");
        lblSurname.setText("Surname :");
        lblPassword.setText("Password :");
        btnUpdate.setText("Update");
        btnExit.setText("Exit");

        GroupLayout pnlAccountLayout = new GroupLayout(pnlAccount);
        pnlAccount.setLayout(pnlAccountLayout);
        pnlAccountLayout.setHorizontalGroup(
                pnlAccountLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(pnlAccountLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlAccountLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addGroup(pnlAccountLayout.createSequentialGroup()
                                        .addComponent(lblMiddleName, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMiddlename, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlAccountLayout.createSequentialGroup()
                                        .addComponent(lblFirstName, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFirstname, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlAccountLayout.createSequentialGroup()
                                        .addComponent(lblSurname, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSurname, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlAccountLayout.createSequentialGroup()
                                        .addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPassword)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(pnlAccountLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnExit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdate, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36))
        );
        pnlAccountLayout.setVerticalGroup(
                pnlAccountLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(pnlAccountLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlAccountLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lblFirstName, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFirstname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlAccountLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lblMiddleName, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMiddlename, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnUpdate))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlAccountLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(pnlAccountLayout.createSequentialGroup()
                                        .addComponent(btnExit)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlAccountLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(pnlAccountLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblSurname, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSurname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(20, Short.MAX_VALUE))
        );

        pnlSearch.setBorder(BorderFactory.createTitledBorder("Search Books"));
        btnSearch.setText("Search Books by");
        cmbSearch.setModel(new DefaultComboBoxModel(new String[]{"Book Number", "Title"}));

        GroupLayout pnlSearchLayout = new GroupLayout(pnlSearch);
        pnlSearch.setLayout(pnlSearchLayout);
        pnlSearchLayout.setHorizontalGroup(
                pnlSearchLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(pnlSearchLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnSearch)
                        .addGap(18, 18, 18)
                        .addComponent(cmbSearch, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, pnlSearchLayout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearch, GroupLayout.PREFERRED_SIZE, 337, GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
        );
        pnlSearchLayout.setVerticalGroup(
                pnlSearchLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, pnlSearchLayout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlSearchLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSearch)
                                .addComponent(cmbSearch, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
        );

        mnuFile.setText("File");
        mnuSignout.setText("Signout");
        mnuFile.add(mnuSignout);
        mnuExit.setText("Exit");
        mnuFile.add(mnuExit);
        mainBar.add(mnuFile);
        mnuHelp.setText("Help");
        mnuAbout.setText("About");
        mnuHelp.add(mnuAbout);
        mainBar.add(mnuHelp);
        setJMenuBar(mainBar);

        javax.swing.GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(pnlAccount, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnlSearch, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlAccount, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    public StudentAccount() {
        initComponents();
        userActionListener();
        enabledFalse();
    }

    public void userActionListener() {
        btnSearch.addActionListener(this);
        btnUpdate.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnSearch) {
            searchBooks();
        }
        if (ae.getSource() == btnUpdate) {
            accountUpdate();
        }

    }

    public void enabledFalse() {
        txtFirstname.setEnabled(false);
        txtMiddlename.setEnabled(false);
        txtSurname.setEnabled(false);
        txtPassword.setEnabled(false);

    }

    public void enabledTrue() {
        txtFirstname.setEnabled(true);
        txtMiddlename.setEnabled(true);
        txtSurname.setEnabled(true);
        txtPassword.setEnabled(true);

    }

    public void accountUpdate() {

        if (btnUpdate.getText().equals("Update")) {
            int ans = JOptionPane.showConfirmDialog(null,
                    "Do you want to update your account?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (ans == 0) {

                String searchedId = UserIDCatcher;
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

                    String UP = String.valueOf(a.dtaUsers.getValueAt(row, 1));
                    String UFN = String.valueOf(a.dtaUsers.getValueAt(row, 2));
                    String UMN = String.valueOf(a.dtaUsers.getValueAt(row, 3));
                    String USN = String.valueOf(a.dtaUsers.getValueAt(row, 4));

                    txtPassword.setText(UP);
                    txtFirstname.setText(UFN);
                    txtMiddlename.setText(UMN);
                    txtSurname.setText(USN);

                    btnUpdate.setText("Save");
                    btnExit.setEnabled(false);
                    enabledTrue();
                } else {
                    System.out.println("not found");
                }
            } 
        }else {

                String dtaUP = txtPassword.getText();
                String dtaUFN = txtFirstname.getText();
                String dtaUMN = txtMiddlename.getText();
                String dtaUSN = txtSurname.getText();
                String dtaType = "User";
                String searchedId = UserIDCatcher;
                int row = -1;//index of row or -1 if not found

                //search for the row based on the ID in the first column
                for (int i = 0; i < a.dtaUsers.getRowCount(); ++i) {
                    if (a.dtaUsers.getValueAt(i, 0).equals(searchedId)) {
                        row = i;
                        break;
                    }
                }

                if (row != -1) {
                    System.out.println("Updating...");
                    a.dtaUsers.removeRow(row);
                        a.dtaUsers.addRow(new Object[]{UserIDCatcher, dtaUP, dtaUFN, dtaUMN, dtaUSN, dtaType});
                        btnUpdate.setText("Update");
                        btnExit.setEnabled(true);
                        JOptionPane.showMessageDialog(null, "Record Updated!");
                        enabledFalse();

                } else {
                    System.out.println("not found");

                }

            }
        System.out.println(a.dtaUsers.getDataVector());
    }

    

    public void searchBooks() {

        if (txtSearch.getText().equals("")) {
            JOptionPane.showMessageDialog(null,
                    "Please type first before you press search!", "Invalid", JOptionPane.ERROR_MESSAGE);
        } else {

            String searchType = (String) cmbSearch.getSelectedItem();
            String sBook = txtSearch.getText();

            if (searchType == "Book Number") {

                String searchedId = sBook;
                int row = -1;//index of row or -1 if not found

                //search for the row based on the ID in the first column
                for (int i = 0; i < a.dtaRec.getRowCount(); ++i) {
                    if (a.dtaRec.getValueAt(i, 0).equals(searchedId)) {
                        row = i;
                        break;
                    }
                }

                if (row != -1) {
                    System.out.println("found!");
                    JOptionPane.showMessageDialog(null, "The book is available. Please procced to the counter!",
                            "Found", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    System.out.println("not found");
                    JOptionPane.showMessageDialog(null, "The book is either unavailable or not found!",
                            "Not Found", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                String searchedId = sBook;
                int row = -1;//index of row or -1 if not found

                //search for the row based on the ID in the first column
                for (int i = 0; i < a.dtaRec.getRowCount(); ++i) {
                    if (a.dtaRec.getValueAt(i, 1).equals(searchedId)) {
                        row = i;
                        break;
                    }
                }

                if (row != -1) {
                    System.out.println("found!");
                    JOptionPane.showMessageDialog(null, "The book is available. Please procced to the counter!",
                            "Invalid", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    System.out.println("not found");
                    JOptionPane.showMessageDialog(null, "The book is either unavailable or not found!",
                            "Not Found", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
}
