package com.example.guia03wilber;


import static com.example.guia03wilber.MainActivity.lstTrabajadores;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.guia03wilber.adapters.TrabajadorAdapter;
import com.example.guia03wilber.databinding.ActivityAgregarTrabajadorBinding;
import com.example.guia03wilber.databinding.ActivityElegirTipoTrabajadorBinding;
import com.example.guia03wilber.databinding.ActivityMostrarListaBinding;
import com.example.guia03wilber.modelo.Trabajador;

public class MostrarListaActivity extends AppCompatActivity {
    private TrabajadorAdapter trabajadorAdapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private ActivityMostrarListaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMostrarListaBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Toast.makeText(this, "DATOS: " + lstTrabajadores,
                Toast.LENGTH_SHORT).show();
        // Configurando adaptador
        trabajadorAdapter = new TrabajadorAdapter(lstTrabajadores);
        layoutManager = new LinearLayoutManager(this);
        binding.rcvTrabajadores.setAdapter(trabajadorAdapter);
        binding.rcvTrabajadores.setLayoutManager(layoutManager);
        binding.rcvTrabajadores.setHasFixedSize(true);

    }
}
