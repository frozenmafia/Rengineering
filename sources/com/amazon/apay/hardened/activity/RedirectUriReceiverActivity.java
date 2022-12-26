package com.amazon.apay.hardened.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import o.WindowMetricsCalculatorDecorator;
/* loaded from: classes6.dex */
public class RedirectUriReceiverActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, APayBrowserActivity.class);
        intent.setData(getIntent().getData());
        intent.addFlags(603979776);
        WindowMetricsCalculatorDecorator.valueOf("RedirectUriReceiverActivity: onCreate called with data : %s", getIntent().getData());
        finish();
        startActivity(intent);
    }
}
