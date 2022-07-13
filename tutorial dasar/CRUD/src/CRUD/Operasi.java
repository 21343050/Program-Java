package CRUD;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Operasi {
    public static void updateData() throws IOException {
        // kita ambil DB original
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        // kita buat db sementara
        File tempBD = new File("tempBD.txt");
        FileWriter fileOutput = new FileWriter(tempBD);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        // tampilkan data
        System.out.println("\nList Buku");
        tampilkanData();

        // ambil user input / pilihan data
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\nMasukkan No Buku Yang Akan Diupdate: ");
        int updateNum = terminalInput.nextInt();

        // tampilkan data yang ingin di update

        String data = bufferedInput.readLine();
        int entryCounts = 0;

        while (data != null) {
            entryCounts++;
            
            StringTokenizer st = new StringTokenizer(data, ",");

            // tampilkan entry counts == updateNum
            if (updateNum == entryCounts) {
                System.out.println("\nData Yang Ingin Anda Update Adalah: ");
                System.out.println("=====================================");
                System.out.println("Referensi           : " + st.nextToken());
                System.out.println("Tahun               : " + st.nextToken());
                System.out.println("Penulis             : " + st.nextToken());
                System.out.println("Penerbit            : " + st.nextToken());
                System.out.println("Judul               : " + st.nextToken());

                // update data

                // mengambil input dari user
                String fieldData[] = {"Tahun", "Penulis", "Penerbit", "Judul"};
                String tempData[] = new String[4];

                st = new StringTokenizer(data, ",");
                String originalData = st.nextToken();


                for (int i = 0; i < fieldData.length; i++) {
                    boolean isUpdate = Util.getYesOrNo("Apakah Anda Ingin Merubah " + fieldData[i]);

                    originalData = st.nextToken();
                    if (isUpdate) {
                        // user input
                        if (fieldData[i].equalsIgnoreCase("tahun")) {
                            System.out.print("Masukkan Tahun Terbit(YYYY) : ");
                            tempData[i] = Util.ambilTahun();
                        } else {
                            terminalInput = new Scanner(System.in);
                            System.out.print("Masukkan " + fieldData[i] + " baru: ");
                            tempData[i] = terminalInput.nextLine();
                        }

                    } else {
                        tempData[i] = originalData;
                    }
                }

                // tampilkan data baru ke layar
                st = new StringTokenizer(data, ",");
                st.nextToken();
                System.out.println("\nData Baru Anda Adalah: ");
                System.out.println("=====================================");
                System.out.println("Tahun               : " + st.nextToken() + " ==> " + tempData[0]);
                System.out.println("Penulis             : " + st.nextToken() + " ==> " + tempData[1]);
                System.out.println("Penerbit            : " + st.nextToken() + " ==> " + tempData[2]);
                System.out.println("Judul               : " + st.nextToken() + " ==> " + tempData[3]);

                Boolean isUpdate = Util.getYesOrNo("Apakah Anda Yakin Mengupdate Data Tersebut");

                if (isUpdate) {
                    // cek data baru didatabase
                    boolean isExist = Util.cekBukuDiDatabase(tempData, false);

                    if (isExist) {
                        System.err.println("Data Buku Sudah Ada Didatabase, proses update dibatalkan, \nsilahkan delete yang bersangkutan");
                    } else {
                        // format data baru kedalam database
                        String tahun = tempData[0];
                        String penulis = tempData[1];
                        String penerbit = tempData[2];
                        String judul = tempData[3];

                        // kita bikin primary key
                        long nomorEntry = Util.ambilEntryPerTahun(penulis, tahun) + 1;

                        String penulisTanpaSpasi = penulis.replaceAll("\\s+", "");
                        String primaryKey = penulisTanpaSpasi+"_"+tahun+"_"+nomorEntry;

                        //tulis data ke database
                        bufferedOutput.write(primaryKey+","+tahun+","+penulis+","+penerbit+","+judul);
                    }
                } else {
                // copy data
                bufferedOutput.write(data);
                }

            } else {
                
                // copy data
                bufferedOutput.write(data);
            }

            bufferedOutput.newLine();

            data = bufferedInput.readLine();
        }

        // menulis data ke file
        bufferedOutput.flush();

        // delete original database nya
        database.delete();

        // rename tempDB jadi database
        tempBD.renameTo(database);

    }

    public static void deleteData() throws IOException {
        // kita ambil database original
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        // kita buat database sementara
        File tempDB = new File("tempDB.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        // tampilkan data
        System.out.println("\nList Buku");
        tampilkanData();

        // kita ambil user input untuk mendelete data
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\nMasukkan No Buku Yang Akan Dihapus: ");
        int deleteNum = terminalInput.nextInt();

        // looping untuk membaca tiap data baris dan skip data yang akan dideleteType

        boolean isFound = false;
        int entryCounts = 0;

        String data = bufferedInput.readLine();

        while (data != null) {
            entryCounts++;
            boolean isDelete = false;

            StringTokenizer st = new StringTokenizer(data, ",");
            //tampilkan data yg ingin dihapus
            if (deleteNum == entryCounts) {
                System.out.println("\nData Yang Ingin Anda Hapus Adalah: ");
                System.out.println("====================================");
                System.out.println("Referensi        : " + st.nextToken());
                System.out.println("Tahun            : " + st.nextToken());
                System.out.println("Penulis          : " + st.nextToken());
                System.out.println("Penerbit         : " + st.nextToken());
                System.out.println("Judul            : " + st.nextToken());

                isDelete = Util.getYesOrNo("Apakah Anda Yakin Ingin Menghapus");
                isFound = true;
            }

            if (isDelete) {
                // skip pindahkan data dari original ke sementara
                System.out.println("Data Berhasil Dihapus");
            } else {
                // kita pindahkan data dari original ke sementara
                bufferedOutput.write(data);
                bufferedOutput.newLine();
            }
            data = bufferedInput.readLine(); 
        }

        if (!isFound) {
            System.err.println("Buku Tidak Ditemukan");
        }

        // menulis data ke file tempDB
        bufferedOutput.flush();

        // delete original DB
        database.delete();

        // rename tempDB ke ori DB
        tempDB.renameTo(database);
    }

    public static void tampilkanData() throws IOException{
        FileReader fileInput;
        BufferedReader bufferInput;

        try {
            fileInput = new FileReader("database.txt");
            bufferInput = new BufferedReader(fileInput);
        } catch (Exception e) {
            System.err.println("Database tidak ditemukan");
            System.err.println("Silahkan tambah data dahulu");
            tambahData();
            return;
        }
        System.out.println("\n| No |\tTahun |\tPenulis                |\tPenerbit                |\tJudul Buku");
        System.out.println("-----------------------------------------------------------------------------------------------");

        String data = bufferInput.readLine();
        int nomorData = 0;
        while (data != null) {
            nomorData++;
            
            StringTokenizer stringToken = new StringTokenizer(data, ",");
            stringToken.nextToken();
            System.out.printf("| %2d ",nomorData);
            System.out.printf("|\t%4s  ",stringToken.nextToken());
            System.out.printf("|\t%-20s   ",stringToken.nextToken());
            System.out.printf("|\t%-20s    ",stringToken.nextToken());
            System.out.printf("|\t%s    ",stringToken.nextToken());
            System.out.println();
            
            data = bufferInput.readLine();
        }
        System.out.println("-----------------------------------------------------------------------------------------------");
    }

    public static void cariData() throws IOException {
        //membaca database ada atau tidak
        try {
            FileReader fileDatabase = new FileReader("database.txt");
            BufferedReader bufferedDatabase = new BufferedReader(fileDatabase);       
        } catch (Exception e) {
            System.err.println("Database tidak ditemukan");
            System.err.println("Silahkan tambah dulu");
            tambahData();
        }

        //ambil keyword dari user
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("Masukkan Kata Kunci Buku: ");
        String cariBuku = terminalInput.nextLine();

        String keywords[] = cariBuku.split("\\s");

        //cek keyword didatabase
        Util.cekBukuDiDatabase(keywords, true);
    }

    public static void tambahData() throws IOException{
        FileWriter fileOutput = new FileWriter("database.txt",true);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);

        Scanner terminalInput = new Scanner(System.in);
        String penulis, judul, penerbit, tahun;
        
        //ambil input dari user
        System.out.print("Masukkan Nama Penulis       : ");
        penulis = terminalInput.nextLine();
        System.out.print("Masukkan Nama Judul         : ");
        judul = terminalInput.nextLine();
        System.out.print("Masukkan Nama Penerbit      : ");
        penerbit = terminalInput.nextLine();
        System.out.print("Masukkan Tahun Terbit(YYYY) : ");
        tahun = Util.ambilTahun();

        //cek buku didatabase
        String[] keywords = {tahun+","+penulis+","+penerbit+","+judul};
        System.out.println(Arrays.toString(keywords));

        boolean isExist =  Util.cekBukuDiDatabase(keywords, false);

        //menulis buku didatabase
        if (!isExist) {
            // fiersabesari_2012_1,2012,fiersa besari,media kita,jejak langkah
            System.out.println(Util.ambilEntryPerTahun(penulis, tahun));
            long nomorEntry = Util.ambilEntryPerTahun(penulis, tahun) + 1;



            String penulisTanpaSpasi = penulis.replaceAll("\\s+", "");
            String primaryKey = penulisTanpaSpasi+"_"+tahun+"_"+nomorEntry;
            System.out.println("\nData yang akan anda masukkan adalah");
            System.out.println("----------------------------------------");
            System.out.println("primary key  : "+primaryKey);
            System.out.println("tahun terbit : "+tahun);
            System.out.println("penulis      : "+penulis);
            System.out.println("judul        : "+judul);
            System.out.println("penerbit     : "+penerbit);
 
            boolean isTambah = Util.getYesOrNo("Apakah anda ingin menambah data tersebut?");

            if (isTambah) {
                bufferOutput.write(primaryKey+","+tahun+","+penulis+","+penerbit+","+judul);
                bufferOutput.newLine();
                bufferOutput.flush();
            }
        } else {
            System.out.println("buku yg anda akan masukkan, sudah tersedia didatabase dengan data berikut");
            Util.cekBukuDiDatabase(keywords, true);
        }

        bufferOutput.close();
    }
}