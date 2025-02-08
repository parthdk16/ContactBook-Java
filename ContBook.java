/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package contactbook;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableRowSorter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PARTH KULKARNI
 */
public class ContBook extends javax.swing.JFrame {

    /**
     * Creates new form ContBook
     */
    private JList<String> contactList;
    private DefaultListModel<String> listModel;
    private JTextArea contactDetails;
    private JButton editButton;    
    private JButton manageGroupDataButton;    
    private JButton deleteButton;
    private JList<String> groupList;
    private DefaultListModel<String> groupListModel;
    private JButton addToGroupButton;
    private JButton removeFromGroupButton;
    private JTextField groupNameField;
    private List<String> contactsInGroup;
    private JButton manageGroupsButton;
    private List<String> groups;
    
    public ContBook() {
        initComponents();
        setupUI();
        setupSearchFunctionality(); // Call your custom method
        loadContactsIntoTable();
        loadContactsFromDatabase();
        groups = new ArrayList<>();
        setupGroupManagement();
        loadGroupsFromDatabase();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Contact Book");

        jTabbedPane3.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTabbedPane3ComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jTabbedPane3ComponentRemoved(evt);
            }
        });

        jLabel3.setText("First Name");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Last Name");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Company");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel6.setText("Title");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel7.setText("Phone");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel8.setText("Email");

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Save");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(256, 256, 256)
                            .addComponent(jButton1))
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6)
                            .addComponent(jTextField3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel9))
                .addGap(22, 22, 22))
        );

        jTabbedPane3.addTab("Create new contact", jPanel1);

        jLabel2.setText("Search");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Company", "Title", "Phone", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Search contact", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jTabbedPane3))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(273, 273, 273))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane3ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTabbedPane3ComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane3ComponentRemoved

    private void jTabbedPane3ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTabbedPane3ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane3ComponentAdded

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here
        String fname = jTextField2.getText();
        String lname = jTextField3.getText();
        String company = jTextField4.getText();
        String title = jTextField5.getText();
        String phone = jTextField6.getText();
        String email = jTextField7.getText();

        boolean hasErrors = false;

        if (fname.trim().isEmpty()) {
            jLabel3.setForeground(Color.RED);
            hasErrors = true;
        } else {
            jLabel3.setForeground(Color.BLACK);
        }
        
        if (lname.trim().isEmpty()) {
            jLabel4.setForeground(Color.RED);
            hasErrors = true;
        } else {
            jLabel4.setForeground(Color.BLACK);
        }

        if (phone.trim().isEmpty()) {
            jLabel7.setForeground(Color.RED);
            hasErrors = true;
        } else {
            jLabel7.setForeground(Color.BLACK);
        }

        if (hasErrors) {
            JOptionPane.showMessageDialog(this, "Fields marked red cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
            jLabel9.setForeground(Color.RED);
        } else {
            jLabel9.setText(""); // Clear error message
            System.out.println("Valid input: " + fname + ", " + phone);

            String url = "jdbc:mysql://localhost:3306/ContactStore";
            String user = "root";
            String password = "";

            String sql = "INSERT INTO contacts (first_name, last_name, phone, email, company, title) VALUES (?, ?, ?, ?, ?, ?)";

            try (Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement stmt = conn.prepareStatement(sql)) {

                stmt.setString(1, fname);
                stmt.setString(2, lname);
                stmt.setString(3, phone);
                stmt.setString(4, email);
                stmt.setString(5, company);
                stmt.setString(6, title);

                int rowsInserted = stmt.executeUpdate();
                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(this, "Contact saved successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    loadContactsFromDatabase();
                    loadContactsIntoTable();
                    jTextField2.setText("");
                    jTextField3.setText("");
                    jTextField4.setText("");
                    jTextField5.setText("");
                    jTextField6.setText("");
                    jTextField7.setText("");
                }

            } catch (SQLException e) {
                jLabel9.setText("Error saving contact: " + e.getMessage());
                jLabel9.setForeground(Color.RED);
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton1MousePressed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        String data = jTextField2.getText();
        if (data.trim().isEmpty()) {
            jLabel9.setText("Field cannot be empty!");
        } else {
            System.out.println("Valid input: " + data);
        }
    }//GEN-LAST:event_jTextField2ActionPerformed
    
    private void setupUI() {
        // Remove the existing components related to jTable1 and jPanel3
//        jTabbedPane3.remove(jPanel2); // Remove the search panel
//        jTabbedPane3.remove(jPanel3); // Remove the view contacts panel

        // Create a new panel for displaying contacts
        JPanel contactPanel = new JPanel(new BorderLayout());
        listModel = new DefaultListModel<>();
        contactList = new JList<>(listModel);
        contactList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        contactList.setFont(new java.awt.Font("Arial", Font.PLAIN, 18));

        contactDetails = new JTextArea();
        contactDetails.setEditable(false);
        contactDetails.setFont(new java.awt.Font("Arial", Font.PLAIN, 18));

        contactList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String selectedContact = contactList.getSelectedValue();
                    if (selectedContact != null) {
                        displayContactDetails(selectedContact);
                    }
                }
            }
        });

        contactPanel.add(new JScrollPane(contactList), BorderLayout.WEST);
        contactPanel.add(new JScrollPane(contactDetails), BorderLayout.CENTER);

        // Add the contact panel as a tab
        jTabbedPane3.addTab("View Contacts", contactPanel);

        // Create button panel for Edit and Delete buttons
        JPanel buttonPanel = new JPanel();
        editButton = new JButton("Edit");
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editSelectedContact();
            }
        });

        deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteSelectedContact();
            }
        });
        
        manageGroupDataButton = new JButton("Manage Group Data");
        manageGroupDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showManageGroupsDialog2();
            }
        });

        manageGroupsButton = new JButton("Manage Groups");
        manageGroupsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showManageGroupsDialog();
            }
        });
        
        JButton copyButton = new JButton("Copy Details");
        copyButton.addActionListener(e -> {
            String text = contactDetails.getText();
            if (!text.isEmpty()) {
                // Copy text to the clipboard
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                StringSelection stringSelection = new StringSelection(text);
                clipboard.setContents(stringSelection, null);

                JOptionPane.showMessageDialog(null, "Contact details copied to clipboard!");
            } else {
                JOptionPane.showMessageDialog(null, "No text to copy!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        });

        // Add buttons to the button panel
        buttonPanel.add(editButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(manageGroupsButton);
        buttonPanel.add(manageGroupDataButton);
        buttonPanel.add(copyButton);

        // Add the button panel at the bottom of the contact panel
        contactPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Create a new tab for managing groups
        JPanel groupManagementPanel = new JPanel(new BorderLayout());
        DefaultListModel<String> groupListModel = new DefaultListModel<>();
        JList<String> groupList = new JList<>(groupListModel);
        groupList.setPreferredSize(new Dimension(50, 200));
        groupList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Load existing groups into the list
        loadGroupsIntoListModel(groupListModel);

        // Create input fields for group name
        groupNameField = new JTextField();
        JButton createGroupButton = new JButton("Create Group");
        JButton updateGroupButton = new JButton("Update Group");
        JButton deleteGroupButton = new JButton("Delete Group");

        // Add action listeners for buttons for group management
        createGroupButton.addActionListener(e -> {
            String groupName = groupNameField.getText().trim();
            if (!groupName.isEmpty()) {
                createGroup(groupName);
                groupNameField.setText("");
                loadGroupsIntoListModel(groupListModel); // Refresh the list
            } else {
                JOptionPane.showMessageDialog(this, "Group name cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        updateGroupButton.addActionListener(e -> {
            String selectedGroup = groupList.getSelectedValue();
            if (selectedGroup != null) {
                String newGroupName = groupNameField.getText().trim();
                if (!newGroupName.isEmpty()) {
                    updateGroup(selectedGroup, newGroupName);
                    groupNameField.setText("");
                    loadGroupsIntoListModel(groupListModel); // Refresh the list
                } else {
                    JOptionPane.showMessageDialog(this, "New group name cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please select a group to update.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        deleteGroupButton.addActionListener(e -> {
            String selectedGroup = groupList.getSelectedValue();
            if (selectedGroup != null) {
                deleteGroup(selectedGroup);
                groupNameField.setText("");
                loadGroupsIntoListModel(groupListModel); // Refresh the list
            } else {
                JOptionPane.showMessageDialog(this, "Please select a group to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Add components to the group management panel
        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(new JLabel("Group Name:"), BorderLayout.NORTH);
        groupNameField.setPreferredSize(new Dimension(200, 30));
        inputPanel.add(groupNameField, BorderLayout.CENTER);

        JPanel groupButtonPanel = new JPanel();
        groupButtonPanel.add(createGroupButton);
        groupButtonPanel.add(updateGroupButton);
        groupButtonPanel.add(deleteGroupButton);

        groupManagementPanel.add(new JScrollPane(groupList), BorderLayout.WEST);
        groupManagementPanel.add(inputPanel, BorderLayout.CENTER);
        groupManagementPanel.add(groupButtonPanel, BorderLayout.SOUTH);

        // Add the group management panel to the tabbed pane
        jTabbedPane3.addTab("Manage Groups", groupManagementPanel);
    }
    
    // Inside your ContBook class, after initializing jTable1
private void setupSearchFunctionality() {
    // Create a TableRowSorter for the jTable1
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>((DefaultTableModel) jTable1.getModel());
    jTable1.setRowSorter(sorter);

    // Add a DocumentListener to jTextField1
    jTextField1.getDocument().addDocumentListener(new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            searchContacts();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            searchContacts();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            searchContacts();
        }

        private void searchContacts() {
            String searchText = jTextField1.getText().trim();
            if (searchText.length() == 0) {
                // If the search text is empty, show all rows
                sorter.setRowFilter(null);
            } else {
                // Create a RowFilter to filter the table based on the search text
                sorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchText)); // Case insensitive search
            }
        }
    });
}
    
    private void createGroup(String groupName) {
        String url = "jdbc:mysql://localhost:3306/ContactStore";
        String user = "root";
        String password = "";

        String sql = "INSERT INTO groups (group_name) VALUES (?)";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, groupName);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Group created successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error creating group: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateGroup(String oldGroupName, String newGroupName) {
        String url = "jdbc:mysql://localhost:3306/ContactStore";
        String user = "root";
        String password = "";

        String sql = "UPDATE groups SET group_name = ? WHERE group_name = ?";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, newGroupName);
            stmt.setString(2, oldGroupName);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Group updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No group found with the name: " + oldGroupName, "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error updating group: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteGroup(String groupName) {
        String url = "jdbc:mysql://localhost:3306/ContactStore";
        String user = "root";
        String password = "";

        String sql = "DELETE FROM groups WHERE group_name = ?";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, groupName);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Group deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No group found with the name: " + groupName, "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error deleting group: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private int getGroupId(String group) {
        String url = "jdbc:mysql://localhost:3306/ContactStore";
        String user = "root";
        String password = "";
        String sql = "SELECT group_id FROM groups WHERE group_name = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, group);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("group_id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1; // Return -1 if not found
    }

    private int getContactId(String contact) {
        String url = "jdbc:mysql://localhost:3306/ContactStore";
        String user = "root";
        String password = "";
        String sql = "SELECT contact_id FROM contacts WHERE CONCAT(first_name, ' ', last_name) = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, contact);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("contact_id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1; // Return -1 if not found
    }
    
    private List<String> getContactsInGroup(String groupName) {
    List<String> contacts = new ArrayList<>();
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;

    try {
        // Establish a connection to the database
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ContactStore", "root", "");

        // Query to fetch contacts associated with the given group
        String query = "SELECT c.first_name, c.last_name FROM contacts c " +
                       "JOIN group_contacts cg ON c.contact_id = cg.contact_id " +
                       "JOIN groups g ON cg.group_id = g.group_id " +
                       "WHERE g.group_name = ?";
        statement = connection.prepareStatement(query);
        statement.setString(1, groupName);

        resultSet = statement.executeQuery();

        // Process the result set
        while (resultSet.next()) {
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            contacts.add(firstName + " " + lastName);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error fetching contacts for the group: " + e.getMessage(),
                "Database Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    return contacts;
}
    
    private void showManageGroupsDialog2() {

    // Create a dialog for group management
    JDialog groupDialog = new JDialog(this, "Manage Groups", true);
    groupDialog.setLayout(new BorderLayout());

    // Left: Group list
    DefaultListModel<String> groupListModel = new DefaultListModel<>();
    JList<String> groupList = new JList<>(groupListModel);
    groupList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    loadGroupsIntoListModel(groupListModel);

    JScrollPane groupListScrollPane = new JScrollPane(groupList);
    groupListScrollPane.setPreferredSize(new Dimension(150, 300)); // Increase width for group list

    // Top-right: Text box for group name
    JPanel topPanel = new JPanel(new BorderLayout());
    JLabel groupNameLabel = new JLabel("Group Name:");
    JTextField groupNameTextField = new JTextField();
    topPanel.add(groupNameLabel, BorderLayout.WEST);
    topPanel.add(groupNameTextField, BorderLayout.CENTER);
    topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

    // Bottom-right: Contacts in the selected group
    DefaultListModel<String> contactListModel = new DefaultListModel<>();
    JList<String> contactList = new JList<>(contactListModel);
    JScrollPane contactListScrollPane = new JScrollPane(contactList);

    groupList.addListSelectionListener(e -> {
        if (!e.getValueIsAdjusting()) {
            contactListModel.clear(); // Clear existing data
            String selectedGroup = groupList.getSelectedValue();
            if (selectedGroup != null) {
                List<String> groupContacts = getContactsInGroup(selectedGroup); // Fetch contacts for the group
                for (String contact : groupContacts) {
                    contactListModel.addElement(contact);
                }
            }
        }
    });

    // Combine text box and contacts display
    JPanel rightPanel = new JPanel(new BorderLayout());
    rightPanel.add(topPanel, BorderLayout.NORTH);
    rightPanel.add(contactListScrollPane, BorderLayout.CENTER);

    // Main layout: Left (Group list) and Right (Text box + Contacts)
    JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, groupListScrollPane, rightPanel);
    splitPane.setDividerLocation(150); // Set initial divider position

    groupDialog.add(splitPane, BorderLayout.CENTER);

    // Bottom: Buttons
    JPanel buttonPanel = new JPanel();
    JButton createGroupButton = new JButton("Create Group");
    JButton updateGroupButton = new JButton("Update Group");
    JButton deleteGroupButton = new JButton("Delete Group");

    createGroupButton.addActionListener(e -> {
        String groupName = groupNameTextField.getText().trim();
        if (!groupName.isEmpty() && !groupListModel.contains(groupName)) {
            groupListModel.addElement(groupName);
            createGroup(groupName); // Add group to database
        }
    });

    updateGroupButton.addActionListener(e -> {
        String groupName = groupNameTextField.getText().trim();
        String selectedGroup = groupList.getSelectedValue();
        if (selectedGroup != null && !groupName.isEmpty()) {
            updateGroup(selectedGroup, groupName); // Update group in database
            groupListModel.set(groupList.getSelectedIndex(), groupName);
        }
    });

    deleteGroupButton.addActionListener(e -> {
        String selectedGroup = groupList.getSelectedValue();
        if (selectedGroup != null) {
            deleteGroup(selectedGroup); // Remove group from database
            groupListModel.removeElement(selectedGroup);
        }
    });

    buttonPanel.add(createGroupButton);
    buttonPanel.add(updateGroupButton);
    buttonPanel.add(deleteGroupButton);

    groupDialog.add(buttonPanel, BorderLayout.SOUTH);
    groupDialog.setSize(600, 400);
    groupDialog.setLocationRelativeTo(this);
    groupDialog.setVisible(true);
}
    
    private void showManageGroupsDialog() {
        String selectedContact = contactList.getSelectedValue();
        if (selectedContact == null) {
            JOptionPane.showMessageDialog(this, "Please select a contact to manage groups.", "No Contact Selected", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Split contact name to retrieve first and last names
        String[] nameParts = selectedContact.split(" ");
        if (nameParts.length < 2) {
            JOptionPane.showMessageDialog(this, "Selected contact does not have a valid name.", "Invalid Contact", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String firstName = nameParts[0];
        String lastName = nameParts[1];

        // Create a dialog for group management
        JDialog groupDialog = new JDialog(this, "Manage Groups", true);
        groupDialog.setLayout(new BorderLayout());

        // Create the JList to display the groups
        DefaultListModel<String> groupListModel = new DefaultListModel<>();
        JList<String> groupList = new JList<>(groupListModel);
        groupList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        loadGroupsIntoListModel(groupListModel); // Load all groups into the model

        // Check which groups the selected contact belongs to and preselect them
        List<String> contactGroups = getContactGroups(selectedContact); // Retrieve groups for the contact
        for (String group : contactGroups) {
            if (groupListModel.contains(group)) {
                groupList.setSelectedValue(group, true); // Preselect the groups
            }
        }

        // Add a listener to handle selection changes
        groupList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                List<String> selectedGroups = groupList.getSelectedValuesList();

                // Iterate through all groups and manage the contact's membership
                for (int i = 0; i < groupListModel.size(); i++) {
                    String groupName = groupListModel.getElementAt(i);
                    if (selectedGroups.contains(groupName)) {
                        // If selected, ensure the contact is added to the group
                        if (!contactGroups.contains(groupName)) {
                            addContactToGroup(selectedContact, groupName);
                            contactGroups.add(groupName); // Update local list of contact groups
                        }
                    } else {
                        // If deselected, ensure the contact is removed from the group
                        if (contactGroups.contains(groupName)) {
                            removeContactFromGroup(selectedContact, groupName);
                            contactGroups.remove(groupName); // Update local list of contact groups
                        }
                    }
                }
            }
        });

        groupDialog.add(new JScrollPane(groupList), BorderLayout.CENTER);

        JButton okButton = new JButton("OK");
        okButton.addActionListener(e -> groupDialog.dispose());

        groupDialog.add(okButton, BorderLayout.SOUTH);
        groupDialog.setSize(300, 200);
        groupDialog.setLocationRelativeTo(this);
        groupDialog.setVisible(true);
    }
    
    private void loadGroupsIntoListModel(DefaultListModel<String> model) {
        model.clear();
        String url = "jdbc:mysql://localhost:3306/ContactStore";
        String user = "root";
        String password = "";

        String sql = "SELECT group_name FROM groups";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                model.addElement(rs.getString("group_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error loading groups: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    private List<String> getContactGroups(String contact) {
        List<String> contactGroups = new ArrayList<>();
        String url = "jdbc:mysql://localhost:3306/ContactStore";
        String user = "root";
        String password = "";

        String sql = "SELECT g.group_name FROM groups g " +
                     "JOIN group_contacts gc ON g.group_id = gc.group_id " +
                     "JOIN contacts c ON c.contact_id = gc.contact_id " +
                     "WHERE CONCAT(c.first_name, ' ', c.last_name) = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, contact );
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    contactGroups.add(rs.getString("group_name"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error fetching contact groups: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return contactGroups;
    }

    private void removeContactFromGroup(String contact, String group) {
        String url = "jdbc:mysql://localhost:3306/ContactStore";
        String user = "root";
        String password = "";

        String sql = "DELETE FROM group_contacts WHERE contact_id = ? AND group_id = ?";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            int contactId = getContactId(contact);
            int groupId = getGroupId(group);

            stmt.setInt(1, contactId);
            stmt.setInt(2, groupId);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Contact removed from group successfully.");
            } else {
                System.out.println("No rows affected. Contact may not have been removed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error removing contact from group: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void loadGroupsFromDatabase() {
        groups.clear(); // Clear the list to avoid duplicates
        String url = "jdbc:mysql://localhost:3306/ContactStore";
        String user = "root";
        String password = "";

        String sql = "SELECT group_name FROM groups"; // Ensure this matches your table structure
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                groups.add(rs.getString("group_name")); // Ensure this column exists
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error loading groups: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void addContactToGroup(String contact, String group) {
    String url = "jdbc:mysql://localhost:3306/ContactStore";
    String user = "root";
    String password = "";

    // First, check if the contact is already in the group
    if (isContactInGroup(contact, group)) {
        JOptionPane.showMessageDialog(this, "Contact is already in the group: " + group, "Info", JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    String sql = "INSERT INTO group_contacts (group_id, contact_id) VALUES (?, ?)";
    try (Connection conn = DriverManager.getConnection(url, user, password);
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        
        // Retrieve the group_id and contact_id based on the group name and contact name
        int groupId = getGroupId(group);
        int contactId = getContactId(contact);
        
        stmt.setInt(1, groupId);
        stmt.setInt(2, contactId);
        
        int rowsAffected = stmt.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Contact added to group successfully.");
            JOptionPane.showMessageDialog(this, "Contact added to group successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            
        } else {
            System.out.println("No rows affected. Contact may not have been added.");
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Log the exception
        JOptionPane.showMessageDialog(this, "Error adding contact to group: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private boolean isContactInGroup(String contact, String group) {
    String url = "jdbc:mysql://localhost:3306/ContactStore";
    String user = "root";
    String password = "";

    String sql = "SELECT COUNT(*) FROM group_contacts gc " +
                 "JOIN groups g ON gc.group_id = g.group_id " +
                 "JOIN contacts c ON gc.contact_id = c.contact_id " +
                 "WHERE g.group_name = ? AND CONCAT(c.first_name, ' ', c.last_name) = ?";
    
    try (Connection conn = DriverManager.getConnection(url, user, password);
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, group);
        stmt.setString(2, contact);
        
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            return rs.getInt(1) > 0; // Return true if count is greater than 0
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}

    private void loadContactsFromDatabase() {
        String url = "jdbc:mysql://localhost:3306/ContactStore";
        String user = "root";
        String password = "";

        String sql = "SELECT first_name, last_name FROM contacts";
        System.out.println("Started...");
        
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            listModel.clear();

            while (rs.next()) {
                String name = rs.getString("first_name") + " " + rs.getString("last_name");
                if(!name.trim().equals(""))
                listModel.addElement(name);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            jLabel9.setText("Error loading contacts: " + e.getMessage());
            jLabel9.setForeground(Color.RED);
        }
    }
    
    private void loadContactsIntoTable() {
        String url = "jdbc:mysql://localhost:3306/ContactStore"; // Update with your database URL
        String user = "root"; // Update with your database username
        String password = ""; // Update with your database password

        String sql = "SELECT CONCAT(first_name, ' ', last_name) AS Name, company, title, phone, email FROM contacts";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
            tableModel.setRowCount(0); // Clear existing rows

            while (rs.next()) {
                String name = rs.getString("Name");
                String company = rs.getString("company");
                String title = rs.getString("title");
                String phone = rs.getString("phone");
                String email = rs.getString("email");

                // Add a new row to the table model
                tableModel.addRow(new Object[]{name, company, title, phone, email});
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error loading contacts: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void displayContactDetails(String contactName) {
        String url = "jdbc:mysql://localhost:3306/ContactStore";
        String user = "root";
        String password = "";

        String sql = "SELECT company, title, phone, email FROM contacts WHERE CONCAT(first_name, ' ', last_name) = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, contactName);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String company = rs.getString("company");
                String title = rs.getString("title");
                String phone = rs.getString("phone");
                String email = rs.getString("email");

                // Display all details in the JTextArea
                contactDetails.setText("Name:       " + contactName + "\n");

                if (!company.equals(""))
                    contactDetails.append("Company: " + company + "\n");

                if (!title.equals(""))
                    contactDetails.append("Title:          " + title + "\n");

                if (!phone.equals(""))
                    contactDetails.append("Phone:      " + phone + "\n");

                if (!email.equals(""))
                    contactDetails.append("Email:        " + email + "\n");
            } else {
                contactDetails.setText("No details found for: " + contactName);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            contactDetails.setText("Error fetching details: " + e.getMessage());
        }

        // Add a "Copy Text" button
        JButton copyButton = new JButton("Copy Details");
        copyButton.addActionListener(e -> {
            String text = contactDetails.getText();
            if (!text.isEmpty()) {
                // Copy text to the clipboard
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                StringSelection stringSelection = new StringSelection(text);
                clipboard.setContents(stringSelection, null);

                JOptionPane.showMessageDialog(null, "Contact details copied to clipboard!");
            } else {
                JOptionPane.showMessageDialog(null, "No text to copy!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        });
    }
    
    private void editSelectedContact() {
        String selectedContact = contactList.getSelectedValue();
        if (selectedContact == null) {
            JOptionPane.showMessageDialog(this, "Please select a contact to edit.", "No Contact Selected", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String[] nameParts = selectedContact.split(" ");

        // Check if we have at least two parts (first name and last name)
        if (nameParts.length < 2) {
            JOptionPane.showMessageDialog(this, "Selected contact does not have a valid name.", "Invalid Contact", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String firstName = nameParts[0];
        String lastName = nameParts[1];

        // Fetch existing details from the database
        String[] contactDetails = getContactDetails(firstName, lastName);
        if (contactDetails == null) {
            JOptionPane.showMessageDialog(this, "Contact details not found.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Create a dialog for editing contact
        JDialog editDialog = new JDialog(this, "Edit Contact", true);
        editDialog.setLayout(new GridLayout(7, 2)); // 6 rows, 2 columns

        JTextField txtFirstName = new JTextField(contactDetails[0]);
        JTextField txtLastName = new JTextField(contactDetails[1]);
        JTextField txtCompany = new JTextField(contactDetails[2]);
        JTextField txtTitle = new JTextField(contactDetails[3]);
        JTextField txtPhone = new JTextField(contactDetails[4]);
        JTextField txtEmail = new JTextField(contactDetails[5]);

        editDialog.add(new JLabel("First Name:"));
        editDialog.add(txtFirstName);
        editDialog.add(new JLabel("Last Name:"));
        editDialog.add(txtLastName);
        editDialog.add(new JLabel("Company:"));
        editDialog.add(txtCompany);
        editDialog.add(new JLabel("Title:"));
        editDialog.add(txtTitle);
        editDialog.add(new JLabel("Phone:"));
        editDialog.add(txtPhone);
        editDialog.add(new JLabel("Email:"));
        editDialog.add(txtEmail);

        JButton updateButton = new JButton("Update");
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateContact(firstName, lastName, txtFirstName.getText(), txtLastName.getText(), txtCompany.getText(), txtTitle.getText(), txtPhone.getText(), txtEmail.getText());
                editDialog.dispose();
            }
        });

        // Add the update button to the dialog
        editDialog.add(updateButton);
        editDialog.pack(); // Adjust the size to fit the content
        editDialog.setLocationRelativeTo(this);
        editDialog.setVisible(true);
    }

    
    private void updateContact(String oldFirstName, String oldLastName, String newFirstName, String newLastName, String company, String title, String phone, String email) {
        String url = "jdbc:mysql://localhost:3306/ContactStore";
        String user = "root";
        String password = "";

        String sql = "UPDATE contacts SET first_name = ?, last_name = ?, company = ?, title = ?, phone = ?, email = ? WHERE first_name = ? AND last_name = ?";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, newFirstName);
            stmt.setString(2, newLastName);
            stmt.setString(3, company);
            stmt.setString(4, title);
            stmt.setString(5, phone);
            stmt.setString(6, email);
            stmt.setString(7, oldFirstName);
            stmt.setString(8, oldLastName);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Contact updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            loadContactsFromDatabase();
            loadContactsIntoTable();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error updating contact.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private String[] getContactDetails(String firstName, String lastName) {
        String url = "jdbc:mysql://localhost:3306/ContactStore";
        String user = "root";
        String password = "";

        String sql = "SELECT company, title, phone, email FROM contacts WHERE first_name = ? AND last_name = ?";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new String[]{
                    firstName,
                    lastName,
                    rs.getString("company"),
                    rs.getString("title"),
                    rs.getString("phone"),
                    rs.getString("email")
                };
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; // Return null if no contact is found
    }
    
    private void deleteSelectedContact() {
        String selectedContact = contactList.getSelectedValue();
        if (selectedContact == null) {
            JOptionPane.showMessageDialog(this, "Please select a contact to delete.", "No Contact Selected", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String[] nameParts = selectedContact.split(" ");

        // Check if we have at least two parts (first name and last name)
        if (nameParts.length < 2) {
            JOptionPane.showMessageDialog(this, "Selected contact does not have a valid name.", "Invalid Contact", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String firstName = nameParts[0];
        String lastName = nameParts[1];

        // Confirm deletion
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this contact?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            // Proceed with deletion
            String url = "jdbc:mysql://localhost:3306/ContactStore";
            String user = "root";
            String password = "";

            String sql = "DELETE FROM contacts WHERE first_name = ? AND last_name = ?";
            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, firstName);
                stmt.setString(2, lastName);
                stmt.executeUpdate();
                contactDetails.setText("");
                JOptionPane.showMessageDialog(this, "Contact deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                loadContactsFromDatabase(); // Refresh the contact list
                loadContactsIntoTable();
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error deleting contact.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void setupGroupManagement() {
        JPanel groupPanel = new JPanel(new BorderLayout());
        groupListModel = new DefaultListModel<>();
        groupList = new JList<>(groupListModel);
        groupList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Load existing groups into the list
        loadGroupsIntoListModel(groupListModel);

        // Create input fields for group name
        groupNameField = new JTextField();

        // Create buttons for group management
        JButton createGroupButton = new JButton("Create Group");
        JButton updateGroupButton = new JButton("Update Group");
        JButton deleteGroupButton = new JButton("Delete Group");

        // Action listeners for buttons
        createGroupButton.addActionListener(e -> {
            String groupName = groupNameField.getText().trim();
            System.out.println("GroupName; " + groupName);
            if (!groupName.isEmpty()) {
                createGroup(groupName);
                groupNameField.setText("");
                loadGroupsIntoListModel(groupListModel); // Refresh the list
                JOptionPane.showMessageDialog(this, "Group created successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                System.out.println("This happened");
                JOptionPane.showMessageDialog(this, "Group name cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        updateGroupButton.addActionListener(e -> {
            String selectedGroup = groupList.getSelectedValue();
            if (selectedGroup != null) {
                String newGroupName = groupNameField.getText().trim();
                if (!newGroupName.isEmpty()) {
                    updateGroup(selectedGroup, newGroupName);
                    groupNameField.setText("");
                    loadGroupsIntoListModel(groupListModel); // Refresh the list
                } else {
                    JOptionPane.showMessageDialog(this, "New group name cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please select a group to update.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        deleteGroupButton.addActionListener(e -> {
            String selectedGroup = groupList.getSelectedValue();
            if (selectedGroup != null) {
                deleteGroup(selectedGroup);
                groupNameField.setText("");
                loadGroupsIntoListModel(groupListModel); // Refresh the list
            } else {
                JOptionPane.showMessageDialog(this, "Please select a group to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Adding components to the group management panel
        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(new JLabel("Group Name"), BorderLayout.NORTH);
        inputPanel.add(groupNameField, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(createGroupButton);
        buttonPanel.add(updateGroupButton);
        buttonPanel.add(deleteGroupButton);

        groupPanel.add(new JScrollPane(groupList), BorderLayout.WEST);
        groupPanel.add(inputPanel, BorderLayout.CENTER);
        groupPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Add the group management panel to the tabbed pane
//        jTabbedPane3.addTab("Manage Groups", groupPanel);
    }
    
    
     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ContBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}