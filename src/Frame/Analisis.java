/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import Connection.ConnectionSet;
import DAO.DekripDAO;
import DAO.EnkripDAO;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author USER
 */
public class Analisis extends javax.swing.JFrame {

    JPanel pane;
    /**
     * Creates new form Analisi
     */
    public Analisis() {
        initComponents();
        pane = PaneMain;
        listEnkrip();
        listDekrip();
        loadEnkrip();
        loadDekrip();
        
        Font ff = new Font("CHOCHOLATE COOKIES", Font.PLAIN, 18);
        jTabbedPane1.setFont(ff);
        
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        tbAnalisis1.setShowGrid(false);
        
        JTableHeader hh2 = tbAnalisis1.getTableHeader();
        hh2.setFont(new Font("CHOCHOLATE COOKIES", 12, 13));
        hh2.setOpaque(false);
        hh2.setBackground(new Color(0, 12, 16));
        hh2.setForeground(new Color(255, 255, 255));
        
        jScrollPane2.setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);
        tbAnalisis.setShowGrid(false);
        
        JTableHeader hh1 = tbAnalisis.getTableHeader();
        hh1.setFont(new Font("CHOCHOLATE COOKIES", 12, 13));
        hh1.setOpaque(false);
        hh1.setBackground(new Color(0, 12, 16));
        hh1.setForeground(new Color(255, 255, 255));
        
        UIManager.put("TabbedPane.contentOpaque", true);
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
        PaneMain = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAnalisis = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbAnalisis1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1060, 550));

        PaneMain.setOpaque(false);
        PaneMain.setPreferredSize(new java.awt.Dimension(1060, 550));
        PaneMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        tbAnalisis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama File", "Ukuran File", "Ukuran RC5", "Ukuran RC6", "Waktu RC5", "Waktu RC6", "Memori RC5", "Memori RC6", "CPU RC5", "CPU RC6"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbAnalisis.setOpaque(false);
        jScrollPane1.setViewportView(tbAnalisis);
        if (tbAnalisis.getColumnModel().getColumnCount() > 0) {
            tbAnalisis.getColumnModel().getColumn(0).setPreferredWidth(15);
            tbAnalisis.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        jTabbedPane1.addTab("Enkripsi", jScrollPane1);

        tbAnalisis1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "File Enkrip RC5", "File Enkrip RC6", "Ukuran RC5", "Ukuran RC6", "Waktu RC5", "Waktu RC6", "Memori RC5", "Memori RC6", "CPU RC5", "CPU RC6"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbAnalisis1);
        if (tbAnalisis1.getColumnModel().getColumnCount() > 0) {
            tbAnalisis1.getColumnModel().getColumn(0).setPreferredWidth(10);
            tbAnalisis1.getColumnModel().getColumn(1).setPreferredWidth(140);
            tbAnalisis1.getColumnModel().getColumn(2).setPreferredWidth(140);
        }

        jTabbedPane1.addTab("Dekripsi", jScrollPane2);

        PaneMain.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 1040, 370));

        jLabel4.setFont(new java.awt.Font("Chocolate Cookies", 1, 56)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Analisis");
        PaneMain.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1060, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PaneMain, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PaneMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MouseClicked

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
            java.util.logging.Logger.getLogger(Analisis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Analisis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Analisis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Analisis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Analisis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PaneMain;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbAnalisis;
    private javax.swing.JTable tbAnalisis1;
    // End of variables declaration//GEN-END:variables
    Connection con;
    ConnectionSet cn = new ConnectionSet();
    PreparedStatement ps;
    ResultSet rs;
    DefaultTableModel dtm = new DefaultTableModel();

    public void setResetTable() {
        for (int i = 0; i < dtm.getRowCount(); i++) {
            dtm.removeRow(i);
            i = i - 1;
        }
    }

    public List listEnkrip() {
        List<EnkripDAO> enkripDAOs = new ArrayList();
        String sql = "SELECT * FROM enkrip";
        try {
            con = cn.getConnect();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                EnkripDAO enkripDAO = new EnkripDAO();
                enkripDAO.setNama_file(rs.getString("nama_file"));
                enkripDAO.setUkuran_file(rs.getString("ukuran_file"));
                enkripDAO.setUkuran_file_rc5(rs.getString("ukuran_file_rc5"));
                enkripDAO.setUkuran_file_rc6(rs.getString("ukuran_file_rc6"));
                enkripDAO.setWaktu_rc5(rs.getString("waktu_rc5"));
                enkripDAO.setWaktu_rc6(rs.getString("waktu_rc6"));
                enkripDAO.setMemori_rc5(rs.getString("memori_rc5"));
                enkripDAO.setMemori_rc6(rs.getString("memori_rc6"));
                enkripDAO.setCpu_rc5(rs.getString("cpu_rc5"));
                enkripDAO.setCpu_rc6(rs.getString("cpu_rc6"));
                enkripDAOs.add(enkripDAO);
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return enkripDAOs;
    }

    public void loadEnkrip() {
        List<EnkripDAO> enkripDAOs = listEnkrip();
        dtm = (DefaultTableModel) tbAnalisis.getModel();
        Object[] ob = new Object[11];
        for (int i = 0; i < enkripDAOs.size(); i++) {
            ob[0] = i+1;
            ob[1] = enkripDAOs.get(i).getNama_file();
            ob[2] = enkripDAOs.get(i).getUkuran_file();
            ob[3] = enkripDAOs.get(i).getUkuran_file_rc5();
            ob[4] = enkripDAOs.get(i).getUkuran_file_rc6();
            ob[5] = enkripDAOs.get(i).getWaktu_rc5();
            ob[6] = enkripDAOs.get(i).getWaktu_rc6();
            ob[7] = enkripDAOs.get(i).getMemori_rc5();
            ob[8] = enkripDAOs.get(i).getMemori_rc6();
            ob[9] = enkripDAOs.get(i).getCpu_rc5();
            ob[10] = enkripDAOs.get(i).getCpu_rc6();
            dtm.addRow(ob);
        }
        tbAnalisis.setModel(dtm);
    }
    
    public List listDekrip() {
        List<DekripDAO> dekripDAOs = new ArrayList();
        String sql = "SELECT * FROM dekrip";
        try {
            con = cn.getConnect();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                DekripDAO dekripDAO = new DekripDAO();
                dekripDAO.setNama_file_rc5(rs.getString("nama_file_rc5"));
                dekripDAO.setNama_file_rc6(rs.getString("nama_file_rc6"));
                dekripDAO.setUkuran_file_rc5(rs.getString("ukuran_file_rc5"));
                dekripDAO.setUkuran_file_rc6(rs.getString("ukuran_file_rc6"));
                dekripDAO.setWaktu_rc5(rs.getString("waktu_rc5"));
                dekripDAO.setWaktu_rc6(rs.getString("waktu_rc6"));
                dekripDAO.setMemori_rc5(rs.getString("memori_rc5"));
                dekripDAO.setMemori_rc6(rs.getString("memori_rc6"));
                dekripDAO.setCpu_rc5(rs.getString("cpu_rc5"));
                dekripDAO.setCpu_rc6(rs.getString("cpu_rc6"));
                dekripDAOs.add(dekripDAO);
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return dekripDAOs;
    }

    public void loadDekrip() {
        List<DekripDAO> dekripDAOs = listDekrip();
        dtm = (DefaultTableModel) tbAnalisis1.getModel();
        Object[] ob = new Object[11];
        for (int i = 0; i < dekripDAOs.size(); i++) {
            ob[0] = i+1;
            ob[1] = dekripDAOs.get(i).getNama_file_rc5();
            ob[2] = dekripDAOs.get(i).getNama_file_rc6();
            ob[3] = dekripDAOs.get(i).getUkuran_file_rc5();
            ob[4] = dekripDAOs.get(i).getUkuran_file_rc6();
            ob[5] = dekripDAOs.get(i).getWaktu_rc5();
            ob[6] = dekripDAOs.get(i).getWaktu_rc6();
            ob[7] = dekripDAOs.get(i).getMemori_rc5();
            ob[8] = dekripDAOs.get(i).getMemori_rc6();
            ob[9] = dekripDAOs.get(i).getCpu_rc5();
            ob[10] = dekripDAOs.get(i).getCpu_rc6();
            dtm.addRow(ob);
        }
        tbAnalisis1.setModel(dtm);
    }
}
