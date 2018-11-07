package com.lec.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Cartoon cartoon=new Cartoon();
        Cartoon cartoon2=new Cartoon();
        Cartoon cartoon3=new Cartoon();
        Cartoon cartoon4=new Cartoon();
        Cartoon cartoon5=new Cartoon();
        Cartoon cartoon6=new Cartoon();
        Cartoon cartoon7=new Cartoon();

        Cartoon.setNme ("Dore");
        Cartoon.setdiscription ("Doreamone");
        Cartoon.setThumbnail(R.drawable.dore);

        Cartoon .setName ("Frozon");
        Cartoon.setdiscription("Frozon");
        Cartoon.setThumbnail(R.drawable.froz);

        Cartoon .setName ("kiracso");
        Cartoon.setdiscription("Kitracsu_Teen Ka Daba");
        Cartoon.setThumbnail(R.drawable.kit);

        Cartoon .setName ("Rapunzel");
        Cartoon.setdiscription("Rapunzel");
        Cartoon.setThumbnail(R.drawable.rapun);

        Cartoon .setName ("Ice_Bear");
        Cartoon.setdiscription("We_are_Bears");
        Cartoon.setThumbnail(R.drawable.bear);

        Cartoon .setName ("Oggy");
        Cartoon.setdiscription("Oggy And Cacroches");
        Cartoon.setThumbnail(R.drawable.oggy);

        Cartoon .setName ("Raju");
        Cartoon.setdiscription("Mighty_Raju");
        Cartoon.setThumbnail(R.drawable.raju);


        Cartoon.add.(cartoon);
        Cartoon.add.(cartoon2;
        Cartoon.add.(cartoon3);
        Cartoon.add.(cartoon4);
        Cartoon.add.(cartoon5);
        Cartoon.add.(cartoon6);
        Cartoon.add.(cartoon7)





    }
}
