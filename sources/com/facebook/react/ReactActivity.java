package com.facebook.react;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.appcompat.app.AppCompatActivity;
import o.getActiveFragmentStateManagers;
import o.getNonConfig;
import o.onFragmentResumed;
import o.resetActiveFragments;
/* loaded from: classes.dex */
public abstract class ReactActivity extends AppCompatActivity implements getActiveFragmentStateManagers, getNonConfig {
    private final onFragmentResumed valueOf = valueOf();

    protected String HaptikSDK$a() {
        return null;
    }

    protected onFragmentResumed valueOf() {
        return new onFragmentResumed(this, HaptikSDK$a());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.valueOf.values(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.valueOf.HaptikWebView();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.valueOf.HaptikSDK$e();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.valueOf.getInitSettings();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.valueOf.ah$a(i, i2, intent);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.valueOf.ag$a(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.valueOf.toString(i, keyEvent) || super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return this.valueOf.valueOf(i, keyEvent) || super.onKeyLongPress(i, keyEvent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.valueOf.HaptikSDK$c()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // o.getActiveFragmentStateManagers
    public void ah$a() {
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        if (this.valueOf.values(intent)) {
            return;
        }
        super.onNewIntent(intent);
    }

    @Override // o.getNonConfig
    public void requestPermissions(String[] strArr, int i, resetActiveFragments resetactivefragments) {
        this.valueOf.ah$a(strArr, i, resetactivefragments);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.valueOf.toString(i, strArr, iArr);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.valueOf.values(z);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.valueOf.ah$a(configuration);
    }
}
