package cn.studyjams.s1.sj35.dengmin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

/**
 * Created by dmin on 2016/5/1.
 */
public class SplashActivity extends Activity {
    ImageView background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        background = (ImageView) findViewById(R.id.iv_background);

        AlphaAnimation anim = new AlphaAnimation(0.0f,1.0f);
        anim.setDuration(4000);
        anim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent = new Intent(SplashActivity.this,LianShanActivity.class);
                startActivity(intent);
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        background.setAnimation(anim);
        background.startAnimation(anim);
    }
}
