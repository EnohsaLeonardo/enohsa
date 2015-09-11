package com.example.leonardoperez.enohsa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class Menuprincipal extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuprincipal);
        final VideoView videoView =
                (VideoView) findViewById(R.id.webView);
        videoView.setVideoPath(
                "http://www.ebookfrenzy.com/android_book/movie.mp4");
        videoView.start();
        MediaController mediaController = new
                MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (id) {
            case R.id.faceEH:
                Toast.makeText(getApplicationContext(), "Facebook Ellas Hacen menu item pressed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.face:
                Toast.makeText(getApplicationContext(), "Facebook menu item pressed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twiter:
                Toast.makeText(getApplicationContext(), "twiter menu item pressed", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_menuprincipal, menu);
        return true;
    }

   /* public void Descarga_Admin(View view) {
        Intent Descarga_Uno = new Intent(this, FileDownloaderAdmin.class);
        startActivity(Descarga_Uno);
}
   */
    public void Menu_Usuario_Uno (View view) {
        Intent Menu_Ususario_Uno = new Intent(this, Menu_Usuario_Uno.class);
    startActivity(Menu_Ususario_Uno);

    }


    public void Descarga_Uno(View view) {
        Intent Descarga_Uno = new Intent(this, FileDownloader1.class);
        startActivity(Descarga_Uno);
    }

    public void Descarga_Dos(View view) {
        Intent Descarga_Uno = new Intent(this, FileDownloader2.class);
        startActivity(Descarga_Uno);
    }

    public void Descarga_Tres(View view) {
        Intent Descarga_Uno = new Intent(this, FileDownloader3.class);
        startActivity(Descarga_Uno);
    }

    public void Descarga_Cuatro(View view) {
        Intent Descarga_Uno = new Intent(this, FileDownloader4.class);
        startActivity(Descarga_Uno);
    }

    public class VideoPlayerActivity extends ActionBarActivity {


        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            int id = item.getItemId();
            if (id == R.id.action_settings) {
                return true;
            }
            return super.onOptionsItemSelected(item);
        }
    }
}
