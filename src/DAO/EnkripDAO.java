/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author USER
 */
public class EnkripDAO {
    
    public EnkripDAO(){ 
    }
    
    String nama_file;
    String ukuran_file;
    String ukuran_file_rc5;
    String ukuran_file_rc6;
    String waktu_rc5;
    String waktu_rc6;
    String memori_rc5;
    String memori_rc6;
    String cpu_rc5;
    String cpu_rc6;

    public EnkripDAO(String nama_file, String ukuran_file, String ukuran_file_rc5, String ukuran_file_rc6, String waktu_rc5, String waktu_rc6, String memori_rc5, String memori_rc6, String cpu_rc5, String cpu_rc6) {
        this.nama_file = nama_file;
        this.ukuran_file = ukuran_file;
        this.ukuran_file_rc5 = ukuran_file_rc5;
        this.ukuran_file_rc6 = ukuran_file_rc6;
        this.waktu_rc5 = waktu_rc5;
        this.waktu_rc6 = waktu_rc6;
        this.memori_rc5 = memori_rc5;
        this.memori_rc6 = memori_rc6;
        this.cpu_rc5 = cpu_rc5;
        this.cpu_rc6 = cpu_rc6;
    }

    public String getNama_file() {
        return nama_file;
    }

    public void setNama_file(String nama_file) {
        this.nama_file = nama_file;
    }

    public String getUkuran_file() {
        return ukuran_file;
    }

    public void setUkuran_file(String ukuran_file) {
        this.ukuran_file = ukuran_file;
    }

    public String getUkuran_file_rc5() {
        return ukuran_file_rc5;
    }

    public void setUkuran_file_rc5(String ukuran_file_rc5) {
        this.ukuran_file_rc5 = ukuran_file_rc5;
    }

    public String getUkuran_file_rc6() {
        return ukuran_file_rc6;
    }

    public void setUkuran_file_rc6(String ukuran_file_rc6) {
        this.ukuran_file_rc6 = ukuran_file_rc6;
    }

    public String getWaktu_rc5() {
        return waktu_rc5;
    }

    public void setWaktu_rc5(String waktu_rc5) {
        this.waktu_rc5 = waktu_rc5;
    }

    public String getWaktu_rc6() {
        return waktu_rc6;
    }

    public void setWaktu_rc6(String waktu_rc6) {
        this.waktu_rc6 = waktu_rc6;
    }

    public String getMemori_rc5() {
        return memori_rc5;
    }

    public void setMemori_rc5(String memori_rc5) {
        this.memori_rc5 = memori_rc5;
    }

    public String getMemori_rc6() {
        return memori_rc6;
    }

    public void setMemori_rc6(String memori_rc6) {
        this.memori_rc6 = memori_rc6;
    }

    public String getCpu_rc5() {
        return cpu_rc5;
    }

    public void setCpu_rc5(String cpu_rc5) {
        this.cpu_rc5 = cpu_rc5;
    }

    public String getCpu_rc6() {
        return cpu_rc6;
    }

    public void setCpu_rc6(String cpu_rc6) {
        this.cpu_rc6 = cpu_rc6;
    }
    
}
