package com.example.frankie.waller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView(){
        tv=(TextView)this.findViewById(R.id.tv);
        tv.setText("改变当前的内容....");
        Toast.makeText(this, "改变当前的内容xxxxccc....", Toast.LENGTH_SHORT).show();
    }
}
