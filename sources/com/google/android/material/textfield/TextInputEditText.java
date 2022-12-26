package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import o.Preference;
import o.Preference$BaseSavedState$HaptikSDK$c;
import o.Preference$BaseSavedState$HaptikSDK$e;
import o.Preference$BaseSavedState$ah$a;
import o.PreferenceFragment;
import o.createItem;
/* loaded from: classes5.dex */
public class TextInputEditText extends AppCompatEditText {
    private final Rect ag$a;
    private boolean valueOf;

    public TextInputEditText(Context context) {
        this(context, null);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Preference.BaseSavedState.values.editTextStyle);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(createItem.valueOf(context, attributeSet, i, 0), attributeSet, i);
        this.ag$a = new Rect();
        TypedArray scrollToPreferenceObserver = PreferenceFragment.ScrollToPreferenceObserver.toString(context, attributeSet, Preference.BaseSavedState.getSignupData.TextInputEditText, i, Preference$BaseSavedState$HaptikSDK$e.Widget_Design_TextInputEditText, new int[0]);
        setTextInputLayoutFocusedRectEnabled(scrollToPreferenceObserver.getBoolean(Preference.BaseSavedState.getSignupData.TextInputEditText_textInputLayoutFocusedRectEnabled, false));
        scrollToPreferenceObserver.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout values = values();
        if (values != null && values.extraCallbackWithResult() && super.getHint() == null && PreferenceFragment.AnonymousClass3.valueOf()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout values = values();
        if (values != null && values.extraCallbackWithResult()) {
            return values.HaptikSDK$d();
        }
        return super.getHint();
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = ah$a();
        }
        return onCreateInputConnection;
    }

    private TextInputLayout values() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private CharSequence ah$a() {
        TextInputLayout values = values();
        if (values != null) {
            return values.HaptikSDK$d();
        }
        return null;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.valueOf = z;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout values = values();
        if (values == null || !this.valueOf || rect == null) {
            return;
        }
        values.getFocusedRect(this.ag$a);
        rect.bottom = this.ag$a.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        TextInputLayout values = values();
        if (values != null && this.valueOf && rect != null) {
            values.getGlobalVisibleRect(this.ag$a, point);
            rect.bottom = this.ag$a.bottom;
        }
        return globalVisibleRect;
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        boolean requestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        TextInputLayout values = values();
        if (values != null && this.valueOf) {
            this.ag$a.set(0, values.getHeight() - getResources().getDimensionPixelOffset(Preference$BaseSavedState$ah$a.mtrl_edittext_rectangle_top_offset), values.getWidth(), values.getHeight());
            values.requestRectangleOnScreen(this.ag$a, true);
        }
        return requestRectangleOnScreen;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout values = values();
        if (Build.VERSION.SDK_INT >= 23 || values == null) {
            return;
        }
        accessibilityNodeInfo.setText(ag$a(values));
    }

    private String ag$a(TextInputLayout textInputLayout) {
        Editable text = getText();
        CharSequence HaptikSDK$d = textInputLayout.HaptikSDK$d();
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean isEmpty2 = TextUtils.isEmpty(HaptikSDK$d);
        if (Build.VERSION.SDK_INT >= 17) {
            setLabelFor(Preference$BaseSavedState$HaptikSDK$c.textinput_helper_text);
        }
        String str = "";
        String charSequence = isEmpty2 ^ true ? HaptikSDK$d.toString() : "";
        if (!(!isEmpty)) {
            return !TextUtils.isEmpty(charSequence) ? charSequence : "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) text);
        if (!TextUtils.isEmpty(charSequence)) {
            str = ", " + charSequence;
        }
        sb.append(str);
        return sb.toString();
    }
}
