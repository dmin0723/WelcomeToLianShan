package cn.studyjams.s1.sj35.dengmin.custom;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import cn.studyjams.s1.sj35.dengmin.R;

/**
 * Created by dmin on 2016/4/26.
 */
public class CustomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);
    }

    //进行进行代码重构
    public void onClick(View v){
        Intent intent = new Intent();
        switch(v.getId()){
            case R.id.lion:
                intent.setClass(this,CustomTheFireLionFestivalActivity.class);
                break;
            case R.id.niuwang:
                intent.setClass(this,CustomTheNiuwangFestivalActivity.class);
                break;
            case R.id.panwang:
                intent.setClass(this,CustomThePanwangFestivalActivity.class);
                break;
            case R.id.water:
                intent.setClass(this,CustomTheWaterFestivalActivity.class);
                break;
            case R.id.yao:
                intent.setClass(this,CustomYaoWedding.class);
                break;
            case R.id.zhuang:
                intent.setClass(this,CustomSparklerGrabbing.class);
                break;
        }
        startActivity(intent);
    }
}
