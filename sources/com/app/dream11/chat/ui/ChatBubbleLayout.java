package com.app.dream11.chat.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.LinkedHashMap;
import java.util.Map;
import o.AnyRes;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ChatBubbleLayout extends FrameLayout {
    public Map<Integer, View> _$_findViewCache;
    private int childRef;
    private TextView childView;
    private int maxWidth;
    private int parentRef;
    private TextView parentView;

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view == null) {
            View findViewById = findViewById(i);
            if (findViewById == null) {
                return null;
            }
            map.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }
        return view;
    }

    public final int getMaxWidth() {
        return this.maxWidth;
    }

    public final void setMaxWidth(int i) {
        this.maxWidth = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBubbleLayout(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        this.parentRef = -1;
        this.childRef = -1;
        this.maxWidth = -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBubbleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, "attrs");
        this._$_findViewCache = new LinkedHashMap();
        this.parentRef = -1;
        this.childRef = -1;
        this.maxWidth = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnyRes.valueOf.ChatBubbleLayout);
        runAnimators.ah$a(obtainStyledAttributes, "context.obtainStyledAttr…yleable.ChatBubbleLayout)");
        try {
            this.parentRef = obtainStyledAttributes.getResourceId(2, -1);
            this.childRef = obtainStyledAttributes.getResourceId(0, -1);
            int dimension = (int) obtainStyledAttributes.getDimension(1, 0.0f);
            this.maxWidth = dimension;
            this.maxWidth = dimension - (getPaddingLeft() + getPaddingRight());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i = this.parentRef;
        if (i != -1) {
            this.parentView = (TextView) findViewById(i);
        }
        int i2 = this.childRef;
        if (i2 != -1) {
            this.childView = (TextView) findViewById(i2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBubbleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, "attrs");
        this._$_findViewCache = new LinkedHashMap();
        this.parentRef = -1;
        this.childRef = -1;
        this.maxWidth = -1;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        doMeasure();
    }

    private final void doMeasure() {
        int lineCount;
        try {
            TextView textView = this.parentView;
            if (textView == null || this.childView == null || this.maxWidth <= 0 || textView == null || (lineCount = textView.getLineCount()) <= 0) {
                return;
            }
            TextView textView2 = this.childView;
            runAnimators.toString(textView2);
            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            TextView textView3 = this.childView;
            runAnimators.toString(textView3);
            int measuredWidth = textView3.getMeasuredWidth();
            TextView textView4 = this.childView;
            runAnimators.toString(textView4);
            int paddingStart = textView4.getPaddingStart();
            TextView textView5 = this.childView;
            runAnimators.toString(textView5);
            int paddingEnd = measuredWidth + paddingStart + textView5.getPaddingEnd() + layoutParams2.getMarginStart() + layoutParams2.getMarginEnd();
            int i = lineCount - 1;
            int max = Math.max((int) textView.getLayout().getLineWidth(i), textView.getMeasuredWidth()) + paddingEnd;
            int measuredHeight = getMeasuredHeight();
            TextView textView6 = this.childView;
            runAnimators.toString(textView6);
            int measuredHeight2 = textView6.getMeasuredHeight() / 2;
            boolean z = true;
            if (lineCount == 1) {
                if (max > getMaxWidth()) {
                    max = getMaxWidth();
                    measuredHeight += measuredHeight2;
                }
                setMeasuredDimension(max, measuredHeight);
                return;
            }
            if (max > getMaxWidth()) {
                max = getMaxWidth();
            }
            if (textView.getLayout().getLineWidth(i) + paddingEnd >= max) {
                z = false;
            }
            if (!z) {
                measuredHeight += measuredHeight2;
            }
            setMeasuredDimension(max, measuredHeight);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
