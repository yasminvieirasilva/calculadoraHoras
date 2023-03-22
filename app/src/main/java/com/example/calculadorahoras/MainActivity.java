package com.example.calculadorahoras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText hi, hf, mi, mf;
    TextView rm, rh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        hi = findViewById(R.id.hi);
        hf = findViewById(R.id.hf);
        mi = findViewById(R.id.mi);
        mf = findViewById(R.id.mf);
        rm = findViewById(R.id.rm);
        rh = findViewById(R.id.rh);
    }

    public void soma(View v) {
        int horaInicial = Integer.parseInt(hi.getText().toString());
        int horaFinal = Integer.parseInt(hf.getText().toString());
00        int minutoInicial = Integer.parseInt(mi.getText().toString());
        int minutoFinal = Integer.parseInt(mf.getText().toString());

        int resultadoHora = horaInicial + horaFinal;
        int resultadoMinuto = minutoInicial + minutoFinal;
        while (resultadoMinuto > 59) {
            resultadoMinuto -= 60;
            resultadoHora++;
        }
        rh.setText(resultadoHora + "");
        rm.setText(resultadoMinuto + "");

    }

    public void subtrair (View v) {

        int horaInicial = Integer.parseInt(hi.getText().toString());
        int horaFinal = Integer.parseInt(hf.getText().toString());
        int minutoInicial = Integer.parseInt(mi.getText().toString());
        int minutoFinal = Integer.parseInt(mf.getText().toString());


        while (horaInicial > 0) {
            horaInicial--;
            minutoInicial += 60;
        }
        while (horaFinal > 0) {
            horaFinal--;
            minutoFinal += 60;
        }
        int rhs = 0;
        int rmS = minutoInicial - minutoFinal;

        if (minutoFinal > minutoInicial) {
            rmS = minutoFinal - minutoInicial;

        }
        while (rmS > 59) {
            rhs++;
            rmS -= 60;
        }
        rh.setText(rhs + "");
        rm.setText(rmS + "");
    }
}

