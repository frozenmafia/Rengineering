package com.apxor.androidsdk.plugins.realtimeui.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.apxor.androidsdk.plugins.realtimeui.R;
import com.apxor.androidsdk.plugins.realtimeui.i.e;
import com.sendbird.android.constant.StringSet;
import java.util.ArrayList;
/* loaded from: classes3.dex */
public class ButtonsLayout extends LinearLayout {
    private int a;

    /* renamed from: b  reason: collision with root package name */
    private int f363b;
    private int c;
    private b d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        final /* synthetic */ e a;

        a(e eVar) {
            this.a = eVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ButtonsLayout.this.d.a(view, this.a);
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(View view, e eVar);
    }

    public ButtonsLayout(Context context) {
        this(context, null);
    }

    public ButtonsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ButtonsLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ButtonsLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }

    private static int a(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    private static int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    private void a(Context context, AttributeSet attributeSet, int i, int i2) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.ApxorButtonsLayout, i, i2);
            this.a = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ApxorButtonsLayout_stackedSpaceHeight, 0);
            this.f363b = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ApxorButtonsLayout_separatedSpaceWidth, 0);
            this.c = obtainStyledAttributes.getResourceId(R.styleable.ApxorButtonsLayout_buttonLayoutResourceId, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [android.graphics.drawable.RippleDrawable] */
    /* JADX WARN: Type inference failed for: r10v4, types: [android.graphics.drawable.StateListDrawable] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.widget.Button] */
    private void a(Button button, e eVar, int i) {
        int parseColor = Color.parseColor(eVar.e().c());
        int round = (16777215 & parseColor) | (Math.round(Color.alpha(parseColor) * 0.2f) << 24);
        int c = eVar.c();
        button.setTextColor(parseColor);
        button.setTypeface(com.apxor.androidsdk.plugins.realtimeui.utils.b.a(eVar.e().i(), getContext()));
        button.setText(com.apxor.androidsdk.plugins.realtimeui.utils.b.a(eVar.e().n(), eVar.e().m()));
        button.setTextSize(eVar.e().j());
        com.apxor.androidsdk.plugins.realtimeui.i.d b2 = eVar.b();
        float a2 = b2.a();
        int c2 = b2.c();
        int b3 = b2.b();
        float[] a3 = c.a(TypedValue.applyDimension(1, a2, getResources().getDisplayMetrics()), i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 16) {
            GradientDrawable a4 = com.apxor.androidsdk.plugins.realtimeui.utils.b.a(eVar);
            a4.setCornerRadii(a3);
            a4.setStroke(c2, b3);
            if (round != 0) {
                if (i2 >= 21) {
                    a4 = new RippleDrawable(ColorStateList.valueOf(round), a4, new ShapeDrawable(new RoundRectShape(a3, null, null)));
                } else {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setCornerRadii(a3);
                    gradientDrawable.setColor(b(round, c));
                    gradientDrawable.setStroke(2, b(round, Color.parseColor("#ffffff")));
                    ?? stateListDrawable = new StateListDrawable();
                    stateListDrawable.addState(new int[]{16842919}, gradientDrawable);
                    stateListDrawable.addState(StateSet.WILD_CARD, a4);
                    a4 = stateListDrawable;
                }
            }
            button.setBackground(a4);
        }
    }

    private static int b(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int a2 = a(alpha2, alpha);
        return Color.argb(a2, a(Color.red(i), alpha2, Color.red(i2), alpha, a2), a(Color.green(i), alpha2, Color.green(i2), alpha, a2), a(Color.blue(i), alpha2, Color.blue(i2), alpha, a2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(ArrayList<e> arrayList, String str, String str2) {
        boolean z;
        int i;
        int i2;
        LinearLayout.LayoutParams layoutParams;
        if (arrayList.size() > 1) {
            boolean equals = "stacked".equals(str);
            z = StringSet.joined.equals(str);
            i = equals;
        } else {
            z = false;
            i = 0;
        }
        removeAllViews();
        setOrientation(i);
        setMeasureWithLargestChildEnabled(true);
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            e eVar = arrayList.get(i3);
            if (eVar.f() > 0) {
                if (z) {
                    i2 = i3 == 0 ? 9 : i3 == size + (-1) ? 20 : 0;
                    if (str2.equals("fixed")) {
                        i2 = i3 == 0 ? 8 : 16;
                    }
                } else {
                    i2 = 29;
                }
                Button button = (Button) LayoutInflater.from(getContext()).inflate(R.layout.apx_button, (ViewGroup) this, false);
                a(button, eVar, i2);
                if (i != 0) {
                    layoutParams = new LinearLayout.LayoutParams(-1, 0);
                    if (!TextUtils.isEmpty(str2)) {
                        if (str2.equals("fixed")) {
                            layoutParams.weight = 50.0f;
                            this.a = 0;
                        } else {
                            layoutParams.weight = 1.0f;
                        }
                    }
                    if (i3 > 0) {
                        layoutParams.setMargins(0, this.a, 0, 0);
                    }
                } else {
                    layoutParams = new LinearLayout.LayoutParams(0, -1);
                    if (!TextUtils.isEmpty(str2)) {
                        if (str2.equals("fixed")) {
                            layoutParams.weight = 50.0f;
                            this.f363b = 5;
                            if (i3 == 0) {
                                layoutParams.setMargins(0, 0, 5, 0);
                            }
                        } else {
                            layoutParams.weight = 1.0f;
                        }
                    }
                    if (!z && i3 > 0) {
                        layoutParams.setMargins(this.f363b, 0, 0, 0);
                        if (Build.VERSION.SDK_INT >= 17) {
                            layoutParams.setMarginStart(this.f363b);
                        }
                    }
                }
                button.setLayoutParams(layoutParams);
                button.setVisibility(0);
                addView(button);
                button.setOnClickListener(new a(eVar));
            }
            i3++;
        }
        requestLayout();
    }

    public void setButtonOnClickListener(b bVar) {
        this.d = bVar;
    }
}
