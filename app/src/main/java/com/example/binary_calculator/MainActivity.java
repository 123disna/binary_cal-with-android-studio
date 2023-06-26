package com.example.binary_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText value=findViewById(R.id.value);
        Button binaryToOctal=findViewById(R.id.binaryToOctal);
        Button binaryToDecimal=findViewById(R.id.binaryToDecimal);
        Button binaryToHexa=findViewById(R.id.binaryToHexa);
        Button OctalToBinary=findViewById(R.id.octalToBinary);
        Button OctalToDecimal=findViewById(R.id.octalToDecimal);
        Button OctalToHexa=findViewById(R.id.octalToHexa);
        Button DecimalToBinary=findViewById(R.id.decimalToBinary);
        Button DecimalToOctal=findViewById(R.id.decimalToOctal);
        Button DecimalToHexa=findViewById(R.id.decimalToHexa);
        Button HexaToBinary=findViewById(R.id.hexaToBinary);
        Button HexaToOctal=findViewById(R.id.hexaToOctal);
        Button HexaToDecimal=findViewById(R.id.hexaToDecimal);

        binaryToOctal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=value.getText().toString();
                int decimal=Integer.parseInt(val,2);
                String octal=Integer.toOctalString(decimal);
                Toast.makeText(getApplicationContext(),"Octal value is "+octal,Toast.LENGTH_LONG).show();

            }
        });
        binaryToDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=value.getText().toString();
                Toast.makeText(getApplicationContext(),"Decimal value is "+ Integer.parseInt(val,2),Toast.LENGTH_LONG).show();

            }
        });
        binaryToHexa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=value.getText().toString();
                int decimal=Integer.parseInt(val,2);
                String hexa=Integer.toHexString(decimal);
                Toast.makeText(getApplicationContext(),"Hexadecimal value is "+hexa,Toast.LENGTH_LONG).show();

            }
        });
        OctalToBinary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=value.getText().toString();
                int decimal=Integer.parseInt(val,8);
                String binary=Integer.toBinaryString(decimal);
                Toast.makeText(getApplicationContext(),"Binary value is "+binary,Toast.LENGTH_LONG).show();
            }
        });
        OctalToDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=value.getText().toString();
                int decimal=Integer.parseInt(val,8);
                Toast.makeText(getApplicationContext(),"Decimal value is "+decimal,Toast.LENGTH_LONG).show();
            }
        });
        OctalToHexa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=value.getText().toString();
                int decimal=Integer.parseInt(val,8);
                String Hexa=Integer.toBinaryString(decimal);
                Toast.makeText(getApplicationContext(),"Hexadecimal value is "+Hexa,Toast.LENGTH_LONG).show();
            }
        });
        DecimalToBinary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val=Integer.parseInt(value.getText().toString());
                String binary=Integer.toBinaryString(val);
                Toast.makeText(getApplicationContext(),"Binary value is "+binary,Toast.LENGTH_LONG).show();
            }
        });
        DecimalToOctal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val=Integer.parseInt(value.getText().toString());
                String octal=Integer.toOctalString(val);
                Toast.makeText(getApplicationContext(),"Octal value is "+octal,Toast.LENGTH_LONG).show();
            }
        });
        DecimalToHexa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val=Integer.parseInt(value.getText().toString());
                String hexa=Integer.toHexString(val);
                Toast.makeText(getApplicationContext(),"Hexadecimal value is "+hexa,Toast.LENGTH_LONG).show();
            }
        });
        HexaToBinary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=value.getText().toString();
                int decimal=Integer.parseInt(val,16);
                String binary=Integer.toBinaryString(decimal);
                Toast.makeText(getApplicationContext(),"Binary value is "+binary,Toast.LENGTH_LONG).show();
            }
        });
        HexaToOctal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=value.getText().toString();
                int decimal=Integer.parseInt(val,16);
                String octal=Integer.toOctalString(decimal);
                Toast.makeText(getApplicationContext(),"Octal value is "+octal,Toast.LENGTH_LONG).show();
            }
        });
        HexaToDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=value.getText().toString();
                int decimal=Integer.parseInt(val,16);
                String strDecimal=String.valueOf(decimal);
                Toast.makeText(getApplicationContext(),"Decimal value is "+strDecimal,Toast.LENGTH_LONG).show();
            }
        });
    }
}