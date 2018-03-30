
package booksage;

import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Query;
import org.hibernate.Session;


public class AuthorInfoFrame extends javax.swing.JFrame {

    
    public AuthorInfoFrame(Authors author) {
        initComponents();
        firstNameLable.setText(author.getFirstName());
        lastNameLable.setText(author.getLastName());
        dateOfBirthLable.setText(author.getAge().toString());
        selectAllBooks(author.getId());
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        firstNameLable = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lastNameLable = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dateOfBirthLable = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();

        setLocation(new java.awt.Point(300, 300));

        jLabel1.setText("First name:");

        firstNameLable.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        firstNameLable.setText("jLabel2");

        jLabel2.setText("Last name:");

        lastNameLable.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lastNameLable.setText("jLabel3");

        jLabel3.setText("Date of birth:");

        dateOfBirthLable.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        dateOfBirthLable.setText("jLabel4");

        jLabel4.setText("Books list:");

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
        jScrollPane1.setViewportView(bookTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(firstNameLable, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(lastNameLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dateOfBirthLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel4))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(firstNameLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lastNameLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dateOfBirthLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookTable;
    private javax.swing.JLabel dateOfBirthLable;
    private javax.swing.JLabel firstNameLable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameLable;
    // End of variables declaration//GEN-END:variables
    private void selectAllBooks(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();        
        Query query = session.createQuery("from Books B where B.authors.id = :id");
        query.setParameter("id", id);
        List list = query.list();
        displayBookResult(list);
        session.close();
    }
    
    private void displayBookResult(List resultList) {
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("Id"); 
        tableHeaders.add("Book name");        
        tableHeaders.add("Price");
    

        for(Object o : resultList) {
            Books book = (Books)o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(book.getId());
            oneRow.add(book.getName());            
            oneRow.add(book.getPrice());
            tableData.add(oneRow);
        }
    bookTable.setModel(new DefaultTableModel(tableData, tableHeaders));
}
}
