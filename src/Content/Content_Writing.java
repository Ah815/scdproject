package Content;

import Start_pages.Department;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Content_Writing extends javax.swing.JFrame{
    Vector TableModel;
    DocumentListener documentListener;
    MediatorPatternDemo model;
    Controller controller;
    public Start_pages.Department mainView;
    Singleton_DesignPattern singleton_object = Singleton_DesignPattern.getInstance();
    TemplateDesignPattern templatedesignobject= new RemoveRowMethod();

    public Content_Writing() {
        initComponents();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 20 - this.getSize().width / 20, dim.height / 20 - this.getSize().height / 20);
        model = templatedesignobject.retriveFromDatabase("9528101","Aayan Nazim Shaikh","Male","2 year","20","Fb area","03314364824","Karachi");
        singleton_object.updateWriting(model,this);        
        model = templatedesignobject.retriveFromDatabase("9528102","Syed Ibrahim","Male","4 year"," 28","Gulshan","03249817641","Karachi");
        singleton_object.updateWriting(model,this);
        model = templatedesignobject.retriveFromDatabase("9528103","Maheen Ilyas","Male","1.5 years","30","Gulberg","0332433433","Lohare");
        singleton_object.updateWriting(model,this);
        model = templatedesignobject.retriveFromDatabase("9528104","Faiz Ahmed","Male","3 year","27","sadar","03212128974","Hydrabad");
        singleton_object.updateWriting(model,this);
        model = templatedesignobject.retriveFromDatabase("9528105","Marwan tayyar","Male","7 year","20","liaqutabad","03330418549","Peshawar");
        singleton_object.updateWriting(model,this);
        model = templatedesignobject.retriveFromDatabase("9528106","Hamza Khan ","Male","3 year","21","Samnabad","03319378120","Balochistan");
        singleton_object.updateWriting(model,this);
        model = templatedesignobject.retriveFromDatabase("9528107","Karan kumar","Male","5 year","22","Nagan","03253212341","Lahore");
        singleton_object.updateWriting(model,this);
        model = templatedesignobject.retriveFromDatabase("9528108","Ashar Tameem","Male","3 year","34","Fb area","03428419402","islamabad");
        singleton_object.updateWriting(model,this);
        model = templatedesignobject.retriveFromDatabase("9528109"," Rabeeb Ashraf ","Male","6 year","21","Johar","03345651038","karachi");
        singleton_object.updateWriting(model,this);
        model = templatedesignobject.retriveFromDatabase("9528110","Umairshah majeed","Male","10 year","22","johar","03330568191","Karachi");
        singleton_object.updateWriting(model,this);
        model = templatedesignobject.retriveFromDatabase("9528111","Tayyab Munir","Male","3 year","40","Gulshan","0331831124","Lohare");
        singleton_object.updateWriting(model,this);

        TableModel = (Vector) ((DefaultTableModel) jTable1.getModel()).getDataVector().clone();
        addDocumentListener();
    }

    
    public void displayData(String Criminal_ID, String Criminal_Name, String Gender, String Time_period,
        String Age, String Address, String Phone_Number, String City) {

        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        Object[] row = {Criminal_ID, Criminal_Name, Gender, Time_period,Age, Address, Phone_Number, City};
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
        Time_period = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        Phone = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        City = new javax.swing.JLabel();
        Age = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Id = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        time_period = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        Remove = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Qualification1 = new javax.swing.JLabel();
        Search = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        Exit = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        Heading.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Heading.setForeground(new java.awt.Color(255, 255, 255));
        Heading.setText("CONTENT WRITING");
        jPanel1.add(Heading);
        Heading.setBounds(350, 10, 360, 40);

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back (1).jpg"))); // NOI18N
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(10, 590, 50, 50);

        Time_period.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Time_period.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Time_period);
        Time_period.setBounds(10, 140, 120, 0);

        Gender.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Gender.setForeground(new java.awt.Color(255, 255, 255));
        Gender.setText("Gender");
        jPanel1.add(Gender);
        Gender.setBounds(730, 80, 57, 21);

        Phone.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Phone.setForeground(new java.awt.Color(255, 255, 255));
        Phone.setText("Phone_Number");
        jPanel1.add(Phone);
        Phone.setBounds(10, 190, 121, 21);

        Address.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Address.setForeground(new java.awt.Color(255, 255, 255));
        Address.setText("Address");
        jPanel1.add(Address);
        Address.setBounds(720, 130, 80, 24);

        City.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        City.setForeground(new java.awt.Color(255, 255, 255));
        City.setText("City");
        jPanel1.add(City);
        City.setBounds(350, 190, 80, 24);

        Age.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Age.setForeground(new java.awt.Color(255, 255, 255));
        Age.setText("Age");
        jPanel1.add(Age);
        Age.setBounds(340, 140, 110, 20);

        Name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setText("Criminal_Name");
        jPanel1.add(Name);
        Name.setBounds(320, 90, 140, 21);

        Id.setBackground(new java.awt.Color(153, 153, 255));
        Id.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Id.setForeground(new java.awt.Color(255, 255, 255));
        Id.setText("Criminal_ID");
        jPanel1.add(Id);
        Id.setBounds(10, 90, 110, 24);

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel1.add(id);
        id.setBounds(130, 80, 180, 30);

        time_period.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time_periodActionPerformed(evt);
            }
        });
        jPanel1.add(time_period);
        time_period.setBounds(130, 140, 180, 30);

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name);
        name.setBounds(460, 80, 180, 30);

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        jPanel1.add(address);
        address.setBounds(820, 130, 180, 30);

        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        jPanel1.add(gender);
        gender.setBounds(820, 80, 180, 30);

        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });
        jPanel1.add(city);
        city.setBounds(460, 190, 180, 30);

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        jPanel1.add(phone);
        phone.setBounds(140, 190, 180, 30);

        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        jPanel1.add(age);
        age.setBounds(460, 140, 180, 30);

        Remove.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Remove.setForeground(new java.awt.Color(255, 255, 255));
        Remove.setText("Remove");
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });
        jPanel1.add(Remove);
        Remove.setBounds(870, 180, 120, 30);

        Add.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Add.setForeground(new java.awt.Color(255, 255, 255));
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        jPanel1.add(Add);
        Add.setBounds(740, 180, 80, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Criminal ID", "Criminal Name", "Gender", "Time period", "Age", "Address", "Phone Number", "City"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 282, 1000, 300);

        Qualification1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Qualification1.setForeground(new java.awt.Color(255, 255, 255));
        Qualification1.setText("Time Period");
        jPanel1.add(Qualification1);
        Qualification1.setBounds(10, 140, 120, 24);

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

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/images_1043x650.jpg"))); // NOI18N
        jPanel1.add(Background);
        Background.setBounds(-10, 0, 1050, 650);

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

    private void time_periodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time_periodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_time_periodActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed

        templatedesignobject.removeSelectedRows(jTable1);

    }//GEN-LAST:event_RemoveActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        if ((id.getText().length() > 0) && (name.getText().length() > 0)
                && (gender.getText().length() > 0) && (time_period.getText().length() > 0)
                && (address.getText().length() > 0) && (age.getText().length() > 0)
                && (city.getText().length() > 0) && (phone.getText().length() > 0)) {
            model = new MediatorPatternDemo();
            model.setCriminal_ID(id.getText());
            model.setCriminal_Name(name.getText());
            model.setGender(gender.getText());
            model.setTime_period(time_period.getText());            
            model.setAge(age.getText());
            model.setAddress(address.getText());
            model.setPhone_Number(phone.getText());
            model.setCity(city.getText());
            controller = new Controller(model, this);
            controller.updateWriting();
        } 
        else {
            JOptionPane.showMessageDialog(this, "Please fill Name and Number!!");
        }
    }//GEN-LAST:event_AddActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        searchTableContents(jTextField1.getText());
    }//GEN-LAST:event_SearchActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            jTextField1.getDocument().addDocumentListener(documentListener);
        } else {
            jTextField1.getDocument().addDocumentListener(null);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

            
    public static void main(String args[]) {

     //   /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Content_Writing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JLabel Address;
    private javax.swing.JLabel Age;
    private javax.swing.JButton Back;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel City;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Heading;
    private javax.swing.JLabel Id;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Phone;
    private javax.swing.JLabel Qualification1;
    private javax.swing.JButton Remove;
    private javax.swing.JButton Search;
    private javax.swing.JLabel Time_period;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JTextField city;
    private javax.swing.JTextField gender;
    private javax.swing.JTextField id;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField time_period;
    // End of variables declaration//GEN-END:variables


}
