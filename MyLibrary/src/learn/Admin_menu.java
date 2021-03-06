package learn;
import learn.admin_sub.*;
import learn.admin_sub.newBook.*;

public class Admin_menu extends javax.swing.JFrame {
    private static char selected;
    public Admin_menu() {
        initComponents();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        next = new javax.swing.JButton();
        add_book = new javax.swing.JRadioButton();
        search_book = new javax.swing.JRadioButton();
        add_reader = new javax.swing.JRadioButton();
        branch_info = new javax.swing.JRadioButton();
        print_borrower = new javax.swing.JRadioButton();
        print_borrowed = new javax.swing.JRadioButton();
        avg_fine = new javax.swing.JRadioButton();
        cancel = new javax.swing.JButton();

        buttonGroup1.add(add_book);
        buttonGroup1.add(search_book);
        buttonGroup1.add(add_reader);
        buttonGroup1.add(branch_info);
        buttonGroup1.add(print_borrower);
        buttonGroup1.add(print_borrowed);
        buttonGroup1.add(avg_fine);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Functions");

        next.setText("Next");
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextMouseClicked(evt);
            }
        });
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        add_book.setText("Add a book copy");
        add_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_bookActionPerformed(evt);
            }
        });

        search_book.setText("Search a book copy");
        search_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_bookActionPerformed(evt);
            }
        });

        add_reader.setText("Add new reader");
        add_reader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_readerActionPerformed(evt);
            }
        });

        branch_info.setText("Print branch information");
        branch_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branch_infoActionPerformed(evt);
            }
        });

        print_borrower.setText("Print top 10 borrowers in a branch and number of books each has borrowed");
        print_borrower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_borrowerActionPerformed(evt);
            }
        });

        print_borrowed.setText("Print top 10 borrowed books in a branch");
        print_borrowed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_borrowedActionPerformed(evt);
            }
        });

        avg_fine.setText("Find the average fine paid per reader");
        avg_fine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avg_fineActionPerformed(evt);
            }
        });

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(avg_fine)
                    .addComponent(print_borrowed)
                    .addComponent(print_borrower)
                    .addComponent(branch_info)
                    .addComponent(add_reader)
                    .addComponent(search_book)
                    .addComponent(add_book))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancel)
                .addGap(36, 36, 36))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {add_book, add_reader, avg_fine, branch_info, print_borrowed, print_borrower, search_book});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancel, next});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(add_book)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search_book)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add_reader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(branch_info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(print_borrower)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(print_borrowed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avg_fine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(next)
                    .addComponent(cancel))
                .addGap(30, 30, 30))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {add_book, add_reader, avg_fine, branch_info, print_borrowed, print_borrower, search_book});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nextMouseClicked

    private void add_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_bookActionPerformed
        selected = '1';
    }//GEN-LAST:event_add_bookActionPerformed

    private void search_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_bookActionPerformed
        selected = '2';
    }//GEN-LAST:event_search_bookActionPerformed

    private void add_readerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_readerActionPerformed
        selected = '3';
    }//GEN-LAST:event_add_readerActionPerformed

    private void branch_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branch_infoActionPerformed
        selected = '4';
    }//GEN-LAST:event_branch_infoActionPerformed

    private void print_borrowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_borrowerActionPerformed
        selected = '5';
    }//GEN-LAST:event_print_borrowerActionPerformed

    private void print_borrowedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_borrowedActionPerformed
        selected = '6';
    }//GEN-LAST:event_print_borrowedActionPerformed

    private void avg_fineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avg_fineActionPerformed
        selected = '7';
    }//GEN-LAST:event_avg_fineActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        dispose();
        switch(selected){
           case '1':
               Isbn i = new Isbn();
               i.setVisible(true);
               break;
           case '2':
               SearchBook sb = new SearchBook();
               sb.setVisible(true);
               break;
           case '3':
               AddReader ar = new AddReader();
               ar.setVisible(true);
               break;
           case '4':
               BranchInfo bi = new BranchInfo();
               bi.setVisible(true);
               break;
           case '5':
               PrintBorrowers pbr = new PrintBorrowers();
               pbr.setVisible(true);
               break;
           case '6':
               PrintBorrowed pbd = new PrintBorrowed();
               pbd.setVisible(true);
               break;
           case '7':
               AverageFine af = new AverageFine();
               af.setVisible(true);
               break;    
       }
    }//GEN-LAST:event_nextActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton add_book;
    private javax.swing.JRadioButton add_reader;
    private javax.swing.JRadioButton avg_fine;
    private javax.swing.JRadioButton branch_info;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancel;
    private javax.swing.JButton next;
    private javax.swing.JRadioButton print_borrowed;
    private javax.swing.JRadioButton print_borrower;
    private javax.swing.JRadioButton search_book;
    // End of variables declaration//GEN-END:variables
}
