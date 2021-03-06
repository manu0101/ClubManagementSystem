/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluborganiser;

import cluborganiser.beans.Loginbean;
import cluborganiser.reports.JasperReportGenerator;
import java.awt.Container;
import java.awt.Toolkit;

/**
 *
 * @author hp
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public static Container root;
    public static Loginbean objBean;
    public static int userId;

    public MainFrame() {
        initComponents();
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setLocationRelativeTo(null);
        root = getContentPane();

    }

    public MainFrame(Loginbean objBean) {
        initComponents();
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setLocationRelativeTo(null);
        root = getContentPane();

        this.objBean = objBean;
        userId = objBean.getUserID();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniLogout = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniProfileDetail = new javax.swing.JMenuItem();
        mniUserDeatil = new javax.swing.JMenu();
        mniUserAccountDetail = new javax.swing.JMenuItem();
        mnuMemberMaintenance = new javax.swing.JMenu();
        mniMemberPersonal = new javax.swing.JMenuItem();
        mniManageManagership = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mniManageSportType = new javax.swing.JMenuItem();
        mniManageMembershipType = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        mniUserReport = new javax.swing.JMenuItem();
        mniMemberDetail = new javax.swing.JMenuItem();
        mniMembership = new javax.swing.JMenuItem();
        mniSportFacility = new javax.swing.JMenuItem();
        mniMembershipType = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");

        mniLogout.setText("Logout");
        mniLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLogoutActionPerformed(evt);
            }
        });
        jMenu1.add(mniLogout);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Profile");

        mniProfileDetail.setText("ProfileDetail");
        mniProfileDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniProfileDetailActionPerformed(evt);
            }
        });
        jMenu2.add(mniProfileDetail);

        jMenuBar1.add(jMenu2);

        mniUserDeatil.setText("Employee Maintenence");

        mniUserAccountDetail.setText("UserAccountDetail");
        mniUserAccountDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniUserAccountDetailActionPerformed(evt);
            }
        });
        mniUserDeatil.add(mniUserAccountDetail);

        jMenuBar1.add(mniUserDeatil);

        mnuMemberMaintenance.setText("Member Maintenence");

        mniMemberPersonal.setText("Member Personal");
        mniMemberPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniMemberPersonalActionPerformed(evt);
            }
        });
        mnuMemberMaintenance.add(mniMemberPersonal);

        mniManageManagership.setText("Manage Managership");
        mniManageManagership.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniManageManagershipActionPerformed(evt);
            }
        });
        mnuMemberMaintenance.add(mniManageManagership);

        jMenuBar1.add(mnuMemberMaintenance);

        jMenu5.setText("Information Maintenence");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        mniManageSportType.setText("Manage Sports Types");
        mniManageSportType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniManageSportTypeActionPerformed(evt);
            }
        });
        jMenu5.add(mniManageSportType);

        mniManageMembershipType.setText(" Manage Membership Types");
        mniManageMembershipType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniManageMembershipTypeActionPerformed(evt);
            }
        });
        jMenu5.add(mniManageMembershipType);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Reports");
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });

        mniUserReport.setText("User Account Report");
        mniUserReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniUserReportActionPerformed(evt);
            }
        });
        jMenu6.add(mniUserReport);

        mniMemberDetail.setText("Member Detail Report");
        mniMemberDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniMemberDetailActionPerformed(evt);
            }
        });
        jMenu6.add(mniMemberDetail);

        mniMembership.setText("Membership Report");
        mniMembership.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniMembershipActionPerformed(evt);
            }
        });
        jMenu6.add(mniMembership);

        mniSportFacility.setText("Sports Facility Report");
        mniSportFacility.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSportFacilityActionPerformed(evt);
            }
        });
        jMenu6.add(mniSportFacility);

        mniMembershipType.setText("Membership Type Report");
        mniMembershipType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniMembershipTypeActionPerformed(evt);
            }
        });
        jMenu6.add(mniMembershipType);

        jMenuItem10.setText("Invoice Details");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem10);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 553, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLogoutActionPerformed
        // TODO add your handling code here:
        dispose();
        new LoginFrame().setVisible(true);
    }//GEN-LAST:event_mniLogoutActionPerformed

    private void mniUserAccountDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniUserAccountDetailActionPerformed
        // TODO add your handling code here:
        root.setVisible(false);
        root.removeAll();
        UserDetail obj = new UserDetail();
        obj.setBounds(50, 50, 600, 600);
        root.add(obj);
        root.setVisible(true);
    }//GEN-LAST:event_mniUserAccountDetailActionPerformed

    private void mniManageManagershipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniManageManagershipActionPerformed
        // TODO add your handling code here:
        root.setVisible(false);
        root.removeAll();
        ManageManagership obj = new ManageManagership();
        obj.setBounds(50, 50, 600, 600);
        root.add(obj);
        root.setVisible(true);

    }//GEN-LAST:event_mniManageManagershipActionPerformed

    private void mniMembershipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniMembershipActionPerformed
        // TODO add your handling code here:
        new JasperReportGenerator("Membership.jrxml");
    }//GEN-LAST:event_mniMembershipActionPerformed

    private void mniSportFacilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSportFacilityActionPerformed
        // TODO add your handling code here:
        new JasperReportGenerator("SportReport.jrxml");
    }//GEN-LAST:event_mniSportFacilityActionPerformed

    private void mniMembershipTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniMembershipTypeActionPerformed
        // TODO add your handling code here:
        new JasperReportGenerator("MembershipType.jrxml");
    }//GEN-LAST:event_mniMembershipTypeActionPerformed

    private void mniProfileDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniProfileDetailActionPerformed
        // TODO add your handling code here:
        root.setVisible(false);
        root.removeAll();
        ProfileDetail obj = new ProfileDetail();
        obj.setBounds(50, 50, 600, 600);
        root.add(obj);
        root.setVisible(true);
    }//GEN-LAST:event_mniProfileDetailActionPerformed

    private void mniManageSportTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniManageSportTypeActionPerformed
        // TODO add your handling code here:

        root.setVisible(false);
        root.removeAll();
        ManageSportType obj = new ManageSportType();
        obj.setBounds(50, 50, 600, 600);
        root.add(obj);
        root.setVisible(true);
    }//GEN-LAST:event_mniManageSportTypeActionPerformed

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
        // TODO add your handling code here:
        root.setVisible(false);
        root.removeAll();
        ManageSportType obj = new ManageSportType();
        obj.setBounds(50, 50, 600, 600);
        root.add(obj);
        root.setVisible(true);
    }//GEN-LAST:event_jMenu6ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenu5ActionPerformed

    private void mniUserReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniUserReportActionPerformed
        // TODO add your handling code here:
        new JasperReportGenerator("UserReport.jrxml");
    }//GEN-LAST:event_mniUserReportActionPerformed

    private void mniMemberDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniMemberDetailActionPerformed
        // TODO add your handling code here:
        new JasperReportGenerator("Member.jrxml");
    }//GEN-LAST:event_mniMemberDetailActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        new JasperReportGenerator("Invoice.jrxml");
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void mniManageMembershipTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniManageMembershipTypeActionPerformed
        // TODO add your handling code here:
        root.setVisible(false);
        root.removeAll();
        ManageMembershipType obj = new ManageMembershipType();
        obj.setBounds(50, 50, 600, 600);
        root.add(obj);
        root.setVisible(true);


    }//GEN-LAST:event_mniManageMembershipTypeActionPerformed

    private void mniMemberPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniMemberPersonalActionPerformed
        // TODO add your handling code here:
        root.setVisible(false);
        root.removeAll();
        MemberPersonalInformation obj = new MemberPersonalInformation();
        obj.setBounds(50, 50, 600, 600);
        root.add(obj);
        root.setVisible(true);

    }//GEN-LAST:event_mniMemberPersonalActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem mniLogout;
    private javax.swing.JMenuItem mniManageManagership;
    private javax.swing.JMenuItem mniManageMembershipType;
    private javax.swing.JMenuItem mniManageSportType;
    private javax.swing.JMenuItem mniMemberDetail;
    private javax.swing.JMenuItem mniMemberPersonal;
    private javax.swing.JMenuItem mniMembership;
    private javax.swing.JMenuItem mniMembershipType;
    private javax.swing.JMenuItem mniProfileDetail;
    private javax.swing.JMenuItem mniSportFacility;
    private javax.swing.JMenuItem mniUserAccountDetail;
    private javax.swing.JMenu mniUserDeatil;
    private javax.swing.JMenuItem mniUserReport;
    private javax.swing.JMenu mnuMemberMaintenance;
    // End of variables declaration//GEN-END:variables
}
