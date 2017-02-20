package me.timos.thuanle.utils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import me.timos.thuanle.utils.vietnamese.StringUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText(StringUtils.removeAccent("Cộng Hòa Xã Hội Chủ Nghĩa Việt Nam\n" +
                "Độc Lập - Tự Do - Hạnh Phúc"));
    }
}
