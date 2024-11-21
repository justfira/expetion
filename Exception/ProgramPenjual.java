import java.util.Scanner;

public class ProgramPenjual {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Input Nomor Faktur");
            String NoFaktur = scanner.nextLine();

            System.out.print("Input Kode Barang");
            String KodeBarang = scanner.nextLine();

            System.out.print("Input Nama Barang");
            String NamaBarang = scanner.nextLine();

            System.out.print("Input Nama Barang");
            double HargaBarang = scanner.nextDouble();

            System.out.print("Input Jumlah Barang");
            int JumlahBeli = scanner.nextInt();

            struk Struk = new struk(NoFaktur, KodeBarang, NamaBarang, HargaBarang, JumlahBeli);

            Struk.tampilkanData();

        } catch (IllegalArgumentException e){
            System.out.println("\n Error : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("\n Error : Input data tidak valid");
        } finally {
            scanner.close();
            System.out.print("Program Selesai");
        }
    }
}
