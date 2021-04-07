package com.example.intentpractice;
import androidx.appcompat.app.AppCompatActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void universalQuickAction(View v){
        Intent it = new Intent();
        switch (v.getId()){
            case R.id.button_camera:
                Intent secondScreen = new Intent(this, camera.class);
//                Toast.makeText(MainActivity.this,"before start activity.",Toast.LENGTH_SHORT).show();
                startActivityForResult(secondScreen, 920);
//                Toast.makeText(MainActivity.this,"after start activity.",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_screenShot:
                Toast.makeText(MainActivity.this,"Coming soon(Not really sure)",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_email:
                String[] cc = {"b0742006@ems.niu.edu.tw"};
                String[] TO = {"b0742017@ems.niu.edu.tw"};
                it.setType("text/plain");
                it.setAction(Intent.ACTION_SENDTO);
                it.setData(Uri.parse("mailto:"));
                it.putExtra(Intent.EXTRA_EMAIL, TO);
                it.putExtra(Intent.EXTRA_CC, cc);
                it.putExtra(Intent.EXTRA_SUBJECT, "Testing from Android Xavier");
                it.putExtra(Intent.EXTRA_TEXT, "What doth live");
                startActivity(it);
                break;
            case R.id.button_google:
                it.setAction(Intent.ACTION_VIEW);
                Uri uri = Uri.parse("http://google.com");
                it.setData(uri);
                startActivity(it);
                break;
            case R.id.button_webSearch:
                it.setAction(Intent.ACTION_WEB_SEARCH);
                it.putExtra(SearchManager.QUERY, "android");
                startActivity(it);
                break;

        }
    }
}