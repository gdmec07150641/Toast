package com.example.shana.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /***********************************简单的显示文字********************************************/
    public void ToastText(View v){
        Toast.makeText(this,"我是文字，hello!",Toast.LENGTH_LONG).show();
    }
    /************************************显示自定义的布局******************************************/
    public void ToastText1(View v){
//        获取布局xml文件
        LayoutInflater li=getLayoutInflater();
        View vv= li.inflate(R.layout.toastroot,null);
        LinearLayout ll= (LinearLayout) vv.findViewById(R.id.basic);
        li.inflate(R.layout.toastroot,ll);
        Toast toast= new Toast(this);
        toast.setView(vv);
        toast.show();
    }
    /************************************显示自定义的View******************************************/
    public void ToastText2(View v){
       Toast toast= Toast.makeText(this,"我是文字，hello!",Toast.LENGTH_LONG);
//        创建线性布局
        LinearLayout ll=new LinearLayout(this);
//        设置为水平布局
        ll.setOrientation(LinearLayout.VERTICAL);
//        添加UI组件
        ImageView iv=new ImageView(this);
        iv.setImageResource(R.drawable.shana7);
        View toastView=toast.getView();
//        往线性布局里面添加组件
        ll.addView(iv);
        ll.addView(toastView);
//        在toast中添加并显示
        toast.setView(ll);
        toast.show();
    }


}
