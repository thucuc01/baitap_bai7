import java.time.LocalDate;

public class CBGV extends CanBo {
    private long luongCB;
    private long thuong;
    private long phat;

    private long luongTT;

    public CBGV() {
    }

    public CBGV(String name, LocalDate date,String hometown,long luongCB, long thuong, long phat) {
        super.name=name;
        super.dateOfBirth=date;
        super.hometown=hometown;
        this.luongCB = luongCB;
        this.thuong = thuong;
        this.phat = phat;

        this.luongTT=luongCB-phat+thuong;
    }

    public long getLuongTT() {
        return luongTT;
    }

    public void setLuongTT(long luongTT) {
        this.luongTT = luongTT;
    }

    public long getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(long luongCB) {
        this.luongCB = luongCB;
    }

    public long getThuong() {
        return thuong;
    }

    public void setThuong(long thuong) {
        this.thuong = thuong;
    }

    public long getPhat() {
        return phat;
    }

    public void setPhat(long phat) {
        this.phat = phat;
    }

//    @Override
//    public String toString() {
//        return "CBGV{" + super.toString()+
//                "luongCB=" + luongCB +
//                ", thuong=" + thuong +
//                ", phat=" + phat +
//                '}';
//    }
}
