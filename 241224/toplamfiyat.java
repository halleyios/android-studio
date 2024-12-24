package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompa

public class MainActivity extends AppCompatActivity {

    CheckBox checkBoxCorba,checkBoxPilav,checkBoxKofte,checkBoxLahmacun,checkBoxTatli;
    Button buttonSiparis;

    TextView textViewOzet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxCorba=findViewById(R.id.checkBox_corba);
        checkBoxPilav=findViewById(R.id.checkBox_pilav);
        checkBoxKofte=findViewById(R.id.checkBox_kofte);
        checkBoxLahmacun=findViewById(R.id.checkBox_lahmacun);
        checkBoxTatli=findViewById(R.id.checkBox_tatli);

        buttonSiparis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float corbaFİyat=50,pilavFiyat=100,kofteFiyat=200,lahmacunFiyat=75,tatliFiyat=65;
                float toplamTutar=0;
                String s="Sipariş Özeti:\n";

                if(checkBoxCorba.isChecked()){
                    toplamTutar+=corbaFİyat;
                    s+="Çorba\n";
                }
                if(checkBoxKofte.isChecked()){
                    toplamTutar+=kofteFiyat;
                    s+="Köfte\n";
                }
                if(checkBoxLahmacun.isChecked()){
                    toplamTutar+=lahmacunFiyat;
                    s+="Lahmacun\n";
                }
                if(checkBoxPilav.isChecked()){
                    toplamTutar+=pilavFiyat;
                    s+="Pilav\n";
                }

                if(checkBoxTatli.isChecked()){
                    toplamTutar+=tatliFiyat;
                    s+="Tatlı\n";
                }
                textViewOzet.setText(s+"Toplam Tutar: "+toplamTutar);

            }
        });

    }
}