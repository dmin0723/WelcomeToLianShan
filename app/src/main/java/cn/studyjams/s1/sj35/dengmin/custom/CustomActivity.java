package cn.studyjams.s1.sj35.dengmin.custom;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import cn.studyjams.s1.sj35.dengmin.R;

/**
 * Created by dmin on 2016/4/26.
 */
public class CustomActivity extends AppCompatActivity {

    private TextView yaoWedding;
    private TextView zhuangWedding;
    private TextView thePanwangFestival;
    private TextView theNiuwangFestival;
    private TextView theWaterFestival;
    private TextView theFireLionFestival;;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);

        yaoWedding = (TextView) findViewById(R.id.yao);
        zhuangWedding = (TextView) findViewById(R.id.zhuang);
        thePanwangFestival = (TextView) findViewById(R.id.panwang);
        theNiuwangFestival = (TextView) findViewById(R.id.niuwang);
        theWaterFestival = (TextView) findViewById(R.id.water);
        theFireLionFestival = (TextView) findViewById(R.id.lion);

        yaoWedding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CustomActivity.this,CustomYaoWedding.class);
                startActivity(intent);
            }
        });

        zhuangWedding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CustomActivity.this,CustomZhuangWedding.class);
                startActivity(intent);
            }
        });

        thePanwangFestival.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CustomActivity.this,CustomThePanwangFestivalActivity.class);
                startActivity(intent);
            }
        });

        theNiuwangFestival.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CustomActivity.this,CustomTheNiuwangFestivalActivity.class);
                startActivity(intent);
            }
        });

        theWaterFestival.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CustomActivity.this,CustomTheWaterFestivalActivity.class);
                startActivity(intent);
            }
        });

        theFireLionFestival.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CustomActivity.this,CustomTheFireLionFestivalActivity.class);
                startActivity(intent);
            }
        });
    }
}
