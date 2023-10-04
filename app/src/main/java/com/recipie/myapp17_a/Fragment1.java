package com.recipie.myapp17_a;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.ExtractedTextRequest;
import android.widget.Button;
import android.widget.TextView;

public class Fragment1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment1_layout,container,false);

        Button button3 = view.findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)view.findViewById(R.id.textView)).setText("Hello Activity");
            }
        });
        return view ;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        if(bundle!=null){
            String text1 = bundle.getString("text1");
            ((TextView)view.findViewById(R.id.textView)).setText(text1);
        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        TextView textView = getView().findViewById(R.id.textView);
        bundle.putString("text1",textView.getText().toString());
    }
}
