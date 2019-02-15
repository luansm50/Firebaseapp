package com.example.user.firebaseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseReference usuarios = databaseReference.child("usuarios");
        DatabaseReference produtos = databaseReference.child("produtos");

        Usuario usuario = new Usuario();
        usuario.setIdade(20);
        usuario.setNome("Luan");
        usuario.setSobrenome("Melo");

        usuarios.child("001").setValue(usuario);

        Produto produto = new Produto();
        produto.setDescricao("Tables Samsung 32GB 9.5 Modelo 25AKSLO");
        produto.setMarca("Samsung");
        produto.setPreco(new Float(2.5));

        produtos.child("001").setValue(produto);


    }
}
