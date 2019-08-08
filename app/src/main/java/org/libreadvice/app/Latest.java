package org.libreadvice.app;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Latest extends Fragment {

    //private String finalUrl="https://libreadvice.org/feed/";
    //private HandleXML obj;

    public Latest() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String finalUrl="https://libreadvice.org/feed/";
        HandleXML obj;
        //obj = new HandleXML(finalUrl);
        //obj.fetchXML();

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_latest, container, false);

        View view = inflater.inflate(R.layout.fragment_latest, container, false);
        WebView wv = (WebView) view.findViewById(R.id.web_view);
        wv.loadUrl(finalUrl);
        return view;
    }


}
