package com.team3.ms.mystocks.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.team3.ms.mystocks.R;

public class new_detail_page extends AppCompatActivity {
    private WebView webView;



    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        // 取消标题
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        // 进行全屏
        //Bundle bundle=getIntent().getExtras();
        String news_url=getIntent().getStringExtra("n_url");
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.news_detail_page);
        // 实例化WebView
        webView = (WebView) this.findViewById(R.id.wv_oauth);
        webView.setWebViewClient(new WebViewClient());
        /**
         * 调用loadUrl()方法进行加载内容
         */
        webView.loadUrl(news_url);
        /**
         * 设置WebView的属性，此时可以去执行JavaScript脚本
         */
        webView.getSettings().setJavaScriptEnabled(true);
    }

}
