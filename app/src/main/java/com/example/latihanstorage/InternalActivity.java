package com.example.latihanstorage;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileOutputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class InternalActivity extends AppCompatActivity {
public static final String FILENAME = "namafile.txt";
    Button buatFile, bacaFile, ubahFile, hapusFile;
    TextView textBaca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internal);

        buatFile = findViewById(R.id.buatFile);
        bacaFile = findViewById(R.id.bacaFile);
        ubahFile = findViewById(R.id.ubahFile);
        hapusFile = findViewById(R.id.hapusFile);

        textBaca.findViewById(R.id.textBaca);

        buatFile.setOnClickListener(this);
        bacaFile.setOnClickListener(this);
        ubahFile.setOnClickListener(this);
        hapusFile.setOnClickListener(this);
    }

    void buatFile () {
        String isiFile = "Coba Isi Data File Text";
        File file = new File(getFilesDir(), FILENAME);
        FileOutputStream outputStream = null;
        try {
            file.createNewFile();
            outputStream = new FileOutputStream(file,true);
            outputStream.write(isiFile.getBytes());
            outputStream.flush();
            outputStream.close();
        } catch (Exception e){
            e.printStackTrace();
        }

    }

        void hapusFile (){
        File file = new File(getFilesDir(), FILENAME);
        if (file.exists()) {
            file.delete();
        }
        }

        public void onClick(View view){
        jalankanPerintah(view.getId());
        }

        public void jalankanPerintah (int id){
        switch (id){
            case R.id.buatFile:
                buatFile();
                break;
            case R.id.bacaFile:
                bacaFile();
                break;
            case R.id.ubahFile:
                ubahFile();
                break;
            case R.id.hapusFile:
                hapusFile();
                break;
        }
        }

    void bacaFile (){
        File file = new File(getFilesDir(), FILENAME);
        if (file.exists()) {
            file.delete();
        }
    }

    public void onClick(View view){
        jalankanPerintah(view.getId());
    }

    public void jalankanPerintah (int id){
        switch (id){
            case R.id.buatFile:
                buatFile();
                break;
            case R.id.bacaFile:
                bacaFile();
                break;
            case R.id.ubahFile:
                ubahFile();
                break;
            case R.id.hapusFile:
                hapusFile();
                break;
        }
    }

    void ubahFile (){
        File file = new File(getFilesDir(), FILENAME);
        if (file.exists()) {
            file.delete();
        }
    }

    public void onClick(View view){
        jalankanPerintah(view.getId());
    }

    public void jalankanPerintah (int id){
        switch (id){
            case R.id.buatFile:
                buatFile();
                break;
            case R.id.bacaFile:
                bacaFile();
                break;
            case R.id.ubahFile:
                ubahFile();
                break;
            case R.id.hapusFile:
                hapusFile();
                break;
        }
    }

}