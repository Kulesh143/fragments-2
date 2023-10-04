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

public class Fragment3 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button button3 = getView().findViewById(R.id.btnFrag3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = getView().findViewById(R.id.textViewFrag3);
                textView.setText("Fragment 3 Set");

                FragmentActivity activity = getActivity();
//                FragmentManager manager = activity.getSupportFragmentManager();
//                Fragment frag2 = manager.findFragmentByTag("f2");
//                View view1 = frag2.getView();
//                TextView textView1 = view1.findViewById(R.id.textViewFrag2);

                TextView textView1 = activity.findViewById(R.id.textViewFrag2);
                textView1.setText("Fragment 3 Set");
            }
        });
    }
}
