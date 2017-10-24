package JackPatRuss;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class LibSys extends JFrame implements ActionListener {

    String checker = "off";
    String BN, BT, BA, BY, BooksAvail;

    ArrayDB a = new ArrayDB();

    JPanel pnlBooks = new JPanel();
    JScrollPane scrPanelBookList = new JScrollPane();

    JPanel pnlBookDetails = new JPanel();
    JLabel lblBookNumber = new JLabel();
    JLabel lblBookTitle = new JLabel();
    JLabel lblBookAuthor = new JLabel();
    JLabel lblBookYear = new JLabel();
    JLabel lblBookAvailability = new JLabel();
    JTextField txtBookTitle = new JTextField();
    JTextField txtBookNumber = new JTextField();
    JComboBox cmbAvailable = new JComboBox();
    JTextField txtBookAuthor = new JTextField();
    JTextField txtBookYear = new JTextField();

    JButton btnAdd = new JButton();
    JButton btnExit = new JButton();
    JButton btnEdit = new JButton();
    JButton btnDelete = new JButton();

    JMenuBar mainBar = new JMenuBar();
    JMenu mnuFile = new JMenu();
    JMenuItem mnuSignout = new JMenuItem();
    JMenuItem mnuExit = new JMenuItem();
    JMenu mnuEdit = new JMenu();
    JMenuItem mnuUsers = new JMenuItem();
    JMenu mnuHelp = new JMenu();
    JMenuItem mnuAbout = new JMenuItem();

    JTable tblBooks = new JTable(a.dtaRec) {
        private static final long serialVersionUID = 1L;

        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    ;

    };

    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JACKPATRUSS Libray System");
        setResizable(false);

        pnlBooks.setBorder(BorderFactory.createTitledBorder("Books List"));
        scrPanelBookList.setViewportView(tblBooks);

        GroupLayout pnlBooksLayout = new GroupLayout(pnlBooks);
        pnlBooks.setLayout(pnlBooksLayout);
        pnlBooksLayout.setHorizontalGroup(
                pnlBooksLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(pnlBooksLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrPanelBookList)
                        .addContainerGap())
        );
        pnlBooksLayout.setVerticalGroup(
                pnlBooksLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(scrPanelBookList, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
        );
        pnlBookDetails.setBorder(BorderFactory.createTitledBorder("Book Details"));
        lblBookNumber.setText("Book Number :");
        lblBookTitle.setText("Title :");
        lblBookAuthor.setText("Author :");
        lblBookYear.setText("Year :");
        lblBookAvailability.setText("Availability :");
        cmbAvailable.setModel(new DefaultComboBoxModel(new String[]{"YES", "NO"}));
        btnAdd.setText("Add");
        btnExit.setText("Exit");
        btnEdit.setText("Edit");
        btnDelete.setText("Delete");

        GroupLayout pnlBookDetailsLayout = new GroupLayout(pnlBookDetails);
        pnlBookDetails.setLayout(pnlBookDetailsLayout);
        pnlBookDetailsLayout.setHorizontalGroup(
                pnlBookDetailsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(pnlBookDetailsLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnlBookDetailsLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addGroup(pnlBookDetailsLayout.createSequentialGroup()
                                        .addComponent(lblBookYear, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBookYear, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlBookDetailsLayout.createSequentialGroup()
                                        .addComponent(lblBookAuthor, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBookAuthor))
                                .addGroup(GroupLayout.Alignment.TRAILING, pnlBookDetailsLayout.createSequentialGroup()
                                        .addComponent(lblBookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBookTitle))
                                .addGroup(pnlBookDetailsLayout.createSequentialGroup()
                                        .addComponent(lblBookNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBookNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblBookAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(pnlBookDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))
        );
        pnlBookDetailsLayout.setVerticalGroup(
                pnlBookDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlBookDetailsLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(pnlBookDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlBookDetailsLayout.createSequentialGroup()
                                        .addComponent(btnAdd)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEdit)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDelete)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnExit))
                                .addGroup(pnlBookDetailsLayout.createSequentialGroup()
                                        .addGroup(pnlBookDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(lblBookNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtBookNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblBookAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cmbAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnlBookDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(lblBookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtBookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlBookDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(lblBookAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtBookAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnlBookDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(lblBookYear, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtBookYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(13, Short.MAX_VALUE))
        );

        mnuFile.setText("File");
        mnuExit.setText("Exit");
        mnuEdit.setText("Edit");
        mnuUsers.setText("Users");
        mnuHelp.setText("Help");
        mnuAbout.setText("About");
        mnuSignout.setText("Signout");
        mnuFile.add(mnuExit);
        mainBar.add(mnuFile);
        mainBar.add(mnuEdit);
        mainBar.add(mnuHelp);
        mnuHelp.add(mnuAbout);
        mnuEdit.add(mnuUsers);
       
        
        setJMenuBar(mainBar);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pnlBooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnlBookDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlBooks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlBookDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
        );

        pack();
        setLocationRelativeTo(null);
    }

    public LibSys() {
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
        mnuUsers.addActionListener(this);
        mnuSignout.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnAdd) {
            addBooks();
        }
        if (ae.getSource() == btnEdit) {
            editBooks();
        }
        if (ae.getSource() == btnDelete) {
            deleteBooks();
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
        if (ae.getSource() == mnuUsers) {
            UserMaintenance x = new UserMaintenance();
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
    
    
    public void deleteBooks() {

        if (btnDelete.getText().equals("Delete")) {
            int ans = JOptionPane.showConfirmDialog(null,
                    "Do you want to delete the record?", "Warning", JOptionPane.YES_NO_OPTION);
            if (ans == 0) {
                String searchedId = BN;
                int row = -1;//index of row or -1 if not found

                //search for the row based on the ID in the first column
                for (int i = 0; i < a.dtaRec.getRowCount(); ++i) {
                    if (a.dtaRec.getValueAt(i, 0).equals(searchedId)) {
                        row = i;
                        break;
                    }
                }

                if (row != -1) {

                    System.out.println("deleting...");
                    a.dtaRec.removeRow(row);
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

    public void enabledFalse() {

        checker = "off";
        txtBookNumber.setEnabled(false);
        txtBookTitle.setEnabled(false);
        txtBookAuthor.setEnabled(false);
        txtBookYear.setEnabled(false);
        cmbAvailable.setEnabled(false);
        btnDelete.setEnabled(false);
        btnAdd.setEnabled(true);
        btnExit.setEnabled(true);

    }

    public void enabledTrue() {

        checker = "on";
        txtBookNumber.setEnabled(true);
        txtBookTitle.setEnabled(true);
        txtBookAuthor.setEnabled(true);
        txtBookYear.setEnabled(true);
        cmbAvailable.setEnabled(true);

    }

    public void editBooks() {

        if (btnEdit.getText().equals("Edit")) {
            String IDCatcher = JOptionPane.showInputDialog("Please enter the BookNumber you want to edit");

            String searchedId = IDCatcher;
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
                btnEdit.setText("Update");
                btnAdd.setEnabled(false);
                btnExit.setEnabled(false);
                btnDelete.setEnabled(true);
                enabledTrue();
                System.out.println("BN: " + a.dtaRec.getValueAt(row, 0));
                System.out.println("BT: " + a.dtaRec.getValueAt(row, 1));
                System.out.println("BA: " + a.dtaRec.getValueAt(row, 2));
                System.out.println("BY: " + a.dtaRec.getValueAt(row, 3));
                System.out.println("Avail: " + a.dtaRec.getValueAt(row, 4));

                BN = String.valueOf(a.dtaRec.getValueAt(row, 0));
                BT = String.valueOf(a.dtaRec.getValueAt(row, 1));
                BA = String.valueOf(a.dtaRec.getValueAt(row, 2));
                BY = String.valueOf(a.dtaRec.getValueAt(row, 3));
                BooksAvail = String.valueOf(a.dtaRec.getValueAt(row, 4));

                txtBookNumber.setText(BN);
                txtBookTitle.setText(BT);
                txtBookAuthor.setText(BA);
                txtBookYear.setText(BY);
                cmbAvailable.setSelectedItem(BooksAvail);
            } else {
                JOptionPane.showMessageDialog(null,
                        "File not found!", "Invalid", JOptionPane.ERROR_MESSAGE);
            }
        } else if (btnEdit.getText().equals("Update")) {
            int ans = JOptionPane.showConfirmDialog(null,
                    "Would you like to update the record?", "Warning", JOptionPane.YES_NO_OPTION);
            if (ans == 0) {

                if (txtBookNumber.getText().equals("") || txtBookTitle.getText().equals("")
                        || txtBookAuthor.getText().equals("") || txtBookYear.getText().equals("")) {
                    JOptionPane.showMessageDialog(null,
                            "Please fillup the details first!", "Invalid", JOptionPane.ERROR_MESSAGE);
                } else {

                    String searchedId = BN;
                    int row = -1;//index of row or -1 if not found

                    //search for the row based on the ID in the first column
                    for (int i = 0; i < a.dtaRec.getRowCount(); ++i) {
                        if (a.dtaRec.getValueAt(i, 0).equals(searchedId)) {
                            row = i;
                            break;
                        }
                    }

                    if (row != -1) {
                        String dtaBN = txtBookNumber.getText();
                        String dtaBT = txtBookTitle.getText();
                        String dtaBA = txtBookAuthor.getText();
                        String dtaBY = txtBookYear.getText();
                        String dtaAvail = (String) cmbAvailable.getSelectedItem();

                        System.out.println("deleting...");
                        a.dtaRec.removeRow(row);
                        a.dtaRec.addRow(new Object[]{dtaBN, dtaBT, dtaBA, dtaBY, dtaAvail});
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

    public void clearText() {
        txtBookNumber.setText("");
        txtBookTitle.setText("");
        txtBookAuthor.setText("");
        txtBookYear.setText("");
    }

    public void addBooks() {

        if (btnAdd.getText().equals("Add")) {
            int ans = JOptionPane.showConfirmDialog(null,
                    "Do you want to add new record?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (ans == 0) {
                btnAdd.setText("Save");
                btnEdit.setText("Clear");
                btnDelete.setText("Cancel");
                btnDelete.setEnabled(true);
                 btnExit.setEnabled(false);
                enabledTrue();
            }
        } else {

            if (txtBookNumber.getText().equals("") || txtBookTitle.getText().equals("")
                    || txtBookAuthor.getText().equals("") || txtBookYear.getText().equals("")) {
                JOptionPane.showMessageDialog(null,
                        "Please fillup the details first!", "Invalid", JOptionPane.ERROR_MESSAGE);
            } else {
                String dtaBN = txtBookNumber.getText();
                String dtaBT = txtBookTitle.getText();
                String dtaBA = txtBookAuthor.getText();
                String dtaBY = txtBookYear.getText();
                String dtaAvail = (String) cmbAvailable.getSelectedItem();

                String searchedId = dtaBN;
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
                    JOptionPane.showMessageDialog(null,
                            "Cannot add same Book Number!", "Invalid", JOptionPane.ERROR_MESSAGE);

                } else {
                    System.out.println("not found");
                    a.dtaRec.addRow(new Object[]{dtaBN, dtaBT, dtaBA, dtaBY, dtaAvail});
                    JOptionPane.showMessageDialog(null, "Record Added!");
                    btnAdd.setText("Add");
                    btnEdit.setText("Edit");
                    btnDelete.setText("Delete");
                    enabledFalse();
                    clearText();
                }
            }
            System.out.println(a.dtaRec.getDataVector());

        }
    }
}
