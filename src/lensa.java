/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
public class lensa extends javax.swing.JFrame {

    /**
     * Creates new form lensa
     */
    DefaultTableModel model;
    //private Connection Connection;
    public lensa()throws SQLException {
        initComponents();
        String [] judul={"kode lensa","nama lensa","jenis lensa","harga lensa"};
        model  = new DefaultTableModel(judul,0);
        jTable_lensa.setModel(model);
        autonumber();
        tampilkan_data();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBexit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTkd_lensa = new javax.swing.JTextField();
        jTnama_lensa = new javax.swing.JTextField();
        jTharga_lensa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_lensa = new javax.swing.JTable();
        jBtambah = new javax.swing.JButton();
        jBedit = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jenislensa = new javax.swing.JComboBox<>();
        cetak = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBexit.setBackground(new java.awt.Color(255, 0, 0));
        jBexit.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jBexit.setForeground(new java.awt.Color(255, 255, 255));
        jBexit.setText("X");
        jBexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexitActionPerformed(evt);
            }
        });
        jPanel1.add(jBexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 60, 50));

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 30)); // NOI18N
        jLabel1.setText("LENSA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 150, -1));

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 1, 13)); // NOI18N
        jLabel2.setText("Kode Lensa");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 1, 13)); // NOI18N
        jLabel3.setText("Nama Lensa");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Kristen ITC", 1, 13)); // NOI18N
        jLabel4.setText("Jenis lensa");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Kristen ITC", 1, 13)); // NOI18N
        jLabel5.setText("Harga Lensa");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jTkd_lensa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTkd_lensa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTkd_lensaActionPerformed(evt);
            }
        });
        jPanel1.add(jTkd_lensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 150, 40));

        jTnama_lensa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jTnama_lensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 150, 40));

        jTharga_lensa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jTharga_lensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 150, 40));

        jTable_lensa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable_lensa.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_lensa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_lensaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_lensa);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 530, 100));

        jBtambah.setBackground(new java.awt.Color(255, 245, 252));
        jBtambah.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jBtambah.setText("TAMBAH");
        jBtambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtambahActionPerformed(evt);
            }
        });
        jPanel1.add(jBtambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 130, 50));

        jBedit.setBackground(new java.awt.Color(255, 245, 252));
        jBedit.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jBedit.setText("EDIT");
        jBedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeditActionPerformed(evt);
            }
        });
        jPanel1.add(jBedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 130, 50));

        jButton3.setBackground(new java.awt.Color(255, 245, 252));
        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton3.setText("HAPUS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 140, 50));

        jLabel6.setFont(new java.awt.Font("Kristen ITC", 1, 30)); // NOI18N
        jLabel6.setText("SUKA KAMERA  SOLO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, -1));

        jenislensa.setBackground(new java.awt.Color(255, 245, 252));
        jenislensa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH", "Lensa Kit", "Lensa Tele", "Lensa Macro", "Lensa Fixed", "Lensa Wide ", "Lensa Fisheye" }));
        jPanel1.add(jenislensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 110, 30));

        cetak.setBackground(new java.awt.Color(255, 245, 252));
        cetak.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        cetak.setText("LAPORAN");
        cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakActionPerformed(evt);
            }
        });
        jPanel1.add(cetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 140, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SK'S.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel7.setText("180101161/Panji Taruna");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 356, -1, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 620, 370);

        setSize(new java.awt.Dimension(637, 410));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexitActionPerformed
        // TODO add your handling code here:
        new menuadmin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jBexitActionPerformed

    private void jTkd_lensaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTkd_lensaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTkd_lensaActionPerformed

    private void jBeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeditActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sewa_kamera","root","");
            cn.createStatement().executeUpdate("update lensa set nama_lensa='"+jTnama_lensa.getText()+"', jenis_lensa='"+jenislensa.getSelectedItem()+"', harga_lensa='"+jTharga_lensa.getText()+"' where kd_lensa='"+jTkd_lensa.getText()+"'");
            autonumber();
            tampilkan_data();    
            reset();
        } catch (SQLException ex) {
            //Logger.getLogger(lensa.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null,ex); 
        }

    }//GEN-LAST:event_jBeditActionPerformed

    private void jBtambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtambahActionPerformed
       try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sewa_kamera","root","");
            cn.createStatement().executeUpdate("insert into lensa values"+"('"+jTkd_lensa.getText()+"','"+jTnama_lensa.getText()+"','"+jenislensa.getSelectedItem()+"','"+jTharga_lensa.getText()+"')");
            autonumber();
            tampilkan_data();
            reset();
       } catch (SQLException ex) {
            //Logger.getLogger(kamera.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "cek kembali data !!");
        }
    }//GEN-LAST:event_jBtambahActionPerformed

    private void jTable_lensaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_lensaMouseClicked
        // TODO add your handling code here:
        int i=jTable_lensa.getSelectedRow();
        
        if(i>-1){
            jTkd_lensa.setText(model.getValueAt(i,0).toString());
            jTnama_lensa.setText(model.getValueAt(i,1).toString());
            jenislensa.setSelectedItem(model.getValueAt(i,2).toString());
            jTharga_lensa.setText(model.getValueAt(i,3).toString());
        }
    }//GEN-LAST:event_jTable_lensaMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sewa_kamera","root","");
            cn.createStatement().executeUpdate("delete from lensa where kd_lensa='"+jTkd_lensa.getText()+"'");
            autonumber();
            tampilkan_data();
            reset();
     } catch (SQLException ex) {
            //Logger.getLogger(kamera.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex); 
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakActionPerformed
        // TODO add your handling code here:
                          try {
            HashMap parameter = new HashMap();
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sewa_kamera", "root", "");
            File file = new File("src/laporan/lensa.jasper");            
            JasperReport jr =(JasperReport) JRLoader.loadObject(file);
            JasperPrint jp = JasperFillManager.fillReport(jr, parameter,cn);  
           JasperViewer.viewReport(jp,false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);         
        } catch (Exception e) {
            e.printStackTrace();
        }
 
    }//GEN-LAST:event_cetakActionPerformed
    private void reset (){
        autonumber();
//        jTkd_lensa.setText("");
        jTnama_lensa.setText("");
        jenislensa.setSelectedItem("PILIH");
        jTharga_lensa.setText("");
    }                                       

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
            java.util.logging.Logger.getLogger(lensa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lensa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lensa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lensa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new lensa().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(lensa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cetak;
    private javax.swing.JButton jBedit;
    private javax.swing.JButton jBexit;
    private javax.swing.JButton jBtambah;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_lensa;
    private javax.swing.JTextField jTharga_lensa;
    private javax.swing.JTextField jTkd_lensa;
    private javax.swing.JTextField jTnama_lensa;
    private javax.swing.JComboBox<String> jenislensa;
    // End of variables declaration//GEN-END:variables

 private void autonumber(){
    String kd_lensa= "LS0000";
    int i = 0;
    try{
    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sewa_kamera","root","");
    Statement st =cn.createStatement();
    String sql= "select kd_lensa from lensa";
    ResultSet rs = st.executeQuery(sql);
    while(rs.next()){
	kd_lensa = rs.getString("kd_lensa");
    }
    kd_lensa = kd_lensa.substring(4);
    i = Integer.parseInt(kd_lensa)+1;
    kd_lensa = "00"+i;
    kd_lensa = "LS"+ kd_lensa.substring(kd_lensa.length()-3);
    jTkd_lensa.setText(kd_lensa);
    } catch (SQLException e) {
	System.out.println(e.getMessage());
    }
}    
    private void tampilkan_data() { //throws SQLException {
    int row = jTable_lensa.getRowCount();
    for(int a= 0; a<row;a++){
       model.removeRow(0);
    }
      try{
      Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sewa_kamera","root","");
      ResultSet rs=cn.createStatement().executeQuery("select * FROM lensa");
      while(rs.next()){
          String data[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)};
          model.addRow(data);
      }
    } catch (SQLException ex){
        Logger.getLogger(kamera.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
}
