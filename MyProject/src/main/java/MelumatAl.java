
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Texnoservis
 */
public  class MelumatAl {
    static Musteri melumatAl(String ss) throws SQLException{
    Musteri mstr=new Musteri();
    
    Connection cnt=DriverManager.getConnection("jdbc:mysql://localhost/my_first_db","root","Mamedov1759");
     PreparedStatement pstmt=cnt.prepareStatement("select * from musteri left join olke on olke.id=musteri.id where musteri.ad=?");
     pstmt.setString(1, ss);
    ResultSet rs=pstmt.executeQuery();
        System.out.println("Connc ok");
    while(rs.next()){
        mstr.setAd(rs.getString("ad"));
        mstr.setId(rs.getInt("id"));
        mstr.setSoyad(rs.getString("soyad"));
        mstr.setOlke(rs.getString("olke"));
        mstr.setYash(rs.getInt("yash"));
        
    }
    return mstr;
}}

