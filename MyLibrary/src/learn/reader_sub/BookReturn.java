package learn.reader_sub;
import learn.*;
import java.sql.*;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.util.Date;
public class BookReturn extends javax.swing.JFrame {
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    JOptionPane op = new JOptionPane();
    JDialog dia = null;
    int r=0;
    public BookReturn() {
        initComponents();
    }
    public BookReturn(int reader_id) {
        initComponents();
        r = reader_id;
        books();
    }
    private void books(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager
          .getConnection("jdbc:mysql://localhost/library?"
              + "user=name&password=password");
            statement = connect.createStatement();
            preparedStatement = connect.prepareStatement("select book_id from borrow "
                    + "where reader_id="+r+" and return_date is NULL;");
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                int i = resultSet.getInt("book_id");
                book_id.addItem(i);
            }
        }catch(Exception e){
            op.setMessage(e.getMessage());
            op.setMessageType(0);
            dia = op.createDialog("Error");
            dia.setVisible(true);
        }
    }
    private int calculateDays(Date a,Date b)
    {
        Integer rmonth = new Integer(a.toString().substring(5, 7));
        Integer bmonth = new Integer(b.toString().substring(5, 7));
        Integer rday = new Integer(a.toString().substring(8));
        Integer bday = new Integer(b.toString().substring(8));
        int i=0;
        if(rmonth.equals(bmonth)){
            if(rday-bday <= 15)
                return 0;
            else
                return rday-bday-15;
        }
        else
        { 
            i = rmonth - bmonth;
            if(i==1){
                if(bmonth == 1 || bmonth == 3 || bmonth==5 || bmonth==7 || bmonth==8 || bmonth==10){
                    if(31-bday+rday-15 < 0)
                        return 0;
                    else
                        return 31-bday+rday-15;}
                else{
                    if(31-bday+rday-15 < 0)
                        return 0;
                    else
                        return 31-bday+rday-15;}
            }
            return 50;
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        reTurn = new javax.swing.JButton();
        book_id = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Book Return");

        jLabel2.setText("Book Id :");

        reTurn.setText("Return");
        reTurn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reTurnActionPerformed(evt);
            }
        });

        book_id.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addComponent(book_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(142, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(reTurn)
                .addGap(147, 147, 147))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(book_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(reTurn)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reTurnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reTurnActionPerformed
        Date utilDate = new Date();
        java.sql.Date rd = new java.sql.Date(utilDate.getTime());
        int i=0;
        try{
           Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager
          .getConnection("jdbc:mysql://localhost/library?"
              + "user=name&password=password");
            statement = connect.createStatement();            
            preparedStatement = connect.prepareStatement("select borrow_date from "
                    + "borrow where book_id="+book_id.getSelectedItem()+" and reader_id="+r+";");
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                java.sql.Date bd = resultSet.getDate("borrow_date");
                int j = calculateDays(rd, bd);
                Integer k = new Integer(book_id.getSelectedItem().toString());
            preparedStatement = connect.prepareStatement("update borrow "
                    + "set return_date='"+rd+"', fine="+Math.round(j*0.1*100.0)/100.0+" where "
                    + "book_id="+k+" and reader_id="+r+" and borrow_date='"+bd+"';");
            preparedStatement.executeUpdate();
            op.setMessage("Borrowed date is :"+bd+", Return date is :"+rd+". Fine=$"+Math.round(j*0.1*100.0)/100.0);
            op.setMessageType(1);
            dia = op.createDialog("Book Returned");
            dia.setVisible(true);
            preparedStatement = connect.prepareStatement("select isbn, branch_id from book where"
                    + " book_id="+k+";");
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                String isbn = resultSet.getString("isbn");
                int branch_id = resultSet.getInt("branch_id");
                preparedStatement = connect.prepareStatement("update copy set copies=copies+1 where "
                        + "isbn='"+isbn+"' and branch_id="+branch_id+";");
                preparedStatement.executeUpdate();
                preparedStatement = connect.prepareStatement("update book set available=1 where "
                        + "book_id="+book_id.getSelectedItem().toString()+";");
                preparedStatement.executeUpdate();
            }
            }
            dispose();
            Reader_menu rm = new Reader_menu(r);
            rm.setVisible(true);
       }catch(Exception e){
           op.setMessage(e.getMessage());
           op.setMessageType(0);
           dia = op.createDialog("Error");
           dia.setVisible(true);
       }
    }//GEN-LAST:event_reTurnActionPerformed

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
            java.util.logging.Logger.getLogger(BookReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookReturn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox book_id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton reTurn;
    // End of variables declaration//GEN-END:variables
}
