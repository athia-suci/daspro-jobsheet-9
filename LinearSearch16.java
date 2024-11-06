import java.util.Scanner;

public class LinearSearch16 {
    public static void main(String[] args) {
        // int[] arrNilai = {80, 85, 78, 96, 90, 82, 86};
        // int key = 90;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array : ");
        int banyakNilai = sc.nextInt();

        int[] arrNilai = new int[banyakNilai];
        int key;
        int hasil = 0;

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan elemen array ke-" +i+ " : ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan key yang ingin dicari : ");
        key = sc.nextInt();
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                System.out.println("Nilai " + key + " ada di posisi indeks ke-" + hasil);
                break;
            }else{
                System.out.println("Key tidak ditemukan");
                break;
            }
        }
    }
}

