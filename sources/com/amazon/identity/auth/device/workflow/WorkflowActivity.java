package com.amazon.identity.auth.device.workflow;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.amazon.identity.auth.device.AuthError;
import o.getOnBackPressedDispatcher;
import o.isLayoutRtlSupport;
import o.putEncryptedObject;
import o.registerLayoutStateChangeCallback;
/* loaded from: classes.dex */
public final class WorkflowActivity extends Activity {
    private static final String values = "com.amazon.identity.auth.device.workflow.WorkflowActivity";

    public static void toString(Uri uri, Activity activity, String str, String str2) {
        if (uri == null) {
            putEncryptedObject.valueOf(str2, "uri is null onCreate - closing activity");
            return;
        }
        try {
            if (registerLayoutStateChangeCallback.ah$a(uri)) {
                Log.d(str2, "Receiving response for interactive request");
                Log.d(str2, "Receiving response for request " + str);
                isLayoutRtlSupport.ah$a().values(str, uri);
            } else {
                Log.d(str2, "Receiving response for auth request");
                if (!registerLayoutStateChangeCallback.valueOf(activity.getApplicationContext()).ah$a(uri, activity.getApplicationContext())) {
                    putEncryptedObject.toString(str2, "Could not find active request for redirect URI", uri.toString(), null);
                }
            }
        } catch (AuthError e) {
            putEncryptedObject.toString(str2, "Could not handle response URI", uri.toString(), e);
        }
    }

    private getOnBackPressedDispatcher values(String str) throws AuthError {
        return registerLayoutStateChangeCallback.valueOf(this).values(str);
    }

    private void values(Intent intent) {
        if (intent != null) {
            intent.setFlags(603979776);
            startActivity(intent);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String str = values;
        Log.d(str, "onCreate");
        try {
            String registerlayoutstatechangecallback = registerLayoutStateChangeCallback.toString(getIntent().getData());
            toString(getIntent().getData(), this, registerlayoutstatechangecallback, str);
            values(values(registerlayoutstatechangecallback).ag$a());
        } catch (AuthError e) {
            putEncryptedObject.toString(values, "Could not fetch request ID from the response uri", getIntent().getData().toString(), e);
        }
        Log.d(values, "finish");
        finish();
    }
}
