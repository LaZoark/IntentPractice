package com.example.intentpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void quickActionView(View v){
        Intent it = new Intent();
        it.setAction(Intent.ACTION_VIEW);
        Uri uri = Uri.parse("http://google.com");
        it.setData(uri);

        startActivity(it);
    }
    public void quickActionWeb(View v){
        Intent it = new Intent(Intent.ACTION_WEB_SEARCH);
//        it.setAction();
//        Uri uri = Uri.parse();
//        it.setData(uri);
        it.putExtra(SearchManager.QUERY,"android");    
        startActivity(it);
    }
}