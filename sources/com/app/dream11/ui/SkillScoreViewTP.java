package com.app.dream11.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.BindingAdapter;
import com.app.dream11Pro.R;
import com.dream11.design.textview.D11TextView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.LinkedHashMap;
import java.util.Map;
import o.AnyRes;
import o.getActionProvider;
import o.getTargetTypes;
import o.isLast;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class SkillScoreViewTP extends FrameLayout implements getActionProvider.values {
    public static final values ah$a = new values(null);
    private String HaptikSDK$a;
    private String HaptikSDK$b;
    private int HaptikSDK$c;
    private String HaptikSDK$d;
    private int HaptikSDK$e;
    private TextView HaptikWebView;
    private boolean ag$a;
    private TextView ah$b;
    private TextView invoke;
    private getActionProvider toString;
    public Map<Integer, View> valueOf;
    private ConstraintLayout values;

    @BindingAdapter({"eventName"})
    public static final void values(SkillScoreViewTP skillScoreViewTP, String str) {
        ah$a.ag$a(skillScoreViewTP, str);
    }

    @BindingAdapter({"enableTracker"})
    public static final void values(SkillScoreViewTP skillScoreViewTP, boolean z) {
        ah$a.toString(skillScoreViewTP, z);
    }

    public final void setScore(int i) {
        this.HaptikSDK$c = i;
        int i2 = i % 10;
        TextView textView = this.HaptikWebView;
        TextView textView2 = null;
        if (textView == null) {
            runAnimators.valueOf("thirdDigit");
            textView = null;
        }
        textView.setText((i == 0 && i2 == 0) ? getContext().getString(R.string.res_0x7f120343) : String.valueOf(i2));
        int i3 = i / 10;
        int i4 = i3 % 10;
        TextView textView3 = this.ah$b;
        if (textView3 == null) {
            runAnimators.valueOf("secondDigit");
            textView3 = null;
        }
        textView3.setText((i3 == 0 && i4 == 0) ? getContext().getString(R.string.res_0x7f120343) : String.valueOf(i4));
        int i5 = i3 / 10;
        int i6 = i5 % 10;
        TextView textView4 = this.invoke;
        if (textView4 == null) {
            runAnimators.valueOf("firstDigit");
        } else {
            textView2 = textView4;
        }
        textView2.setText((i5 == 0 && i6 == 0) ? getContext().getString(R.string.res_0x7f120343) : String.valueOf(i6));
    }

    public final void setType(int i) {
        this.HaptikSDK$e = i;
        ConstraintLayout constraintLayout = null;
        if (i == 0) {
            ConstraintLayout constraintLayout2 = this.values;
            if (constraintLayout2 == null) {
                runAnimators.valueOf("baseLayout");
            } else {
                constraintLayout = constraintLayout2;
            }
            constraintLayout.setBackgroundResource(R.drawable.bg_skill_score_tp_you);
        } else if (i != 1) {
        } else {
            ConstraintLayout constraintLayout3 = this.values;
            if (constraintLayout3 == null) {
                runAnimators.valueOf("baseLayout");
            } else {
                constraintLayout = constraintLayout3;
            }
            constraintLayout.setBackgroundResource(R.drawable.bg_skill_score_tp_opp);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getActionProvider getactionprovider = this.toString;
        if (getactionprovider == null) {
            runAnimators.valueOf("d11PerformanceTracker");
            getactionprovider = null;
        }
        getactionprovider.ag$a((String) getContentDescription(), this.HaptikSDK$b, this.HaptikSDK$d, this.HaptikSDK$a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillScoreViewTP(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.valueOf = new LinkedHashMap();
        this.HaptikSDK$b = "";
        this.HaptikSDK$d = "";
        this.HaptikSDK$a = "";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SkillScoreViewTP(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillScoreViewTP(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, "attrs");
        this.valueOf = new LinkedHashMap();
        this.HaptikSDK$b = "";
        this.HaptikSDK$d = "";
        this.HaptikSDK$a = "";
        View inflate = LayoutInflater.from(context).inflate(R.layout.res_0x7f0d0429, (ViewGroup) this, false);
        getActionProvider getactionprovider = new getActionProvider();
        this.toString = getactionprovider;
        getactionprovider.toString(this);
        setWillNotDraw(false);
        D11TextView d11TextView = (D11TextView) inflate.findViewById(AnyRes.values.firstDigit);
        runAnimators.ah$a(d11TextView, "view.firstDigit");
        this.invoke = d11TextView;
        D11TextView d11TextView2 = (D11TextView) inflate.findViewById(AnyRes.values.secondtDigit);
        runAnimators.ah$a(d11TextView2, "view.secondtDigit");
        this.ah$b = d11TextView2;
        D11TextView d11TextView3 = (D11TextView) inflate.findViewById(AnyRes.values.thirdDigit);
        runAnimators.ah$a(d11TextView3, "view.thirdDigit");
        this.HaptikWebView = d11TextView3;
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(AnyRes.values.baseLayout);
        runAnimators.ah$a(constraintLayout, "view.baseLayout");
        this.values = constraintLayout;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnyRes.valueOf.SkillScoreViewFP, 0, 0);
        try {
            setScore(obtainStyledAttributes.getInteger(1, 0));
            setType(obtainStyledAttributes.getInt(2, 0));
            obtainStyledAttributes.recycle();
            addView(inflate);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* loaded from: classes3.dex */
    public static final class values {
        private static int HaptikSDK$a = 1;
        private static char[] ag$a = {324, 320, 326, 323, 308, 310};
        private static int ah$a = 0;
        private static int toString = 209;
        private static boolean valueOf = true;
        private static boolean values = true;

        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }

        @BindingAdapter({"enableTracker"})
        public final void toString(SkillScoreViewTP skillScoreViewTP, boolean z) {
            int i = ah$a + 97;
            HaptikSDK$a = i % 128;
            if ((i % 2 == 0 ? '0' : (char) 0) != '0') {
                runAnimators.ag$a(skillScoreViewTP, Promotion.ACTION_VIEW);
                skillScoreViewTP.ag$a = z;
                return;
            }
            runAnimators.ag$a(skillScoreViewTP, Promotion.ACTION_VIEW);
            skillScoreViewTP.ag$a = z;
            int i2 = 47 / 0;
        }

        @BindingAdapter({"loadInstanceId"})
        public final void values(SkillScoreViewTP skillScoreViewTP, String str) {
            int i = HaptikSDK$a + 85;
            ah$a = i % 128;
            if ((i % 2 != 0 ? (char) 26 : '/') != '/') {
                runAnimators.ag$a(skillScoreViewTP, Promotion.ACTION_VIEW);
                runAnimators.ag$a(str, "loadInstanceId");
                skillScoreViewTP.HaptikSDK$b = str;
                int i2 = 3 / 0;
            } else {
                try {
                    runAnimators.ag$a(skillScoreViewTP, Promotion.ACTION_VIEW);
                    runAnimators.ag$a(str, "loadInstanceId");
                    skillScoreViewTP.HaptikSDK$b = str;
                } catch (Exception e) {
                    throw e;
                }
            }
            int i3 = ah$a + 63;
            try {
                HaptikSDK$a = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception e2) {
                throw e2;
            }
        }

        @BindingAdapter({"source"})
        public final void ah$a(SkillScoreViewTP skillScoreViewTP, String str) {
            int i = ah$a + 15;
            HaptikSDK$a = i % 128;
            Object[] objArr = null;
            if (i % 2 != 0) {
                runAnimators.ag$a(skillScoreViewTP, Promotion.ACTION_VIEW);
                runAnimators.ag$a(str, valueOf(null, null, 126 - TextUtils.lastIndexOf("", '0'), new byte[]{-122, -123, -124, -125, -126, -127}).intern());
            } else {
                runAnimators.ag$a(skillScoreViewTP, Promotion.ACTION_VIEW);
                runAnimators.ag$a(str, valueOf(null, null, 100 % TextUtils.lastIndexOf("", (char) 15), new byte[]{-122, -123, -124, -125, -126, -127}).intern());
            }
            skillScoreViewTP.HaptikSDK$d = str;
            int i2 = ah$a + 115;
            HaptikSDK$a = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            int length = objArr.length;
        }

        @BindingAdapter({"eventName"})
        public final void ag$a(SkillScoreViewTP skillScoreViewTP, String str) {
            int i = ah$a + 99;
            HaptikSDK$a = i % 128;
            Object[] objArr = null;
            if ((i % 2 == 0 ? ',' : ';') == ',') {
                runAnimators.ag$a(skillScoreViewTP, Promotion.ACTION_VIEW);
                runAnimators.ag$a(str, "eventName");
                skillScoreViewTP.HaptikSDK$a = str;
                int length = objArr.length;
            } else {
                try {
                    runAnimators.ag$a(skillScoreViewTP, Promotion.ACTION_VIEW);
                    runAnimators.ag$a(str, "eventName");
                    try {
                        skillScoreViewTP.HaptikSDK$a = str;
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
            int i2 = HaptikSDK$a + 99;
            ah$a = i2 % 128;
            if ((i2 % 2 != 0 ? ':' : 'J') != 'J') {
                super.hashCode();
            }
        }

        private static String valueOf(char[] cArr, int[] iArr, int i, byte[] bArr) {
            synchronized (isLast.valueOf) {
                char[] cArr2 = ag$a;
                int i2 = toString;
                if (valueOf) {
                    int length = bArr.length;
                    isLast.values = length;
                    char[] cArr3 = new char[length];
                    isLast.toString = 0;
                    while (isLast.toString < isLast.values) {
                        cArr3[isLast.toString] = (char) (cArr2[bArr[(isLast.values - 1) - isLast.toString] + i] - i2);
                        isLast.toString++;
                    }
                    return new String(cArr3);
                } else if (values) {
                    int length2 = cArr.length;
                    isLast.values = length2;
                    char[] cArr4 = new char[length2];
                    isLast.toString = 0;
                    while (isLast.toString < isLast.values) {
                        cArr4[isLast.toString] = (char) (cArr2[cArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                        isLast.toString++;
                    }
                    return new String(cArr4);
                } else {
                    int length3 = iArr.length;
                    isLast.values = length3;
                    char[] cArr5 = new char[length3];
                    isLast.toString = 0;
                    while (isLast.toString < isLast.values) {
                        cArr5[isLast.toString] = (char) (cArr2[iArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                        isLast.toString++;
                    }
                    return new String(cArr5);
                }
            }
        }
    }

    @Override // o.getActionProvider.values
    public boolean values() {
        return this.ag$a;
    }
}
