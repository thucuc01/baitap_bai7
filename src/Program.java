import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Menu menu=new Menu();
        Method method=new Method();
        Scanner input=new Scanner(System.in);
        boolean check;
        boolean check1=true;
        do{
            menu.menus();
            int choice=0;
            do{
                try{
                    check=false;
                    choice=Integer.parseInt(input.nextLine());
                }catch (Exception e){
                    check=true;
                    System.out.println("Nhap 1 or 2 or 3 or 4 voi cac chuc nang tuong ung");
                }
            }while(check);

            switch (choice){
                case 1:
                    method.readFromFile();
                    method.creat();
                    method.writeObjectToFile();
                    break;
                case 2:
                        method.readFromFile();
                        method.printInfo();
                    break;
                case 3:
                        method.readFromFile();
                        method.tinhLuongthucte();
                    break;
                case 4:
                    check1=false;
                    break;
                default:
                    System.out.println("khong co chuc nang nay");
                    break;
            }
        }while (check1);

    }
}
