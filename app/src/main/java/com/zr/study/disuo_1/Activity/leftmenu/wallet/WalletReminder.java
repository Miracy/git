package com.zr.study.disuo_1.Activity.leftmenu.wallet;

/**
 *
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.zr.study.disuo_1.R;

public class WalletReminder extends Activity {
    private ImageView ibtn_back;
    private TextView mytitle;
    private ImageView ibtn_close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_wallet_reminder);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title_bar);

        mytitle = (TextView) findViewById(R.id.mytitle);
        mytitle.setText("余额");

        ibtn_back= (ImageView) findViewById(R.id.ibtn_back);
        ibtn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        ibtn_close= (ImageView) findViewById(R.id.ibtn_close);
        ibtn_close.setVisibility(View.GONE);
    }
}
