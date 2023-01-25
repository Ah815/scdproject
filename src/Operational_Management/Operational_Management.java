/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Operational_Management;

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
public class Operational_Management extends javax.swing.JFrame {
        Vector TableModel;
    DocumentListener documentListener;
    MediatorPatternDemoo modelo;
    Controllero controllero;
    public Start_pages.Department mainView;
    Singleton_DesignPatterno singleton_object = Singleton_DesignPatterno.getInstance();
    TemplateDesignPatterno templatedesignobject= new RemoveRowMethodo();
    
    public Operational_Management() {
        initComponents();
        
         Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 20 - this.getSize().width / 20, dim.height / 20 - this.getSize().height / 20);
                
        modelo = templatedesignobject.retriveFromDatabase("9528160","Tooba Afreen","Female","Master","Manager","Peshawar","03523115693","ToobaAfreen102@gmail.com");
        singleton_object.updateWritingo(modelo,this);
        modelo = templatedesignobject.retriveFromDatabase("9528161","Barira Naveed","Female","Master","Assistant Manager","Peshawar","03001837491","BariraNaveed165@gmail.com");
        singleton_object.updateWritingo(modelo,this);
        modelo = templatedesignobject.retriveFromDatabase("9528162","Muhammad  Talal ","Male","Bachelors"," Executive Officer","Islamabad","03249871639","Muhammad Talal110@gmail.com");
        singleton_object.updateWritingo(modelo,this);
        modelo = templatedesignobject.retriveFromDatabase("9528163","Komal Shakeel","Female","Intermediate","Clerk","Karachi","03451223127","KomalShakeel123@gmail.com");
        singleton_object.updateWritingo(modelo,this);
        modelo = templatedesignobject.retriveFromDatabase("9528164","Ashar Ahmad","Male","Intermediate","Officer","Islamabad","03301349260","AsharAhmad136@gmail.com");
        singleton_object.updateWritingo(modelo,this);
         modelo = templatedesignobject.retriveFromDatabase("9528165","Sheeza Imtiaz ","Female","Undergrad","Coordinator","Quetta","03339814781","SheezaImtiaz144@gmail.com");
        singleton_object.updateWritingo(modelo,this);
        modelo = templatedesignobject.retriveFromDatabase("9528166","Rahib Siddiqui","Female","Bachelors","Director","Multan","03242311212","RahibSiddiqui115@gmail.com");
        singleton_object.updateWritingo(modelo,this);
        modelo = templatedesignobject.retriveFromDatabase("9528167","Muhammad  Ahmed","Male","Matric","Peon","Peshawar","03491783456","Muhammad Ahmed156@gmail.com");
        singleton_object.updateWritingo(modelo,this);
         modelo = templatedesignobject.retriveFromDatabase("9528168","Muhammad  Rameez ","Male","Undergrad","Junior Officer","Islamabad","03297845671","Muhammad Rameez140@gmail.com");
        singleton_object.updateWritingo(modelo,this);
        modelo = templatedesignobject.retriveFromDatabase("9528169","Sajid Mahmood","Male","Matric","Senior officer","Quetta","03743617218","SajidMahmood160@gmail.com");
        singleton_object.updateWritingo(modelo,this);
        modelo = templatedesignobject.retriveFromDatabase("9528170","Shan Shahid","Male","Bachelors","Administrator","Peshawar","03410248925","ShanShahid173@gmail.com");
        singleton_object.updateWritingo(modelo,this);
        
        TableModel = (Vector) ((DefaultTableModel) jTable1.getModel()).getDataVector().clone();
        addDocumentListener();
    }
    public void displayDatao(String Emp_ID, String Emp_Name, String Gender, String Qualification,
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Back = new javax.swing.JButton();
        Heading = new javax.swing.JLabel();
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

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back (1).jpg"))); // NOI18N
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(10, 590, 50, 50);

        Heading.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Heading.setForeground(new java.awt.Color(255, 255, 255));
        Heading.setText("OPERATIONAL MANAGEMENT");
        jPanel1.add(Heading);
        Heading.setBounds(280, 20, 560, 40);

        Qualification.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Qualification.setForeground(new java.awt.Color(255, 255, 255));
        Qualification.setText("Qualification");
        jPanel1.add(Qualification);
        Qualification.setBounds(20, 110, 120, 30);

        Gender.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Gender.setForeground(new java.awt.Color(255, 255, 255));
        Gender.setText("Gender");
        jPanel1.add(Gender);
        Gender.setBounds(730, 80, 57, 21);

        Phone.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Phone.setForeground(new java.awt.Color(255, 255, 255));
        Phone.setText("Phone_Number");
        jPanel1.add(Phone);
        Phone.setBounds(10, 150, 130, 30);

        Address.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Address.setForeground(new java.awt.Color(255, 255, 255));
        Address.setText("Address");
        jPanel1.add(Address);
        Address.setBounds(720, 120, 80, 24);

        Email.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Email.setForeground(new java.awt.Color(255, 255, 255));
        Email.setText("Email");
        jPanel1.add(Email);
        Email.setBounds(360, 160, 80, 24);

        Designation.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Designation.setForeground(new java.awt.Color(255, 255, 255));
        Designation.setText("Designation");
        jPanel1.add(Designation);
        Designation.setBounds(350, 110, 110, 30);

        Name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setText("Emp_Name");
        jPanel1.add(Name);
        Name.setBounds(350, 70, 90, 30);

        Id.setBackground(new java.awt.Color(153, 153, 255));
        Id.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Id.setForeground(new java.awt.Color(255, 255, 255));
        Id.setText("Emp_ID");
        jPanel1.add(Id);
        Id.setBounds(20, 74, 70, 30);

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
        address.setBounds(820, 110, 180, 30);

        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        jPanel1.add(gender);
        gender.setBounds(820, 70, 180, 30);

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email);
        email.setBounds(470, 160, 180, 30);

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
        Remove.setBounds(890, 170, 120, 30);

        Add.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Add.setForeground(new java.awt.Color(255, 255, 255));
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        jPanel1.add(Add);
        Add.setBounds(760, 170, 80, 30);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
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
                && (address.getText().length() > 0) && (designation.getText().length() > 0)
                && (email.getText().length() > 0) && (phone.getText().length() > 0)) {
            modelo = new MediatorPatternDemoo();
            modelo.setEmp_ID(id.getText());
            modelo.setEmp_Name(name.getText());
            modelo.setGender(gender.getText());
            modelo.setQualification(qulification.getText());
            modelo.setAddress(address.getText());
            modelo.setDesignation(designation.getText());
            modelo.setPhone_Number(phone.getText());
            modelo.setEmail(email.getText());
            

            controllero = new Controllero(modelo, this);
            controllero.updateWritingo();
        } 
        else {
            JOptionPane.showMessageDialog(this, "Please fill Name and Number!!");
        }
    }//GEN-LAST:event_AddActionPerformed

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed
        templatedesignobject.removeSelectedRowso(jTable1);
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
            java.util.logging.Logger.getLogger(Operational_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operational_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operational_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operational_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operational_Management().setVisible(true);
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
