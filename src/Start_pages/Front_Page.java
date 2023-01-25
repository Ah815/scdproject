
package Start_pages;

;

import javax.swing.JOptionPane;

public class Front_Page extends javax.swing.JFrame {
    public Front_Page() {
        initComponents();
    }
    public void check_authorizedUser(){

        String user=u.getText();
        String pass=p.getText();
        
        //Null Design Pattern
        AbstractEmploee customer1 = EmployeeFactory.getCustomer(user);
        
        System.out.println(customer1.getName());
        //Null Design Pattern
        
        if(user.equals(customer1.getName()) && pass.equals("786")){
           
            JOptionPane.showMessageDialog(null, "username and password matched");
            this.setVisible(false);
             new Department().setVisible(true);
         }
        else{
            JOptionPane.showMessageDialog(null, "username and password do not matched");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        user = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        u = new javax.swing.JTextField();
        p = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(null);

        user.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setText("User");
        jPanel1.add(user);
        user.setBounds(240, 290, 80, 29);

        password.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Password");
        jPanel1.add(password);
        password.setBounds(240, 350, 110, 20);

        u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uActionPerformed(evt);
            }
        });
        jPanel1.add(u);
        u.setBounds(390, 290, 210, 30);
        jPanel1.add(p);
        p.setBounds(390, 340, 210, 30);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("LOGIN ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(420, 410, 130, 37);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/images_1_802x500.jpg"))); // NOI18N
        jPanel1.add(back);
        back.setBounds(0, 0, 802, 470);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             check_authorizedUser();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Front_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField p;
    private javax.swing.JLabel password;
    private javax.swing.JTextField u;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
