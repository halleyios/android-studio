package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;


public class MainActivity extends AppCompatActivity {

    CheckBox checkBoxCorba,checkBoxPilav,checkBoxKofte,checkBoxLahmacun,checkBoxTatli;
    EditText editTextCorba,editTextKofte,editTextPilav,editTextLahmacun,editTextTatli;
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
        buttonSiparis=findViewById(R.id.button_siparis);
        textViewOzet=findViewById(R.id.textView_ozet);
        editTextCorba=findViewById(R.id.editTextNumber_corba);
        editTextKofte=findViewById(R.id.editTextNumber_kofte);
        editTextLahmacun=findViewById(R.id.editTextNumber_lahmacun);
        editTextPilav=findViewById(R.id.editTextNumber_pilav);
        editTextTatli=findViewById(R.id.editTextNumber_tatli);


        buttonSiparis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float corbaFİyat=50,pilavFiyat=100,kofteFiyat=200,lahmacunFiyat=75,tatliFiyat=65;
                float toplamTutar=0;
                String s="Sipariş Özeti:\n";

                if(checkBoxCorba.isChecked()){
                    int adet=Integer.parseInt(editTextCorba.getText().toString());
                    toplamTutar+=corbaFİyat*adet;
                    s+="Çorba\n";
                }
                if(checkBoxKofte.isChecked()){
                    int adet=Integer.parseInt(editTextKofte.getText().toString());
                    toplamTutar+=kofteFiyat*adet;
                    s+="Köfte\n";
                }
                if(checkBoxLahmacun.isChecked()){
                    int adet=Integer.parseInt(editTextLahmacun.getText().toString());
                    toplamTutar+=lahmacunFiyat*adet;
                    s+="Lahmacun\n";
                }
                if(checkBoxPilav.isChecked()){
                    int adet=Integer.parseInt(editTextPilav.getText().toString());
                    toplamTutar+=pilavFiyat*adet;
                    s+="Pilav\n";
                }

                if(checkBoxTatli.isChecked()){
                    int adet=Integer.parseInt(editTextTatli.getText().toString());
                    toplamTutar+=tatliFiyat*adet;
                    s+="Tatlı\n";
                }
                textViewOzet.setText(s+"Toplam Tutar: "+toplamTutar);

            }
        });

    }
}