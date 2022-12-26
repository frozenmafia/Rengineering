package com.facebook.react.modules.accessibilityinfo;

import android.view.accessibility.AccessibilityManager;
/* loaded from: classes4.dex */
class AccessibilityInfoModule$ah$a implements AccessibilityManager.AccessibilityStateChangeListener {
    final /* synthetic */ AccessibilityInfoModule toString;

    private AccessibilityInfoModule$ah$a(AccessibilityInfoModule accessibilityInfoModule) {
        this.toString = accessibilityInfoModule;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z) {
        AccessibilityInfoModule.access$100(this.toString, z);
    }
}
