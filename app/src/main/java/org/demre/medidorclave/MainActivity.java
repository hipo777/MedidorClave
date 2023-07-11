package org.demre.medidorclave;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.demre.medidorclave.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //vista - construir el modelo y presentador
    }
}