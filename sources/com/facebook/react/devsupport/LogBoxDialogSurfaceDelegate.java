package com.facebook.react.devsupport;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import o.FragmentLifecycleCallbacksDispatcher;
import o.FragmentResultListener;
import o.calculateNameOverrides;
/* loaded from: classes4.dex */
public class LogBoxDialogSurfaceDelegate implements FragmentResultListener {
    private final DevSupportManager mDevSupportManager;
    private LogBoxDialog mDialog;
    private View mReactRootView;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LogBoxDialogSurfaceDelegate(DevSupportManager devSupportManager) {
        this.mDevSupportManager = devSupportManager;
    }

    @Override // o.FragmentResultListener
    public void createContentView(String str) {
        FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder.ah$a(str.equals(LogBoxModule.NAME), "This surface manager can only create LogBox React application");
        View createRootView = this.mDevSupportManager.createRootView(LogBoxModule.NAME);
        this.mReactRootView = createRootView;
        if (createRootView == null) {
            calculateNameOverrides.valueOf("Unable to launch logbox because react was unable to create the root view");
        }
    }

    @Override // o.FragmentResultListener
    public boolean isContentViewReady() {
        return this.mReactRootView != null;
    }

    @Override // o.FragmentResultListener
    public void destroyContentView() {
        View view = this.mReactRootView;
        if (view != null) {
            this.mDevSupportManager.destroyRootView(view);
            this.mReactRootView = null;
        }
    }

    @Override // o.FragmentResultListener
    public void show() {
        if (isShowing() || !isContentViewReady()) {
            return;
        }
        Activity currentActivity = this.mDevSupportManager.getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            calculateNameOverrides.valueOf("Unable to launch logbox because react activity is not available, here is the error that logbox would've displayed: ");
            return;
        }
        LogBoxDialog logBoxDialog = new LogBoxDialog(currentActivity, this.mReactRootView);
        this.mDialog = logBoxDialog;
        logBoxDialog.setCancelable(false);
        this.mDialog.show();
    }

    @Override // o.FragmentResultListener
    public void hide() {
        if (isShowing()) {
            View view = this.mReactRootView;
            if (view != null && view.getParent() != null) {
                ((ViewGroup) this.mReactRootView.getParent()).removeView(this.mReactRootView);
            }
            this.mDialog.dismiss();
            this.mDialog = null;
        }
    }

    @Override // o.FragmentResultListener
    public boolean isShowing() {
        LogBoxDialog logBoxDialog = this.mDialog;
        return logBoxDialog != null && logBoxDialog.isShowing();
    }
}
