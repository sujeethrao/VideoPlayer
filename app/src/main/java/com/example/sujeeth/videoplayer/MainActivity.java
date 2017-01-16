package com.example.sujeeth.videoplayer;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = (VideoView) findViewById(R.id.videoview);

        MediaController mc = new MediaController(this);
        mc.setAnchorView(videoView);

        Uri video_uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.naalo_nenu_promo);
        videoView.setVideoURI(video_uri);
        videoView.setMediaController(mc);
        videoView.start();

    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {

        savedInstanceState.putInt("current position",videoView.getCurrentPosition() );
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        if(savedInstanceState!=null){
            int currentPos =  savedInstanceState.getInt("current position");
            videoView.seekTo(currentPos);
        }
        super.onRestoreInstanceState(savedInstanceState);


    }
}
//hiiiii
// how r u
//hjhjhk