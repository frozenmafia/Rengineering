package com.facebook.react.views.slider;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
/* loaded from: classes4.dex */
protected class ReactSliderManager$ag$a extends ReactAccessibilityDelegate {
    private boolean ag$a(int i) {
        return i == AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD.getId() || i == AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD.getId() || i == AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_PROGRESS.getId();
    }

    @Override // com.facebook.react.uimanager.ReactAccessibilityDelegate, androidx.core.view.AccessibilityDelegateCompat
    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener;
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2;
        if (ag$a(i)) {
            onSeekBarChangeListener2 = ReactSliderManager.ON_CHANGE_LISTENER;
            onSeekBarChangeListener2.onStartTrackingTouch((SeekBar) view);
        }
        boolean performAccessibilityAction = super.performAccessibilityAction(view, i, bundle);
        if (ag$a(i)) {
            onSeekBarChangeListener = ReactSliderManager.ON_CHANGE_LISTENER;
            onSeekBarChangeListener.onStopTrackingTouch((SeekBar) view);
        }
        return performAccessibilityAction;
    }
}
