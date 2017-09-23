package com.bdjobs.training.day2.Activities;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bdjobs.training.day2.Fragments.FragmentA;
import com.bdjobs.training.day2.Fragments.FragmentB;
import com.bdjobs.training.day2.Fragments.FragmentC;
import com.bdjobs.training.day2.Fragments.FragmentD;
import com.bdjobs.training.day2.R;

import static com.bdjobs.training.day2.R.drawable.ic_folder_black_24dp;
import static com.bdjobs.training.day2.R.drawable.ic_folder_black_24dp_red;
import static com.bdjobs.training.day2.R.drawable.ic_subscriptions_black_24dp;
import static com.bdjobs.training.day2.R.drawable.ic_subscriptions_black_24dp_red;
import static com.bdjobs.training.day2.R.drawable.ic_trending_up_black_24dp;
import static com.bdjobs.training.day2.R.drawable.ic_trending_up_black_24dp_red;


public class MainActivity extends AppCompatActivity {

    LinearLayout homeLL;
    ImageView homeIMGV;

    LinearLayout trendingLL;
    ImageView trendingIMGV;

    LinearLayout libraryLL;
    ImageView libraryIMGV;

    LinearLayout subscriptionLL;
    ImageView subscriptionIMGV;

    TextView homeTV;
    TextView trendingTV;
    TextView libraryTV;
    TextView subscriptionTV;

    android.support.v4.app.FragmentManager manager;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getSupportFragmentManager();
        homeLL = (LinearLayout) findViewById(R.id.homeLL);
        homeIMGV = (ImageView) findViewById(R.id.homeIMGV);


        trendingLL = (LinearLayout) findViewById(R.id.trendingLL);
        trendingIMGV = (ImageView) findViewById(R.id.trendingIMGV);


        libraryLL = (LinearLayout) findViewById(R.id.libraryLL);
        libraryIMGV = (ImageView) findViewById(R.id.libraryIMGV);

        subscriptionLL = (LinearLayout) findViewById(R.id.subscriptionLL);
        subscriptionIMGV = (ImageView) findViewById(R.id.subscriptionIMGV);


        homeTV = (TextView) findViewById(R.id.homeTV);
        trendingTV = (TextView) findViewById(R.id.trendingTV);
        libraryTV = (TextView) findViewById(R.id.libraryTV);
        subscriptionTV = (TextView) findViewById(R.id.subscriptionTV);

        changeBackgroundColor();
        goToFragmrntA();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            homeIMGV.setBackground(getResources().getDrawable(R.drawable.ic_home_black_24dp_red));
            homeTV.setTextColor(Color.parseColor("#ff0000"));
        }

        homeLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToFragmrntA();
                changeBackgroundColor();
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    homeIMGV.setBackground(getResources().getDrawable(R.drawable.ic_home_black_24dp_red));
                    homeTV.setTextColor(Color.parseColor("#ff0000"));
                }
            }
        });

        trendingLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToFragmrntB();
                changeBackgroundColor();
                //reserveView = trendingIMGV;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    trendingIMGV.setBackground(getResources().getDrawable(ic_folder_black_24dp_red));
                    trendingTV.setTextColor(Color.parseColor("#ff0000"));
                }
            }
        });

        libraryLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToFragmrntC();
                changeBackgroundColor();
                //reserveView = trendingIMGV;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    libraryIMGV.setBackground(getResources().getDrawable(ic_trending_up_black_24dp_red));
                    libraryTV.setTextColor(Color.parseColor("#ff0000"));
                }
            }
        });

        subscriptionLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToFragmrntD();
                changeBackgroundColor();
                // reserveView = trendingIMGV;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    subscriptionIMGV.setBackground(getResources().getDrawable(ic_subscriptions_black_24dp_red));
                    subscriptionTV.setTextColor(Color.parseColor("#ff0000"));

                }
            }
        });

    }


    public void changeBackgroundColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            subscriptionIMGV.setBackground(getResources().getDrawable(ic_subscriptions_black_24dp));
            libraryIMGV.setBackground(getResources().getDrawable(ic_trending_up_black_24dp));
            trendingIMGV.setBackground(getResources().getDrawable(ic_folder_black_24dp));
            homeIMGV.setBackground(getResources().getDrawable(R.drawable.ic_home_black_24dp));

            homeTV.setTextColor(Color.parseColor("#8b8a8a"));
            trendingTV.setTextColor(Color.parseColor("#8b8a8a"));
            libraryTV.setTextColor(Color.parseColor("#8b8a8a"));
            subscriptionTV.setTextColor(Color.parseColor("#8b8a8a"));
        }
    }

    public void goToFragmrntA() {


        FragmentA fragmentBreplace = new FragmentA();

        android.support.v4.app.FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.group, fragmentBreplace, "A");
        transaction.commit();

    }

    public void goToFragmrntB() {

        FragmentB fragmentBreplace = new FragmentB();
        android.support.v4.app.FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.group, fragmentBreplace, "B");
        transaction.commit();

    }

    public void goToFragmrntC() {

        FragmentC fragmentCreplace = new FragmentC();
        android.support.v4.app.FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.group, fragmentCreplace, "C");
        transaction.commit();

    }

    public void goToFragmrntD() {

        FragmentD fragmentDreplace = new FragmentD();
        android.support.v4.app.FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.group, fragmentDreplace, "D");
        transaction.commit();

    }
}
