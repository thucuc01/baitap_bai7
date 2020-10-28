import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.EOFException;
public class Method {
    ArrayList <CBGV> list=new ArrayList<>();
    private static final String filepath = "FileQL.txt";


    public CBGV nhapInfoCanBo(){
        boolean checkInfo;
        CBGV canboGV = null;
        do{
            try{
                checkInfo=false;
                Scanner input=new Scanner(System.in);
                System.out.println("Nhap ten : ");
                String name=input.nextLine();
                System.out.println("Nhap ngay sinh :");
                int day=Integer.parseInt(input.nextLine());
                System.out.println("Nhap thang sinh :");
                int month=Integer.parseInt(input.nextLine());
                System.out.println("Nhap nam sinh :");
                int year=Integer.parseInt(input.nextLine());
                LocalDate dateOfBirth=LocalDate.of(year,month,day);
                System.out.println("Nhap que quan :");
                String que=input.nextLine();
                CanBo canBo=new CanBo(name,dateOfBirth,que);
                System.out.println("Nhap LuongCB:");
                long luongcb=Long.parseLong(input.nextLine());
                System.out.println("Nhap thuong :");
                long bonus=Long.parseLong(input.nextLine());
                System.out.println("Nhap phat: ");
                long phat=Long.parseLong(input.nextLine());
                canboGV =new CBGV(name,dateOfBirth,que,luongcb,bonus,phat);
            }catch (Exception e){
                checkInfo=true;
                System.out.println("Xin hay nhap dung dinh dang :");
            }
        }while (checkInfo);

        return canboGV;
    }


    public void creat(){
        list.add(nhapInfoCanBo());
    }


    public void printInfo(){
        for (CBGV canboGV : list) {
            System.out.println(canboGV.toString());
        }

    }
    public void tinhLuongthucte(){
        for (CBGV canboGV : list) {
            long luongThucte= canboGV.getLuongCB()-canboGV.getPhat()+canboGV.getThuong();
            System.out.println(canboGV.toString()+" "+ "luong thuc te = "+luongThucte);
        }
    }
    public void writeObjectToFile() {
        try {
            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(list);
            objectOut.close();
            fileOut.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Object readFromFile() {
        try {
            FileInputStream fileIn = new FileInputStream(filepath);
            try{
                ObjectInputStream objectIn = new ObjectInputStream(fileIn);
                Object obj = objectIn.readObject();
                list=(ArrayList<CBGV>) obj;
                objectIn.close();
                fileIn.close();
                return list;
            }catch (EOFException e){
                return null;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

}
