package com.example.leonardoperez.enohsa;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class Menuprincipal extends ActionBarActivity {
    public Vibrator vibrator;

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

        int id = item.getItemId();
        switch (id) {
            case R.id.faceEH:
                Toast.makeText(getApplicationContext(), "Facebook Ellas Hacen menu item pressed", Toast.LENGTH_SHORT).show();
                Intent intentface = new Intent (Intent.ACTION_VIEW);
                intentface.setData(Uri.parse("https://www.facebook.com/Comunidad-plomeras-1496461803957365/timeline/"));
                startActivity(intentface) ;
                break;
            case R.id.face:
                Toast.makeText(getApplicationContext(), "Facebook menu item pressed", Toast.LENGTH_SHORT).show();
                Intent intentface1 = new Intent (Intent.ACTION_VIEW);
                intentface1.setData(Uri.parse("https://www.facebook.com/EnohsaGob/"));
                startActivity(intentface1) ;
                break;
            case R.id.twiter:
                Toast.makeText(getApplicationContext(), "twiter menu item pressed", Toast.LENGTH_SHORT).show();
                Intent intenttw = new Intent (Intent.ACTION_VIEW);
                intenttw.setData(Uri.parse("https://twitter.com/Enohsa"));
                startActivity(intenttw) ;
                break;
        }
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(this, "Option1", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(this, "Option2", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(this, "Option3", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item4:
                Toast.makeText(this, "Option4", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item5:
                Toast.makeText(this, "Option5", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item6:
                Toast.makeText(this, "Option6", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
    }
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
    public void Menu_usu2 (View view) {
        Intent Menu_Usu_dos = new Intent(this, Menu_Usuario_dos.class);
        startActivity(Menu_Usu_dos);
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

    public void tractormp(View view) {
        Intent tractor_lalala = new Intent(this, tractor.class);
        startActivity(tractor_lalala);
    }
    public void startVibrate22222(View v) {
        long pattern[] = { 0, 100, 200, 300, 400 };
        vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(pattern, -1);
    }

    public void stopVibrate9999999(View v) {
        vibrator.cancel();
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
