

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author berkay
 */
public class UserOperations {
    
    Connection con = null;
    
    Statement statement = null;
    
    PreparedStatement preparedStatement = null;
    
    
    public boolean login(String tc_no,String mail,String tel_no,String sifre){
        
        String sorgu = "Select*From users where tc = ? and mail = ? and tel_no = ? and sifre = ?";
       
        try {
               preparedStatement = con.prepareStatement(sorgu);
               preparedStatement.setString(1,tc_no);
               preparedStatement.setString(2,mail);
               preparedStatement.setString(3,tel_no);
               preparedStatement.setString(4,sifre);
               
               ResultSet rs = preparedStatement.executeQuery();
               return rs.next();
               
        } catch (SQLException ex) {
            System.out.println("Giriş yaparken hata oluştu");
            return false;
            
        }
    }
    
   
    
    
    
    public void addProduct(String urun_adi, int urun_adedi,double birim_fiyati){
        
        String sorgu = "INSERT INTO urunler(urun_adi, urun_adedi, birim_fiyati, toplam_fiyat) VALUES(?, ?, ?, ?)";
        
        
        try(
            PreparedStatement preparedStatement = con.prepareStatement(sorgu)) {
            double toplam_fiyat = birim_fiyati*urun_adedi;
            preparedStatement.setString(1, urun_adi);
            preparedStatement.setInt(2,urun_adedi);
            preparedStatement.setDouble(3,birim_fiyati);
            preparedStatement.setDouble(4,toplam_fiyat);
            
            preparedStatement.executeUpdate();
            System.out.println("ürün başarıyla eklendi");
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        
        
    }
   
    
    public void addUser(String tc_no,String mail,String tel_no,String sifre){
        
        try {
            String sorgu = "Insert Into users(tc,mail,tel_no,sifre) VALUES(?,?,?,?)";
            
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, tc_no);
            preparedStatement.setString(2,mail);
            preparedStatement.setString(3, tel_no);
            preparedStatement.setString(4, sifre);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
           System.out.println("Kullanıcı oluşturulurken bir hata oluştu" + ex.getMessage());
        }
        
    }
    
    public ArrayList<Urun>urunleriGetir(){
        
            ArrayList<Urun>cikti = new ArrayList<Urun>();
            
            try{
                statement = con.createStatement();
                String sorgu = "Select * From urunler";
                ResultSet rs = statement.executeQuery(sorgu);
                
                while(rs.next()){
                    String urun_adi = rs.getString("urun_adi");
                    int urun_adedi = rs.getInt("urun_adedi");
                    double birim_fiyati = rs.getDouble("birim_fiyati");
                    double toplam_fiyat = rs.getDouble("toplam_fiyat");
                    cikti.add(new Urun(urun_adi,urun_adedi,birim_fiyati,toplam_fiyat));
                }
                return cikti;
            }
            catch(SQLException ex){
                System.out.println("Hata oluştu");
                return null;
            }
            
            
    }
    
    public void sepetiTemizle(){
        try {
            
            String sorgu = "Delete From urunler";
            statement = con.prepareStatement(sorgu);
            statement.executeUpdate(sorgu);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UserOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
   
    
   
    
    public boolean receteBul(String recete_no){
        
        String sorgu = "Select *From recete where recete_no = ? ";
        
        try{
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1,recete_no);
            
            
            ResultSet rs = preparedStatement.executeQuery();
            return rs.next();
       
        } catch(SQLException ex){
            System.out.println("Reçete bulunamadı");
            return false;
        }
        
    }
   
   
    
   
    
    public String ilacBul(String recete_no){
        String ilaclar = null;
        String sorgu = "Select ilaclar *From  where recete_no = ? ";
        
        try{
            PreparedStatement preparedstatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1,recete_no);
            ResultSet rs = preparedStatement.executeQuery();
            
            if (rs.next()) {
            ilaclar = rs.getString("ilaclar"); // "ilaclar" sütunundan değer alınıyor
        } else {
            ilaclar = "İlaç bulunamadı"; // Eğer ilaç bulunmazsa
        }
        
        rs.close(); // ResultSet kapatılmalı
        preparedStatement.close();
        }
        catch(SQLException ex){
            System.out.println("İlaçlar bulunurken bir hata oluştu");
        }
        return ilaclar;
    }
    
    
    
    
   UserOperations(){
       try{
            String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_ismi + "?useUnicod = true&characterEncoding = utf8";
            try{
                Class.forName("com.mysql.jdbc.Driver");
            } catch(ClassNotFoundException ex){
                System.out.println("Driver bulunamadı");
            }
            con = DriverManager.getConnection(url,Database.kullanici_adi,Database.parola);
            System.out.println("Bağlantı başarılı");
        } catch(SQLException ex){
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Bağlantı başarısız");
        }
       
   }
   
   public static void main(String[]args){
       UserOperations operations = new UserOperations();
   }
        
    
}
