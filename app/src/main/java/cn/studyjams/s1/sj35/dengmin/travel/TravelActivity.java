package cn.studyjams.s1.sj35.dengmin.travel;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import cn.studyjams.s1.sj35.dengmin.R;

/**
 * Created by dmin on 2016/4/26.
 */
public class TravelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);
    }

    //进行代码重构
    public void onClick(View v){
        Intent intent = new Intent();
        switch(v.getId()){
            case R.id.daxushan:
                intent.setClass(this,TravelDaXuShanActivity.class);
                break;
            case R.id.jinzishan:
                intent.setClass(this,TravelJinZiShanActivity.class);
                break;
            case R.id.oujiatitian:
                intent.setClass(this,TravelOuJiaTiTianActivity.class);
                break;
            case R.id.yingyangguan:
                intent.setClass(this,TravelYingYangGuanActivity.class);
                break;
        }
        startActivity(intent);
    }
}
