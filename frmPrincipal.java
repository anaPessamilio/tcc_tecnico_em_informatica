package br.com.tcc.Formularios;

/**
 *
 * @author Amy
 */
public class frmPrincipal extends javax.swing.JFrame {

   
    public frmPrincipal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        desktop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCad = new javax.swing.JMenu();
        itemCadAluno = new javax.swing.JMenuItem();
        itemCadProfessor = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        itemNotas1 = new javax.swing.JMenuItem();
        itemNotas2 = new javax.swing.JMenuItem();
        itemNotas3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemTrab1 = new javax.swing.JMenuItem();
        itemTrab2 = new javax.swing.JMenuItem();
        itemTrab3 = new javax.swing.JMenuItem();
        menuUs = new javax.swing.JMenu();
        itemOpUs = new javax.swing.JMenuItem();
        itemOpLog = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("jMenu3");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 582, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Usuário:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        menuCad.setText("Cadastro");

        itemCadAluno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        itemCadAluno.setText("Aluno");
        itemCadAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadAlunoActionPerformed(evt);
            }
        });
        menuCad.add(itemCadAluno);

        itemCadProfessor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        itemCadProfessor.setText("Professor");
        itemCadProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadProfessorActionPerformed(evt);
            }
        });
        menuCad.add(itemCadProfessor);

        jMenuBar1.add(menuCad);

        jMenu1.setText("Notas");

        itemNotas1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        itemNotas1.setText("1° ano/ E.M.");
        itemNotas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNotas1ActionPerformed(evt);
            }
        });
        jMenu1.add(itemNotas1);

        itemNotas2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        itemNotas2.setText("2° ano/ E.M.");
        itemNotas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNotas2ActionPerformed(evt);
            }
        });
        jMenu1.add(itemNotas2);

        itemNotas3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        itemNotas3.setText("3° ano/ E.M.");
        itemNotas3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNotas3ActionPerformed(evt);
            }
        });
        jMenu1.add(itemNotas3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Trabalhos");

        itemTrab1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.SHIFT_MASK));
        itemTrab1.setText("1° ano/E.M.");
        itemTrab1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTrab1ActionPerformed(evt);
            }
        });
        jMenu2.add(itemTrab1);

        itemTrab2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.SHIFT_MASK));
        itemTrab2.setText("2° ano/E.M.");
        itemTrab2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTrab2ActionPerformed(evt);
            }
        });
        jMenu2.add(itemTrab2);

        itemTrab3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.SHIFT_MASK));
        itemTrab3.setText("3° ano/E.M.");
        itemTrab3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTrab3ActionPerformed(evt);
            }
        });
        jMenu2.add(itemTrab3);

        jMenuBar1.add(jMenu2);

        menuUs.setText("Opções");
        menuUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUsActionPerformed(evt);
            }
        });

        itemOpUs.setText("Usuários");
        itemOpUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemOpUsActionPerformed(evt);
            }
        });
        menuUs.add(itemOpUs);

        itemOpLog.setText("Logoff");
        itemOpLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemOpLogActionPerformed(evt);
            }
        });
        menuUs.add(itemOpLog);

        jMenuBar1.add(menuUs);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(desktop)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemCadAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadAlunoActionPerformed
        frmCadAluno cadAluno = new frmCadAluno();
         cadAluno.setVisible(true);
         desktop.add(cadAluno);
    }//GEN-LAST:event_itemCadAlunoActionPerformed

    private void itemCadProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadProfessorActionPerformed
       frmCadProf cadProf = new frmCadProf();
         cadProf.setVisible(true);
         desktop.add(cadProf);
    }//GEN-LAST:event_itemCadProfessorActionPerformed

    private void menuUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUsActionPerformed
       
    }//GEN-LAST:event_menuUsActionPerformed

    private void itemOpUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemOpUsActionPerformed
        frmUsu us = new frmUsu();
         us.setVisible(true);
         desktop.add(us);
    }//GEN-LAST:event_itemOpUsActionPerformed

    private void itemNotas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNotas1ActionPerformed
          frmNotas nota1 = new frmNotas();
         nota1.setVisible(true);
         desktop.add(nota1);
         frmNotas.lblSerie.setText("1° ano/E.M.");
    }//GEN-LAST:event_itemNotas1ActionPerformed

    private void itemNotas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNotas2ActionPerformed
        frmNotas nota2 = new frmNotas();
         nota2.setVisible(true);
         desktop.add(nota2);
         frmNotas.lblSerie.setText("2° ano/E.M.");
          
    }//GEN-LAST:event_itemNotas2ActionPerformed

    private void itemNotas3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNotas3ActionPerformed
       frmNotas nota3 = new frmNotas();
         nota3.setVisible(true);
         desktop.add(nota3);
         frmNotas.lblSerie.setText("3° ano/E.M.");
          
    }//GEN-LAST:event_itemNotas3ActionPerformed

    private void itemOpLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemOpLogActionPerformed
          frmLogin log = new frmLogin();
         log.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_itemOpLogActionPerformed

    private void itemTrab1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTrab1ActionPerformed
        frmTrabalhos trab1 = new frmTrabalhos();
         trab1.setVisible(true);
         desktop.add(trab1);
         frmTrabalhos.lblSerie.setText("1° ano/E.M.");
    }//GEN-LAST:event_itemTrab1ActionPerformed

    private void itemTrab2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTrab2ActionPerformed
       frmTrabalhos trab2 = new frmTrabalhos();
         trab2.setVisible(true);
         desktop.add(trab2);
         frmTrabalhos.lblSerie.setText("2° ano/E.M.");
    }//GEN-LAST:event_itemTrab2ActionPerformed

    private void itemTrab3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTrab3ActionPerformed
       frmTrabalhos trab3 = new frmTrabalhos();
         trab3.setVisible(true);
         desktop.add(trab3);
         frmTrabalhos.lblSerie.setText("3° ano/E.M.");
    }//GEN-LAST:event_itemTrab3ActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuItem itemCadAluno;
    private javax.swing.JMenuItem itemCadProfessor;
    private javax.swing.JMenuItem itemNotas1;
    private javax.swing.JMenuItem itemNotas2;
    private javax.swing.JMenuItem itemNotas3;
    private javax.swing.JMenuItem itemOpLog;
    private javax.swing.JMenuItem itemOpUs;
    private javax.swing.JMenuItem itemTrab1;
    private javax.swing.JMenuItem itemTrab2;
    private javax.swing.JMenuItem itemTrab3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu menuCad;
    private javax.swing.JMenu menuUs;
    // End of variables declaration//GEN-END:variables
}
