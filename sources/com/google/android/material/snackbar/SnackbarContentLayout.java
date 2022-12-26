package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import o.Preference;
import o.Preference$BaseSavedState$HaptikSDK$c;
import o.PreferenceDialogFragmentCompat;
import o.access$getOnBackPressedCallback$p;
import o.setInitialExpandedChildrenCount;
/* loaded from: classes5.dex */
public class SnackbarContentLayout extends LinearLayout implements access$getOnBackPressedCallback$p {
    private TextView toString;
    private int valueOf;
    private Button values;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.toString = (TextView) findViewById(Preference$BaseSavedState$HaptikSDK$c.snackbar_text);
        this.values = (Button) findViewById(Preference$BaseSavedState$HaptikSDK$c.snackbar_action);
    }

    public TextView values() {
        return this.toString;
    }

    public Button ah$a() {
        return this.values;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$a(float f) {
        if (f != 1.0f) {
            this.values.setTextColor(PreferenceDialogFragmentCompat.Api30Impl.ag$a(setInitialExpandedChildrenCount.toString(this, Preference.BaseSavedState.values.colorSurface), this.values.getCurrentTextColor(), f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (ah$a(1, r0, r0 - r1) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (ah$a(0, r0, r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
        r3 = true;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            android.content.res.Resources r0 = r7.getResources()
            int r1 = o.Preference$BaseSavedState$ah$a.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = o.Preference$BaseSavedState$ah$a.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.toString
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L27
            r2 = 1
            goto L28
        L27:
            r2 = 0
        L28:
            if (r2 == 0) goto L41
            int r5 = r7.valueOf
            if (r5 <= 0) goto L41
            android.widget.Button r5 = r7.values
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.valueOf
            if (r5 <= r6) goto L41
            int r1 = r0 - r1
            boolean r0 = r7.ah$a(r4, r0, r1)
            if (r0 == 0) goto L4c
            goto L4b
        L41:
            if (r2 == 0) goto L44
            goto L45
        L44:
            r0 = r1
        L45:
            boolean r0 = r7.ah$a(r3, r0, r0)
            if (r0 == 0) goto L4c
        L4b:
            r3 = 1
        L4c:
            if (r3 == 0) goto L51
            super.onMeasure(r8, r9)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    private boolean ah$a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.toString.getPaddingTop() == i2 && this.toString.getPaddingBottom() == i3) {
            return z;
        }
        ag$a(this.toString, i2, i3);
        return true;
    }

    private static void ag$a(View view, int i, int i2) {
        if (ViewCompat.isPaddingRelative(view)) {
            ViewCompat.setPaddingRelative(view, ViewCompat.getPaddingStart(view), i, ViewCompat.getPaddingEnd(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    @Override // o.access$getOnBackPressedCallback$p
    public void valueOf(int i, int i2) {
        this.toString.setAlpha(0.0f);
        long j = i2;
        long j2 = i;
        this.toString.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.values.getVisibility() == 0) {
            this.values.setAlpha(0.0f);
            this.values.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    @Override // o.access$getOnBackPressedCallback$p
    public void ag$a(int i, int i2) {
        this.toString.setAlpha(1.0f);
        long j = i2;
        long j2 = i;
        this.toString.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.values.getVisibility() == 0) {
            this.values.setAlpha(1.0f);
            this.values.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    public void setMaxInlineActionWidth(int i) {
        this.valueOf = i;
    }
}
