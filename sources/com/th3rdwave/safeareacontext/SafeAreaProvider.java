package com.th3rdwave.safeareacontext;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.react.views.view.ReactViewGroup;
import o.EncryptedFile;
import o.FragmentLifecycleCallbacksDispatcher;
import o.getChannel;
import o.setKeysetPrefName;
/* loaded from: classes5.dex */
public class SafeAreaProvider extends ReactViewGroup implements ViewTreeObserver.OnPreDrawListener {
    private setKeysetPrefName ag$a;
    private getChannel toString;
    private values values;

    /* loaded from: classes5.dex */
    public interface values {
        void valueOf(SafeAreaProvider safeAreaProvider, getChannel getchannel, setKeysetPrefName setkeysetprefname);
    }

    public SafeAreaProvider(Context context) {
        super(context);
    }

    private void ah$a() {
        getChannel valueOf = EncryptedFile.FileEncryptionScheme.valueOf(this);
        setKeysetPrefName ag$a = EncryptedFile.FileEncryptionScheme.ag$a((ViewGroup) getRootView(), this);
        if (valueOf == null || ag$a == null) {
            return;
        }
        getChannel getchannel = this.toString;
        if (getchannel == null || this.ag$a == null || !getchannel.values(valueOf) || !this.ag$a.ah$a(ag$a)) {
            ((values) FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder.ag$a(this.values)).valueOf(this, valueOf, ag$a);
            this.toString = valueOf;
            this.ag$a = ag$a;
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this);
        ah$a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ah$a();
        return true;
    }

    public void setOnInsetsChangeListener(values valuesVar) {
        this.values = valuesVar;
    }
}
