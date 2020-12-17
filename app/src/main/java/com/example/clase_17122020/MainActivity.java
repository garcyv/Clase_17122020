package com.example.clase_17122020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.clase_17122020.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding bind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bind = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(bind.getRoot());
        Button mButton = findViewById(R.id.bt_button);

        bind.btButton.setRotationY(180);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Botón presionado",
                        Toast.LENGTH_SHORT).show();
            }
        }
        );

    }


}


