/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Web_Development;


import Start_pages.Department;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SAAD COMMUNICATION
 */
public class Web_Development extends javax.swing.JFrame {
    Vector TableModel;
    DocumentListener documentListener;
    MediatorPatternDemow modelw;
    Controllerw controllerw;
    public Start_pages.Department mainView;
    Singleton_DesignPatternw singleton_object = Singleton_DesignPatternw.getInstance();
    TemplateDesignPatternw templatedesignobject= new RemoveRowMethodw();
    
    public Web_Development () {
        initComponents();
         Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 20 - this.getSize().width / 20, dim.height / 20 - this.getSize().height / 20);
                
        modelw = templatedesignobject.retriveFromDatabase("9528190","Shazmeen Rasheed ","Female","Master"," Manager","Islamabad","03301232498","ShazmeenRasheed104@gmail.com");
        singleton_object.updateWritingw(modelw,this);
        modelw = templatedesignobject.retriveFromDatabase("9528191","Ehsham Hussain","Male","Master","Assistant Manager","Quetta","03832741821","EhshamHussain168@gmail.com");
        singleton_object.updateWritingw(modelw,this);
        modelw = templatedesignobject.retriveFromDatabase("9528192","Erum Mahmood","Female","Bachelors","Executive Officer","Karachi","03324344512","ErumMahmood108@gmail.com");
        singleton_object.updateWritingw(modelw,this);
        modelw = templatedesignobject.retriveFromDatabase("9528193","Muhammad  Moiz","Male","Intermediate","Clerk","Multan","03344984112","Muhammad Moiz125@gmail.com");
        singleton_object.updateWritingw(modelw,this);
        modelw = templatedesignobject.retriveFromDatabase("9528194","Zaid Iqbal ","Male","Intermediate","Officer","Karachi","03338512743","ZaidIqbal132@gmail.com");
        singleton_object.updateWritingw(modelw,this);
        modelw = templatedesignobject.retriveFromDatabase("9528195","Abdul Rafay","Male","Undergrad","Coordinator","Peshawar","03378101478","AbdulRafay146@gmail.com");
        singleton_object.updateWritingw(modelw,this);
        modelw = templatedesignobject.retriveFromDatabase("9528196","Muhammad  Uzair","Male","Bachelors","Director","Quetta","03338438311","Muhammad Uzair113@gmail.com");
        singleton_object.updateWritingw(modelw,this);
        modelw = templatedesignobject.retriveFromDatabase("9528197","Mahum Habib","Female","Matric","Peon","Karachi","03302781594","MahumHabib159@gmail.com");
        singleton_object.updateWritingw(modelw,this);
        modelw = templatedesignobject.retriveFromDatabase("9528198","Uzair Ahmed","Male","Undergrad","Junior Officer","Karachi","03261813413","UzairAhmed138@gmail.com");
        singleton_object.updateWritingw(modelw,this);
        modelw = templatedesignobject.retriveFromDatabase("9528199","Taha Ahmed","Male","Matric","Senior officer","Multan","0300123846","TahaAhmed162@gmail.com");
        singleton_object.updateWritingw(modelw,this);
        modelw = templatedesignobject.retriveFromDatabase("9528200","Ahmed Hussain","Male","Bachelors","Administrator","Karachi","0333014768","Ahmed Hussain171@gmail.com");
        singleton_object.updateWritingw(modelw,this);
        
        TableModel = (Vector) ((DefaultTableModel) jTable1.getModel()).getDataVector().clone();
        addDocumentListener();

    }
    public void displayDataw(String Emp_ID, String Emp_Name, String Gender, String Qualification,
        String Designation, String Address, String Phone_Number, String Email) {

        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        Object[] row = {Emp_ID, Emp_Name, Gender, Qualification, Designation, Address, Phone_Number, Email};
        tableModel.addRow(row);
    }
    
     private void addDocumentListener() {
        documentListener = new DocumentListener() {
        public void changedUpdate(DocumentEvent documentEvent) {
            search();
        }
        public void insertUpdate(DocumentEvent documentEvent) {
            search();
        }
        public void removeUpdate(DocumentEvent documentEvent) {
            search();
        }
        private void search() {
            searchTableContents(jTextField1.getText());
        }
         };
        jCheckBox1.setSelected(true);
    }
    public void searchTableContents(String searchString) {
    DefaultTableModel currtableModel = (DefaultTableModel) jTable1.getModel();
    //To empty the table before search
    currtableModel.setRowCount(0);
    //To search for contents from original table content
    for (Object rows : TableModel) {
        Vector rowVector = (Vector) rows;
        for (Object column : rowVector) {
            if (column.toString().contains(searchString)) {
                //content found so adding to table
                currtableModel.addRow(rowVector);
                break;
            }
        }
    }
} 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Heading = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        Qualification = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        Phone = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Designation = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Id = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        qulification = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        designation = new javax.swing.JTextField();
        Remove = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Search = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        Exit = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        Heading.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        Heading.setForeground(new java.awt.Color(255, 255, 255));
        Heading.setText("WEB DEVELOPMENT");
        jPanel1.add(Heading);
        Heading.setBounds(320, 20, 430, 40);

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back (1).jpg"))); // NOI18N
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(10, 590, 50, 50);

        Qualification.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Qualification.setForeground(new java.awt.Color(255, 255, 255));
        Qualification.setText("Qualification");
        jPanel1.add(Qualification);
        Qualification.setBounds(10, 110, 120, 40);

        Gender.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Gender.setForeground(new java.awt.Color(255, 255, 255));
        Gender.setText("Gender");
        jPanel1.add(Gender);
        Gender.setBounds(710, 80, 57, 21);

        Phone.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Phone.setForeground(new java.awt.Color(255, 255, 255));
        Phone.setText("Phone_Number");
        jPanel1.add(Phone);
        Phone.setBounds(10, 160, 121, 21);

        Address.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Address.setForeground(new java.awt.Color(255, 255, 255));
        Address.setText("Address");
        jPanel1.add(Address);
        Address.setBounds(710, 120, 80, 30);

        Email.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Email.setForeground(new java.awt.Color(255, 255, 255));
        Email.setText("Email");
        jPanel1.add(Email);
        Email.setBounds(370, 150, 80, 24);

        Designation.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Designation.setForeground(new java.awt.Color(255, 255, 255));
        Designation.setText("Designation");
        jPanel1.add(Designation);
        Designation.setBounds(370, 110, 110, 30);

        Name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setText("Emp_Name");
        jPanel1.add(Name);
        Name.setBounds(370, 70, 90, 21);

        Id.setBackground(new java.awt.Color(153, 153, 255));
        Id.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Id.setForeground(new java.awt.Color(255, 255, 255));
        Id.setText("Emp_ID");
        jPanel1.add(Id);
        Id.setBounds(20, 80, 70, 24);

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel1.add(id);
        id.setBounds(140, 70, 180, 30);

        qulification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qulificationActionPerformed(evt);
            }
        });
        jPanel1.add(qulification);
        qulification.setBounds(140, 110, 180, 30);

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name);
        name.setBounds(470, 70, 180, 30);

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        jPanel1.add(address);
        address.setBounds(810, 120, 180, 30);

        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        jPanel1.add(gender);
        gender.setBounds(810, 80, 180, 30);

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email);
        email.setBounds(470, 150, 180, 30);

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        jPanel1.add(phone);
        phone.setBounds(140, 150, 180, 30);

        designation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                designationActionPerformed(evt);
            }
        });
        jPanel1.add(designation);
        designation.setBounds(470, 110, 180, 30);

        Remove.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Remove.setForeground(new java.awt.Color(255, 255, 255));
        Remove.setText("Remove");
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });
        jPanel1.add(Remove);
        Remove.setBounds(870, 170, 120, 30);

        Add.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Add.setForeground(new java.awt.Color(255, 255, 255));
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        jPanel1.add(Add);
        Add.setBounds(740, 170, 80, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Employee Name", "Gender", "Qualification", "Designation", "Address", "Phone Number", "Email"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 282, 1000, 300);

        Search.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setText("SEARCH");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        jPanel1.add(Search);
        Search.setBounds(570, 240, 120, 30);

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(500, 240, 20, 30);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(300, 240, 220, 30);

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Exit.jpg"))); // NOI18N
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit);
        Exit.setBounds(970, 590, 60, 55);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Background.jpg"))); // NOI18N
        jPanel1.add(Background);
        Background.setBounds(0, 0, 1050, 650);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1043, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        this.setVisible(false);
        new Department().setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void qulificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qulificationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qulificationActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void designationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_designationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_designationActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
          if ((id.getText().length() > 0) && (name.getText().length() > 0)
                && (gender.getText().length() > 0) && (qulification.getText().length() > 0)
                && (designation.getText().length() > 0) && (address.getText().length() > 0) 
                 && (phone.getText().length() > 0) && (email.getText().length() > 0)) {
            modelw = new MediatorPatternDemow();
            modelw.setEmp_ID(id.getText());
            modelw.setEmp_Name(name.getText());
            modelw.setGender(gender.getText());
            modelw.setQualification(qulification.getText());            
            modelw.setDesignation(designation.getText());
            modelw.setAddress(address.getText());
            modelw.setPhone_Number(phone.getText());
            modelw.setEmail(email.getText());

            controllerw = new Controllerw(modelw, this);
            controllerw.updateWritingw();
        } 
        else {
            JOptionPane.showMessageDialog(this, "Please fill Name and Number!!");
        }
    }//GEN-LAST:event_AddActionPerformed

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed
       templatedesignobject.removeSelectedRowsw(jTable1);
    }//GEN-LAST:event_RemoveActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        searchTableContents(jTextField1.getText());
    }//GEN-LAST:event_SearchActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            jTextField1.getDocument().addDocumentListener(documentListener);
        } else {
            jTextField1.getDocument().addDocumentListener(null);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(Web_Development.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Web_Development.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Web_Development.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Web_Development.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Web_Development().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JLabel Address;
    private javax.swing.JButton Back;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Designation;
    private javax.swing.JLabel Email;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Heading;
    private javax.swing.JLabel Id;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Phone;
    private javax.swing.JLabel Qualification;
    private javax.swing.JButton Remove;
    private javax.swing.JButton Search;
    private javax.swing.JTextField address;
    private javax.swing.JTextField designation;
    private javax.swing.JTextField email;
    private javax.swing.JTextField gender;
    private javax.swing.JTextField id;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField qulification;
    // End of variables declaration//GEN-END:variables
}
