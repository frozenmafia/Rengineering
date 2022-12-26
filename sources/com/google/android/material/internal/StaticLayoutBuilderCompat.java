package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.util.Preconditions;
import java.lang.reflect.Constructor;
/* loaded from: classes5.dex */
final class StaticLayoutBuilderCompat {
    static final int ag$a;
    private static boolean ah$a;
    private static Object valueOf;
    private static Constructor<StaticLayout> values;
    private int HaptikSDK$c;
    private CharSequence HaptikWebView;
    private final TextPaint getSignupData;
    private boolean invoke;
    private final int isLogoutPending;
    private int a = 0;
    private Layout.Alignment toString = Layout.Alignment.ALIGN_NORMAL;
    private int HaptikSDK$d = Integer.MAX_VALUE;
    private float HaptikSDK$e = 0.0f;
    private float getInitSettings = 1.0f;
    private int HaptikSDK$b = ag$a;
    private boolean HaptikSDK$a = true;
    private TextUtils.TruncateAt ah$b = null;

    static {
        ag$a = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    private StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i) {
        this.HaptikWebView = charSequence;
        this.getSignupData = textPaint;
        this.isLogoutPending = i;
        this.HaptikSDK$c = charSequence.length();
    }

    public static StaticLayoutBuilderCompat values(CharSequence charSequence, TextPaint textPaint, int i) {
        return new StaticLayoutBuilderCompat(charSequence, textPaint, i);
    }

    public StaticLayoutBuilderCompat ah$a(Layout.Alignment alignment) {
        this.toString = alignment;
        return this;
    }

    public StaticLayoutBuilderCompat ah$a(boolean z) {
        this.HaptikSDK$a = z;
        return this;
    }

    public StaticLayoutBuilderCompat values(int i) {
        this.HaptikSDK$d = i;
        return this;
    }

    public StaticLayoutBuilderCompat ah$a(float f, float f2) {
        this.HaptikSDK$e = f;
        this.getInitSettings = f2;
        return this;
    }

    public StaticLayoutBuilderCompat ah$a(int i) {
        this.HaptikSDK$b = i;
        return this;
    }

    public StaticLayoutBuilderCompat toString(TextUtils.TruncateAt truncateAt) {
        this.ah$b = truncateAt;
        return this;
    }

    public StaticLayout ah$a() throws StaticLayoutBuilderCompatException {
        if (this.HaptikWebView == null) {
            this.HaptikWebView = "";
        }
        int max = Math.max(0, this.isLogoutPending);
        CharSequence charSequence = this.HaptikWebView;
        if (this.HaptikSDK$d == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.getSignupData, max, this.ah$b);
        }
        this.HaptikSDK$c = Math.min(charSequence.length(), this.HaptikSDK$c);
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.invoke && this.HaptikSDK$d == 1) {
                this.toString = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.a, this.HaptikSDK$c, this.getSignupData, max);
            obtain.setAlignment(this.toString);
            obtain.setIncludePad(this.HaptikSDK$a);
            obtain.setTextDirection(this.invoke ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            TextUtils.TruncateAt truncateAt = this.ah$b;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.HaptikSDK$d);
            float f = this.HaptikSDK$e;
            if (f != 0.0f || this.getInitSettings != 1.0f) {
                obtain.setLineSpacing(f, this.getInitSettings);
            }
            if (this.HaptikSDK$d > 1) {
                obtain.setHyphenationFrequency(this.HaptikSDK$b);
            }
            return obtain.build();
        }
        ag$a();
        try {
            return (StaticLayout) ((Constructor) Preconditions.checkNotNull(values)).newInstance(charSequence, Integer.valueOf(this.a), Integer.valueOf(this.HaptikSDK$c), this.getSignupData, Integer.valueOf(max), this.toString, Preconditions.checkNotNull(valueOf), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.HaptikSDK$a), null, Integer.valueOf(max), Integer.valueOf(this.HaptikSDK$d));
        } catch (Exception e) {
            throw new StaticLayoutBuilderCompatException(e);
        }
    }

    private void ag$a() throws StaticLayoutBuilderCompatException {
        Class<?> cls;
        if (ah$a) {
            return;
        }
        try {
            boolean z = this.invoke && Build.VERSION.SDK_INT >= 23;
            if (Build.VERSION.SDK_INT >= 18) {
                cls = TextDirectionHeuristic.class;
                valueOf = z ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            } else {
                ClassLoader classLoader = StaticLayoutBuilderCompat.class.getClassLoader();
                String str = this.invoke ? "RTL" : "LTR";
                Class<?> loadClass = classLoader.loadClass("android.text.TextDirectionHeuristic");
                Class<?> loadClass2 = classLoader.loadClass("android.text.TextDirectionHeuristics");
                valueOf = loadClass2.getField(str).get(loadClass2);
                cls = loadClass;
            }
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Layout.Alignment.class, cls, Float.TYPE, Float.TYPE, Boolean.TYPE, TextUtils.TruncateAt.class, Integer.TYPE, Integer.TYPE);
            values = declaredConstructor;
            declaredConstructor.setAccessible(true);
            ah$a = true;
        } catch (Exception e) {
            throw new StaticLayoutBuilderCompatException(e);
        }
    }

    public StaticLayoutBuilderCompat toString(boolean z) {
        this.invoke = z;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class StaticLayoutBuilderCompatException extends Exception {
        StaticLayoutBuilderCompatException(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }
}
