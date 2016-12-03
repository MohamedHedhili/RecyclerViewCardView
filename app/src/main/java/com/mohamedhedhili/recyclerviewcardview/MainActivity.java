package com.mohamedhedhili.recyclerviewcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private List<MyObject> Cartoons = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //remplir la ville
        AddCartoon();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

// define the layout of cells, here vertically, like a ListView
// recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // to fit as a RecyclerView grid, with 2 cells per line
       recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        // then create a MyAdapter, provide our list of cartoons
      // this adapter will be used to fill out our recycletrview
        recyclerView.setAdapter(new MyAdapter(Cartoons));
    }

    private void AddCartoon()
    {
        Cartoons.add(new MyObject("Sponge Bob","https://s-media-cache-ak0.pinimg.com/originals/6f/59/a8/6f59a8861b44413d9e74648860c17679.jpg"));
        Cartoons.add(new MyObject("Mickey Mouse","http://www.picgifs.com/graphics/m/mickey-mouse/graphics-mickey-mouse-019311.gif"));
        Cartoons.add(new MyObject("Jerry","http://www.gif-maniac.com/gifs/30/29835.gif"));
        Cartoons.add(new MyObject("Hello Kitty","http://www.gifgratis.net/gifs_animes/hello_kitty_glitter/77.gif"));
        Cartoons.add(new MyObject("pokemon", "http://www.gifgratis.net/gifs_animes/pokemon/20.gif"));
        Cartoons.add(new MyObject("Conane", "http://www.gifmania.be/Gif-Animes-Manga-Anime/Animations-Series-Anime-Police/Images-Gif-Detective-Conan/Detective-Conan-76547.gif"));
    }
    }

