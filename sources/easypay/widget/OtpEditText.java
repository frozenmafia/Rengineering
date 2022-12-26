package easypay.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.text.TextUtilsCompat;
import androidx.core.view.ViewCompat;
import java.util.Locale;
import o.SidecarCompat;
/* loaded from: classes5.dex */
public class OtpEditText extends AppCompatEditText {
    protected View.OnClickListener HaptikSDK$a;
    protected float HaptikSDK$b;
    protected Paint HaptikSDK$c;
    protected int HaptikSDK$d;
    protected boolean HaptikSDK$e;
    protected Paint HaptikWebView;
    protected StringBuilder ICustomTabsCallback;
    protected float ICustomTabsCallback$Default;
    private boolean ICustomTabsCallback$Stub;
    protected RectF[] a;
    protected boolean ag$a;
    protected float ah$a;
    protected float[] ah$b;
    protected int aj$a;
    protected int ak;
    protected String ak$a;
    protected int ak$b;
    protected float asBinder;
    protected float asInterface;
    protected Paint extraCallback;
    protected View.OnLongClickListener extraCallbackWithResult;
    private float[] getDefaultImpl;
    protected int getInitSettings;
    protected boolean getSignupData;
    protected float invoke;
    protected int isLogoutPending;
    protected int onMessageChannelReady;
    protected valueOf onNavigationEvent;
    protected OtpEditText$ag$a onPostMessage;
    protected ColorStateList onRelationshipValidationResult;
    protected int onXdkEvent;
    protected Rect setDefaultImpl;
    protected Drawable toString;
    protected boolean valueOf;
    protected boolean values;

    /* loaded from: classes5.dex */
    public interface valueOf {
        void ah$a(CharSequence charSequence);
    }

    public OtpEditText(Context context) {
        super(context);
        this.ak$b = 6;
        this.setDefaultImpl = new Rect();
        this.getSignupData = false;
        this.ak$a = null;
        this.ICustomTabsCallback = null;
        this.HaptikSDK$d = 0;
        this.getInitSettings = 0;
        this.invoke = 24.0f;
        this.ah$a = 6.0f;
        this.asInterface = 8.0f;
        this.onNavigationEvent = null;
        this.onPostMessage = null;
        this.asBinder = 1.0f;
        this.ICustomTabsCallback$Default = 2.0f;
        this.valueOf = false;
        this.values = false;
        this.HaptikSDK$e = false;
        this.ag$a = false;
        this.onMessageChannelReady = 0;
        this.ICustomTabsCallback$Stub = true;
    }

    public OtpEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ak$b = 6;
        this.setDefaultImpl = new Rect();
        this.getSignupData = false;
        this.ak$a = null;
        this.ICustomTabsCallback = null;
        this.HaptikSDK$d = 0;
        this.getInitSettings = 0;
        this.invoke = 24.0f;
        this.ah$a = 6.0f;
        this.asInterface = 8.0f;
        this.onNavigationEvent = null;
        this.onPostMessage = null;
        this.asBinder = 1.0f;
        this.ICustomTabsCallback$Default = 2.0f;
        this.valueOf = false;
        this.values = false;
        this.HaptikSDK$e = false;
        this.ag$a = false;
        this.onMessageChannelReady = 0;
        this.ICustomTabsCallback$Stub = true;
        valueOf(context, attributeSet);
    }

    public OtpEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ak$b = 6;
        this.setDefaultImpl = new Rect();
        this.getSignupData = false;
        this.ak$a = null;
        this.ICustomTabsCallback = null;
        this.HaptikSDK$d = 0;
        this.getInitSettings = 0;
        this.invoke = 24.0f;
        this.ah$a = 6.0f;
        this.asInterface = 8.0f;
        this.onNavigationEvent = null;
        this.onPostMessage = null;
        this.asBinder = 1.0f;
        this.ICustomTabsCallback$Default = 2.0f;
        this.valueOf = false;
        this.values = false;
        this.HaptikSDK$e = false;
        this.ag$a = false;
        this.onMessageChannelReady = 0;
        this.ICustomTabsCallback$Stub = true;
        valueOf(context, attributeSet);
    }

    public void setMaxLength(int i) {
        this.ak$b = i;
        float f = i;
        this.ah$a = f;
        this.getDefaultImpl = new float[(int) f];
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        setText((CharSequence) null);
        invalidate();
    }

    public void setActive(boolean z) {
        this.ICustomTabsCallback$Stub = z;
    }

    private void valueOf(Context context, AttributeSet attributeSet) {
        float f = context.getResources().getDisplayMetrics().density;
        this.asBinder *= f;
        this.ICustomTabsCallback$Default *= f;
        this.invoke *= f;
        this.asInterface = f * this.asInterface;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, SidecarCompat.DistinctElementCallback.values.OtpEditText, 0, 0);
        try {
            TypedValue typedValue = new TypedValue();
            obtainStyledAttributes.getValue(SidecarCompat.DistinctElementCallback.values.OtpEditText_otpInputAnimStyle, typedValue);
            this.HaptikSDK$d = typedValue.data;
            obtainStyledAttributes.getValue(SidecarCompat.DistinctElementCallback.values.OtpEditText_otpErrorAnimStyle, typedValue);
            this.getInitSettings = typedValue.data;
            this.asBinder = obtainStyledAttributes.getDimension(SidecarCompat.DistinctElementCallback.values.OtpEditText_otpStrokeLineHeight, this.asBinder);
            this.ICustomTabsCallback$Default = obtainStyledAttributes.getDimension(SidecarCompat.DistinctElementCallback.values.OtpEditText_otpStrokeLineSelectedHeight, this.ICustomTabsCallback$Default);
            this.invoke = obtainStyledAttributes.getDimension(SidecarCompat.DistinctElementCallback.values.OtpEditText_otpCharacterSpacing, this.invoke);
            this.asInterface = obtainStyledAttributes.getDimension(SidecarCompat.DistinctElementCallback.values.OtpEditText_otpTextBottomLinePadding, this.asInterface);
            this.getSignupData = obtainStyledAttributes.getBoolean(SidecarCompat.DistinctElementCallback.values.OtpEditText_otpBackgroundIsSquare, this.getSignupData);
            this.toString = obtainStyledAttributes.getDrawable(SidecarCompat.DistinctElementCallback.values.OtpEditText_otpBackgroundDrawable);
            this.onMessageChannelReady = obtainStyledAttributes.getColor(SidecarCompat.DistinctElementCallback.values.OtpEditText_otpErrorTextColor, -7829368);
            this.ak = obtainStyledAttributes.getColor(SidecarCompat.DistinctElementCallback.values.OtpEditText_otpLineErrorColor, getTextColors().getColorForState(new int[]{16842914}, Color.parseColor("#fd5c5c")));
            this.onXdkEvent = obtainStyledAttributes.getColor(SidecarCompat.DistinctElementCallback.values.OtpEditText_otpLineFocusedColor, getTextColors().getColorForState(new int[]{16842908}, -12303292));
            this.aj$a = obtainStyledAttributes.getColor(SidecarCompat.DistinctElementCallback.values.OtpEditText_otpLineNextCharColor, getTextColors().getColorForState(new int[]{16842908}, -12303292));
            this.isLogoutPending = obtainStyledAttributes.getColor(SidecarCompat.DistinctElementCallback.values.OtpEditText_otpLineUnFocusedColor, getTextColors().getColorForState(new int[]{16842914}, -7829368));
            obtainStyledAttributes.recycle();
            this.HaptikSDK$c = new Paint(getPaint());
            this.HaptikWebView = new Paint(getPaint());
            Paint paint = new Paint(getPaint());
            this.extraCallback = paint;
            paint.setStrokeWidth(this.asBinder);
            setBackgroundResource(0);
            int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLength", 6);
            this.ak$b = attributeIntValue;
            float f2 = attributeIntValue;
            this.ah$a = f2;
            this.getDefaultImpl = new float[(int) f2];
            super.setCustomSelectionActionModeCallback(new ActionMode.Callback() { // from class: easypay.widget.OtpEditText.5
                @Override // android.view.ActionMode.Callback
                public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                    return false;
                }

                @Override // android.view.ActionMode.Callback
                public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                    return false;
                }

                @Override // android.view.ActionMode.Callback
                public void onDestroyActionMode(ActionMode actionMode) {
                }

                @Override // android.view.ActionMode.Callback
                public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                    return false;
                }
            });
            super.setOnClickListener(new View.OnClickListener() { // from class: easypay.widget.OtpEditText.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    OtpEditText otpEditText = OtpEditText.this;
                    otpEditText.setSelection(otpEditText.getText().length());
                    if (OtpEditText.this.HaptikSDK$a != null) {
                        OtpEditText.this.HaptikSDK$a.onClick(view);
                    }
                }
            });
            super.setOnLongClickListener(new View.OnLongClickListener() { // from class: easypay.widget.OtpEditText.3
                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view) {
                    OtpEditText otpEditText = OtpEditText.this;
                    otpEditText.setSelection(otpEditText.getText().length());
                    if (OtpEditText.this.extraCallbackWithResult == null) {
                        return false;
                    }
                    return OtpEditText.this.extraCallbackWithResult.onLongClick(view);
                }
            });
            if ((getInputType() & 128) == 128) {
                this.ak$a = "●";
            } else if ((getInputType() & 16) == 16) {
                this.ak$a = "●";
            }
            if (!TextUtils.isEmpty(this.ak$a)) {
                this.ICustomTabsCallback = ah$a();
            }
            getPaint().getTextBounds("|", 0, 1, this.setDefaultImpl);
            this.valueOf = this.HaptikSDK$d > -1;
            this.values = this.getInitSettings > -1;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int ah$a;
        float f;
        super.onSizeChanged(i, i2, i3, i4);
        ColorStateList textColors = getTextColors();
        this.onRelationshipValidationResult = textColors;
        if (textColors != null) {
            this.HaptikWebView.setColor(textColors.getDefaultColor());
            this.HaptikSDK$c.setColor(this.onRelationshipValidationResult.getDefaultColor());
        }
        int width = (getWidth() - ViewCompat.getPaddingEnd(this)) - ViewCompat.getPaddingStart(this);
        float f2 = this.invoke;
        if (f2 < 0.0f) {
            this.HaptikSDK$b = width / ((this.ah$a * 2.0f) - 1.0f);
        } else {
            float f3 = this.ah$a;
            this.HaptikSDK$b = ((width - (f2 * (f3 - 1.0f))) / f3) + ah$a(2);
        }
        int i5 = (int) this.ah$a;
        this.a = new RectF[i5];
        this.ah$b = new float[i5];
        int height = getHeight();
        int paddingBottom = getPaddingBottom();
        int i6 = 1;
        if (TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            i6 = -1;
            ah$a = (int) ((getWidth() - ViewCompat.getPaddingStart(this)) - this.HaptikSDK$b);
        } else {
            ah$a = ah$a(2) + ViewCompat.getPaddingStart(this);
        }
        for (int i7 = 0; i7 < this.ah$a; i7++) {
            float f4 = ah$a;
            float f5 = height - paddingBottom;
            this.a[i7] = new RectF(f4, f5, this.HaptikSDK$b + f4, f5);
            if (this.toString != null) {
                if (this.getSignupData) {
                    this.a[i7].top = getPaddingTop();
                    RectF[] rectFArr = this.a;
                    rectFArr[i7].right = rectFArr[i7].height() + f4;
                } else {
                    this.a[i7].top -= this.setDefaultImpl.height() + (this.asInterface * 2.0f);
                }
            }
            float f6 = this.invoke;
            if (f6 < 0.0f) {
                f = f4 + (i6 * this.HaptikSDK$b * 2.0f);
            } else {
                f = f4 + (i6 * (this.HaptikSDK$b + f6));
            }
            ah$a = (int) f;
            this.ah$b[i7] = this.a[i7].bottom - this.asInterface;
        }
    }

    private int ah$a(int i) {
        return (int) TypedValue.applyDimension(1, i, getContext().getApplicationContext().getResources().getDisplayMetrics());
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.HaptikSDK$a = onClickListener;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.extraCallbackWithResult = onLongClickListener;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        throw new RuntimeException("setCustomSelectionActionModeCallback() is not allowed.");
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        CharSequence valueOf2 = valueOf();
        int length = valueOf2.length();
        float[] fArr = this.getDefaultImpl;
        if (length > fArr.length) {
            length = fArr.length;
        }
        int i = length;
        getPaint().getTextWidths(valueOf2, 0, i, this.getDefaultImpl);
        int i2 = 0;
        while (i2 < this.ah$a) {
            if (this.toString != null) {
                values(i2 < i, i2 == i);
                this.toString.setBounds((int) this.a[i2].left, (int) this.a[i2].top, (int) this.a[i2].right, (int) this.a[i2].bottom);
                this.toString.draw(canvas);
            }
            float f = this.a[i2].left + (this.HaptikSDK$b / 2.0f);
            if (i > i2) {
                if (!this.valueOf || i2 != i - 1) {
                    canvas.drawText(valueOf2, i2, i2 + 1, f - (this.getDefaultImpl[i2] / 2.0f), this.ah$b[i2], this.HaptikSDK$c);
                } else {
                    canvas.drawText(valueOf2, i2, i2 + 1, f - (this.getDefaultImpl[i2] / 2.0f), this.ah$b[i2], this.HaptikWebView);
                }
            }
            if (this.toString == null) {
                toString(i2, i);
                canvas.drawLine(this.a[i2].left, this.a[i2].top, this.a[i2].right, this.a[i2].bottom, this.extraCallback);
            }
            i2++;
        }
    }

    private CharSequence valueOf() {
        if (this.ak$a == null) {
            return getText();
        }
        return ah$a();
    }

    private StringBuilder ah$a() {
        if (this.ICustomTabsCallback == null) {
            this.ICustomTabsCallback = new StringBuilder();
        }
        int length = getText().length();
        while (this.ICustomTabsCallback.length() != length) {
            if (this.ICustomTabsCallback.length() < length) {
                this.ICustomTabsCallback.append(this.ak$a);
            } else {
                StringBuilder sb = this.ICustomTabsCallback;
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return this.ICustomTabsCallback;
    }

    private void toString(int i, int i2) {
        int i3;
        if (this.HaptikSDK$e) {
            this.extraCallback.setColor(this.ak);
        } else if (isFocused()) {
            this.extraCallback.setStrokeWidth(this.ICustomTabsCallback$Default);
            if (i == i2 || (i2 == (i3 = this.ak$b) && i == i3 - 1 && this.ICustomTabsCallback$Stub)) {
                this.extraCallback.setColor(this.aj$a);
            } else if (i < i2) {
                this.extraCallback.setColor(this.onXdkEvent);
            } else {
                this.extraCallback.setColor(this.isLogoutPending);
            }
        } else {
            this.extraCallback.setStrokeWidth(this.asBinder);
            this.extraCallback.setColor(this.isLogoutPending);
        }
    }

    protected void values(boolean z, boolean z2) {
        if (this.HaptikSDK$e) {
            this.toString.setState(new int[]{16842914});
        } else if (isFocused()) {
            this.toString.setState(new int[]{16842908});
            if (z2) {
                this.toString.setState(new int[]{16842908, 16842913});
            } else if (z) {
                this.toString.setState(new int[]{16842908, 16842912});
            }
        } else {
            this.toString.setState(new int[]{-16842908});
        }
    }

    public void setError(boolean z) {
        this.HaptikSDK$e = z;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        boolean onTextContextMenuItem = super.onTextContextMenuItem(i);
        if (i == 16908322) {
            this.onPostMessage.ag$a();
        }
        return onTextContextMenuItem;
    }

    public void setOnTextChangedListener(OtpEditText$ag$a otpEditText$ag$a) {
        this.onPostMessage = otpEditText$ag$a;
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        setError(false);
        OtpEditText$ag$a otpEditText$ag$a = this.onPostMessage;
        if (otpEditText$ag$a != null) {
            otpEditText$ag$a.valueOf();
        }
        if (this.ag$a || this.HaptikSDK$e) {
            this.ag$a = false;
            this.HaptikSDK$e = false;
            ColorStateList colorStateList = this.onRelationshipValidationResult;
            if (colorStateList != null) {
                this.HaptikWebView.setColor(colorStateList.getDefaultColor());
                this.HaptikSDK$c.setColor(this.onRelationshipValidationResult.getDefaultColor());
            }
        }
        if (this.a == null || !this.valueOf) {
            if (this.onNavigationEvent == null || charSequence.length() != this.ak$b) {
                return;
            }
            this.onNavigationEvent.ah$a(charSequence);
            return;
        }
        int i4 = this.HaptikSDK$d;
        if (i4 == -1) {
            invalidate();
        } else if (i3 > i2) {
            if (i4 == 0) {
                values();
            } else {
                toString(charSequence, i);
            }
        }
    }

    private void values() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, getPaint().getTextSize());
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new OvershootInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: easypay.widget.OtpEditText.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                OtpEditText.this.HaptikWebView.setTextSize(((Float) valueAnimator.getAnimatedValue()).floatValue());
                OtpEditText.this.invalidate();
            }
        });
        if (getText().length() == this.ak$b && this.onNavigationEvent != null) {
            ofFloat.addListener(new Animator.AnimatorListener() { // from class: easypay.widget.OtpEditText.2
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    OtpEditText.this.onNavigationEvent.ah$a(OtpEditText.this.getText());
                }
            });
        }
        ofFloat.start();
    }

    private void toString(CharSequence charSequence, final int i) {
        this.ah$b[i] = this.a[i].bottom - this.asInterface;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.ah$b[i] + getPaint().getTextSize(), this.ah$b[i]);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new OvershootInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: easypay.widget.OtpEditText.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                OtpEditText.this.ah$b[i] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                OtpEditText.this.invalidate();
            }
        });
        this.HaptikWebView.setAlpha(255);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: easypay.widget.OtpEditText.6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                OtpEditText.this.HaptikWebView.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        if (charSequence.length() == this.ak$b && this.onNavigationEvent != null) {
            animatorSet.addListener(new Animator.AnimatorListener() { // from class: easypay.widget.OtpEditText.8
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    OtpEditText.this.onNavigationEvent.ah$a(OtpEditText.this.getText());
                }
            });
        }
        animatorSet.playTogether(ofFloat, ofInt);
        animatorSet.start();
    }

    public void setOnPinEnteredListener(valueOf valueof) {
        this.onNavigationEvent = valueof;
    }

    @Override // android.widget.TextView
    public CharSequence getError() {
        return super.getError();
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence) {
        Log.e("OtpEditText", "setError(CharSequence error) is not supported");
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence, Drawable drawable) {
        Log.e("OtpEditText", "setError(CharSequence error, Drawable icon) is not supported");
    }
}
