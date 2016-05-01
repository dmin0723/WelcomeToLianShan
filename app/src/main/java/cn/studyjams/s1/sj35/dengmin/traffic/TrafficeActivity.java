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
//    private MyBroadcastReceiver receiver;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic);

        baiduMap = (Button) findViewById(R.id.map_button);
        baiduMap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("geo:23.1291,113.2644?q=" +"连山壮族瑶族自治县"));
                if(intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }else{
                    T.showShort(TrafficeActivity.this,R.string.no_map);
                }
            }
        });

//        //在onCreate()方法中注册广播
//        receiver = new MyBroadcastReceiver();
//        IntentFilter filter = new IntentFilter();
//        // 网络错误
//        filter.addAction(SDKInitializer.SDK_BROADCAST_ACTION_STRING_NETWORK_ERROR);
//        // 效验key失败
//        filter.addAction(SDKInitializer.SDK_BROADTCAST_ACTION_STRING_PERMISSION_CHECK_ERROR);
//        registerReceiver(receiver, filter);
    }

//    class MyBroadcastReceiver extends BroadcastReceiver {
//        //实现一个广播
//        @Override
//        public void onReceive(Context context, Intent intent) {
//            String action = intent.getAction();
//            // 网络错误
//            if (action.equals(SDKInitializer.SDK_BROADCAST_ACTION_STRING_NETWORK_ERROR)) {
//                Toast.makeText(TrafficeActivity.this, "无法连接网络", Toast.LENGTH_SHORT).show();
//                // key效验失败
//            } else if(action.equals(SDKInitializer.SDK_BROADTCAST_ACTION_STRING_PERMISSION_CHECK_ERROR)) {
//                Toast.makeText(TrafficeActivity.this, "百度地图key效验失败",Toast.LENGTH_SHORT).show();
//            }
//        }
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        //注意要在onDestroy()方法中销毁这个广播
//        unregisterReceiver(receiver);
//    }
}
