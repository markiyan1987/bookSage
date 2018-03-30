
package booksage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        selectAllBooks();
        selectAllAuthors();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        bookNameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bookPriceField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        authorFirstNameField = new javax.swing.JTextField();
        Label1 = new javax.swing.JLabel();
        authorLastNameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dayField = new javax.swing.JTextField();
        monthField = new javax.swing.JTextField();
        yearField = new javax.swing.JTextField();
        authorAddBtn = new javax.swing.JButton();
        authorUpdateBtn = new javax.swing.JButton();
        authorDeleteBtn = new javax.swing.JButton();
        bookAddBtn = new javax.swing.JButton();
        bookUpdateBtn = new javax.swing.JButton();
        bookDeleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        authorTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        bookAuthorComboBox = new javax.swing.JComboBox<>();
        authorInfoBtn = new javax.swing.JButton();
        bookInfoBtn = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(150, 150));

        jLabel1.setText("Book Name");

        jLabel2.setText("Price");

        jLabel3.setText("Author");

        Label2.setText("First Name");

        Label1.setText("Last Name");

        jLabel4.setText("Date of birth");

        authorAddBtn.setText("Add");
        authorAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorAddBtnActionPerformed(evt);
            }
        });

        authorUpdateBtn.setText("Update");
        authorUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorUpdateBtnActionPerformed(evt);
            }
        });

        authorDeleteBtn.setText("Delete");
        authorDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorDeleteBtnActionPerformed(evt);
            }
        });

        bookAddBtn.setText("Add");
        bookAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookAddBtnActionPerformed(evt);
            }
        });

        bookUpdateBtn.setText("Update");
        bookUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookUpdateBtnActionPerformed(evt);
            }
        });

        bookDeleteBtn.setText("Delete");
        bookDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookDeleteBtnActionPerformed(evt);
            }
        });

        authorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ){public boolean isCellEditable(int rowIndex, int mColIndex) {
            return false;
        }}
    );
    authorTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    authorTable.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            authorTableMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(authorTable);

    jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel5.setText("Authors");

    jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel6.setText("Books");

    bookTable.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "Title 1", "Title 2", "Title 3", "Title 4"
        }
    ));
    bookTable.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            bookTableMouseClicked(evt);
        }
    });
    jScrollPane3.setViewportView(bookTable);

    authorInfoBtn.setText("Info");
    authorInfoBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            authorInfoBtnActionPerformed(evt);
        }
    });

    bookInfoBtn.setText("Info");
    bookInfoBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            bookInfoBtnActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6))
                    .addContainerGap(813, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Label2)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bookNameField)
                                .addComponent(authorFirstNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Label1)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(authorLastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bookPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(dayField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(monthField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(authorAddBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(authorUpdateBtn))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bookAuthorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bookAddBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bookUpdateBtn)))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(bookDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bookInfoBtn))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(authorDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(authorInfoBtn)))
                    .addGap(61, 61, 61))))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Label2)
                .addComponent(authorFirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Label1)
                .addComponent(authorLastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel4)
                .addComponent(dayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(monthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(authorAddBtn)
                .addComponent(authorUpdateBtn)
                .addComponent(authorDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(authorInfoBtn))
            .addGap(11, 11, 11)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(bookNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2)
                .addComponent(jLabel3)
                .addComponent(bookAddBtn)
                .addComponent(bookUpdateBtn)
                .addComponent(bookDeleteBtn)
                .addComponent(bookAuthorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(bookPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(bookInfoBtn))
            .addGap(26, 26, 26)
            .addComponent(jLabel5)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel6)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void authorAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorAddBtnActionPerformed
        Date age = new Date(Integer.parseInt(yearField.getText())-1900,Integer.parseInt(monthField.getText())-1,Integer.parseInt(dayField.getText()));
        Authors author = new Authors(authorFirstNameField.getText(),authorLastNameField.getText(),age);
        insertAuthor(author);
    }//GEN-LAST:event_authorAddBtnActionPerformed

    private void bookAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookAddBtnActionPerformed
        String author = (String)bookAuthorComboBox.getSelectedItem();        
        String firstName= author.substring(0,author.indexOf(" "));
        String lastName= author.substring(author.indexOf(" ")+1);
        Authors author_ = selectAuthorByName(firstName, lastName);
        insertBook(new Books(author_, bookNameField.getText(), Integer.parseInt(bookPriceField.getText())));
    }//GEN-LAST:event_bookAddBtnActionPerformed

    private void authorTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_authorTableMouseClicked
        
        
            
            int index = authorTable.getSelectedRow();
            TableModel model = authorTable.getModel();
            authorFirstNameField.setText(model.getValueAt(index,1).toString());
            authorLastNameField.setText(model.getValueAt(index,2).toString());
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date _date = formatter.parse(model.getValueAt(index,3).toString());            
                dayField.setText(String.valueOf(_date.getDate()));
                monthField.setText(String.valueOf(_date.getMonth()+1));
                yearField.setText(String.valueOf(_date.getYear()+1900));
            } catch (ParseException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_authorTableMouseClicked

    private void authorUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorUpdateBtnActionPerformed
        int row = authorTable.getSelectedRow();
        TableModel model = authorTable.getModel();
        String index = model.getValueAt(row,0).toString();
        int _index = Integer.parseInt(index);
        String firstName = authorFirstNameField.getText();
        String lastName =authorLastNameField.getText();
        Date dateOfBirth = new Date(Integer.parseInt(yearField.getText())-1900,Integer.parseInt(monthField.getText())-1,Integer.parseInt(dayField.getText()));                
        updateAuthor(_index, firstName, lastName,dateOfBirth);
        selectAllAuthors();
    }//GEN-LAST:event_authorUpdateBtnActionPerformed

    private void authorDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorDeleteBtnActionPerformed
        int row = authorTable.getSelectedRow();
        TableModel model = authorTable.getModel();
        String index = model.getValueAt(row,0).toString();
        int _index = Integer.parseInt(index);
        deleteAuthor(_index);
        selectAllAuthors();
    }//GEN-LAST:event_authorDeleteBtnActionPerformed

    private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseClicked
        int index = bookTable.getSelectedRow();
        TableModel model = bookTable.getModel();
        bookNameField.setText(model.getValueAt(index,1).toString());
        bookAuthorComboBox.setSelectedItem(model.getValueAt(index,2).toString());        
        bookPriceField.setText(model.getValueAt(index,3).toString());
    }//GEN-LAST:event_bookTableMouseClicked

    private void bookUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookUpdateBtnActionPerformed
        int row = bookTable.getSelectedRow();
        TableModel model = bookTable.getModel();
        String index = model.getValueAt(row,0).toString();
        int _index = Integer.parseInt(index);
        String name = bookNameField.getText();
        String author = (String)bookAuthorComboBox.getSelectedItem();        
        String firstName= author.substring(0,author.indexOf(" "));
        String lastName= author.substring(author.indexOf(" ")+1);
        Authors author_ = selectAuthorByName(firstName, lastName);
        String bookPrice = bookPriceField.getText();
        int _bookPrice = Integer.parseInt(bookPrice);        
        updateBook(_index, name, author_,_bookPrice);
        selectAllBooks();
    }//GEN-LAST:event_bookUpdateBtnActionPerformed

    private void bookDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookDeleteBtnActionPerformed
        int row = bookTable.getSelectedRow();
        TableModel model = bookTable.getModel();
        String index = model.getValueAt(row,0).toString();
        int _index = Integer.parseInt(index);
        deleteBook(_index);
        selectAllBooks();
    }//GEN-LAST:event_bookDeleteBtnActionPerformed

    private void authorInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorInfoBtnActionPerformed
        Authors author = selectAuthorByName(authorFirstNameField.getText(), authorLastNameField.getText());
        AuthorInfoFrame authorInfoFrame = new AuthorInfoFrame(author);
        authorInfoFrame.setVisible(true);
    }//GEN-LAST:event_authorInfoBtnActionPerformed

    private void bookInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookInfoBtnActionPerformed
        Books book = selectBookByName(bookNameField.getText());        
        BookInfoFrame bookInfoFrame = new BookInfoFrame(book, (String)bookAuthorComboBox.getSelectedItem());
        bookInfoFrame.setVisible(true);
    }//GEN-LAST:event_bookInfoBtnActionPerformed

    public static void main(String args[]) {        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JButton authorAddBtn;
    private javax.swing.JButton authorDeleteBtn;
    private javax.swing.JTextField authorFirstNameField;
    private javax.swing.JButton authorInfoBtn;
    private javax.swing.JTextField authorLastNameField;
    private javax.swing.JTable authorTable;
    private javax.swing.JButton authorUpdateBtn;
    private javax.swing.JButton bookAddBtn;
    private javax.swing.JComboBox<String> bookAuthorComboBox;
    private javax.swing.JButton bookDeleteBtn;
    private javax.swing.JButton bookInfoBtn;
    private javax.swing.JTextField bookNameField;
    private javax.swing.JTextField bookPriceField;
    private javax.swing.JTable bookTable;
    private javax.swing.JButton bookUpdateBtn;
    private javax.swing.JTextField dayField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField monthField;
    private javax.swing.JTextField yearField;
    // End of variables declaration//GEN-END:variables

private void selectAllBooks(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from Books");
        List list = query.list();
        displayBookResult(list);
    }

private void selectAllAuthors(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from Authors");
        List list = query.list();
        displayAuthorResult(list);
        displayComboBox(list);
    }

private Authors selectAuthorByName(String firstName, String lastName){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from Authors A where A.firstName = :firstName and A.lastName = :lastname");
        query.setParameter("firstName", firstName);
        query.setParameter("lastname", lastName);
        List list = query.list();
        Authors author = (Authors)list.get(0);
        session.close();
        return author;
}

private Books selectBookByName(String name){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from Books B where B.name = :name");
        query.setParameter("name", name);        
        List list = query.list();
        Books book = (Books)list.get(0);
        session.close();
        return book;
}

private void displayBookResult(List resultList) {
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("Id"); 
        tableHeaders.add("Book name");
        tableHeaders.add("Author");
        tableHeaders.add("Price");
    

        for(Object o : resultList) {
            Books book = (Books)o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(book.getId());
            oneRow.add(book.getName());
            oneRow.add(book.getAuthors().getFirstName() +" " + book.getAuthors().getLastName());
            oneRow.add(book.getPrice());
            tableData.add(oneRow);
        }
    bookTable.setModel(new DefaultTableModel(tableData, tableHeaders));
}

private void displayAuthorResult(List resultList) {
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("Id"); 
        tableHeaders.add("First name");
        tableHeaders.add("Last name");
        tableHeaders.add("Date of birth");     

        for(Object o : resultList) {
            Authors author = (Authors)o;
            Vector<Object> oneRow = new Vector<Object>();            
            oneRow.add(author.getId());
            oneRow.add(author.getFirstName());
            oneRow.add(author.getLastName());
            oneRow.add(author.getAge());
            tableData.add(oneRow);
        }
    authorTable.setModel(new DefaultTableModel(tableData,tableHeaders));
    
}

private void displayComboBox(List resultList){
    bookAuthorComboBox.removeAllItems();
    for(Object o : resultList) {
        Authors author = (Authors)o;        
        bookAuthorComboBox.addItem(author.getFirstName()+" " + author.getLastName());            
    }    
}

private void insertAuthor(Authors author) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();        
    } catch (HibernateException he) {
    }
    selectAllAuthors();
}

private void insertBook(Books book) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(book);
        session.getTransaction().commit();        
    } catch (HibernateException he) {
    }
    selectAllBooks();
}

private void updateAuthor(Integer id, String firstName, String lastName, Date age){
        Session session = HibernateUtil.getSessionFactory().openSession();		
	session.beginTransaction();
        Authors author = (Authors)session.get(Authors.class, id);
        author.setFirstName(firstName);
        author.setLastName(lastName);
        author.setAge(age);
        session.update(author);
	session.getTransaction().commit();
	session.close();
    }

private void updateBook(Integer id, String name, Authors author, int price){
        Session session = HibernateUtil.getSessionFactory().openSession();		
		session.beginTransaction();
                Books book = (Books)session.get(Books.class, id);
                book.setName(name);
                book.setAuthors(author);
                book.setPrice(price);
		session.update(book);
		session.getTransaction().commit();
		session.close();
    }

private void deleteAuthor(Integer id){
        Session session = HibernateUtil.getSessionFactory().openSession();		
		session.beginTransaction();
                Authors author = (Authors)session.get(Authors.class, id);                
		session.delete(author);
		session.getTransaction().commit();
	session.close();
}

private void deleteBook(Integer id){
        Session session = HibernateUtil.getSessionFactory().openSession();		
		session.beginTransaction();
                Books book = (Books)session.get(Books.class, id);                
		session.delete(book);
		session.getTransaction().commit();
	session.close();
    }

}


