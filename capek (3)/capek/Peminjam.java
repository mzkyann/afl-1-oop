public class Peminjam {
    private String ID;
    private String JUDUL;
    private int PTANGGAL; // Changed TANGGAL to PTANGGAL
    private String NAMA;
    private int TGLKEMBALI;
    private int JMLDIPINJAM;

    public Peminjam(String JUDUL, int PTANGGAL, String NAMA, int TGLKEMBALI, int JMLDIPINJAM ) { // Changed TANGGAL to PTANGGAL
        this.JUDUL = JUDUL;
        this.PTANGGAL = PTANGGAL; // Changed TANGGAL to PTANGGAL
        this.NAMA = NAMA;
        this.TGLKEMBALI = TGLKEMBALI;
        this.JMLDIPINJAM = JMLDIPINJAM;
    }

    // getters and setters
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

    public int getPTANGGAL() { // Changed TANGGAL to PTANGGAL
        return PTANGGAL;
    }

    public void setPTANGGAL(int PTANGGAL) { // Changed TANGGAL to PTANGGAL
        this.PTANGGAL = PTANGGAL;
    }

    public String getNAMA() {
        return NAMA;
    }

    public void setNAMA(String NAMA) {
        this.NAMA = NAMA;
    }

    public int getTGLKEMBALI() {
        return TGLKEMBALI;
    }

    public void setTGLKEMBALI(int TGLKEMBALI) {
        this.TGLKEMBALI = TGLKEMBALI;
    }

    public int getJMLDIPINJAM() {
        return JMLDIPINJAM;
    }

    public void setJMLDIPINJAM(int JMLDIPINJAM) {
        this.JMLDIPINJAM = JMLDIPINJAM;
    }
}
