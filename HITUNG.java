/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program_ta;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adiiq
 */
public class HITUNG extends javax.swing.JFrame {
    
    int g1,g2,g3,g4,g5,g6,g7,g8,g9,g10,g11,g12,g13,g14;
    int nc1=0,nc2=0,nc3=0,nc4=0,nc5=0,nc6=0,nc7=0,nc8=0,nc9=0,nc10=0,nc11=0,nc12=0,nc13=0,nc14=0;
//    int Nc1=0,Nc3=0,Nc11=0,Nc12=0;
    int Nc1=0,Nc2=0,Nc3=0,Nc4=0,Nc5=0,Nc6=0,Nc7=0,Nc8=0,Nc9=0,Nc10=0,Nc11=0,Nc12=0,Nc13=0,Nc14=0;
//    int NC1=0,NC3=0,NC6=0,NC7=0,NC13=0,NC14=0;
    int NC1=0,NC2=0,NC3=0,NC4=0,NC5=0,NC6=0,NC7=0,NC8=0,NC9=0,NC10=0,NC11=0,NC12=0,NC13=0,NC14=0;
    
    float P1X,P2X,P3X,P4X,P5X,P6X,P7X,P8X,P9X,P10X,P11X,P12X,P13X,P14X;
//    float P1X2,P3X2,P11X2,P12X2;
    float P1X2,P2X2,P3X2,P4X2,P5X2,P6X2,P7X2,P8X2,P9X2,P10X2,P11X2,P12X2,P13X2,P14X2;
//    float P1X3,P3X3,P6X3,P7X3,P13X3,P14X3;
    float P1X3,P2X3,P3X3,P4X3,P5X3,P6X3,P7X3,P8X3,P9X3,P10X3,P11X3,P12X3,P13X3,P14X3;
    float P1,P2,P3;
    float n=1;
    float m=14;
    float p=n/3;
    String p1="PENYAKIT KANKER PAYUDARA UMUM";
    String p2="PENYAKIT KANKER PAYUDARA INFLAMASI";
    String p3="PENYAKIT KANKER PUTING PAYUDARA";
//    float mp=m*p;
//    float nm=(n+m);
    
    /**
     * Creates new form HITUNG
     */
    
    Connection con;
    Statement stmt;
    public ResultSet rs;
    DefaultTableModel model;
    String no_pasien,nama,alamat,kota,telepon,pekerjaan;
    public HITUNG(String no_pasien,String nama,String alamat,String kota,String telepon,String pekerjaan) {
        initComponents();
        setLocationRelativeTo(this);
        DoConnect();
        load_table();
        
    }

    HITUNG(String stringhis.no_pasien=this.no_pasien;
        jLabel26.setText(this.no_pasien);
        this.nama=this.nama;
        jLabel27.setText(this.nama);
        this.alamat=this.alamat;
        jLabel28.setText(this.alamat);
        this.kota=this.kota;
        jLabel29.setText(this.kota);
        this.telepon=this.telepon;
        jLabel30.setText(this.telepon);
        this.pekerjaan=this.pekerjaan;
        jLabel21.setText(this.pekerjaan);) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void DoConnect(){
        try {
            String host = "jdbc:derby://localhost/datapasien";
            String uName = "admin";
            String uPass ="admin";
            con = DriverManager.getConnection(host, uName, uPass);
        
            stmt = con.createStatement();
            String sql = "SELECT * FROM data_pasien";
            rs=stmt.executeQuery(sql);
        
        rs.next();
            String no_pasien = rs.getString("NO PASIEN");
            String nama = rs.getString("NAMA");
            String alamat = rs.getString("ALAMAT");
            String kota = rs.getString("KOTA");
            String telepon = rs.getString("TELEPON");
            String pekerjaan = rs.getString("PEKERJAAN");
            String hasil = rs.getString("HASIL");
            String penyakit = rs.getString("PENYAKIT");
        
//            txno_pasien.setText(no_pasien);
//            txnama.setText(nama);
//            txalamat.setText(alamat);
//            txkota.setText(kota);
//            txnomer.setText(telepon);
//            txpekerjaan.setText(pekerjaan);
            txhasil.setText(hasil);
            txpenyakit.setText(penyakit);
            
        }catch ( SQLException e ) {
            System.out.println(e.getMessage());
        }
    }
    
    private void load_table(){
        //membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NO PASIEN");
        model.addColumn("NAMA");
        model.addColumn("ALAMAT");
        model.addColumn("KOTA");
        model.addColumn("TELEPON");
        model.addColumn("PEKERJAAN");
        model.addColumn("HASIL");
        model.addColumn("PENYAKIT");
//        tbdata_pasien.setModel(model);
        //menampilkan data pada database 
        try{
            
            String sql= "select * from data_pasien";
            java.sql.Connection con=(Connection)koneksi.koneksiDB();
            java.sql.Statement stmt=con.createStatement();
            java.sql.ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                model.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8)});
            }
//            tbdata_pasien.setModel(model);
        }catch(Exception e){
            
        }
    }
    public void simpan(){
        
    }
    public void penyakit1(){
          TA_HASIL.append("\tPENYAKIT 1 : Hasil Diagnosa Langkah 1 \n" +
            "============================================================\n"+
            "kanker p1 : K.P.Umum\n"+
            "n =" + n+"\n"+
            "p =" + p+"\n"+
            "m =" + m+"\n"
            );
        
            if(g1==1){
                nc1+=1;
                P1X=(nc1+m*p)/(n+m);
                TA_HASIL.append("nc1 =" + nc1+"\n");
//                TA_HASIL.append("1 =" + P1X+"\n");
            }else if(g1==0){
                P1X=1;
            }
            if(g2==1){
                nc2+=1;
                P2X=(nc2+m*p)/(n+m);
                TA_HASIL.append("nc2 =" + nc2+"\n");
//                TA_HASIL.append("2 =" + P2X+"\n");
            }else if(g2==0){
                P2X=1;
            }
            if(g3==1){
                nc3+=1;
                P3X=(nc3+m*p)/(n+m);
                TA_HASIL.append("nc3 =" + nc3+"\n");
//                TA_HASIL.append("3 =" + P3X+"\n");
            }else if(g3==0){
                P3X=1;
            }
            if(g4==1){
                nc4+=1;
                P4X=(nc4+m*p)/(n+m);
                TA_HASIL.append("nc4 =" + nc4+"\n");
//                TA_HASIL.append("4 =" + P4X+"\n");
            }else if(g4==0){
                P4X=1;
            }
            if(g5==1){
                nc5+=1;
                P5X=(nc5+m*p)/(n+m);
                TA_HASIL.append("nc5 =" + nc5+"\n");
//                TA_HASIL.append("5 =" + P5X+"\n");
            }else if(g5==0){
                P5X=1;
            }
            if(g6==1){
                nc6+=1;
                P6X=(nc6+m*p)/(n+m);
                TA_HASIL.append("nc6 =" + nc6+"\n");
//                TA_HASIL.append("6 =" + P6X+"\n");
            }else if(g6==0){
                P6X=1;
            }
            if(g7==1){
                nc7+=1;
                P7X=(nc7+m*p)/(n+m);
                TA_HASIL.append("nc7 =" + nc7+"\n");
//                TA_HASIL.append("7 =" + P7X+"\n");
            }else if(g7==0){
                P7X=1;
            }
            if(g8==1){
                nc8+=1;
                P8X=(nc8+m*p)/(n+m);
                TA_HASIL.append("nc8 =" + nc8+"\n");
//                TA_HASIL.append("8 =" + P8X+"\n");
            }else if(g8==0){
                P8X=1;
            }
            if(g9==1){
                nc9+=1;
                P9X=(nc9+m*p)/(n+m);
                TA_HASIL.append("nc9 =" + nc9+"\n");
//                TA_HASIL.append("9 =" + P9X+"\n");
            }else if(g9==0){
                P9X=1;
            }
            if(g10==1){
                nc10+=1;
                P10X=(nc10+m*p)/(n+m);
                TA_HASIL.append("nc10 =" + nc10+"\n");
//                TA_HASIL.append("10 =" + P10X+"\n");
            }else if(g10==0){
                P10X=1;
            }
            if(g11==1){
                nc11+=0;
                P11X=(nc11+m*p)/(n+m);
                TA_HASIL.append("nc11 =" + nc11+"\n");
//                TA_HASIL.append("11 =" + P11X+"\n");
            }else if(g11==0){
                P11X=1;
            }
            if(g12==1){
                nc12+=0;
                P12X=(nc12+m*p)/(n+m);
                TA_HASIL.append("nc12 =" + nc12+"\n");
//                TA_HASIL.append("12 =" + P12X+"\n");
            }else if(g12==0){
                P12X=1;
            } 
            if(g13==1){
                nc13+=0;
                P13X=(nc13+m*p)/(n+m);
                TA_HASIL.append("nc13 =" + nc13+"\n");
//                TA_HASIL.append("13 =" + P13X+"\n");
            }else if(g13==0){
                P13X=1;
            }
            if(g14==1){
                nc14+=0;
                P14X=(nc14+m*p)/(n+m);
                TA_HASIL.append("nc14 =" + nc14+"\n");
//                TA_HASIL.append("14 =" + P14X+"\n");
            }else if(g14==0){
                P14X=1;
            }
            
            P1=p*P1X*P2X*P3X*P4X*P5X*P6X*P7X*P8X*P9X*P10X*P11X*P12X*P13X*P14X;
            TA_HASIL.append("hasil penyakit 1 = " +P1+"\n");
            TA_HASIL.append("============================================================\n");
              
    }
    public void penyakit2(){
           TA_HASIL.append("\tPENYAKIT 2 : Hasil Diagnosa Langkah 1 \n" +
            "============================================================\n"+
            "kanker p2 : K.P.I\n" +
            "n =" + n+"\n"+
            "p =" + p+"\n"+
            "m =" + m+"\n"
            );
            
            if(g1==1){
                Nc1+=1;
                P1X2=(Nc1+(m*p))/(n+m);
                TA_HASIL.append("Nc1 ="+Nc1+"\n");
            }else if(g1==0){
                P1X2=1;
            }
            if(g2==1){
                Nc2+=0;
                P2X2=(Nc2+(m*p))/(n+m);
                TA_HASIL.append("Nc2 ="+Nc2+"\n");
            }else if(g2==0){
                P2X2=1;
            }
            if(g3==1){
                Nc3+=1;
                P3X2=(Nc3+(m*p))/(n+m);
                TA_HASIL.append("Nc3 ="+Nc3+"\n");
            }else if(g3==0){
                P3X2=1;
            }
            if(g4==1){
                Nc4+=0;
                P4X2=(Nc4+(m*p))/(n+m);
                TA_HASIL.append("Nc4 ="+Nc4+"\n");
            }else if(g4==0){
                P4X2=1;
            }
            if(g5==1){
                Nc5+=0;
                P5X2=(Nc5+(m*p))/(n+m);
                TA_HASIL.append("Nc5 ="+Nc5+"\n");
            }else if(g5==0){
                P5X2=1;
            }
            if(g6==1){
                Nc6+=0;
                P6X2=(Nc6+(m*p))/(n+m);
                TA_HASIL.append("Nc6 ="+Nc6+"\n");
            }else if(g6==0){
                P6X2=1;
            }
            if(g7==1){
                Nc7+=0;
                P7X2=(Nc7+(m*p))/(n+m);
                TA_HASIL.append("Nc7 ="+Nc7+"\n");
            }else if(g7==0){
                P7X2=1;
            }
            if(g8==1){
                Nc8+=0;
                P8X2=(Nc8+(m*p))/(n+m);
                TA_HASIL.append("Nc8 ="+Nc8+"\n");
            }else if(g8==0){
                P8X2=1;
            }
            if(g9==1){
                Nc9+=0;
                P9X2=(Nc9+(m*p))/(n+m);
                TA_HASIL.append("Nc9 ="+Nc9+"\n");
            }else if(g9==0){
                P9X2=1;
            }
            if(g10==1){
                Nc10+=0;
                P10X2=(Nc10+(m*p))/(n+m);
                TA_HASIL.append("Nc10 ="+Nc10+"\n");
            }else if(g10==0){
                P10X2=1;
            }
            if(g11==1){
                Nc11+=1;
                P11X2=(Nc11+(m*p))/(n+m);
                TA_HASIL.append("Nc11 ="+Nc11+"\n");
            }else if(g11==0){
                P11X2=1;
            }
            if(g12==1){
                Nc12+=1;
                P12X2=(Nc12+(m*p))/(n+m);
                TA_HASIL.append("Nc12 ="+Nc12+"\n");
            }else if(g12==0){
                P12X2=1;
            }
            if(g13==1){
                Nc13+=0;
                P13X2=(Nc13+(m*p))/(n+m);
                TA_HASIL.append("Nc13 ="+Nc13+"\n");
            }else if(g13==0){
                P13X2=1;
            }
            if(g14==1){
                Nc14+=0;
                P14X2=(Nc14+(m*p))/(n+m);
                TA_HASIL.append("Nc14 ="+Nc14+"\n");
            }else if(g14==0){
                P14X2=1;
            }
            
            
            P2=p*(P1X2*P2X2*P3X2*P4X2*P5X2*P6X2*P7X2*P8X2*P9X2*P10X2*P11X2*P12X2*P13X2*P14X2);
            TA_HASIL.append("hasil penyakit 2 = " +P2+"\n");
            TA_HASIL.append("============================================================\n");
             
    }
    public void penyakit3(){
     TA_HASIL.append("\tPENYAKIT 3 : Hasil Diagnosa Langkah 1\n" +
            "============================================================\n"+
            "kanker p3 : K.Pt.P\n" +
            "n =" + n+"\n"+
            "p =" + p+"\n"+
            "m =" + m+"\n");
        
            if(g1==1){
                NC1+=1;
                P1X3=(NC1+m*p)/(n+m);
                TA_HASIL.append("nc1 =" + NC1+"\n");
//                TA_HASIL.append("1 =" + P1X3+"\n");
            }else if(g1==0){
                P1X3=1;
            }
            if(g2==1){
                NC2+=0;
                P2X3=(NC2+m*p)/(n+m);
                TA_HASIL.append("nc2 =" + NC2+"\n");
//                TA_HASIL.append("2 =" + P2X3+"\n");
            }else if(g2==0){
                P2X3=1;
            }
            if(g3==1){
                NC3+=1;
                P3X3=(NC3+m*p)/(n+m);
                TA_HASIL.append("nc3 =" + NC3+"\n");
//                TA_HASIL.append("3 =" + P3X3+"\n");
            }else if(g3==0){
                P3X3=1;
            }
            if(g4==1){
                NC4+=0;
                P4X3=(NC4+m*p)/(n+m);
                TA_HASIL.append("nc4 =" + NC4+"\n");
//                TA_HASIL.append("4 =" + P4X3+"\n");
            }else if(g4==0){
                P4X3=1;
            }
            if(g5==1){
                NC5+=0;
                P5X3=(NC5+m*p)/(n+m);
                TA_HASIL.append("nc5 =" + NC5+"\n");
//                TA_HASIL.append("5 =" + P5X3+"\n");
            }else if(g5==0){
                P5X3=1;
            }
            if(g6==1){
                NC6+=1;
                P6X3=(NC6+m*p)/(n+m);
                TA_HASIL.append("nc6 =" + NC6+"\n");
//                TA_HASIL.append("6 =" + P6X3+"\n");
            }else if(g6==0){
                P6X3=1;
            }
            if(g7==1){
                NC7+=1;
                P7X3=(NC7+m*p)/(n+m);
                TA_HASIL.append("nc7 =" + NC7+"\n");
//                TA_HASIL.append("7 =" + P7X3+"\n");
            }else if(g7==0){
                P7X3=1;
            }
            if(g8==1){
                NC8+=0;
                P8X3=(NC8+m*p)/(n+m);
                TA_HASIL.append("nc8 =" + NC8+"\n");
//                TA_HASIL.append("8 =" + P8X3+"\n");
            }else if(g8==0){
                P8X3=1;
            }
            if(g9==1){
                NC9+=0;
                P9X3=(NC9+m*p)/(n+m);
                TA_HASIL.append("nc9 =" + NC9+"\n");
//                TA_HASIL.append("9 =" + P9X3+"\n");
            }else if(g9==0){
                P9X3=1;
            }
            if(g10==1){
                NC10+=0;
                P10X3=(NC10+m*p)/(n+m);
                TA_HASIL.append("nc10 =" + NC10+"\n");
//                TA_HASIL.append("10 =" + P10X3+"\n");
            }else if(g10==0){
                P10X3=1;
            }
            if(g11==1){
                NC11+=0;
                P11X3=(NC11+m*p)/(n+m);
                TA_HASIL.append("nc11 =" + NC11+"\n");
//                TA_HASIL.append("11 =" + P11X3+"\n");
            }else if(g11==0){
                P11X3=1;
            }
            if(g12==1){
                NC12+=0;
                P12X3=(NC12+m*p)/(n+m);
                TA_HASIL.append("nc12 =" + NC12+"\n");
//                TA_HASIL.append("12 =" + P12X3+"\n");
            }else if(g12==0){
                P12X3=1;
            } 
            if(g13==1){
                NC13+=1;
                P13X3=(NC13+m*p)/(n+m);
                TA_HASIL.append("nc13 =" + NC13+"\n");
//                TA_HASIL.append("13 =" + P13X3+"\n");
            }else if(g13==0){
                P13X3=1;
            }
            if(g14==1){
                NC14+=1;
                P14X3=(NC14+m*p)/(n+m);
                TA_HASIL.append("nc14 =" + NC14+"\n");
//                TA_HASIL.append("14 =" + P14X3+"\n");
            }else if(g14==0){
                P14X3=1;
            }
            
            
        P3=p*(P1X3*P2X3*P3X3*P4X3*P5X3*P6X3*P7X3*P8X3*P9X3*P10X3*P11X3*P12X3*P13X3*P14X3);
        TA_HASIL.append("hasil penyakit 3 = " +P3+"\n"); 
        TA_HASIL.append("============================================================\n");
        
    }
    
    public void hasilAkhir(){
        TA_HASIL.append(
                "HASIL DIAGNOSA\n"+
                "============================================================\n"
//                "ID PASIEN : "+txno_pasien+"\n"+
//                "NAMA      : "+txnama+"\n"+
//                "ALAMAT    : "+txalamat+"\n"+
//                "KOTA      : "+txkota+"\n"+
//                "NO.TELPON : "+txnomer+"\n"+
//                "PEKERJAAN : "+txpekerjaan+"\n"+
//                "============================================================\n"
            );
//        txno_pasien.setText("");TA_HASIL.setText("");jLabel21.setText("NO PASIEN");
//        txnama.setText("");TA_HASIL.setText("");jLabel20.setText("NAMA");
//        txalamat.setText("");TA_HASIL.setText("");jLabel19.setText("ALAMAT");
//        txkota.setText("");TA_HASIL.setText("");jLabel18.setText("KOTA");
//        txnomer.setText("");TA_HASIL.setText("");jLabel17.setText("NO.TELEPON");
//        txpekerjaan.setText("");TA_HASIL.setText("");jLabel12.setText("PEKERJAAN");
        if(P1>P2 && P1>P3){
              txhasil.setText(String.valueOf(P1));
              txpenyakit.setText(p1);
                TA_HASIL.append("HASIL DARI PENYAKIT ANDA ADALAH : \n"+ 
                        "ANDA MEMILIKI KEMUNGKINAN TERKENA PENYAKIT KANKER P.U\n"+
                        "DENGAN HASIL SEBESAR = "+P1+"\n"
                );
        }else if(P2>P1 && P2>P3){
                txhasil.setText(String.valueOf(P2));
                txpenyakit.setText(p2);
                TA_HASIL.append("HASIL DARI PENYAKIT ANDA ADALAH : \n"+
                        "ANDA MEMILIKI KEMUNGKINAN TERKENA PENYAKIT KANKER P.i\n"+
                        "DENGAN HASIL SEBESAR = "+P2+"\n"
                );
        }else{
                txhasil.setText(String.valueOf(P3));
                txpenyakit.setText(p3);
                TA_HASIL.append("HASIL DARI PENYAKIT ANDA ADALAH : \n"+
                        "ANDA MEMILIKI KEMUNGKINAN TERKENA PENYAKIT KANKER Pt.P\n"+
                        "DENGAN HASIL SEBESAR = "+P3+"\n"
                );
        }
    }
    
//    public void datadiri(){
//        String no_pasien = null;
//        TA_HASIL.append("\tDATA DIRI \n" +
//            "============================================================\n"+
//            "NO PASIEN =" +no_pasien+"\n"
////            "NAMA =" + p+"\n"+
////            "ALAMAT =" + m+"\n"
////            "KOTA =" + n+"\n"+
////            "TELEPON =" + p+"\n"+
////            "PEKERJAAN =" + m+"\n"
//            );
//    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA_HASIL = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        txhasil = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txpenyakit = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        HASIL = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        YA10 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        YA6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        YA13 = new javax.swing.JButton();
        TIDAK9 = new javax.swing.JButton();
        TIDAK10 = new javax.swing.JButton();
        TIDAK7 = new javax.swing.JButton();
        TIDAK4 = new javax.swing.JButton();
        YA4 = new javax.swing.JButton();
        YA8 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        TIDAK3 = new javax.swing.JButton();
        TIDAK1 = new javax.swing.JButton();
        TIDAK5 = new javax.swing.JButton();
        TIDAK6 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        YA5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        YA7 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        TIDAK8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TIDAK2 = new javax.swing.JButton();
        YA11 = new javax.swing.JButton();
        YA1 = new javax.swing.JButton();
        YA12 = new javax.swing.JButton();
        YA9 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        TIDAK11 = new javax.swing.JButton();
        YA2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        TIDAK12 = new javax.swing.JButton();
        TIDAK14 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        YA3 = new javax.swing.JButton();
        YA14 = new javax.swing.JButton();
        TIDAK13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DIAGNOS");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1260, 31));

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1270, 565));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TA_HASIL.setColumns(20);
        TA_HASIL.setRows(5);
        jScrollPane1.setViewportView(TA_HASIL);

        jDesktopPane1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 50, 360, 460));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel12.setText("PEKERJAAN");
        jLabel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel17.setText("NO. TELP");
        jLabel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel18.setText("KOTA");
        jLabel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel19.setText("ALAMAT");
        jLabel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel20.setText("NAMA");
        jLabel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel21.setText("ID PASIEN");
        jLabel21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("DATA PASIEN");

        jButton2.setBackground(new java.awt.Color(102, 255, 102));
        jButton2.setText("SAVE");
        jButton2.setPreferredSize(new java.awt.Dimension(69, 23));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 255, 102));
        jButton3.setText("EDIT");
        jButton3.setPreferredSize(new java.awt.Dimension(69, 23));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(102, 255, 102));
        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(102, 255, 102));
        jButton5.setText("PRINT");
        jButton5.setPreferredSize(new java.awt.Dimension(69, 23));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(102, 255, 102));
        jButton6.setText("NEXT");
        jButton6.setPreferredSize(new java.awt.Dimension(69, 23));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(102, 255, 102));
        jButton7.setText("MENU");
        jButton7.setPreferredSize(new java.awt.Dimension(69, 23));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel23.setText("HASIL");
        jLabel23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel24.setText("PENYAKIT");
        jLabel24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txhasil, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(txpenyakit)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4)
                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel25)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addGap(13, 13, 13)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txhasil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txpenyakit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13))
        );

        jDesktopPane1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 49, -1, 470));

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, -1, -1));

        HASIL.setText("HASIL");
        HASIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HASILActionPerformed(evt);
            }
        });
        jDesktopPane1.add(HASIL, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, -1, -1));

        YA10.setText("YA");
        YA10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YA10ActionPerformed(evt);
            }
        });

        jLabel6.setText("5. Keluar Carian Di Puting Tapi Bukan Asi ?");
        jLabel6.setToolTipText("");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        YA6.setText("YA");
        YA6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YA6ActionPerformed(evt);
            }
        });

        jLabel10.setText("7. Puting/Payudara Kulit Bersisik Dan Mengelupas ?");
        jLabel10.setToolTipText("");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        YA13.setText("YA");
        YA13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YA13ActionPerformed(evt);
            }
        });

        TIDAK9.setText("TIDAK");
        TIDAK9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIDAK9ActionPerformed(evt);
            }
        });

        TIDAK10.setText("TIDAK");
        TIDAK10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIDAK10ActionPerformed(evt);
            }
        });

        TIDAK7.setText("TIDAK");
        TIDAK7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIDAK7ActionPerformed(evt);
            }
        });

        TIDAK4.setText("TIDAK");
        TIDAK4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIDAK4ActionPerformed(evt);
            }
        });

        YA4.setText("YA");
        YA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YA4ActionPerformed(evt);
            }
        });

        YA8.setText("YA");
        YA8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YA8ActionPerformed(evt);
            }
        });

        jLabel8.setText("9. Puting Tertarik Ke Belakang ?");
        jLabel8.setToolTipText("");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TIDAK3.setText("TIDAK");
        TIDAK3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIDAK3ActionPerformed(evt);
            }
        });

        TIDAK1.setText("TIDAK");
        TIDAK1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIDAK1ActionPerformed(evt);
            }
        });

        TIDAK5.setText("TIDAK");
        TIDAK5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIDAK5ActionPerformed(evt);
            }
        });

        TIDAK6.setText("TIDAK");
        TIDAK6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIDAK6ActionPerformed(evt);
            }
        });

        jLabel14.setText("13. Kulit Terasa Nyeri, Terbakar, Dan Gatal ?");
        jLabel14.setToolTipText("");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        YA5.setText("YA");
        YA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YA5ActionPerformed(evt);
            }
        });

        jLabel4.setText("3. Payudara Kemerahan/Ada Luka Berlubang ?");
        jLabel4.setToolTipText("");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setText("12. Pembengkakan Pada Kelenjar Getah Bening ?");
        jLabel15.setToolTipText("");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setText("4. Sebgian/Seluruh Payudara Membengkak ?");
        jLabel5.setToolTipText("");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("1. Benjolan Dan Jaringan Di Payudara ?");
        jLabel2.setToolTipText("");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setText("8. Bentuk Payudara Berubah Tanpa Sebab ?");
        jLabel9.setToolTipText("");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        YA7.setText("YA");
        YA7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YA7ActionPerformed(evt);
            }
        });

        jLabel11.setText("6. Puting Mengeluarkan Darah ?");
        jLabel11.setToolTipText("");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TIDAK8.setText("TIDAK");
        TIDAK8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIDAK8ActionPerformed(evt);
            }
        });

        jLabel3.setText("2. Payudara Terasa Sakit ?");
        jLabel3.setToolTipText("");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TIDAK2.setText("TIDAK");
        TIDAK2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIDAK2ActionPerformed(evt);
            }
        });

        YA11.setText("YA");
        YA11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YA11ActionPerformed(evt);
            }
        });

        YA1.setText("YA");
        YA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YA1ActionPerformed(evt);
            }
        });

        YA12.setText("YA");
        YA12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YA12ActionPerformed(evt);
            }
        });

        YA9.setText("YA");
        YA9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YA9ActionPerformed(evt);
            }
        });

        jLabel13.setText("14. Puting Menjadi Rata, Dan Timbul Luka Besar ?");
        jLabel13.setToolTipText("");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TIDAK11.setText("TIDAK");
        TIDAK11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIDAK11ActionPerformed(evt);
            }
        });

        YA2.setText("YA");
        YA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YA2ActionPerformed(evt);
            }
        });

        jLabel16.setText("11. Pembesaran Puting ?");
        jLabel16.setToolTipText("");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TIDAK12.setText("TIDAK");
        TIDAK12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIDAK12ActionPerformed(evt);
            }
        });

        TIDAK14.setText("TIDAK");
        TIDAK14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIDAK14ActionPerformed(evt);
            }
        });

        jLabel7.setText("10. Muncul Bejolan/Bengkak Dibawah Lengan ?");
        jLabel7.setToolTipText("");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        YA3.setText("YA");
        YA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YA3ActionPerformed(evt);
            }
        });

        YA14.setText("YA");
        YA14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YA14ActionPerformed(evt);
            }
        });

        TIDAK13.setText("TIDAK");
        TIDAK13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIDAK13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(YA1)
                        .addGap(15, 15, 15)
                        .addComponent(TIDAK1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(YA2)
                        .addGap(15, 15, 15)
                        .addComponent(TIDAK2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(YA4)
                        .addGap(15, 15, 15)
                        .addComponent(TIDAK4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(YA3)
                        .addGap(15, 15, 15)
                        .addComponent(TIDAK3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(YA5)
                        .addGap(15, 15, 15)
                        .addComponent(TIDAK5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(YA6)
                        .addGap(15, 15, 15)
                        .addComponent(TIDAK6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(YA7)
                        .addGap(15, 15, 15)
                        .addComponent(TIDAK7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(YA8)
                        .addGap(15, 15, 15)
                        .addComponent(TIDAK8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(YA9)
                        .addGap(15, 15, 15)
                        .addComponent(TIDAK9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(YA10)
                        .addGap(15, 15, 15)
                        .addComponent(TIDAK10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(YA11)
                        .addGap(15, 15, 15)
                        .addComponent(TIDAK11))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(YA12)
                        .addGap(15, 15, 15)
                        .addComponent(TIDAK12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(YA13)
                        .addGap(15, 15, 15)
                        .addComponent(TIDAK13))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(YA14)
                        .addGap(15, 15, 15)
                        .addComponent(TIDAK14)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YA1)
                    .addComponent(TIDAK1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(YA2)
                    .addComponent(TIDAK2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YA3)
                    .addComponent(TIDAK3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YA4)
                    .addComponent(TIDAK4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YA5)
                    .addComponent(TIDAK5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YA6)
                    .addComponent(TIDAK6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YA7)
                    .addComponent(TIDAK7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YA8)
                    .addComponent(TIDAK8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YA9)
                    .addComponent(TIDAK9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YA10)
                    .addComponent(TIDAK10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YA11)
                    .addComponent(TIDAK11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YA12)
                    .addComponent(TIDAK12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YA13)
                    .addComponent(TIDAK13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(YA14)
                    .addComponent(TIDAK14)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 26, Short.MAX_VALUE))
        );

        jDesktopPane1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 437, 470));

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HASILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HASILActionPerformed
        try {
//            String sql = "INSERT INTO data_pasien VALUES ('"+txno_pasien.getText()+"','"+txnama.getText()+"','"+txalamat.getText()+"','"+txkota.getText()+"','"+txnomer.getText()+"','"+txpekerjaan.getText()+"')";
            //stmt.executeUpdate("update into datapasien VALUES ('"+no_pasien+"','"+nama+"','"+alamat+"','"+kota+"','"+telepon+"','"+pekerjaan+"');");
            stmt = (Statement)koneksi.koneksiDB().createStatement();
            java.sql.Connection conn=(Connection)koneksi.koneksiDB();
//            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
//            pst.execute();
            stmt.close();
            load_table();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
            HITUNG pindah;
//            pindah = new HITUNG();
//            pindah.setVisible(true);
            this.dispose();
                simpan();
                penyakit1();
                penyakit2();
                penyakit3();
                hasilAkhir();
        } catch (Exception e) {
        }
        
//        datadiri();
    }//GEN-LAST:event_HASILActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MENU pindah;
        pindah = new MENU();
        pindah.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            java.sql.Connection conn = koneksi.koneksiDB();
            java.sql.PreparedStatement stmt = conn.prepareStatement("update data_pasien set nama=?, alamat=?, kota=?, telepon=?, pekerjaan=? where no_pasien=?");
//            stmt.setString(1, txno_pasien.getText());
//            stmt.setString(2, txnama.getText());
//            stmt.setString(3, txalamat.getText());
//            stmt.setString(4, txkota.getText());
//            stmt.setString(5, txnomer.getText());
//            stmt.setString(6, txpekerjaan.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil diubah", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            load_table();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        int confirm = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data tersebut?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (confirm == 0) {
            try {
                java.sql.Connection conn = koneksi.koneksiDB();
//                java.sql.PreparedStatement stmt = conn.prepareStatement("delete from data_pasien where no_pasien ='" + txno_pasien.getText() + "'");
//                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus", "Pesan", JOptionPane.INFORMATION_MESSAGE);
                load_table();
//                txno_pasien.setText("");
//                txnama.setText("");
//                txalamat.setText("");
//                txkota.setText("");
//                txnomer.setText("");
//                txpekerjaan.setText("");
//                txno_pasien.requestFocus();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data gagal di hapus" + e.getMessage(), "Pesan", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
//            txno_pasien.print();
//            txnama.print();
//            txalamat.print();
//            txkota.print();
//            txnomer.print();
//            txpekerjaan.print();
            TA_HASIL.print();
            //hasildiagnosa2.print();
        } catch (PrinterException ex) {
//            Logger.getLogger(DATA_PASIEN.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        HITUNG pindah;
//        pindah = new HITUNG();
//        pindah.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        MENU pindah;
        pindah = new MENU();
        pindah.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void YA10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YA10ActionPerformed
        // TODO add your handling code here:
        g10=1;
    }//GEN-LAST:event_YA10ActionPerformed

    private void YA6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YA6ActionPerformed
        // TODO add your handling code here:
        g6=1;
    }//GEN-LAST:event_YA6ActionPerformed

    private void YA13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YA13ActionPerformed
        // TODO add your handling code here:
        g13=1;
    }//GEN-LAST:event_YA13ActionPerformed

    private void TIDAK9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIDAK9ActionPerformed
        // TODO add your handling code here:
        g9=0;
    }//GEN-LAST:event_TIDAK9ActionPerformed

    private void TIDAK10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIDAK10ActionPerformed
        // TODO add your handling code here:
        g10=0;
    }//GEN-LAST:event_TIDAK10ActionPerformed

    private void TIDAK7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIDAK7ActionPerformed
        // TODO add your handling code here:
        g7=0;
    }//GEN-LAST:event_TIDAK7ActionPerformed

    private void TIDAK4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIDAK4ActionPerformed
        // TODO add your handling code here:
        g4=0;
    }//GEN-LAST:event_TIDAK4ActionPerformed

    private void YA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YA4ActionPerformed
        // TODO add your handling code here:
        g4=1;
    }//GEN-LAST:event_YA4ActionPerformed

    private void YA8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YA8ActionPerformed
        // TODO add your handling code here:
        g8=1;
    }//GEN-LAST:event_YA8ActionPerformed

    private void TIDAK3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIDAK3ActionPerformed
        // TODO add your handling code here:
        g3=0;
    }//GEN-LAST:event_TIDAK3ActionPerformed

    private void TIDAK1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIDAK1ActionPerformed
        // TODO add your handling code here:
        g1=0;
    }//GEN-LAST:event_TIDAK1ActionPerformed

    private void TIDAK5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIDAK5ActionPerformed
        // TODO add your handling code here:
        g5=0;
    }//GEN-LAST:event_TIDAK5ActionPerformed

    private void TIDAK6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIDAK6ActionPerformed
        // TODO add your handling code here:
        g6=0;
    }//GEN-LAST:event_TIDAK6ActionPerformed

    private void YA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YA5ActionPerformed
        // TODO add your handling code here:
        g5=1;
    }//GEN-LAST:event_YA5ActionPerformed

    private void YA7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YA7ActionPerformed
        // TODO add your handling code here:
        g7=1;
    }//GEN-LAST:event_YA7ActionPerformed

    private void TIDAK8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIDAK8ActionPerformed
        // TODO add your handling code here:
        g8=0;
    }//GEN-LAST:event_TIDAK8ActionPerformed

    private void TIDAK2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIDAK2ActionPerformed
        // TODO add your handling code here:
        g2=0;
    }//GEN-LAST:event_TIDAK2ActionPerformed

    private void YA11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YA11ActionPerformed
        // TODO add your handling code here:
        g11=1;
    }//GEN-LAST:event_YA11ActionPerformed

    private void YA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YA1ActionPerformed
        // TODO add your handling code here:
        g1=1;
    }//GEN-LAST:event_YA1ActionPerformed

    private void YA12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YA12ActionPerformed
        // TODO add your handling code here:
        g12=1;
    }//GEN-LAST:event_YA12ActionPerformed

    private void YA9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YA9ActionPerformed
        // TODO add your handling code here:
        g9=1;
    }//GEN-LAST:event_YA9ActionPerformed

    private void TIDAK11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIDAK11ActionPerformed
        // TODO add your handling code here:
        g11=0;
    }//GEN-LAST:event_TIDAK11ActionPerformed

    private void YA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YA2ActionPerformed
        // TODO add your handling code here:
        g2=1;
    }//GEN-LAST:event_YA2ActionPerformed

    private void TIDAK12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIDAK12ActionPerformed
        // TODO add your handling code here:
        g12=0;
    }//GEN-LAST:event_TIDAK12ActionPerformed

    private void TIDAK14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIDAK14ActionPerformed
        // TODO add your handling code here:
        g14=0;
    }//GEN-LAST:event_TIDAK14ActionPerformed

    private void YA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YA3ActionPerformed
        // TODO add your handling code here:
        g3=1;
    }//GEN-LAST:event_YA3ActionPerformed

    private void YA14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YA14ActionPerformed
        // TODO add your handling code here:
        g14=1;
    }//GEN-LAST:event_YA14ActionPerformed

    private void TIDAK13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIDAK13ActionPerformed
        // TODO add your handling code here:
        g13=0;
    }//GEN-LAST:event_TIDAK13ActionPerformed

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
            java.util.logging.Logger.getLogger(HITUNG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HITUNG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HITUNG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HITUNG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HITUNG( "","","","","","").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HASIL;
    private javax.swing.JTextArea TA_HASIL;
    private javax.swing.JButton TIDAK1;
    private javax.swing.JButton TIDAK10;
    private javax.swing.JButton TIDAK11;
    private javax.swing.JButton TIDAK12;
    private javax.swing.JButton TIDAK13;
    private javax.swing.JButton TIDAK14;
    private javax.swing.JButton TIDAK2;
    private javax.swing.JButton TIDAK3;
    private javax.swing.JButton TIDAK4;
    private javax.swing.JButton TIDAK5;
    private javax.swing.JButton TIDAK6;
    private javax.swing.JButton TIDAK7;
    private javax.swing.JButton TIDAK8;
    private javax.swing.JButton TIDAK9;
    private javax.swing.JButton YA1;
    private javax.swing.JButton YA10;
    private javax.swing.JButton YA11;
    private javax.swing.JButton YA12;
    private javax.swing.JButton YA13;
    private javax.swing.JButton YA14;
    private javax.swing.JButton YA2;
    private javax.swing.JButton YA3;
    private javax.swing.JButton YA4;
    private javax.swing.JButton YA5;
    private javax.swing.JButton YA6;
    private javax.swing.JButton YA7;
    private javax.swing.JButton YA8;
    private javax.swing.JButton YA9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txhasil;
    private javax.swing.JTextField txpenyakit;
    // End of variables declaration//GEN-END:variables
}
