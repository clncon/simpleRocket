package com.rocket;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;

/**
 * 烟雾的背景
 */
public class BackGroundActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_ground);
        ImageView ivTop = findViewById(R.id.iv_top);
        ImageView ivBottom = findViewById(R.id.iv_bottom);
        AlphaAnimation anim = new AlphaAnimation(0,1);
        anim.setDuration(1000);
        anim.setFillAfter(true);//动画结束后保持状态

        //启动动画
        ivTop.startAnimation(anim);
        ivBottom.startAnimation(anim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                 finish();
            }
        },1000);//延时一秒后关闭activity
    }


}
