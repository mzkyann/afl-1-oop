public class Barang {
    private String ID;
    private String JUDUL;
    private int TANGGAL;
    private int TOTAL;
    private String EDISI;
    private int DIPINJAM;
    private int TERSEDIA;
    private int RUSAK;
    private String PENERBIT;


    public Barang(String JUDUL, int TANGGAL, int TOTAL, String EDISI, int DIPINJAM, int TERSEDIA, int RUSAK, String PENERBIT) {
        this.JUDUL = JUDUL;
        this.TANGGAL = TANGGAL;
        this.TOTAL = TOTAL;
        this.RUSAK = RUSAK;
        this.PENERBIT = PENERBIT;
    }

    // getter dan setter
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getJUDUL() {
        return JUDUL;
    }

    public void setJUDUL(String JUDUL) {
        this.JUDUL = JUDUL;
    }

    public int getTANGGAL() {
        return TANGGAL;
    }

    public void setTANGGAL(int TANGGAL) {
        this.TANGGAL = TANGGAL;
    }

    public int getTOTAL() {
        return TOTAL;
    }

    public void setTOTAL(int TOTAL) {
        this.TOTAL = TOTAL;
    }

    public String getEDISI() {
        return EDISI;
    }

    public void setEDISI(String EDISI) {
        this.EDISI = EDISI;
    }

    public int getDIPINJAM() {
        return DIPINJAM;
    }

    public void setDIPINJAM(int DIPINJAM) {
        this.DIPINJAM = DIPINJAM;
    }

    public int getTERSEDIA() {
        return TERSEDIA;
    }

    public void setTERSEDIA(int TERSEDIA) {
        this.TERSEDIA = TERSEDIA;
    }

    public int getRUSAK() {
        return RUSAK;
    }

    public void setRUSAK(int RUSAK) {
        this.RUSAK = RUSAK;
    }

    public String getPENERBIT() {
        return PENERBIT;
    }

    public void setPENERBIT(String PENERBIT) {
        this.PENERBIT = PENERBIT;
    }
}