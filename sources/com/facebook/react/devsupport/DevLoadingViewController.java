package com.facebook.react.devsupport;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.react.bridge.UiThreadUtil;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import o.FragmentActivity;
import o.onFragmentSaveInstanceState;
import o.onFragmentSaveInstanceState$ah$a;
/* loaded from: classes6.dex */
public class DevLoadingViewController {
    private static boolean sEnabled = true;
    private PopupWindow mDevLoadingPopup;
    private TextView mDevLoadingView;
    private final ReactInstanceDevHelper mReactInstanceManagerHelper;

    public static void setDevLoadingEnabled(boolean z) {
        sEnabled = z;
    }

    public DevLoadingViewController(ReactInstanceDevHelper reactInstanceDevHelper) {
        this.mReactInstanceManagerHelper = reactInstanceDevHelper;
    }

    public void showMessage(final String str) {
        if (sEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevLoadingViewController.1
                @Override // java.lang.Runnable
                public void run() {
                    DevLoadingViewController.this.showInternal(str);
                }
            });
        }
    }

    public void showForUrl(String str) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        try {
            URL url = new URL(str);
            int i = onFragmentSaveInstanceState.valueOf.catalyst_loading_from_url;
            showMessage(context.getString(i, url.getHost() + ":" + url.getPort()));
        } catch (MalformedURLException e) {
            FragmentActivity.values("ReactNative", "Bundle url format is invalid. \n\n" + e.toString());
        }
    }

    public void showForRemoteJSEnabled() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        showMessage(context.getString(onFragmentSaveInstanceState.valueOf.catalyst_debug_connecting));
    }

    public void updateProgress(final String str, final Integer num, final Integer num2) {
        if (sEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevLoadingViewController.2
                @Override // java.lang.Runnable
                public void run() {
                    Integer num3;
                    StringBuilder sb = new StringBuilder();
                    String str2 = str;
                    if (str2 == null) {
                        str2 = "Loading";
                    }
                    sb.append(str2);
                    if (num != null && (num3 = num2) != null && num3.intValue() > 0) {
                        sb.append(String.format(Locale.getDefault(), " %.1f%%", Float.valueOf((num.intValue() / num2.intValue()) * 100.0f)));
                    }
                    sb.append("…");
                    if (DevLoadingViewController.this.mDevLoadingView != null) {
                        DevLoadingViewController.this.mDevLoadingView.setText(sb);
                    }
                }
            });
        }
    }

    public void hide() {
        if (sEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevLoadingViewController.3
                @Override // java.lang.Runnable
                public void run() {
                    DevLoadingViewController.this.hideInternal();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showInternal(String str) {
        PopupWindow popupWindow = this.mDevLoadingPopup;
        if (popupWindow == null || !popupWindow.isShowing()) {
            Activity currentActivity = this.mReactInstanceManagerHelper.getCurrentActivity();
            if (currentActivity == null) {
                FragmentActivity.values("ReactNative", "Unable to display loading message because react activity isn't available");
                return;
            }
            Rect rect = new Rect();
            currentActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            int i = rect.top;
            TextView textView = (TextView) ((LayoutInflater) currentActivity.getSystemService("layout_inflater")).inflate(onFragmentSaveInstanceState$ah$a.dev_loading_view, (ViewGroup) null);
            this.mDevLoadingView = textView;
            textView.setText(str);
            PopupWindow popupWindow2 = new PopupWindow(this.mDevLoadingView, -1, -2);
            this.mDevLoadingPopup = popupWindow2;
            popupWindow2.setTouchable(false);
            this.mDevLoadingPopup.showAtLocation(currentActivity.getWindow().getDecorView(), 0, 0, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideInternal() {
        PopupWindow popupWindow = this.mDevLoadingPopup;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        this.mDevLoadingPopup.dismiss();
        this.mDevLoadingPopup = null;
        this.mDevLoadingView = null;
    }

    private Context getContext() {
        return this.mReactInstanceManagerHelper.getCurrentActivity();
    }
}
