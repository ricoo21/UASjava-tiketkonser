/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konser;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Rico.Handoyo 825190001
 * Muhammad.Farras 825190029
 * Jessen 825190040
 */
public class tiket extends javax.swing.JFrame {
    double tikett;
    double jumhar;


    private void kosongkan_form(){

        nama.setText(null);
        tanggal.setSelectedItem(this);
        gender.setSelectedItem(this);
        jenis.setSelectedItem(this);
        harga.setText(null);
        qty.setSelectedItem(this);
        total.setText(null);
    }

    private void tampilkan_data() throws ClassNotFoundException{
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NO");
        model.addColumn("nama");
        model.addColumn("tanggal");
        model.addColumn("gender");
        model.addColumn("jenis");
        model.addColumn("harga");
        model.addColumn("jumlah");
        model.addColumn("total");

        try {
            int no = 1;
            String sql = "SELECT * FROM tiketkonser";
            java.sql.Connection conn = (Connection) konser.koneksi.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()){
                model.addRow(new Object[] {no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7)});

            }
            tabelkonser.setModel(model);

        } catch (SQLException e) {
            System.out.println("error :" + e.getMessage());
        }
    }

    public tiket() throws ClassNotFoundException {
        initComponents();
        tampilkan_data();
        kosongkan_form();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        formkonser = new javax.swing.JLabel();
        westlife = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        harga = new javax.swing.JTextField();
        jenis = new javax.swing.JComboBox<>();
        tanggal = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        qty = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        cek = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        gender = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelkonser = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(71, 71, 221));

        formkonser.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        formkonser.setForeground(new java.awt.Color(102, 255, 153));
        formkonser.setText("FORM PEMESANAN TIKET KONSER WINGS");

        westlife.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        westlife.setForeground(new java.awt.Color(0, 255, 204));
        westlife.setText("WESTLIFE TOUR in JAKARTA");

        nama.setBackground(new java.awt.Color(153, 204, 255));
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        harga.setEditable(false);
        harga.setBackground(new java.awt.Color(51, 204, 255));
        harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaActionPerformed(evt);
            }
        });

        jenis.setForeground(new java.awt.Color(0, 51, 51));
        jenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "WINGS A", "WINGS B", "PURPLE A", "PURPLE B", "BLACK A", "BLACK B", " " }));
        jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisActionPerformed(evt);
            }
        });

        tanggal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01 januari 2020", "02 februari 2020", "03 maret 2020", "04 april 2020", "05 mei 2020", "06 juni 2020", "07 juli 2020", "08 agustus 2020", "09 september 2020", "10 oktober 2020", "11 november 2020", "12 desember 2020", " " }));

        jLabel3.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 51));
        jLabel3.setText("Nama");

        jLabel4.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 51));
        jLabel4.setText("Tanggal");

        jLabel5.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 51));
        jLabel5.setText("Gender");

        jLabel6.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 51));
        jLabel6.setText("Jenis");

        jLabel7.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 51));
        jLabel7.setText("Harga");

        jLabel8.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 51));
        jLabel8.setText("quantity");

        qty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 51));
        jLabel9.setText("Total");

        total.setBackground(new java.awt.Color(153, 204, 255));

        cek.setBackground(new java.awt.Color(255, 102, 102));
        cek.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        cek.setForeground(new java.awt.Color(0, 255, 0));
        cek.setText("Cek");
        cek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(255, 153, 153));
        cancel.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        cancel.setForeground(new java.awt.Color(102, 204, 0));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pria", "Perempuan" }));

        tabelkonser.setBackground(new java.awt.Color(102, 255, 204));
        tabelkonser.setBorder(new javax.swing.border.MatteBorder(null));
        tabelkonser.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        tabelkonser.setForeground(new java.awt.Color(255, 51, 204));
        tabelkonser.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelkonser);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane1))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(107, 107, 107)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(62, 62, 62)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel9)
                                                                        .addComponent(jLabel8)
                                                                        .addComponent(cek)
                                                                        .addComponent(cancel)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(36, 36, 36)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel7)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel4)
                                                                                        .addComponent(jLabel5)
                                                                                        .addComponent(jLabel3)
                                                                                        .addComponent(jLabel6))
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                .addGap(376, 376, 376)
                                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                .addGap(19, 19, 19)
                                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(jenis, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(formkonser)
                                                                                                .addGap(85, 85, 85))))))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(238, 238, 238)
                                                                .addComponent(westlife)))
                                                .addGap(0, 141, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(formkonser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(westlife)
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel8)
                                        .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel9)
                                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(7, 7, 7)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(cek)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cancel)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel7)
                                                .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargaActionPerformed

    private void qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyActionPerformed
        double jumlah_harga = Double.parseDouble(harga.getText());
        if(qty.getSelectedItem().equals("1")){
            jumhar = jumlah_harga;
        }else if (qty.getSelectedItem().equals("2")){
            jumhar = jumlah_harga*2;
        }else if (qty.getSelectedItem().equals("3")){
            jumhar = jumlah_harga*3;
        }else if (qty.getSelectedItem().equals("4")){
            jumhar = jumlah_harga*4;
        }else if (qty.getSelectedItem().equals("5")){
            jumhar = jumlah_harga*5;
        }else if (qty.getSelectedItem().equals("6")){
            jumhar = jumlah_harga*6;
        }else if (qty.getSelectedItem().equals("7")){
            jumhar = jumlah_harga*7;
        }else if (qty.getSelectedItem().equals("8")){
            jumhar = jumlah_harga*8;
        }else if (qty.getSelectedItem().equals("9")){
            jumhar = jumlah_harga*9;
        }
        total.setText(jumhar+"");
    }//GEN-LAST:event_qtyActionPerformed

    private void cekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekActionPerformed

        try {
            String sql = "INSERT INTO tiketkonser VALUES ('"+nama.getText()+"','"+tanggal.getSelectedItem()+"','"+gender.getSelectedItem()+"','"+jenis.getSelectedItem()+"','"+harga.getText()+"','"+qty.getSelectedItem()+"','"+total.getText()+"')";
            java.sql.Connection conn = (Connection) konser.koneksi.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "data berhasil disimpan...");
            tampilkan_data();
            kosongkan_form();
        } catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(tiket.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_cekActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        int pilihan =0;
        JOptionPane.showConfirmDialog(null, "apakah anda mau keluar ?", "cancel",JOptionPane.YES_NO_OPTION);
        if(pilihan == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_cancelActionPerformed

    private void jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisActionPerformed
        // TODO add your handling code here:
        if(jenis.getSelectedItem().equals("WINGS A")){
            tikett = 200000;
            harga.setText(tikett+"");
        }else if (jenis.getSelectedItem().equals("WINGS B")){
            tikett = 250000;
            harga.setText(tikett+"");
        }else if (jenis.getSelectedItem().equals("PURPLE A")){
            tikett = 300000;
            harga.setText(tikett+"");
        }else if (jenis.getSelectedItem().equals("PURPLE B")){
            tikett = 350000;
            harga.setText(tikett+"");
        }else if (jenis.getSelectedItem().equals("BLACK A")){
            tikett = 400000;
            harga.setText(tikett+"");
        }else if (jenis.getSelectedItem().equals("BLACK B")){
            tikett = 450000;
            harga.setText(tikett+"");
        }

    }//GEN-LAST:event_jenisActionPerformed

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
            java.util.logging.Logger.getLogger(tiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new tiket().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(tiket.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancel;
    private javax.swing.JButton cek;
    private javax.swing.JLabel formkonser;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JTextField harga;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jenis;
    private javax.swing.JTextField nama;
    private javax.swing.JComboBox<String> qty;
    private javax.swing.JTable tabelkonser;
    private javax.swing.JComboBox<String> tanggal;
    private javax.swing.JTextField total;
    private javax.swing.JLabel westlife;
    // End of variables declaration//GEN-END:variables
}

