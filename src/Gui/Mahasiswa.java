package Gui;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String getJenisKelamin;
    private String getJenjang;
    private String getTahun;
    private String getFakultas;
    private String getJurusan;
    private String getNomorUrut;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;

    }

    public Mahasiswa() {

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;

    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getFakultas() {
        char kodeA = nim.charAt(3);
        if (kodeA == '1') {
            return "TARBIAH DAN KEGURUAN";
        } else if (kodeA == '2') {
            return "SYARIAH DAN HUKUM";
        } else if (kodeA == '3') {
            return "USHULUDDIN";
        } else if (kodeA == '4') {
            return "DAKWAH DAN KOMUNIKASI";
        } else if (kodeA == '5') {
            return "SAINS DAN TEKNOLOGI";
        } else if (kodeA == '6') {
            return "PSIKOLOGI";
        } else if (kodeA == '7') {
            return "EKONOMI DAN ILMU SOSIAL";
        } else if (kodeA == '8') {
            return "PERTANIAN DAN PETERNAKAN";
        }
        return "UNKNOWN";
    }

    public String getGetJenisKelamin() {
        return getJenisKelamin;
    }

    public String getJenisKelamin() {
        if (nim.charAt(6) == '1') {
            return "Laki-laki";
        } else if (nim.charAt(6) == '2') {
            return "Perempuan";
        }
        return "UNKNOWN";
    }

    public String getGetJenjang() {
        return getJenjang;
    }


    String Jenjang = "";

    String C1 = "S1 (SARJANA)";
    String C2 = "S2 (MAGISTER)";
    String C3 = "S3 (DOCTOR)";

    public String getJenjang() {
        if (nim.charAt(0) == '1') {
            return Jenjang = C1;
        } else if (nim.charAt(0) == '2') {
            return Jenjang = C2;
        } else if (nim.charAt(0) == '3') {
            return Jenjang = C3;
        }
        return "UNKNOWN";
    }

    public String getGetTahun() {
        return getTahun;
    }



    public String getTahun() {
        String Tahun = nim.substring(1, 3);
        return "20" + Tahun;
    }

    public String getGetFakultas() {

        char kodeA = nim.charAt(3);
        if (kodeA == '1') {
            return "TARBIAH DAN KEGURUAN";
        } else if (kodeA == '2') {
            return "SYARIAH DAN HUKUM";
        } else if (kodeA == '3') {
            return "USHULUDDIN";
        } else if (kodeA == '4') {
            return "DAKWAH DAN KOMUNIKASI";
        } else if (kodeA == '5') {
            return "SAINS DAN TEKNOLOGI";
        } else if (kodeA == '6') {
            return "PSIKOLOGI";
        } else if (kodeA == '7') {
            return "EKONOMI DAN ILMU SOSIAL";
        } else if (kodeA == '8') {
            return "PERTANIAN DAN PETERNAKAN";
        }
        return "UNKNOWN";
    }

    public void setGetFakultas(String getFakultas) {
        this.getFakultas = getFakultas;
    }


    public String getGetJurusan() {
        return getJurusan;
    }

    public void setGetJurusan(String getJurusan) {
        this.getJurusan = getJurusan;
    }

    public String getJurusan() {
        char kodeB = nim.charAt(5);
        if (kodeB == '1') {
            return "TEKNIK INFORMATIKA";
        } else if (kodeB == '2') {
            return "TEKNIK INDUSTRI";
        } else if (kodeB == '3') {
            return "SYSTEM INFORMASI";
        } else if (kodeB == '4') {
            return "MATEMATIKA";
        } else if (kodeB == '5') {
            return "TEKNIK ELEKTRO";
        }
        return "UNKNOWN";
    }
        String No;
        public String getNomorUrut () {
            String No = nim.substring(7);
            return No;
        }

        public void setGetNomorUrut (String getNomorUrut){
            this.getNomorUrut = getNomorUrut;
        }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama='" + nama + '\'' +
                ", nim='" + nim + '\'' +
                '}';
    }
}