package com.example.teste2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.IOException;

import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
            public static void main(String[] args) throws IOException {
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("https://develangola.officegest.com/api/")
                        .build();

                CustumersService service = retrofit.create(CustumersService.class);
            }


}