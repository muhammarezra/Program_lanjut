public class NIM {

    private String nim;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getFakultas(){
        char kodeA = nim.charAt(3);
        if(kodeA == '1'){
            return"TARBIAH DAN KEGURUAN";
        }else if(kodeA == '2'){
            return "SYARIAH DAN HUKUM";
        }else if(kodeA == '3'){
            return "USHULUDDIN";
        }else if(kodeA == '4'){
            return "DAKWAH DAN KOMUNIKASI";
        }else if(kodeA == '5'){
            return "SAINS DAN TEKNOLOGI";
        }else if(kodeA == '6'){
            return "PSIKOLOGI";
        }else if(kodeA == '7'){
            return "EKONOMI DAN ILMU SOSIAL";
        }else if(kodeA == '8'){
            return "PERTANIAN DAN PETERNAKAN";
        }
        return "UNKNOWN";
    }
    public String getJurusan(){
        char kodeB = nim.charAt(5);
        if(kodeB == '1'){
            return"TEKNIK INFORMATIKA";
        }else if(kodeB == '2'){
            return "TEKNIK INDUSTRI";
        }else if(kodeB == '3'){
            return "SYSTEM INFORMASI";
        }else if(kodeB == '4'){
            return "MATEMATIKA";
        }else if(kodeB == '5'){
            return "TEKNIK ELEKTRO";
        }
        return "UNKNOWN";
    }
    String No;
    public String getNomorUrut(){
        String No = nim.substring(7);
        return No;
    }
        String Jenjang="";
        
        String C1 = "S1 (SARJANA)";
        String C2 = "S2 (MAGISTER)";
        String C3 = "S3 (DOCTOR)";
        
        public String getJenjang(){
         if(nim.charAt(0)=='1'){
            return Jenjang = C1;
        }else if(nim.charAt(0)=='2'){
            return Jenjang = C2;
        }else if(nim.charAt(0)=='3'){
            return Jenjang = C3;
        }
         return "UNKNOWN";
     }
        public String getJenisKelamin(){
        if(nim.charAt(6) == '1'){
            return "Laki-laki";
        }else if(nim.charAt(6) == '2'){
            return "Perempuan";
        }
        return "UNKNOWN";
    }
         public String getTahun(){
        String Tahun = nim.substring(1,3);
        return "20"+Tahun;
    }
}