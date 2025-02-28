/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author berkay
 */
public class Recete {
   
    private String recete_no;
    private String ilaclar;

    public String getRecete_no() {
        return recete_no;
    }

    public void setRecete_no(String recete_no) {
        this.recete_no = recete_no;
    }

    public String getIlaclar() {
        return ilaclar;
    }

    public void setIlaclar(String ilaclar) {
        this.ilaclar = ilaclar;
    }

    public Recete(String recete_no, String ilaclar) {
        this.recete_no = recete_no;
        this.ilaclar = ilaclar;
    }
}
