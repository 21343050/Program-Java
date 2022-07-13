package CRUD;

import java.io.*;
import java.time.Year;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Util {
    static String ambilTahun() throws IOException {
        boolean tahunValid = false;
        Scanner terminalInput = new Scanner(System.in);
        String tahunInput = terminalInput.nextLine();

        while(!tahunValid) {
            try {
                Year.parse(tahunInput);
                tahunValid = true;
            } catch (Exception e) {
                System.err.println("Penulisan Format Tahun Yang Anda Masukkan Salah!3");
                System.out.print("Masukkan Tahun Lagi(YYYY)   : ");
                tahunValid = false;
                tahunInput = terminalInput.nextLine();
            }
        }

        return tahunInput;
    }
    static boolean cekBukuDiDatabase(String keywords[], boolean isDisplay) throws IOException{
        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        String data = bufferInput.readLine();
        boolean isExist = false;
        int jumlahData = 0;

        if (isDisplay) {
            System.out.println("\n| No |\tTahun |\tPenulis                |\tPenerbit                |\tJudul Buku");
            System.out.println("-----------------------------------------------------------------------------------------------");
        }
        int nomorData = 0;
        while (data != null) {
            //cek keyword didalam baris
            isExist = true;
            
            for (String keyword : keywords) {
                isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase());
            }
            
            //jika keyword cocok maka tampilkan
            if (isExist) {
                if (isDisplay) {
                    nomorData++;
                    StringTokenizer stringToken = new StringTokenizer(data, ",");
                    stringToken.nextToken();
                    System.out.printf("| %2d ",nomorData);
                    System.out.printf("|\t%4s  ",stringToken.nextToken());
                    System.out.printf("|\t%-20s   ",stringToken.nextToken());
                    System.out.printf("|\t%-20s    ",stringToken.nextToken());
                    System.out.printf("|\t%s    ",stringToken.nextToken());
                    System.out.println();
                } else {
                    break;
                }
            }
            data = bufferInput.readLine();
        }
        if (isDisplay) {
            System.out.println("-----------------------------------------------------------------------------------------------");
        }

        return isExist;
    }
    public static boolean getYesOrNo(String message) throws IOException{
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\n"+message+" (y/n)? ");
        String pilihanInput = terminalInput.next();

        while (!pilihanInput.equalsIgnoreCase("y") && !pilihanInput.equalsIgnoreCase("n")){
            System.out.println("Pilihan Anda, Bukan Y/N ");
            System.out.print("\n"+message+" (y/n)? ");
            pilihanInput = terminalInput.next();
        }

        return pilihanInput.equalsIgnoreCase("y");
    }
    public static void clearScreen() throws IOException{
        try {
            System.out.print("\033\143");
        } catch (Exception e) {
            System.err.println("Tidak bisa clear screen");
        }
    }
    protected static long ambilEntryPerTahun(String penulis, String tahun) throws IOException {
        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        long entry = 0;
        String data = bufferInput.readLine();
        Scanner dataScanner;
        String primaryKey;

        while (data != null) {
            dataScanner = new Scanner(data);
            dataScanner.useDelimiter(",");
            primaryKey = dataScanner.next();
            dataScanner = new Scanner(primaryKey);
            dataScanner.useDelimiter("_");

            penulis = penulis.replaceAll("\\s+", "");
            if (penulis.equalsIgnoreCase(dataScanner.next()) && tahun.equalsIgnoreCase(dataScanner.next())){
                entry = dataScanner.nextInt();
            }

            data = bufferInput.readLine();
        }

        return entry;
    }
}
