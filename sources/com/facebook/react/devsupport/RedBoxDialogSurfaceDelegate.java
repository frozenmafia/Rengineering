package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.Dialog;
import android.view.KeyEvent;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import o.FragmentActivity;
import o.FragmentResultListener;
import o.onFragmentSaveInstanceState;
/* loaded from: classes6.dex */
public class RedBoxDialogSurfaceDelegate implements FragmentResultListener {
    private final DevSupportManager mDevSupportManager;
    private Dialog mDialog;
    private final DoubleTapReloadRecognizer mDoubleTapReloadRecognizer = new DoubleTapReloadRecognizer();
    private RedBoxContentView mRedBoxContentView;

    public RedBoxDialogSurfaceDelegate(DevSupportManager devSupportManager) {
        this.mDevSupportManager = devSupportManager;
    }

    @Override // o.FragmentResultListener
    public void createContentView(String str) {
        RedBoxHandler redBoxHandler = this.mDevSupportManager.getRedBoxHandler();
        Activity currentActivity = this.mDevSupportManager.getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            String lastErrorTitle = this.mDevSupportManager.getLastErrorTitle();
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to launch redbox because react activity is not available, here is the error that redbox would've displayed: ");
            if (lastErrorTitle == null) {
                lastErrorTitle = "N/A";
            }
            sb.append(lastErrorTitle);
            FragmentActivity.values("ReactNative", sb.toString());
            return;
        }
        RedBoxContentView redBoxContentView = new RedBoxContentView(currentActivity);
        this.mRedBoxContentView = redBoxContentView;
        redBoxContentView.setDevSupportManager(this.mDevSupportManager).setRedBoxHandler(redBoxHandler).init();
    }

    @Override // o.FragmentResultListener
    public boolean isContentViewReady() {
        return this.mRedBoxContentView != null;
    }

    @Override // o.FragmentResultListener
    public void destroyContentView() {
        this.mRedBoxContentView = null;
    }

    @Override // o.FragmentResultListener
    public void show() {
        String lastErrorTitle = this.mDevSupportManager.getLastErrorTitle();
        Activity currentActivity = this.mDevSupportManager.getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to launch redbox because react activity is not available, here is the error that redbox would've displayed: ");
            if (lastErrorTitle == null) {
                lastErrorTitle = "N/A";
            }
            sb.append(lastErrorTitle);
            FragmentActivity.values("ReactNative", sb.toString());
            return;
        }
        RedBoxContentView redBoxContentView = this.mRedBoxContentView;
        if (redBoxContentView == null || redBoxContentView.getContext() != currentActivity) {
            createContentView("RedBox");
        }
        this.mRedBoxContentView.refreshContentView();
        if (this.mDialog == null) {
            Dialog dialog = new Dialog(currentActivity, onFragmentSaveInstanceState.toString.Theme_Catalyst_RedBox) { // from class: com.facebook.react.devsupport.RedBoxDialogSurfaceDelegate.1
                @Override // android.app.Dialog, android.view.KeyEvent.Callback
                public boolean onKeyUp(int i, KeyEvent keyEvent) {
                    if (i == 82) {
                        RedBoxDialogSurfaceDelegate.this.mDevSupportManager.showDevOptionsDialog();
                        return true;
                    }
                    if (RedBoxDialogSurfaceDelegate.this.mDoubleTapReloadRecognizer.didDoubleTapR(i, getCurrentFocus())) {
                        RedBoxDialogSurfaceDelegate.this.mDevSupportManager.handleReloadJS();
                    }
                    return super.onKeyUp(i, keyEvent);
                }
            };
            this.mDialog = dialog;
            dialog.requestWindowFeature(1);
            this.mDialog.setContentView(this.mRedBoxContentView);
        }
        this.mDialog.show();
    }

    @Override // o.FragmentResultListener
    public void hide() {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.dismiss();
            destroyContentView();
            this.mDialog = null;
        }
    }

    @Override // o.FragmentResultListener
    public boolean isShowing() {
        Dialog dialog = this.mDialog;
        return dialog != null && dialog.isShowing();
    }
}
