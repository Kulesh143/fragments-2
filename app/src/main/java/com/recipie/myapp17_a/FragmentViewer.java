package com.recipie.myapp17_a;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FragmentViewer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_viewer);
    }

    public void viewFragment2(View view) {
        Fragment2 fragment2 = new Fragment2();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.linear,fragment2,"f2");
        transaction.commit();
    }

    public void viewFragment3(View view) {
        Fragment3 fragment3 = new Fragment3();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.linear,fragment3,"f3");
        transaction.commit();
    }
}
