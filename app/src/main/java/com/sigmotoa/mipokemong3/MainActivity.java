package com.sigmotoa.mipokemong3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgPokemon1 = findViewById(R.id.iv_pokemon_1);
        ImageView imgPokemon2 = findViewById(R.id.iv_pokemon_2);
        ImageView imgPokemon3 = findViewById(R.id.iv_pokemon_3);
        ImageView imgPokemon4 = findViewById(R.id.iv_pokemon_4);
        ImageView imgPokemon5 = findViewById(R.id.iv_pokemon_5);

        Glide.with(this)
                .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/animated/1.gif")
                .centerCrop()
                .into(imgPokemon1);
        Glide.with(this)
                .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/animated/2.gif")
                .centerCrop()
                .into(imgPokemon2);
        Glide.with(this)
                .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/animated/3.gif")
                .centerCrop()
                .into(imgPokemon3);
        Glide.with(this)
                .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/animated/4.gif")
                .centerCrop()
                .into(imgPokemon4);
        Glide.with(this)
                .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/animated/5.gif")
                .centerCrop()
                .into(imgPokemon5);


    }
}