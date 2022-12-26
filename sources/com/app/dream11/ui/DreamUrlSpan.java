package com.app.dream11.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import com.google.android.gms.analytics.ecommerce.Promotion;
import o.canShowOverflowMenu;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class DreamUrlSpan extends URLSpan {
    private final valueOf toString;
    private final boolean valueOf;
    private final View values;

    /* loaded from: classes3.dex */
    public interface valueOf {
        void ah$a(String str);

        void toString(String str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DreamUrlSpan(String str, View view, boolean z, valueOf valueof) {
        super(str);
        runAnimators.ag$a(str, "url");
        runAnimators.ag$a(view, Promotion.ACTION_VIEW);
        this.values = view;
        this.valueOf = z;
        this.toString = valueof;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        runAnimators.ag$a(view, "widget");
        try {
            if (canShowOverflowMenu.valueOf(getURL())) {
                valueOf valueof = this.toString;
                if (valueof != null) {
                    String url = getURL();
                    runAnimators.ah$a(url, "url");
                    valueof.ah$a(url);
                }
            } else {
                super.onClick(view);
            }
        } catch (Exception unused) {
            super.onClick(view);
        }
    }

    public final void ah$a() {
        valueOf valueof = this.toString;
        if (valueof == null) {
            return;
        }
        String url = getURL();
        runAnimators.ah$a(url, "url");
        valueof.toString(url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        runAnimators.ag$a(textPaint, "ds");
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(this.valueOf);
    }
}
