package com.recipie.myapp17_a;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Fragment2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button button2 = getView().findViewById(R.id.btnFrag2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = getView().findViewById(R.id.textViewFrag2);
                textView.setText("Fragment 2 Set");

                FragmentActivity activity = getActivity();
                FragmentManager manager = activity.getSupportFragmentManager();
                Fragment frag3 = manager.findFragmentByTag("f3");
                View view1 = frag3.getView();
                TextView textView1 = view1.findViewById(R.id.textViewFrag3);
                textView1.setText("Fragment 2 Set");
            }
        });
    }
}
