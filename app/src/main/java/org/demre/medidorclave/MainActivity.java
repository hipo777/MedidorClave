package org.demre.medidorclave;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Toast;

import org.demre.medidorclave.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements VistaPresentador{
    private Presentador presentando;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //vista - construir el modelo y presentador}
        presentando = new Presentador(this);
        binding.ediTxtPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            presentando.evaluarContrasena(s.toString());
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }
    @Override
    public void mostrarDebil() {
        Toast.makeText(this, "Contraseña Débil", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void mostrarMedio() {
        Toast.makeText(this, "Contraseña Media", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void mostrarFuerte() {
        Toast.makeText(this, "Contraseña Fuerte", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void mostrarError() {
        Toast.makeText(this, "Ocurrió un Error", Toast.LENGTH_SHORT).show();

    }
}