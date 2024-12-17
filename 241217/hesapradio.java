package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText etS1,etS2;
    RadioButton rdTopla,rdCikar,rdCarp,rdBol;
    Button btnHesapla;
    TextView tvSonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        etS1 = findViewById(R.id.editTextNumber_s1);
        etS2 = findViewById(R.id.editTextNumber_s2);
        rdTopla = findViewById(R.id.radioButton_topla);
        rdCikar = findViewById(R.id.radioButton_cikar);
        rdCarp = findViewById(R.id.radioButton_carp);
        rdBol = findViewById(R.id.radioButton_bol);
        tvSonuc = findViewById(R.id.textView_sonuc);
        btnHesapla = findViewById(R.id.button_hesapla);
        btnHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double sonuc=0;
                int s1 = Integer.parseInt(etS1.getText().toString());
                int s2 = Integer.parseInt(etS2.getText().toString());
                if (rdTopla.isChecked()) {
                    sonuc = s1 + s2;
                }else if(rdCikar.isChecked()){
                    sonuc = s1-s2;
                }else if(rdCarp.isChecked()){
                    sonuc = s1*s2;
                }else if(rdBol.isChecked()){
                    sonuc = (double)s1/s2;
                }else{
                    Toast.makeText(MainActivity.this, "İşlem Seçiniz", Toast.LENGTH_SHORT).show();
                }
                tvSonuc.setText("Sonuc:" + sonuc);
            }
        });
    }
}