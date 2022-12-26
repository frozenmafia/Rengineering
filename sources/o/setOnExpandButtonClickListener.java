package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.res.ResourcesCompat;
import o.Preference;
import o.PreferenceGroup;
/* loaded from: classes5.dex */
public class setOnExpandButtonClickListener {
    public final ColorStateList HaptikSDK$a;
    public final boolean HaptikSDK$b;
    public final float HaptikSDK$c;
    public final int HaptikSDK$d;
    public final int HaptikSDK$e;
    private Typeface HaptikWebView;
    public final float ag$a;
    public final ColorStateList ah$a;
    public final float ah$b;
    private ColorStateList ak;
    private final int getInitSettings;
    private boolean getSignupData = false;
    public final ColorStateList invoke;
    private float onXdkEvent;
    public final float toString;
    public final boolean valueOf;
    public final String values;

    public setOnExpandButtonClickListener(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, Preference.BaseSavedState.getSignupData.TextAppearance);
        ag$a(obtainStyledAttributes.getDimension(Preference.BaseSavedState.getSignupData.TextAppearance_android_textSize, 0.0f));
        ag$a(PreferenceGroup.AnonymousClass1.ah$a(context, obtainStyledAttributes, Preference.BaseSavedState.getSignupData.TextAppearance_android_textColor));
        this.HaptikSDK$a = PreferenceGroup.AnonymousClass1.ah$a(context, obtainStyledAttributes, Preference.BaseSavedState.getSignupData.TextAppearance_android_textColorHint);
        this.invoke = PreferenceGroup.AnonymousClass1.ah$a(context, obtainStyledAttributes, Preference.BaseSavedState.getSignupData.TextAppearance_android_textColorLink);
        this.HaptikSDK$e = obtainStyledAttributes.getInt(Preference.BaseSavedState.getSignupData.TextAppearance_android_textStyle, 0);
        this.HaptikSDK$d = obtainStyledAttributes.getInt(Preference.BaseSavedState.getSignupData.TextAppearance_android_typeface, 1);
        int valueOf = PreferenceGroup.AnonymousClass1.valueOf(obtainStyledAttributes, Preference.BaseSavedState.getSignupData.TextAppearance_fontFamily, Preference.BaseSavedState.getSignupData.TextAppearance_android_fontFamily);
        this.getInitSettings = obtainStyledAttributes.getResourceId(valueOf, 0);
        this.values = obtainStyledAttributes.getString(valueOf);
        this.HaptikSDK$b = obtainStyledAttributes.getBoolean(Preference.BaseSavedState.getSignupData.TextAppearance_textAllCaps, false);
        this.ah$a = PreferenceGroup.AnonymousClass1.ah$a(context, obtainStyledAttributes, Preference.BaseSavedState.getSignupData.TextAppearance_android_shadowColor);
        this.ag$a = obtainStyledAttributes.getFloat(Preference.BaseSavedState.getSignupData.TextAppearance_android_shadowDx, 0.0f);
        this.ah$b = obtainStyledAttributes.getFloat(Preference.BaseSavedState.getSignupData.TextAppearance_android_shadowDy, 0.0f);
        this.HaptikSDK$c = obtainStyledAttributes.getFloat(Preference.BaseSavedState.getSignupData.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, Preference.BaseSavedState.getSignupData.MaterialTextAppearance);
            this.valueOf = obtainStyledAttributes2.hasValue(Preference.BaseSavedState.getSignupData.MaterialTextAppearance_android_letterSpacing);
            this.toString = obtainStyledAttributes2.getFloat(Preference.BaseSavedState.getSignupData.MaterialTextAppearance_android_letterSpacing, 0.0f);
            obtainStyledAttributes2.recycle();
            return;
        }
        this.valueOf = false;
        this.toString = 0.0f;
    }

    public Typeface valueOf(Context context) {
        if (this.getSignupData) {
            return this.HaptikWebView;
        }
        if (!context.isRestricted()) {
            try {
                Typeface font = androidx.core.content.res.ResourcesCompat.getFont(context, this.getInitSettings);
                this.HaptikWebView = font;
                if (font != null) {
                    this.HaptikWebView = Typeface.create(font, this.HaptikSDK$e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.values, e);
            }
        }
        valueOf();
        this.getSignupData = true;
        return this.HaptikWebView;
    }

    public void toString(Context context, final onExpandButtonClick onexpandbuttonclick) {
        if (toString(context)) {
            valueOf(context);
        } else {
            valueOf();
        }
        int i = this.getInitSettings;
        if (i == 0) {
            this.getSignupData = true;
        }
        if (this.getSignupData) {
            onexpandbuttonclick.ag$a(this.HaptikWebView, true);
            return;
        }
        try {
            androidx.core.content.res.ResourcesCompat.getFont(context, i, new ResourcesCompat.FontCallback() { // from class: o.setOnExpandButtonClickListener.4
                @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                public void onFontRetrieved(Typeface typeface) {
                    setOnExpandButtonClickListener setonexpandbuttonclicklistener = setOnExpandButtonClickListener.this;
                    setonexpandbuttonclicklistener.HaptikWebView = Typeface.create(typeface, setonexpandbuttonclicklistener.HaptikSDK$e);
                    setOnExpandButtonClickListener.this.getSignupData = true;
                    onexpandbuttonclick.ag$a(setOnExpandButtonClickListener.this.HaptikWebView, false);
                }

                @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                public void onFontRetrievalFailed(int i2) {
                    setOnExpandButtonClickListener.this.getSignupData = true;
                    onexpandbuttonclick.ah$a(i2);
                }
            }, null);
        } catch (Resources.NotFoundException unused) {
            this.getSignupData = true;
            onexpandbuttonclick.ah$a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.values, e);
            this.getSignupData = true;
            onexpandbuttonclick.ah$a(-3);
        }
    }

    public void ag$a(Context context, final TextPaint textPaint, final onExpandButtonClick onexpandbuttonclick) {
        ah$a(textPaint, ah$a());
        toString(context, new onExpandButtonClick() { // from class: o.setOnExpandButtonClickListener.3
            @Override // o.onExpandButtonClick
            public void ag$a(Typeface typeface, boolean z) {
                setOnExpandButtonClickListener.this.ah$a(textPaint, typeface);
                onexpandbuttonclick.ag$a(typeface, z);
            }

            @Override // o.onExpandButtonClick
            public void ah$a(int i) {
                onexpandbuttonclick.ah$a(i);
            }
        });
    }

    public Typeface ah$a() {
        valueOf();
        return this.HaptikWebView;
    }

    private void valueOf() {
        String str;
        if (this.HaptikWebView == null && (str = this.values) != null) {
            this.HaptikWebView = Typeface.create(str, this.HaptikSDK$e);
        }
        if (this.HaptikWebView == null) {
            int i = this.HaptikSDK$d;
            if (i == 1) {
                this.HaptikWebView = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.HaptikWebView = Typeface.SERIF;
            } else if (i == 3) {
                this.HaptikWebView = Typeface.MONOSPACE;
            } else {
                this.HaptikWebView = Typeface.DEFAULT;
            }
            this.HaptikWebView = Typeface.create(this.HaptikWebView, this.HaptikSDK$e);
        }
    }

    public void values(Context context, TextPaint textPaint, onExpandButtonClick onexpandbuttonclick) {
        ah$a(context, textPaint, onexpandbuttonclick);
        ColorStateList colorStateList = this.ak;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, this.ak.getDefaultColor()) : androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        float f = this.HaptikSDK$c;
        float f2 = this.ag$a;
        float f3 = this.ah$b;
        ColorStateList colorStateList2 = this.ah$a;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, this.ah$a.getDefaultColor()) : 0);
    }

    public void ah$a(Context context, TextPaint textPaint, onExpandButtonClick onexpandbuttonclick) {
        if (toString(context)) {
            ah$a(textPaint, valueOf(context));
        } else {
            ag$a(context, textPaint, onexpandbuttonclick);
        }
    }

    public void ah$a(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.HaptikSDK$e;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.onXdkEvent);
        if (Build.VERSION.SDK_INT < 21 || !this.valueOf) {
            return;
        }
        textPaint.setLetterSpacing(this.toString);
    }

    public ColorStateList values() {
        return this.ak;
    }

    public void ag$a(ColorStateList colorStateList) {
        this.ak = colorStateList;
    }

    public float ag$a() {
        return this.onXdkEvent;
    }

    public void ag$a(float f) {
        this.onXdkEvent = f;
    }

    private boolean toString(Context context) {
        boolean z;
        z = setOrderingAsAdded.ag$a;
        if (z) {
            return true;
        }
        int i = this.getInitSettings;
        return (i != 0 ? androidx.core.content.res.ResourcesCompat.getCachedFont(context, i) : null) != null;
    }
}
