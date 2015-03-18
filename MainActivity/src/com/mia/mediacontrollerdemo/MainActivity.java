package com.mia.mediacontrollerdemo;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        VideoView videoView = (VideoView) findViewById(R.id.VideoView);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        String uriPath = "android.resource://com.mia.mediacontrollerdemo/"+R.raw.video;
        Uri video = Uri.parse(uriPath);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(video);
        videoView.start();

    }
}