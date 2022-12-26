package com.app.dream11.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.app.dream11Pro.R;
import com.apxor.androidsdk.core.ce.Constants;
import com.google.android.material.chip.Chip;
import java.util.LinkedHashMap;
import java.util.Map;
import o.mirror$ah$a;
import o.onCreateDialogView;
import o.resolveShadowDrawables;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class D11BackgroundColorChip extends Chip {
    private String ag$a;
    public Map<Integer, View> values;

    public final void setFont(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.ag$a = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D11BackgroundColorChip(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.values = new LinkedHashMap();
        this.ag$a = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D11BackgroundColorChip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, Constants.META_ATTRIBUTES);
        this.values = new LinkedHashMap();
        this.ag$a = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D11BackgroundColorChip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, Constants.META_ATTRIBUTES);
        this.values = new LinkedHashMap();
        this.ag$a = "";
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mirror$ah$a.CustomChipTextView);
        runAnimators.ah$a(obtainStyledAttributes, "context.obtainStyledAttr…eable.CustomChipTextView)");
        try {
            int i = obtainStyledAttributes.getInt(0, 1);
            if (i == 1) {
                String string = context.getString(R.string.res_0x7f12000e);
                runAnimators.ah$a(string, "context.getString(R.string.D11Font_Regular)");
                this.ag$a = string;
            } else if (i == 2) {
                String string2 = context.getString(R.string.res_0x7f12000d);
                runAnimators.ah$a(string2, "context.getString(R.string.D11Font_Medium)");
                this.ag$a = string2;
            } else if (i == 3) {
                String string3 = context.getString(R.string.res_0x7f12000c);
                runAnimators.ah$a(string3, "context.getString(R.string.D11Font_Bold)");
                this.ag$a = string3;
            }
            obtainStyledAttributes.recycle();
            HaptikSDK$e();
            getInitSettings();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void getInitSettings() {
        setCheckable(false);
        setChipIconVisible(false);
        setCheckedIconVisible(false);
        setChipStrokeWidthResource(R.dimen.height_1dp);
        Chip chip = new Chip(getContext());
        onCreateDialogView ag$a = onCreateDialogView.ag$a(getContext(), null, 0, R.style._res_0x7f130550);
        runAnimators.ah$a(ag$a, "createFromAttributes(con…alComponents_Chip_Choice)");
        chip.setChipDrawable(ag$a);
    }

    private final void HaptikSDK$e() {
        if (isInEditMode()) {
            return;
        }
        try {
            resolveShadowDrawables resolveshadowdrawables = resolveShadowDrawables.ag$a;
            Context context = getContext();
            runAnimators.ah$a(context, "context");
            setTypeface(resolveshadowdrawables.values(context, this.ag$a));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
