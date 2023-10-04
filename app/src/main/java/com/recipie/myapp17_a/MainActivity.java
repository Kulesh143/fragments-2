package com.recipie.myapp17_a;

import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.textView2)).setText("Fragment1");
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment1 fragment1 = new Fragment1();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.add(R.id.con_layout,fragment1,"f1");
                transaction.commit();

                View view1 = findViewById(R.id.con_layout);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation1);
                animation.setDuration(2000);
                view1.startAnimation(animation);
            }
        });
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
    }

    public void viewFragments(View view) {
        FragmentManager manager = getSupportFragmentManager();
        List<Fragment> list = manager.getFragments();


        FragmentTransaction transaction = manager.beginTransaction();
//        for (Fragment fragment : list){
//            System.out.println("a");
//            transaction.remove(fragment);
//        }

        // for single fragment removing
        Fragment fragment = manager.findFragmentByTag("f1");
        if(fragment != null){
            transaction.remove(fragment);
            transaction.commit();
        }



    }
}
