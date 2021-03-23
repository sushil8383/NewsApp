package com.example.navi.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.navi.R;
import com.example.navi.WebViewController;

public class CnnFragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


        @Override
        public View onCreateView (LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState){
            // Inflate the layout for this fragment
            View root =  inflater.inflate(R.layout.fragment_cnn, container, false);

            WebView webView = root.findViewById(R.id.webviewcnn);
            webView.loadUrl("https://edition.cnn.com");
            webView.setWebViewClient(new WebViewController());
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
            return root;
        }
    }