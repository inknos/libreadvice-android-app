package org.libreadvice.app;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class RssArticle extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rss_article);
        WebView w1=(WebView)findViewById(R.id.web_view);
        w1.loadUrl("http://tutorialspoint.com/android/sampleXML.xml");
    }
}