package cn.studyjams.s1.sj35.dengmin;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

/**
 * Created by dmin on 2016/4/26.
 */
public class AccommodationActivity extends AppCompatActivity {
    private EditText questionEditText;
    private CheckBox sureCheckBox;
    private Button sendEmailButton;
    private RadioButton man;
    public String sex;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accommodation);

        questionEditText = (EditText) findViewById(R.id.question);
        sureCheckBox = (CheckBox) findViewById(R.id.sure);
        sendEmailButton = (Button) findViewById(R.id.send_email);
        man = (RadioButton) findViewById(R.id.man);
    }

    /**
     * 这是点击复选框，选择发邮件来询问住宿问题
     * */
    public void send(View view){
        String content = questionEditText.getText().toString();
        boolean hasCheckBox = sureCheckBox.isChecked();
        boolean isSex = man.isChecked();
        if(isSex){
            sex = "男士";
        }else{
            sex = "女士";
        }
        if(hasCheckBox){
            Uri uri = Uri.parse("mailto:");
            Intent intent = new Intent(Intent.ACTION_SENDTO,uri);
            intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"gzdengmin@126.com"});
            intent.putExtra(Intent.EXTRA_SUBJECT,sex+"问关于连山的问题" );
            //email的正文内容
            intent.putExtra(Intent.EXTRA_TEXT,content);
            if (intent.resolveActivity(getPackageManager()) != null ){
                startActivity(intent);
            }
        }
    }
}
