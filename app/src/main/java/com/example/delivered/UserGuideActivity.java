package com.example.delivered;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class UserGuideActivity extends AppCompatActivity {

    private TextView mainpage,notification,account;
    private TextView userguide,home;

    private Button btn_1;
    private TextView tv_1,tv_3,et_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_guide);

        AssetManager mgr = getAssets();
        Typeface tf = Typeface.createFromAsset(mgr, "ahronbd.ttf");





        tv_1 = findViewById(R.id.tv_1);
        tv_1.setTypeface(tf);
        tv_3 = findViewById(R.id.tv_3);
        tv_3.setTypeface(tf);
        btn_1 = findViewById(R.id.btn_1);
        btn_1.setTypeface(tf);
        et_1 = findViewById(R.id.et_1);
        et_1.setTypeface(tf);







        userguide = findViewById(R.id.userguide);
        mainpage = findViewById(R.id.mainpage);
        mainpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair pair1 = new Pair<>(mainpage, ViewCompat.getTransitionName(mainpage));
                ActivityOptionsCompat transitionActivityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(UserGuideActivity.this, pair1);
                Intent intent = new Intent(UserGuideActivity.this, HomePageActivity.class);
                ActivityCompat.startActivity(UserGuideActivity.this, intent, transitionActivityOptions.toBundle());
            }
        });
        notification = findViewById(R.id.notification);
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair pair1 = new Pair<>(notification, ViewCompat.getTransitionName(notification));
                ActivityOptionsCompat transitionActivityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(UserGuideActivity.this, pair1);
                Intent intent = new Intent(UserGuideActivity.this, AlertsActivity.class);
                ActivityCompat.startActivity(UserGuideActivity.this, intent, transitionActivityOptions.toBundle());
            }
        });

        account = findViewById(R.id.account);
        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair pair1 = new Pair<>(account, ViewCompat.getTransitionName(account));
                Pair pair2 = new Pair<>(userguide, ViewCompat.getTransitionName(userguide));
                ActivityOptionsCompat transitionActivityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(UserGuideActivity.this, pair1, pair2);
                Intent intent = new Intent(UserGuideActivity.this, AccountActivity.class);
                ActivityCompat.startActivity(UserGuideActivity.this, intent, transitionActivityOptions.toBundle());
            }
        });

        home = findViewById(R.id.home);
        home.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        home.setTypeface(tf);
    }
}
