package learn;
import learn.reader_sub.*;

public class Reader_menu extends javax.swing.JFrame {
    int reader_id;
    private static char selected;
    /**
     * Creates new form Reader_menu
     */
    public Reader_menu() {
        initComponents();
    }
    public Reader_menu(int r){
        initComponents();
        reader_id = r;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        search_book = new javax.swing.JRadioButton();
        book_checkout = new javax.swing.JRadioButton();
        book_return = new javax.swing.JRadioButton();
        book_reserve = new javax.swing.JRadioButton();
        compute_fines = new javax.swing.JRadioButton();
        print_books = new javax.swing.JRadioButton();
        print_title = new javax.swing.JRadioButton();
        next = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        buttonGroup1.add(search_book);
        buttonGroup1.add(book_checkout);
        buttonGroup1.add(book_return);
        buttonGroup1.add(book_reserve);
        buttonGroup1.add(compute_fines);
        buttonGroup1.add(print_books);
        buttonGroup1.add(print_title);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reader Menu");

        search_book.setText("Search a book by Id, title or Publsiher name");
        search_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_bookActionPerformed(evt);
            }
        });

        book_checkout.setText("Book Checkout");
        book_checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_checkoutActionPerformed(evt);
            }
        });

        book_return.setText("Book return");
        book_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_returnActionPerformed(evt);
            }
        });

        book_reserve.setText("Book reserve");
        book_reserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_reserveActionPerformed(evt);
            }
        });

        compute_fines.setText("Compute fine for a book copy borrowed by a reader based on a current date");
        compute_fines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compute_finesActionPerformed(evt);
            }
        });

        print_books.setText("Print the list of book reserved by a reader and their status");
        print_books.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_booksActionPerformed(evt);
            }
        });

        print_title.setText("Print the book id and titles of books publsihed by a publisher");
        print_title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_titleActionPerformed(evt);
            }
        });

        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Reader Menu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(book_return, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(book_reserve, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(compute_fines, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(print_books, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(book_checkout, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(print_title, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search_book, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Cancel, next});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search_book)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(book_checkout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(book_return)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(book_reserve)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(compute_fines)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(print_books)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(print_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(next)
                    .addComponent(Cancel))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
       dispose();
    }//GEN-LAST:event_CancelActionPerformed

    private void search_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_bookActionPerformed
        selected = '1';
    }//GEN-LAST:event_search_bookActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        dispose();
        switch(selected){
           case '1':
               SearchBook sb = new SearchBook();
               sb.setVisible(true);
               break;
           case '2':
               Checkout c = new Checkout(reader_id);
               c.setVisible(true);
               break;
           case '3':
               BookReturn br = new BookReturn(reader_id);
               br.setVisible(true);
               break;
           case '4':
               BookReserve b = new BookReserve(reader_id);
               b.setVisible(true);
               break;
           case '5':
               ComputeFines cf = new ComputeFines(reader_id);
               cf.setVisible(true);
               break;
           case '6':
               BookStatus bs = new BookStatus(reader_id);
               bs.setVisible(true);
               break;
           case '7':
               PrintBook pb = new PrintBook();
               pb.setVisible(true);
               break;
                  
       }
        
    }//GEN-LAST:event_nextActionPerformed

    private void book_checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_checkoutActionPerformed
        selected = '2';
    }//GEN-LAST:event_book_checkoutActionPerformed

    private void book_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_returnActionPerformed
       selected = '3';
    }//GEN-LAST:event_book_returnActionPerformed

    private void book_reserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_reserveActionPerformed
        selected = '4';        
    }//GEN-LAST:event_book_reserveActionPerformed

    private void compute_finesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compute_finesActionPerformed
        selected = '5';        
    }//GEN-LAST:event_compute_finesActionPerformed

    private void print_booksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_booksActionPerformed
        selected = '6';        
    }//GEN-LAST:event_print_booksActionPerformed

    private void print_titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_titleActionPerformed
        selected = '7';        
    }//GEN-LAST:event_print_titleActionPerformed

    
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
            java.util.logging.Logger.getLogger(Reader_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reader_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reader_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reader_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reader_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JRadioButton book_checkout;
    private javax.swing.JRadioButton book_reserve;
    private javax.swing.JRadioButton book_return;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton compute_fines;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton next;
    private javax.swing.JRadioButton print_books;
    private javax.swing.JRadioButton print_title;
    private javax.swing.JRadioButton search_book;
    // End of variables declaration//GEN-END:variables
}
