package com.example.snow_.dortislem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2;
    EditText edt,edt1;
    RadioButton RTopla,RCıkar,RCarp,RBol;
    double ilkSayi,ikinciSayi;
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.button);
        btn2=(Button)findViewById(R.id.button2);
        edt=(EditText)findViewById(R.id.editText);
        edt1=(EditText)findViewById(R.id.editText2);
        RTopla=(RadioButton)findViewById(R.id.radioButton);
        RCıkar=(RadioButton)findViewById(R.id.radioButton2);
        RCarp=(RadioButton)findViewById(R.id.radioButton3);
        RBol=(RadioButton)findViewById(R.id.radioButton4);
        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        hesapla();
    }
    public void hesapla(){
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ilkSayi=Double.parseDouble(edt.getText().toString());
                ikinciSayi=Double.parseDouble(edt1.getText().toString());
                int selectedId=radioGroup.getCheckedRadioButtonId();
                switch (selectedId){
                    case R.id.radioButton:
                        btn2.setText(String.valueOf(ilkSayi+ikinciSayi));
                        break;
                    case R.id.radioButton2:
                        btn2.setText(String.valueOf(ilkSayi-ikinciSayi));
                        break;
                    case R.id.radioButton3:
                        btn2.setText(String.valueOf(ilkSayi*ikinciSayi));
                        break;
                    case R.id.radioButton4:
                        btn2.setText(String.valueOf(ilkSayi/ikinciSayi));
                        break;
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setText("SONUÇ");
            }
        });

    }
}
