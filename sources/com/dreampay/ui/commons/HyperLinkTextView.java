package com.dreampay.ui.commons;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import o.C0368entity;
import o.entity$HaptikSDK$c;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class HyperLinkTextView extends AppCompatTextView {
    private int ag$a;
    private HyperLinkTextView$ag$a ah$a;
    private int toString;

    public final void setStartIndex(int i) {
        this.toString = i;
    }

    public final void setEndIndex(int i) {
        this.ag$a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HyperLinkTextView(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        values(context, null, -1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HyperLinkTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        values(context, attributeSet, -1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HyperLinkTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        runAnimators.ag$a(context, "context");
        values(context, attributeSet, i);
    }

    public final void setOnHyperLinkedTextViewClickListener(HyperLinkTextView$ag$a hyperLinkTextView$ag$a) {
        runAnimators.ag$a(hyperLinkTextView$ag$a, "listener");
        this.ah$a = hyperLinkTextView$ag$a;
    }

    private final void values(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, entity$HaptikSDK$c.HyperLinkTextView);
        this.toString = obtainStyledAttributes.getInt(entity$HaptikSDK$c.HyperLinkTextView_start_index, 0);
        this.ag$a = obtainStyledAttributes.getInt(entity$HaptikSDK$c.HyperLinkTextView_end_index, 0);
        CharSequence text = getText();
        runAnimators.ah$a(text, "text");
        if (text.length() > 0) {
            setHyperLinkedText(getText().toString());
        }
        obtainStyledAttributes.recycle();
    }

    public final void setHyperLinkedText(String str) {
        runAnimators.ag$a(str, "text");
        if (this.ag$a == 0) {
            this.ag$a = str.length();
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new valueOf(), this.toString, this.ag$a, 33);
        setText(spannableString);
        setHighlightColor(0);
        setMovementMethod(LinkMovementMethod.getInstance());
        invalidate();
    }

    /* loaded from: classes6.dex */
    public static final class valueOf extends ClickableSpan {
        valueOf() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            runAnimators.ag$a(view, Promotion.ACTION_VIEW);
            HyperLinkTextView$ag$a hyperLinkTextView$ag$a = HyperLinkTextView.this.ah$a;
            if (hyperLinkTextView$ag$a == null) {
                return;
            }
            hyperLinkTextView$ag$a.ah$a();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            runAnimators.ag$a(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setColor(HyperLinkTextView.this.getResources().getColor(C0368entity.values.cornflower_blue));
            textPaint.setUnderlineText(false);
        }
    }
}
