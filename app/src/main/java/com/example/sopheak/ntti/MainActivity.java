package com.example.sopheak.ntti;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout;
    Button button;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = (LinearLayout) findViewById(R.id.LoginBox);
        button = (Button) findViewById(R.id.submit);
        linearLayout.setVisibility(View.VISIBLE);
        button.setVisibility(View.VISIBLE);
        imageView = (ImageView) findViewById(R.id.logo);
        Animation loadAnimation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate);
        loadAnimation.setAnimationListener(new myAnimator(linearLayout, MainActivity.this ,button));
        imageView.startAnimation(loadAnimation);
    }
}
