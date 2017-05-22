/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbctable;
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author cipowela
 */
public class JDBCTable {

    /**
     * @param args the command line arguments
     */
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/pbo";
    static final String USER = "root";
    static final String PASS = "cipo";
    
    static final String row = "-----------------------------------------------"
            + "------------";
    
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmnt = null;
        ResultSet rs = null;
        
        Scanner input = new Scanner(System.in);
        String nama, kota;
        int banyak,id;
        
        String sql1 = "CREATE TABLE idKary("
                + "id INTEGER(4) NOT NULL AUTO_INCREMENT,"
                + "nama_karyawan VARCHAR(30),"
                + "PRIMARY KEY (id))";
        String sql2 = "CREATE TABLE nmKary("
                + "nama_karyawan VARCHAR(30),"
                + "kota_domisili VARCHAR(20))";
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmnt = conn.createStatement();
            
            // MEMBUAT TABEL
            stmnt.executeUpdate(sql1);
            stmnt.executeUpdate(sql2);
            
            
            // MENGISI TABEL
            System.out.print("Input banyak data: ");
            banyak = input.nextInt();
            for(int i=1; i<=banyak; i++){
                System.out.println("Data ke "+i);
                System.out.print("input Nama: ");
                nama = input.next();
                System.out.print("input Kota: ");
                kota = input.next();
                String sql = "INSERT INTO nmKary "
                        + "VALUES('" + nama + "', '"
                        + kota + "')";
                stmnt.executeUpdate(sql);
                sql = "INSERT INTO idKary(nama_karyawan) "
                        + "VALUES('" + nama + "')";
                stmnt.executeUpdate(sql);
            }
            
            String query = "SELECT idKary.id, nmKary.nama_karyawan,"
                    + "nmKary.kota_domisili FROM idKary, nmKary "
                    + "WHERE nmKary.nama_karyawan=idKary.nama_karyawan";
            
            rs = stmnt.executeQuery(query);
            System.out.println(row);
            System.out.printf("%4s %30s %20s\n", "id", "nama Karyawan",
                    "kota domisili");
            System.out.println(row);
            while(rs.next()) {
                int idKary = rs.getInt("id");
                String namaKary = rs.getString("nama_karyawan");
                String kotaKary = rs.getString("kota_domisili");
                
                System.out.printf("%4d %30s %20s\n", idKary, namaKary, kotaKary);
                
            }
            
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(conn != null)
                    conn.close();
            } catch (SQLException e) {
            }
            
            try {
                if(stmnt  != null)
                    stmnt.close();
            } catch (SQLException e) {
            }
            
            try {
                if(rs != null)
                    rs.close();
            } catch (SQLException e) {
            }
        }
    }
    
}
