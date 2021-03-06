package learn.admin_sub.newBook;
import java.sql.*;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import learn.Admin_menu;

public class newIsbn extends javax.swing.JFrame {
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    JOptionPane op = new JOptionPane();
    JDialog dia = null;
    /**
     * Creates new form newIsbn
     */
    public newIsbn() {
        initComponents();
        addPublisherNBranch();
    }

    public void addPublisherNBranch(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
      // setup the connection with the DB.
       connect = DriverManager
          .getConnection("jdbc:mysql://localhost/library?"
              + "user=name&password=password");

      // statements allow to issue SQL queries to the database
        statement = connect.createStatement();
        preparedStatement = connect.prepareStatement("select pub_name from publisher;");
      resultSet = preparedStatement.executeQuery();
      while(resultSet.next())
      {
          String s = resultSet.getString("pub_name");
          pub_name.addItem(s.trim());
      }
      preparedStatement = connect.prepareStatement("select name from branch;");
      resultSet = preparedStatement.executeQuery();
      while(resultSet.next())
      {
          String s = resultSet.getString("name");
          branch.addItem(s.trim());
      }
        }catch(Exception e){
            op.setMessage(e.getMessage());
            op.setMessageType(0);
            dia = op.createDialog("Error");
            dia.setVisible(true);
        }
    }
    public void auth(String a)
    {
        boolean flag=false;
        try{
            Class.forName("com.mysql.jdbc.Driver");
      // setup the connection with the DB.
            connect = DriverManager
          .getConnection("jdbc:mysql://localhost/library?"
              + "user=name&password=password");

      // statements allow to issue SQL queries to the database
            statement = connect.createStatement();
            preparedStatement = connect.prepareStatement("select name from author;");
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next())
            {
                if(a.equals(resultSet.getString("name"))){
                    flag=true;
                    break;}
                else
                    flag=false;
            }    
            if(!flag){
            preparedStatement = connect.prepareStatement("insert into author(name)"
                    + " values(?);");
            preparedStatement.setString(1,a);
            preparedStatement.executeUpdate();
            }
            
        }catch(Exception e){
            op.setMessage(e.getMessage());
            op.setMessageType(0);
            dia = op.createDialog("Error");
            dia.setVisible(true);
        }        
      }
    public int pub_id(String name){
        int i=0;
        try{
            preparedStatement = connect.prepareStatement("select pub_id from publisher "
                    + "where pub_name='"+name+"'");
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                i=resultSet.getInt("pub_id");
            }
        }catch(Exception e){
            op.setMessage(e.getMessage());
            op.setMessageType(0);
            dia = op.createDialog("Error");
            dia.setVisible(true);
        }
        return i;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        isbn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pub_name = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        branch = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        position = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        author = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Title :");

        title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleActionPerformed(evt);
            }
        });

        jLabel2.setText("ISBN :");

        isbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isbnActionPerformed(evt);
            }
        });

        jLabel3.setText("Publisher :");

        pub_name.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));

        jLabel4.setText("Branch :");

        branch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        branch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchActionPerformed(evt);
            }
        });

        jLabel5.setText("Position :");

        position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionActionPerformed(evt);
            }
        });

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jLabel6.setText("Publication Date :");

        date.setDateFormatString("MM-d-yyyy");

        jLabel7.setText("Author :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(submit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(branch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pub_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(author, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(72, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {author, isbn, position, title});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {branch, pub_name});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pub_name, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(branch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(submit)
                .addGap(20, 20, 20))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {author, isbn, position, title});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {branch, pub_name});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void branchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_branchActionPerformed

    private void isbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isbnActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        int i, j, k=0;
        auth(author.getText());
        try{
        Class.forName("com.mysql.jdbc.Driver");
      // setup the connection with the DB.
       connect = DriverManager
          .getConnection("jdbc:mysql://localhost/library?"
              + "user=name&password=password");

      // statements allow to issue SQL queries to the database
        statement = connect.createStatement();
        preparedStatement = connect.prepareStatement("select branch_id from branch "
                + "where name='"+branch.getSelectedItem().toString()+"';");
        resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            k = resultSet.getInt("branch_id");
        }
        preparedStatement = connect.prepareStatement("select author_id from author "
                + "where name='"+author.getText()+"';");
        resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
          i = resultSet.getInt("author_id");
          j = pub_id(pub_name.getSelectedItem().toString());
          java.util.Date utilDate = date.getDate();
          java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
          preparedStatement = connect.prepareStatement("insert into book_info(isbn, "
                  + "title, publisher_id, pub_date, author_id) values(?, ?, ?, ?, ?)");
          preparedStatement.setString(1, isbn.getText());
          preparedStatement.setString(2, title.getText());
          preparedStatement.setInt(3, j);
          preparedStatement.setDate(4, sqlDate);
          preparedStatement.setInt(5, i);
          preparedStatement.executeUpdate();
          preparedStatement = connect.prepareStatement("insert into book(isbn, branch_id, "
                  + "position) values(?, ?, ?)");
          preparedStatement.setString(1, isbn.getText());
          preparedStatement.setInt(2, k);
          preparedStatement.setString(3, position.getText());
          preparedStatement.executeUpdate();
          preparedStatement = connect.prepareStatement("insert into copy(isbn, branch_id, "
                  + "copies) values(?, ?, ?)");
          preparedStatement.setString(1, isbn.getText());
          preparedStatement.setInt(2, k);
          preparedStatement.setInt(3, 1);
          preparedStatement.executeUpdate();
          dispose();
          op.setMessage("A new book has been added");
          op.setMessageType(1);
          dia = op.createDialog("Success");
          dia.setVisible(true);
          Admin_menu af = new Admin_menu();
          af.setVisible(true);         
         }
        }catch(Exception e){
          op.setMessage(e.getMessage());
          op.setMessageType(0);
          dia = op.createDialog("Error");
          dia.setVisible(true);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleActionPerformed

    private void positionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionActionPerformed

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
            java.util.logging.Logger.getLogger(newIsbn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newIsbn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newIsbn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newIsbn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newIsbn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField author;
    private javax.swing.JComboBox branch;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTextField isbn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField position;
    private javax.swing.JComboBox pub_name;
    private javax.swing.JButton submit;
    private javax.swing.JTextField title;
    // End of variables declaration//GEN-END:variables
}
