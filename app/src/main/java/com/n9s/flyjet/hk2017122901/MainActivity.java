package com.n9s.flyjet.hk2017122901;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click1(View v)
    {
        Intent it = new Intent();
        it.setAction(Intent.ACTION_SEND);
        it.setType("text/plain");
        it.putExtra(Intent.EXTRA_TEXT, "哈囉, HK!");
        startActivity(it);
    }


    public void click2(View v)
    {
        Intent it = new Intent();
        it.setAction(Intent.ACTION_SEND);
        it.setType("image/jpeg");
        Uri uri = Uri.parse("android.resource://" +
                getApplicationContext().getPackageName() + "/" + R.drawable.car);
        it.putExtra(Intent.EXTRA_STREAM, uri);
        startActivity(it);
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d("LOG", "This is onResume");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d("LOG", "This is onStop");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("LOG", "This is onDestroy");
    }
}

