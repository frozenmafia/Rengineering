package com.dream11.design.textinput;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import o.Visibility;
import o.getTargetTypes;
import o.mirror$ag$a;
import o.mirror$ah$a;
import o.resolveShadowDrawables;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class D11TextInputLayout extends TextInputLayout {
    public static final valueOf valueOf = new valueOf(null);
    private Object HaptikSDK$a;
    private boolean HaptikSDK$b;
    private Rect HaptikSDK$c;
    private Method ah$b;
    private String invoke;
    public Map<Integer, View> toString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D11TextInputLayout(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.toString = new LinkedHashMap();
        this.HaptikSDK$b = true;
        toString(context, (AttributeSet) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D11TextInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        this.toString = new LinkedHashMap();
        this.HaptikSDK$b = true;
        toString(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D11TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        runAnimators.ag$a(context, "context");
        this.toString = new LinkedHashMap();
        this.HaptikSDK$b = true;
        toString(context, attributeSet);
    }

    private final void toString(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mirror$ah$a.CustomTextInputView);
            runAnimators.ah$a(obtainStyledAttributes, "context.obtainStyledAttr…able.CustomTextInputView)");
            try {
                int i = obtainStyledAttributes.getInt(mirror$ah$a.CustomTextInputView_textInputFontName, 1);
                if (i == 1) {
                    this.invoke = context.getString(mirror$ag$a.D11Font_Regular);
                } else if (i == 2) {
                    this.invoke = context.getString(mirror$ag$a.D11Font_Medium);
                } else if (i == 3) {
                    this.invoke = context.getString(mirror$ag$a.D11Font_Bold);
                }
                this.HaptikSDK$b = obtainStyledAttributes.getInt(mirror$ah$a.CustomTextInputView_shouldIgnoreDrawablePadding, 0) == 1;
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        String str = this.invoke;
        if (str == null || Visibility.Mode.toString(str, "null", true)) {
            this.invoke = context.getString(mirror$ag$a.D11Font_Regular);
        }
        setDefaultImpl();
        onNavigationEvent();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037 A[Catch: NoSuchMethodException -> 0x006b, IllegalAccessException -> 0x0076, NoSuchFieldException -> 0x0081, TryCatch #2 {IllegalAccessException -> 0x0076, NoSuchFieldException -> 0x0081, NoSuchMethodException -> 0x006b, blocks: (B:6:0x0011, B:20:0x0046, B:27:0x0060, B:23:0x004f, B:26:0x0057, B:28:0x0063, B:29:0x006a, B:18:0x003e, B:15:0x0037, B:9:0x0026, B:12:0x002e), top: B:37:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[Catch: NoSuchMethodException -> 0x006b, IllegalAccessException -> 0x0076, NoSuchFieldException -> 0x0081, TryCatch #2 {IllegalAccessException -> 0x0076, NoSuchFieldException -> 0x0081, NoSuchMethodException -> 0x006b, blocks: (B:6:0x0011, B:20:0x0046, B:27:0x0060, B:23:0x004f, B:26:0x0057, B:28:0x0063, B:29:0x006a, B:18:0x003e, B:15:0x0037, B:9:0x0026, B:12:0x002e), top: B:37:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[Catch: NoSuchMethodException -> 0x006b, IllegalAccessException -> 0x0076, NoSuchFieldException -> 0x0081, TryCatch #2 {IllegalAccessException -> 0x0076, NoSuchFieldException -> 0x0081, NoSuchMethodException -> 0x006b, blocks: (B:6:0x0011, B:20:0x0046, B:27:0x0060, B:23:0x004f, B:26:0x0057, B:28:0x0063, B:29:0x006a, B:18:0x003e, B:15:0x0037, B:9:0x0026, B:12:0x002e), top: B:37:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063 A[Catch: NoSuchMethodException -> 0x006b, IllegalAccessException -> 0x0076, NoSuchFieldException -> 0x0081, TryCatch #2 {IllegalAccessException -> 0x0076, NoSuchFieldException -> 0x0081, NoSuchMethodException -> 0x006b, blocks: (B:6:0x0011, B:20:0x0046, B:27:0x0060, B:23:0x004f, B:26:0x0057, B:28:0x0063, B:29:0x006a, B:18:0x003e, B:15:0x0037, B:9:0x0026, B:12:0x002e), top: B:37:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onNavigationEvent() {
        /*
            r4 = this;
            boolean r0 = r4.HaptikSDK$b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "gnoreDrawbblePadding"
            android.util.Log.i(r1, r0)
            boolean r0 = r4.HaptikSDK$b
            if (r0 != 0) goto L10
            return
        L10:
            r0 = 0
            java.lang.Class<com.google.android.material.textfield.TextInputLayout> r1 = com.google.android.material.textfield.TextInputLayout.class
            java.lang.String r2 = "ah$a"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchMethodException -> L6b java.lang.IllegalAccessException -> L76 java.lang.NoSuchFieldException -> L81
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.NoSuchMethodException -> L6b java.lang.IllegalAccessException -> L76 java.lang.NoSuchFieldException -> L81
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.NoSuchMethodException -> L6b java.lang.IllegalAccessException -> L76 java.lang.NoSuchFieldException -> L81
            r4.HaptikSDK$a = r1     // Catch: java.lang.NoSuchMethodException -> L6b java.lang.IllegalAccessException -> L76 java.lang.NoSuchFieldException -> L81
            if (r1 != 0) goto L26
            goto L2c
        L26:
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.NoSuchMethodException -> L6b java.lang.IllegalAccessException -> L76 java.lang.NoSuchFieldException -> L81
            if (r1 != 0) goto L2e
        L2c:
            r1 = r0
            goto L34
        L2e:
            java.lang.String r3 = "collapsedBounds"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch: java.lang.NoSuchMethodException -> L6b java.lang.IllegalAccessException -> L76 java.lang.NoSuchFieldException -> L81
        L34:
            if (r1 != 0) goto L37
            goto L3a
        L37:
            r1.setAccessible(r2)     // Catch: java.lang.NoSuchMethodException -> L6b java.lang.IllegalAccessException -> L76 java.lang.NoSuchFieldException -> L81
        L3a:
            if (r1 != 0) goto L3e
            r1 = r0
            goto L44
        L3e:
            java.lang.Object r2 = r4.HaptikSDK$a     // Catch: java.lang.NoSuchMethodException -> L6b java.lang.IllegalAccessException -> L76 java.lang.NoSuchFieldException -> L81
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.NoSuchMethodException -> L6b java.lang.IllegalAccessException -> L76 java.lang.NoSuchFieldException -> L81
        L44:
            if (r1 == 0) goto L63
            android.graphics.Rect r1 = (android.graphics.Rect) r1     // Catch: java.lang.NoSuchMethodException -> L6b java.lang.IllegalAccessException -> L76 java.lang.NoSuchFieldException -> L81
            r4.HaptikSDK$c = r1     // Catch: java.lang.NoSuchMethodException -> L6b java.lang.IllegalAccessException -> L76 java.lang.NoSuchFieldException -> L81
            java.lang.Object r1 = r4.HaptikSDK$a     // Catch: java.lang.NoSuchMethodException -> L6b java.lang.IllegalAccessException -> L76 java.lang.NoSuchFieldException -> L81
            if (r1 != 0) goto L4f
            goto L55
        L4f:
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.NoSuchMethodException -> L6b java.lang.IllegalAccessException -> L76 java.lang.NoSuchFieldException -> L81
            if (r1 != 0) goto L57
        L55:
            r1 = r0
            goto L60
        L57:
            java.lang.String r2 = "recalculate"
            r3 = 0
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L6b java.lang.IllegalAccessException -> L76 java.lang.NoSuchFieldException -> L81
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.NoSuchMethodException -> L6b java.lang.IllegalAccessException -> L76 java.lang.NoSuchFieldException -> L81
        L60:
            r4.ah$b = r1     // Catch: java.lang.NoSuchMethodException -> L6b java.lang.IllegalAccessException -> L76 java.lang.NoSuchFieldException -> L81
            goto L8b
        L63:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.NoSuchMethodException -> L6b java.lang.IllegalAccessException -> L76 java.lang.NoSuchFieldException -> L81
            java.lang.String r2 = "null cannot be cast to non-null type android.graphics.Rect"
            r1.<init>(r2)     // Catch: java.lang.NoSuchMethodException -> L6b java.lang.IllegalAccessException -> L76 java.lang.NoSuchFieldException -> L81
            throw r1     // Catch: java.lang.NoSuchMethodException -> L6b java.lang.IllegalAccessException -> L76 java.lang.NoSuchFieldException -> L81
        L6b:
            r1 = move-exception
            r4.HaptikSDK$a = r0
            r4.HaptikSDK$c = r0
            r4.ah$b = r0
            r1.printStackTrace()
            goto L8b
        L76:
            r1 = move-exception
            r4.HaptikSDK$a = r0
            r4.HaptikSDK$c = r0
            r4.ah$b = r0
            r1.printStackTrace()
            goto L8b
        L81:
            r1 = move-exception
            r4.HaptikSDK$a = r0
            r4.HaptikSDK$c = r0
            r4.ah$b = r0
            r1.printStackTrace()
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dream11.design.textinput.D11TextInputLayout.onNavigationEvent():void");
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        onMessageChannelReady();
    }

    private final void setDefaultImpl() {
        try {
            String str = this.invoke;
            if (str == null) {
                return;
            }
            resolveShadowDrawables resolveshadowdrawables = resolveShadowDrawables.ag$a;
            Context context = getContext();
            runAnimators.ah$a(context, "context");
            setTypeface(resolveshadowdrawables.values(context, str));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void onMessageChannelReady() {
        if (this.HaptikSDK$a == null) {
            return;
        }
        try {
            Rect rect = this.HaptikSDK$c;
            if (rect != null) {
                EditText invoke = invoke();
                Integer num = null;
                if (invoke != null) {
                    int paddingLeft = invoke.getPaddingLeft();
                    EditText invoke2 = invoke();
                    if (invoke2 != null) {
                        num = Integer.valueOf(invoke2.getLeft() + paddingLeft);
                    }
                }
                rect.left = num.intValue();
            }
            Method method = this.ah$b;
            if (method == null) {
                return;
            }
            method.invoke(this.HaptikSDK$a, new Object[0]);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }

    /* loaded from: classes4.dex */
    public static final class valueOf {
        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }

        private valueOf() {
        }
    }
}
