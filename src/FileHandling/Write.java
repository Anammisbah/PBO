package FileHandling;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    Gson gson = new Gson();
    String nama, nim, jurusan, ttl;

    public Write(String nama, String nim, String jurusan, String ttl) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ttl = ttl;
        try {
            FileWriter myWriter = new FileWriter("mahasiswa.json");
            String[] data = { this.nama, this.nim, this.jurusan, this.ttl };
            String file = gson.toJson(data);
            myWriter.write(file);
            myWriter.close();
            System.out.println("Success Menambahkan data");
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
