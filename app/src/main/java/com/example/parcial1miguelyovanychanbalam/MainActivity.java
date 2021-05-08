package com.example.parcial1miguelyovanychanbalam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    EditText et2;
    TextView resultado;
    Button suma, resta, multiplicar, dividir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        suma = findViewById(R.id.btn_1);
        suma.setOnClickListener(clic);
        multiplicar = findViewById(R.id.btn_4);
        multiplicar.setOnClickListener(clic3);
        resta = findViewById(R.id.btn_2);
        resta.setOnClickListener(clic1);
        dividir = findViewById(R.id.btn_3);
        dividir.setOnClickListener(clic2);



    }

    View.OnClickListener clic = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //instrucciones que se realizarán al dar clic
            et1 = findViewById(R.id.et_1);
            String ad = et1.getText().toString();
            et2 = findViewById(R.id.et_2);
            String ba = et2.getText().toString();
            if (!ad.equals("")) {
                if (!ba.equals("")) {
                    double e1 = Double.parseDouble(ad);
                    double e2 = Double.parseDouble(ba);
                    double ppresultado = e1 + e2;
                    resultado = findViewById(R.id.tv_1);
                    resultado.setText(String.valueOf(ppresultado));
                } else {
                    Toast.makeText(getBaseContext(), "dato1", Toast.LENGTH_SHORT).show();
                }

            }
            else
                {
                    Toast.makeText(getBaseContext(), "dato2", Toast.LENGTH_SHORT).show();
                }
            }
        };

    View.OnClickListener clic1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //instrucciones que se realizarán al dar clic
            et1 = findViewById(R.id.et_1);
            String ad = et1.getText().toString();
            et2 = findViewById(R.id.et_2);
            String ba = et2.getText().toString();
            if (!ad.equals("")) {
                if (!ba.equals("")) {
                    double e1 = Double.parseDouble(ad);
                    double e2 = Double.parseDouble(ba);
                    double ppresultado = e1 * e2;
                    resultado = findViewById(R.id.tv_1);
                    resultado.setText(String.valueOf(ppresultado));
                } else {
                    Toast.makeText(getBaseContext(), "dato1", Toast.LENGTH_SHORT).show();
                }

            }
            else
            {
                Toast.makeText(getBaseContext(), "dato2", Toast.LENGTH_SHORT).show();
            }
        }
    };

    View.OnClickListener clic2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //instrucciones que se realizarán al dar clic
            et1 = findViewById(R.id.et_1);
            String ad = et1.getText().toString();
            et2 = findViewById(R.id.et_2);
            String ba = et2.getText().toString();
            if (!ad.equals("")) {
                if (!ba.equals("")) {
                    double e1 = Double.parseDouble(ad);
                    double e2 = Double.parseDouble(ba);
                    double ppresultado = e1 - e2;
                    resultado = findViewById(R.id.tv_1);
                    resultado.setText(String.valueOf(ppresultado));
                } else {
                    Toast.makeText(getBaseContext(), "dato1", Toast.LENGTH_SHORT).show();
                }

            }
            else
            {
                Toast.makeText(getBaseContext(), "dato2", Toast.LENGTH_SHORT).show();
            }
        }
    };

    View.OnClickListener clic3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //instrucciones que se realizarán al dar clic
            et1 = findViewById(R.id.et_1);
            String ad = et1.getText().toString();
            et2 = findViewById(R.id.et_2);
            String ba = et2.getText().toString();
            if (!ad.equals("")) {
                if (!ba.equals("")) {
                    double e1 = Double.parseDouble(ad);
                    double e2 = Double.parseDouble(ba);
                    double ppresultado = e1 / e2;
                    resultado = findViewById(R.id.tv_1);
                    resultado.setText(String.valueOf(ppresultado));
                } else {
                    Toast.makeText(getBaseContext(), "dato1", Toast.LENGTH_SHORT).show();
                }

            }
            else
            {
                Toast.makeText(getBaseContext(), "dato2", Toast.LENGTH_SHORT).show();
            }
        }
    };

}