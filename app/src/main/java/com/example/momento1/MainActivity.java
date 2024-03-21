package com.example.momento1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText inputTipoTenis, inputBranch, inputColor;

    TextView txtResultadoBusqueda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        inputTipoTenis = findViewById(R.id.inputTipoTenis);
        inputBranch = findViewById(R.id.inputBranch);
        inputColor = findViewById(R.id.inputColor);
        txtResultadoBusqueda = findViewById(R.id.txtResultadoBusqueda);
    }

    public void enviarData(View view){
        String TipoTenis= inputTipoTenis.getText().toString();
        String branch= inputBranch.getText().toString();
        String color= inputColor.getText().toString();
        tenis tenis1= new tenis(TipoTenis,branch,color);
        Toast.makeText(this, "BÚESQUEDA EXITOSA", Toast.LENGTH_LONG).show();
        String resultadoBusqueda = tenis1.TipoTenis + " " + tenis1.branch + " " + tenis1.color;
        txtResultadoBusqueda.setText(resultadoBusqueda);
        txtResultadoBusqueda.setTextColor(Color.parseColor("#08AFE6"));
}
}
