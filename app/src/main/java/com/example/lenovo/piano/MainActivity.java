package com.example.lenovo.piano;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void gydx(View view){
        setContentView(R.layout.first_main);
    }
    public void dou(View view){
        MediaPlayer player = MediaPlayer.create(this,R.raw.fiftyone); //raw文件中的名字(加载声音
        player.start();   //播放声音
    }
    public void r(View view){
        MediaPlayer player = MediaPlayer.create(this,R.raw.fiftytwo); //raw文件中的名字(加载声音
        player.start();   //播放声音
    }
    public void m(View view){
        MediaPlayer player = MediaPlayer.create(this,R.raw.fiftythree); //raw文件中的名字(加载声音
        player.start();   //播放声音
    }
    public void f(View view){
        MediaPlayer player = MediaPlayer.create(this,R.raw.fiftyfour); //raw文件中的名字(加载声音
        player.start();   //播放声音
    }
    public void s(View view){
        MediaPlayer player = MediaPlayer.create(this,R.raw.fiftyfive); //raw文件中的名字(加载声音
        player.start();   //播放声音
    }
    public void l(View view){
        MediaPlayer player = MediaPlayer.create(this,R.raw.fiftysix); //raw文件中的名字(加载声音
        player.start();   //播放声音
    }
    public void x(View view){
        MediaPlayer player = MediaPlayer.create(this,R.raw.fiftyseven); //raw文件中的名字(加载声音
        player.start();   //播放声音
    }
    public void b1(View view){
        MediaPlayer player = MediaPlayer.create(this,R.raw.forty); //raw文件中的名字(加载声音
        player.start();   //播放声音
    }
    public void b2(View view){
        MediaPlayer player = MediaPlayer.create(this,R.raw.fortyone); //raw文件中的名字(加载声音
        player.start();   //播放声音
    }
    public void b3(View view){
        MediaPlayer player = MediaPlayer.create(this,R.raw.fortytwo); //raw文件中的名字(加载声音
        player.start();   //播放声音
    }
    public void b4(View view){
        MediaPlayer player = MediaPlayer.create(this,R.raw.fortythree); //raw文件中的名字(加载声音
        player.start();   //播放声音
    }
    public void b5(View view){
        MediaPlayer player = MediaPlayer.create(this,R.raw.fortyfour); //raw文件中的名字(加载声音
        player.start();   //播放声音
    }
    public void b6(View view){
        MediaPlayer player = MediaPlayer.create(this,R.raw.fortyfive); //raw文件中的名字(加载声音
        player.start();   //播放声音
    }
    public void b7(View view){
        MediaPlayer player = MediaPlayer.create(this,R.raw.fortysix); //raw文件中的名字(加载声音
        player.start();   //播放声音
    }
    public void b8(View view){
        MediaPlayer player = MediaPlayer.create(this,R.raw.fortyseven); //raw文件中的名字(加载声音
        player.start();   //播放声音
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
