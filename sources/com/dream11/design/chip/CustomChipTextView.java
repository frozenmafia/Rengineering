package com.dream11.design.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.apxor.androidsdk.core.ce.Constants;
import com.google.android.material.chip.Chip;
import java.util.LinkedHashMap;
import java.util.Map;
import o.mirror;
import o.mirror$ag$a;
import o.mirror$ah$a;
import o.resolveShadowDrawables;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class CustomChipTextView extends Chip {
    private String toString;
    public Map<Integer, View> valueOf;

    public final void setFont(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.toString = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomChipTextView(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.valueOf = new LinkedHashMap();
        this.toString = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomChipTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, Constants.META_ATTRIBUTES);
        this.valueOf = new LinkedHashMap();
        this.toString = "";
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mirror$ah$a.CustomChipTextView);
        runAnimators.ah$a(obtainStyledAttributes, "context.obtainStyledAttr…eable.CustomChipTextView)");
        try {
            int i = obtainStyledAttributes.getInt(mirror$ah$a.CustomChipTextView_chipFontName, 1);
            if (i == 1) {
                String string = context.getString(mirror$ag$a.D11Font_Regular);
                runAnimators.ah$a(string, "context.getString(R.string.D11Font_Regular)");
                this.toString = string;
            } else if (i == 2) {
                String string2 = context.getString(mirror$ag$a.D11Font_Medium);
                runAnimators.ah$a(string2, "context.getString(R.string.D11Font_Medium)");
                this.toString = string2;
            } else if (i == 3) {
                String string3 = context.getString(mirror$ag$a.D11Font_Bold);
                runAnimators.ah$a(string3, "context.getString(R.string.D11Font_Bold)");
                this.toString = string3;
            }
            obtainStyledAttributes.recycle();
            HaptikWebView();
            HaptikSDK$e();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void HaptikSDK$e() {
        setCheckable(true);
        setClickable(true);
        setCheckedIconVisible(false);
        setChipBackgroundColor(ContextCompat.getColorStateList(getContext(), mirror.values.bg_chip_state_list));
        setTextColor(ContextCompat.getColorStateList(getContext(), mirror.values.chip_text_color_list));
        setChipStrokeColor(ContextCompat.getColorStateList(getContext(), mirror.values.chip_stroke_color_list));
        setChipStrokeWidthResource(mirror.valueOf.height_1dp);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomChipTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, Constants.META_ATTRIBUTES);
        this.valueOf = new LinkedHashMap();
        this.toString = "";
    }

    private final void HaptikWebView() {
        if (isInEditMode()) {
            return;
        }
        try {
            resolveShadowDrawables resolveshadowdrawables = resolveShadowDrawables.ag$a;
            Context context = getContext();
            runAnimators.ah$a(context, "context");
            setTypeface(resolveshadowdrawables.values(context, this.toString));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
