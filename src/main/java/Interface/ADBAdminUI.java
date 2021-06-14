/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.Color;

/**
 *
 * @author briananjune
 */
public class ADBAdminUI extends javax.swing.JFrame {

    /**
     * Creates new form DBAdmin
     */
    Color DefaultColor,ClickedColor,HoverColor;
    public ADBAdminUI() {
        initComponents();
        setLocationRelativeTo(null);
        DefaultColor=new Color(240,240,240);
        ClickedColor=new Color(0,204,204);
        HoverColor=new Color(204,255,255);
        
        //Set default color to pan on run time
        AHome.setBackground(DefaultColor);
        AAssignEmp.setBackground(DefaultColor);
        AOrderSup.setBackground(DefaultColor);
        AGenerateR.setBackground(DefaultColor);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AMenu = new javax.swing.JPanel();
        AHome = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        AAssignEmp = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        AOrderSup = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        AGenerateR = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Logo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        StatusBar = new javax.swing.JPanel();
        MusicMartTxt = new javax.swing.JLabel();
        MenuName = new javax.swing.JLabel();
        ADesktop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 540));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AMenu.setBackground(new java.awt.Color(102, 102, 102));
        AMenu.setPreferredSize(new java.awt.Dimension(250, 540));

        AHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AHomeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AHomeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AHomeMouseReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Home");

        javax.swing.GroupLayout AHomeLayout = new javax.swing.GroupLayout(AHome);
        AHome.setLayout(AHomeLayout);
        AHomeLayout.setHorizontalGroup(
            AHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AHomeLayout.setVerticalGroup(
            AHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        AAssignEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AAssignEmpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AAssignEmpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AAssignEmpMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AAssignEmpMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AAssignEmpMouseReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Assign Employees to Jobs");

        javax.swing.GroupLayout AAssignEmpLayout = new javax.swing.GroupLayout(AAssignEmp);
        AAssignEmp.setLayout(AAssignEmpLayout);
        AAssignEmpLayout.setHorizontalGroup(
            AAssignEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AAssignEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        AAssignEmpLayout.setVerticalGroup(
            AAssignEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AAssignEmpLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        AOrderSup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AOrderSupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AOrderSupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AOrderSupMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AOrderSupMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AOrderSupMouseReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Order from Suppliers");

        javax.swing.GroupLayout AOrderSupLayout = new javax.swing.GroupLayout(AOrderSup);
        AOrderSup.setLayout(AOrderSupLayout);
        AOrderSupLayout.setHorizontalGroup(
            AOrderSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AOrderSupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AOrderSupLayout.setVerticalGroup(
            AOrderSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        AGenerateR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AGenerateRMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AGenerateRMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AGenerateRMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AGenerateRMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AGenerateRMouseReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Generate Report");

        javax.swing.GroupLayout AGenerateRLayout = new javax.swing.GroupLayout(AGenerateR);
        AGenerateR.setLayout(AGenerateRLayout);
        AGenerateRLayout.setHorizontalGroup(
            AGenerateRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AGenerateRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AGenerateRLayout.setVerticalGroup(
            AGenerateRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        Logo.setPreferredSize(new java.awt.Dimension(171, 100));
        Logo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Logo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, 90));

        javax.swing.GroupLayout AMenuLayout = new javax.swing.GroupLayout(AMenu);
        AMenu.setLayout(AMenuLayout);
        AMenuLayout.setHorizontalGroup(
            AMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AOrderSup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AAssignEmp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AGenerateR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AMenuLayout.setVerticalGroup(
            AMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AMenuLayout.createSequentialGroup()
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AAssignEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AOrderSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AGenerateR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        getContentPane().add(AMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, -1));

        StatusBar.setBackground(new java.awt.Color(0, 204, 204));

        MusicMartTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MusicMartTxt.setForeground(new java.awt.Color(255, 255, 255));
        MusicMartTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MusicMartTxt.setText("Music Mart");

        MenuName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MenuName.setForeground(new java.awt.Color(255, 255, 255));
        MenuName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuName.setText("Admin");

        javax.swing.GroupLayout StatusBarLayout = new javax.swing.GroupLayout(StatusBar);
        StatusBar.setLayout(StatusBarLayout);
        StatusBarLayout.setHorizontalGroup(
            StatusBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StatusBarLayout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addGroup(StatusBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StatusBarLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(MusicMartTxt))
                    .addComponent(MenuName, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
        );
        StatusBarLayout.setVerticalGroup(
            StatusBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StatusBarLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(MusicMartTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MenuName)
                .addGap(25, 25, 25))
        );

        getContentPane().add(StatusBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 0, 650, -1));

        ADesktop.setBackground(new java.awt.Color(204, 204, 204));
        ADesktop.setPreferredSize(new java.awt.Dimension(650, 440));

master

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Edu. STORE\\SLIIT\\UOB Year 1\\UOB Semester 2\\2- Object Oriented Programming-JAVA (OOP)\\Group Project\\PROJECT\\MusicMart_RunTimeTerror\\src\\main\\java\\Images\\xfn1X.jpg")); // NOI18N

master
        javax.swing.GroupLayout ADesktopLayout = new javax.swing.GroupLayout(ADesktop);
        ADesktop.setLayout(ADesktopLayout);
        ADesktopLayout.setHorizontalGroup(
            ADesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        ADesktopLayout.setVerticalGroup(
            ADesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(ADesktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 100, 650, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AHomeMouseClicked
        AHome home = new AHome ();
        ADesktop.removeAll();
        ADesktop.add(home).setVisible(true);
    }//GEN-LAST:event_AHomeMouseClicked

    private void AAssignEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AAssignEmpMouseClicked
        // TODO add your handling code here:
        AAssignEmptoJobs aj = new AAssignEmptoJobs();
        ADesktop.removeAll();
        ADesktop.add(aj).setVisible(true);
               
    }//GEN-LAST:event_AAssignEmpMouseClicked

    private void AOrderSupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AOrderSupMouseClicked
        
        AOrderfromSuppliers of = new AOrderfromSuppliers();
        ADesktop.removeAll();
        ADesktop.add(of).setVisible(true);
    }//GEN-LAST:event_AOrderSupMouseClicked

    private void AGenerateRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AGenerateRMouseClicked
        // TODO add your handling code here:
        AGenerateReport Gr= new AGenerateReport();
        ADesktop.removeAll();
        ADesktop.add(Gr).setVisible(true);
    }//GEN-LAST:event_AGenerateRMouseClicked

    private void AHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AHomeMouseEntered
        // TODO add your handling code here:
        AHome.setBackground(HoverColor);
        
        AAssignEmp.setBackground(DefaultColor);
        AOrderSup.setBackground(DefaultColor);
        AGenerateR.setBackground(DefaultColor);
    }//GEN-LAST:event_AHomeMouseEntered

    private void AAssignEmpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AAssignEmpMouseEntered
        // TODO add your handling code here:
        AAssignEmp.setBackground(HoverColor);
        
        AHome.setBackground(DefaultColor);
        AOrderSup.setBackground(DefaultColor);
        AGenerateR.setBackground(DefaultColor);
    }//GEN-LAST:event_AAssignEmpMouseEntered

    private void AOrderSupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AOrderSupMouseEntered
        // TODO add your handling code here:
        AOrderSup.setBackground(HoverColor);
        
        AHome.setBackground(DefaultColor);
        AAssignEmp.setBackground(DefaultColor);
        AGenerateR.setBackground(DefaultColor);
    }//GEN-LAST:event_AOrderSupMouseEntered

    private void AGenerateRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AGenerateRMouseEntered
        // TODO add your handling code here:
        AGenerateR.setBackground(HoverColor);
        
        AHome.setBackground(DefaultColor);
        AAssignEmp.setBackground(DefaultColor);
        AOrderSup.setBackground(DefaultColor);
    }//GEN-LAST:event_AGenerateRMouseEntered

    private void AHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AHomeMouseExited
        // TODO add your handling code here:
        AHome.setBackground(DefaultColor);
    }//GEN-LAST:event_AHomeMouseExited

    private void AAssignEmpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AAssignEmpMouseExited
        // TODO add your handling code here:
        AAssignEmp.setBackground(DefaultColor);
    }//GEN-LAST:event_AAssignEmpMouseExited

    private void AOrderSupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AOrderSupMouseExited
        // TODO add your handling code here:
        AOrderSup.setBackground(DefaultColor);
    }//GEN-LAST:event_AOrderSupMouseExited

    private void AGenerateRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AGenerateRMouseExited
        // TODO add your handling code here:
        AGenerateR.setBackground(DefaultColor);
    }//GEN-LAST:event_AGenerateRMouseExited

    private void AHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AHomeMousePressed
        // TODO add your handling code here:
        AHome.setBackground(ClickedColor);
        
        MenuName.setText("Home");
    }//GEN-LAST:event_AHomeMousePressed

    private void AAssignEmpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AAssignEmpMousePressed
        // TODO add your handling code here:
        AAssignEmp.setBackground(ClickedColor);
        
        MenuName.setText("Assign Employees to Jobs");
    }//GEN-LAST:event_AAssignEmpMousePressed

    private void AOrderSupMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AOrderSupMousePressed
        // TODO add your handling code here:
        AOrderSup.setBackground(ClickedColor);
        
        MenuName.setText("Order from Suppliers");
    }//GEN-LAST:event_AOrderSupMousePressed

    private void AGenerateRMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AGenerateRMousePressed
        // TODO add your handling code here:
        AGenerateR.setBackground(ClickedColor);
        
        MenuName.setText("Generate Report");
    }//GEN-LAST:event_AGenerateRMousePressed

    private void AHomeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AHomeMouseReleased
        // TODO add your handling code here:
        AHome.setBackground(ClickedColor);
    }//GEN-LAST:event_AHomeMouseReleased

    private void AAssignEmpMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AAssignEmpMouseReleased
        // TODO add your handling code here:
        AAssignEmp.setBackground(ClickedColor);
    }//GEN-LAST:event_AAssignEmpMouseReleased

    private void AOrderSupMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AOrderSupMouseReleased
        // TODO add your handling code here:
        AOrderSup.setBackground(ClickedColor);
    }//GEN-LAST:event_AOrderSupMouseReleased

    private void AGenerateRMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AGenerateRMouseReleased
        // TODO add your handling code here:
        AGenerateR.setBackground(ClickedColor);
    }//GEN-LAST:event_AGenerateRMouseReleased

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
            java.util.logging.Logger.getLogger(ADBAdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADBAdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADBAdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADBAdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADBAdminUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AAssignEmp;
    private javax.swing.JPanel ADesktop;
    private javax.swing.JPanel AGenerateR;
    private javax.swing.JPanel AHome;
    private javax.swing.JPanel AMenu;
    private javax.swing.JPanel AOrderSup;
    private javax.swing.JPanel Logo;
    private javax.swing.JLabel MenuName;
    private javax.swing.JLabel MusicMartTxt;
    private javax.swing.JPanel StatusBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
