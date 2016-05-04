package cn.studyjams.s1.sj35.dengmin.traffic;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import cn.studyjams.s1.sj35.dengmin.R;
import cn.studyjams.s1.sj35.dengmin.util.T;

/**
 * Created by dmin on 2016/4/26.
 */
public class TrafficeActivity extends AppCompatActivity {
    private Button baiduMap;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic);

        baiduMap = (Button) findViewById(R.id.map_button);
        baiduMap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("geo:23.1291,113.2644?q=" + "连山壮族瑶族自治县"));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                } else {
                    T.showShort(TrafficeActivity.this, R.string.no_map);
                }
            }
        });
    }
}
