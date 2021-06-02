package Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormBiodata {
    private JTextField textNama;
    private JTextField textNim;
    private JButton cekButton;
    private JPanel rootPanel;
    private JLabel Hasil1;
    private JLabel Hasil2;
    private JLabel Hasil3;
    private JLabel Hasil4;
    private JLabel Hasil5;
    private JLabel Hasil6;
    private JLabel Hasil7;
    private JLabel Hasil8;
    private JLabel LabelHasil;

    public FormBiodata() {
        cekButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Mengambil data dari textNama
                String nama = textNama.getText();
                //Mengambil data dari textNim
                String nim = textNim.getText();
                //Diproses
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(nama);
                mhs.setNim(nim);
                LabelHasil.setText(mhs.toString());

                Hasil1.setText("Nama\t:\t" + mhs.getNama());
                Hasil2.setText("NIM\t:\t" + mhs.getNim());
                Hasil3.setText("Jenjang Pendidikan\t:\t" + mhs.getJenjang());
                Hasil4.setText("Tahun Masuk\t:\t" + mhs.getTahun());
                Hasil5.setText("Fakultas\t:\t" + mhs.getFakultas());
                Hasil6.setText("Jurusan\t:\t" + mhs.getJurusan());
                Hasil7.setText("Jenis Kelamin\t:\t" + mhs.getJenisKelamin());
                Hasil8.setText("Nomor Urut Mahasiswa\t:\t" + mhs.getNomorUrut());

                //Menampilkan hasil ke gui

            }
        });
    }

    public JPanel getrootPanel(){
        return rootPanel;
    }
}
