package com.facci.restaurantja;
//INGENIERO si lo hice yo :v
//JUAN DANIEL AVILA DELGADO
//4 NIVEL "B"
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivityJA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_j);
    }
    public void click1(View v){
        Toast.makeText(MainActivityJA.this,"Bocaditos Manabas",Toast.LENGTH_SHORT).show();
    }

    public void click2(View v){
        Toast.makeText(MainActivityJA.this,"Caldo de Gallina",Toast.LENGTH_SHORT).show();
    }

    public void click3(View v){
        Toast.makeText(MainActivityJA.this,"Ceviche de Pescado",Toast.LENGTH_SHORT).show();
    }

    public void click4(View v){
        Toast.makeText(MainActivityJA.this,"Cangrejada",Toast.LENGTH_SHORT).show();
    }

    public void click5(View v){
        Toast.makeText(MainActivityJA.this,"Encebollado",Toast.LENGTH_SHORT).show();
    }

    public void click6(View v){
        Toast.makeText(MainActivityJA.this,"Encocado de Pescado",Toast.LENGTH_SHORT).show();
    }

    public void click7(View v){
        Toast.makeText(MainActivityJA.this,"Apanado",Toast.LENGTH_SHORT).show();
    }
}
