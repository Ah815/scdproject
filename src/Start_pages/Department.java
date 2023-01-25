package Start_pages;

import Web_Development.Web_Development;
import Security_Department.Security_Department;
import Operational_Management.Operational_Management;
import Human_Resources.Human_Resources;
import Content.Content_Writing;



public class Department extends javax.swing.JFrame {
    public Department() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        content = new javax.swing.JButton();
        operation = new javax.swing.JButton();
        secuirty = new javax.swing.JButton();
        web = new javax.swing.JButton();
        human = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        content.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        content.setText("Kidnapping");
        content.setIconTextGap(10);
        content.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentActionPerformed(evt);
            }
        });
        jPanel1.add(content);
        content.setBounds(620, 450, 200, 90);

        operation.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        operation.setText("Robbery");
        operation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operationActionPerformed(evt);
            }
        });
        jPanel1.add(operation);
        operation.setBounds(760, 250, 200, 90);

        secuirty.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        secuirty.setText("Muders");
        secuirty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secuirtyActionPerformed(evt);
            }
        });
        jPanel1.add(secuirty);
        secuirty.setBounds(240, 450, 200, 90);

        web.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        web.setText("Computer Crime");
        web.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                webActionPerformed(evt);
            }
        });
        jPanel1.add(web);
        web.setBounds(410, 70, 230, 80);

        human.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        human.setText("Drug Smugling");
        human.setRolloverEnabled(false);
        human.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                humanActionPerformed(evt);
            }
        });
        jPanel1.add(human);
        human.setBounds(120, 240, 210, 80);

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back (1).jpg"))); // NOI18N
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(10, 560, 50, 50);

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Exit.jpg"))); // NOI18N
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit);
        Exit.setBounds(970, 550, 60, 55);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/images_1043x650.jpg"))); // NOI18N
        jPanel1.add(Background);
        Background.setBounds(0, 20, 1090, 620);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1043, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentActionPerformed
        this.setVisible(false);
        new Content_Writing().setVisible(true);
        
    }//GEN-LAST:event_contentActionPerformed

    private void secuirtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secuirtyActionPerformed
        this.setVisible(false);
        new Security_Department().setVisible(true);
    }//GEN-LAST:event_secuirtyActionPerformed

    private void humanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_humanActionPerformed
        this.setVisible(false);
        new Human_Resources().setVisible(true);
    }//GEN-LAST:event_humanActionPerformed

    private void operationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operationActionPerformed
        this.setVisible(false);
        new Operational_Management().setVisible(true);
    }//GEN-LAST:event_operationActionPerformed

    private void webActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_webActionPerformed
        this.setVisible(false);
        new Web_Development().setVisible(true);
    }//GEN-LAST:event_webActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        this.setVisible(false);
        new Front_Page().setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Department().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel Background;
    private javax.swing.JButton Exit;
    private javax.swing.JButton content;
    private javax.swing.JButton human;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton operation;
    private javax.swing.JButton secuirty;
    private javax.swing.JButton web;
    // End of variables declaration//GEN-END:variables
}
