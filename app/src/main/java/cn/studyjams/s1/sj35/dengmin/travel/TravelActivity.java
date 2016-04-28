package cn.studyjams.s1.sj35.dengmin.travel;

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
public class TravelActivity extends AppCompatActivity {

    private TextView jinZiShan;
    private TextView daXuShan;
    private TextView yingYangGuan;
    private TextView ouJiaTiTian;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);

        jinZiShan = (TextView) findViewById(R.id.jinzishan);
        daXuShan = (TextView) findViewById(R.id.daxushan);
        yingYangGuan = (TextView) findViewById(R.id.yingyangguan);
        ouJiaTiTian = (TextView) findViewById(R.id.oujiatitian);

        jinZiShan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActivity.this,TravelJinZiShanActivity.class);
                startActivity(intent);
            }
        });

        daXuShan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActivity.this,TravelDaXuShanActivity.class);
                startActivity(intent);
            }
        });

        yingYangGuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActivity.this,TravelYingYangGuanActivity.class);
                startActivity(intent);
            }
        });

        ouJiaTiTian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActivity.this,TravelOuJiaTiTianActivity.class);
                startActivity(intent);
            }
        });
    }
}
