 package com.tashfia.myfavouritewebsite;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

    Button btn_techtunes,btn_sikkhok,btn_youtube,btn_webcoachbd,btn_facebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_techtunes =(Button)findViewById(R.id.btn_techtunes);
        btn_sikkhok=(Button)findViewById(R.id.btn_sikkhok);
        btn_youtube=(Button)findViewById(R.id.btn_youtube);
        btn_webcoachbd=(Button)findViewById(R.id.btn_webcoachbd);
        btn_facebook=(Button)findViewById(R.id.btn_facebook);

        btn_techtunes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttech= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.techtunes.com.bd/"));
                startActivity(intenttech);
                Toast.makeText(MainActivity.this, "Techtunes", Toast.LENGTH_SHORT).show();
            }
        });
        btn_sikkhok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentsikkhok = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sikkhok.com/"));
                startActivity(intentsikkhok);
                Toast.makeText(MainActivity.this, "Sikkhok.com", Toast.LENGTH_SHORT).show();
            }
        });
 btn_webcoachbd.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {
         Intent intentweb = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.webcoachbd.com/"));
         startActivity(intentweb);
         Toast.makeText(MainActivity.this, "Webcoachbd", Toast.LENGTH_SHORT).show();
     }
 });

 btn_youtube.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {
         Intent intentyoutube = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"));
         startActivity(intentyoutube);
         Toast.makeText(MainActivity.this, "Youtube", Toast.LENGTH_SHORT).show();
     }
 });
btn_facebook.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intentfb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
        startActivity(intentfb);
        Toast.makeText(MainActivity.this, "Facebook", Toast.LENGTH_SHORT).show();
    }
});

    }
}
