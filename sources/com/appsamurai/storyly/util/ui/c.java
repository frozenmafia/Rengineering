package com.appsamurai.storyly.util.ui;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.app.NotificationCompat;
import com.appsamurai.storyly.util.ui.c;
import o.Styleable;
import o.accessibilityHeadingProperty;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class c extends AppCompatEditText {
    public boolean ag$a;
    public boolean ah$a;
    public Styleable.ArcMotion<Boolean> valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.enableAccessibleClickableSpanSupport
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                c.toString(c.this, view, z);
            }
        });
    }

    public static final void toString(final c cVar, View view, boolean z) {
        runAnimators.ag$a(cVar, "this$0");
        cVar.ag$a = z;
        cVar.post(new Runnable() { // from class: o.getAccessibilityDelegate
            @Override // java.lang.Runnable
            public final void run() {
                c.toString(c.this);
            }
        });
    }

    private final InputMethodManager valueOf() {
        Context context = getContext();
        runAnimators.ah$a(context, "context");
        Activity values = accessibilityHeadingProperty.values(context);
        Object systemService = values == null ? null : values.getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            return (InputMethodManager) systemService;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        Boolean invoke;
        runAnimators.ag$a(keyEvent, NotificationCompat.CATEGORY_EVENT);
        if (i == 4 && keyEvent.getAction() == 1) {
            Styleable.ArcMotion<Boolean> arcMotion = this.valueOf;
            if (arcMotion == null || (invoke = arcMotion.invoke()) == null) {
                return false;
            }
            return invoke.booleanValue();
        }
        return dispatchKeyEvent(keyEvent);
    }

    public final void setOnBackPressed(Styleable.ArcMotion<Boolean> arcMotion) {
        this.valueOf = arcMotion;
    }

    public final boolean values() {
        return this.ag$a;
    }

    public static final void toString(c cVar) {
        runAnimators.ag$a(cVar, "this$0");
        if (cVar.values()) {
            if (cVar.ah$a) {
                return;
            }
            cVar.ah$a = true;
            InputMethodManager valueOf = cVar.valueOf();
            if (valueOf == null) {
                return;
            }
            valueOf.toggleSoftInput(1, 0);
        } else if (cVar.ah$a) {
            cVar.ah$a = false;
            InputMethodManager valueOf2 = cVar.valueOf();
            if (valueOf2 == null) {
                return;
            }
            valueOf2.toggleSoftInput(0, 1);
        }
    }
}
