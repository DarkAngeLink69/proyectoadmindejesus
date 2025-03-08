package com.example.sesion81dejesusap_git;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public Button btnVenta, btnContacto, btnProducto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnVenta= findViewById(R.id.btnVenta);
        btnVenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  abrirVenta = new Intent(getApplicationContext(), Venta.class);
                startActivity(abrirVenta);
            }
        });
        btnContacto=findViewById(R.id.btnContacto);
        btnContacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  abrirContacto = new Intent(getApplicationContext(), Contacto.class);
                startActivity(abrirContacto);
            }
        });
        btnProducto=findViewById(R.id.btnProductos);
        btnProducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  abrirProducto = new Intent(getApplicationContext(), Productos.class);
                startActivity(abrirProducto);
            }
        });
    }
}