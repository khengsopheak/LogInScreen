package com.example.sopheak.ntti;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by sopheak on 28-May-17.
 */

public class myAnimator implements Animation.AnimationListener {
    LinearLayout ln;
    Context c;
    Button btn;

    public myAnimator(LinearLayout ln, Context c, Button btn) {
        this.ln = ln;
        this.c = c;
        this.btn = btn;
    }

    @Override
    public void onAnimationStart(Animation animation) {
        this.ln.setVisibility(View.GONE);
        this.btn.setVisibility(View.GONE);
        Animation loadAnimation = AnimationUtils.loadAnimation(c, R.anim.fade);
        this.btn.startAnimation(loadAnimation);
        this.ln.startAnimation(loadAnimation);
    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
