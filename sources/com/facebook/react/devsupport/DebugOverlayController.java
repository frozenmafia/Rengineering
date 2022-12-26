package com.facebook.react.devsupport;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import o.FragmentActivity;
/* loaded from: classes6.dex */
class DebugOverlayController {
    private FrameLayout mFPSDebugViewContainer;
    private final ReactContext mReactContext;
    private final WindowManager mWindowManager;

    public static void requestPermission(Context context) {
        if (Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(context)) {
            return;
        }
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName()));
        intent.setFlags(268435456);
        FragmentActivity.ah$a("ReactNative", "Overlay permissions needs to be granted in order for react native apps to run in dev mode");
        if (canHandleIntent(context, intent)) {
            context.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean permissionCheck(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Settings.canDrawOverlays(context);
        }
        return hasPermission(context, "android.permission.SYSTEM_ALERT_WINDOW");
    }

    private static boolean hasPermission(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            if (packageInfo.requestedPermissions != null) {
                for (String str2 : packageInfo.requestedPermissions) {
                    if (str2.equals(str)) {
                        return true;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            FragmentActivity.valueOf("ReactNative", "Error while retrieving package info", (Throwable) e);
        }
        return false;
    }

    private static boolean canHandleIntent(Context context, Intent intent) {
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    public DebugOverlayController(ReactContext reactContext) {
        this.mReactContext = reactContext;
        this.mWindowManager = (WindowManager) reactContext.getSystemService("window");
    }

    public void setFpsDebugViewVisible(final boolean z) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DebugOverlayController.1
            @Override // java.lang.Runnable
            public void run() {
                if (z && DebugOverlayController.this.mFPSDebugViewContainer == null) {
                    if (!DebugOverlayController.permissionCheck(DebugOverlayController.this.mReactContext)) {
                        FragmentActivity.toString("ReactNative", "Wait for overlay permission to be set");
                        return;
                    }
                    DebugOverlayController.this.mFPSDebugViewContainer = new FpsView(DebugOverlayController.this.mReactContext);
                    DebugOverlayController.this.mWindowManager.addView(DebugOverlayController.this.mFPSDebugViewContainer, new WindowManager.LayoutParams(-1, -1, WindowOverlayCompat.TYPE_SYSTEM_OVERLAY, 24, -3));
                } else if (z || DebugOverlayController.this.mFPSDebugViewContainer == null) {
                } else {
                    DebugOverlayController.this.mFPSDebugViewContainer.removeAllViews();
                    DebugOverlayController.this.mWindowManager.removeView(DebugOverlayController.this.mFPSDebugViewContainer);
                    DebugOverlayController.this.mFPSDebugViewContainer = null;
                }
            }
        });
    }
}
