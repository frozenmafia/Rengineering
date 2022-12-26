package com.wheelpicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o.EncryptedSharedPreferences;
import o.isReservedKey;
import o.registerOnSharedPreferenceChangeListener;
import o.unregisterOnSharedPreferenceChangeListener;
/* loaded from: classes5.dex */
public class LoopView extends View {
    int HaptikSDK$a;
    int HaptikSDK$b;
    float HaptikSDK$c;
    public int HaptikSDK$d;
    public boolean HaptikSDK$e;
    public EncryptedSharedPreferences.AnonymousClass1 HaptikWebView;
    int ICustomTabsCallback;
    int ICustomTabsCallback$Default;
    private GestureDetector ICustomTabsCallback$Stub;
    ScheduledExecutorService a;
    int ag$a;
    int ah$a;
    public Handler ah$b;
    int aj$a;
    int ak;
    int ak$a;
    Paint ak$b;
    private int asBinder;
    private GestureDetector.SimpleOnGestureListener asInterface;
    Paint extraCallback;
    Paint extraCallbackWithResult;
    private ScheduledFuture<?> getDefaultImpl;
    public float getInitSettings;
    int getSignupData;
    Context invoke;
    int isLogoutPending;
    int onMessageChannelReady;
    public int onNavigationEvent;
    float onPostMessage;
    float onRelationshipValidationResult;
    public int onXdkEvent;
    private Rect setDefaultImpl;
    int toString;
    public ArrayList valueOf;
    int values;

    public LoopView(Context context) {
        super(context);
        this.a = Executors.newSingleThreadScheduledExecutor();
        this.setDefaultImpl = new Rect();
        ah$a(context);
    }

    public LoopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = Executors.newSingleThreadScheduledExecutor();
        this.setDefaultImpl = new Rect();
        ah$a(context);
    }

    public LoopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = Executors.newSingleThreadScheduledExecutor();
        this.setDefaultImpl = new Rect();
        ah$a(context);
    }

    private void ah$a(Context context) {
        this.onMessageChannelReady = 0;
        this.toString = -5263441;
        this.ah$a = -13553359;
        this.values = -3815995;
        this.getInitSettings = 2.0f;
        this.HaptikSDK$e = false;
        this.HaptikSDK$d = 0;
        this.getSignupData = 7;
        this.onRelationshipValidationResult = 0.0f;
        this.onPostMessage = 0.0f;
        this.HaptikSDK$c = 0.0f;
        this.onNavigationEvent = 0;
        this.asInterface = new unregisterOnSharedPreferenceChangeListener(this);
        this.ah$b = new EncryptedSharedPreferences.EncryptedType(this);
        this.invoke = context;
        setTextSize(16.0f);
        Paint paint = new Paint();
        this.extraCallback = paint;
        paint.setColor(this.values);
        Paint paint2 = new Paint();
        this.extraCallbackWithResult = paint2;
        paint2.setTextSize(this.onMessageChannelReady);
        this.ak$b = new Paint();
        this.extraCallback.setTextSize(this.onMessageChannelReady);
        if (Build.VERSION.SDK_INT >= 11) {
            setLayerType(1, null);
        }
        GestureDetector gestureDetector = new GestureDetector(context, this.asInterface);
        this.ICustomTabsCallback$Stub = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
    }

    public static int toString(LoopView loopView) {
        return loopView.asBinder;
    }

    private void values() {
        if (this.valueOf == null) {
            return;
        }
        this.extraCallback.setAntiAlias(true);
        this.extraCallbackWithResult.setAntiAlias(true);
        this.ak$b.setAntiAlias(true);
        this.ak$b.setTypeface(Typeface.MONOSPACE);
        this.ak$b.setTextSize(this.onMessageChannelReady);
        invoke();
        float f = this.onXdkEvent * this.getInitSettings;
        int i = (int) ((this.getSignupData - 1) * f);
        this.HaptikSDK$b = i;
        int i2 = (int) ((i * 2) / 3.141592653589793d);
        this.ak = i2;
        this.ICustomTabsCallback = (int) (i / 3.141592653589793d);
        float f2 = i2;
        this.HaptikSDK$a = (int) ((f2 - f) / 2.0f);
        this.ICustomTabsCallback$Default = (int) ((f2 + f) / 2.0f);
        if (this.HaptikSDK$d == -1) {
            if (this.HaptikSDK$e) {
                this.HaptikSDK$d = (this.valueOf.size() + 1) / 2;
            } else {
                this.HaptikSDK$d = 0;
            }
        }
        this.ak$a = this.HaptikSDK$d;
    }

    private void invoke() {
        Rect rect = new Rect();
        for (int i = 0; i < this.valueOf.size(); i++) {
            String str = (String) this.valueOf.get(i);
            this.extraCallbackWithResult.getTextBounds(str, 0, str.length(), rect);
            int width = rect.width();
            if (width > this.isLogoutPending) {
                this.isLogoutPending = width;
            }
            this.extraCallbackWithResult.getTextBounds("星期", 0, 2, rect);
            int height = rect.height();
            if (height > this.onXdkEvent) {
                this.onXdkEvent = height;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void HaptikSDK$c() {
        ah$a();
        this.getDefaultImpl = this.a.scheduleWithFixedDelay(new EncryptedSharedPreferences.Editor(this, (int) (this.onNavigationEvent % (this.getInitSettings * this.onXdkEvent))), 0L, 10L, TimeUnit.MILLISECONDS);
    }

    public void ah$a() {
        ScheduledFuture<?> scheduledFuture = this.getDefaultImpl;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            return;
        }
        this.getDefaultImpl.cancel(true);
        this.getDefaultImpl = null;
    }

    public final void values(float f) {
        ah$a();
        this.getDefaultImpl = this.a.scheduleWithFixedDelay(new isReservedKey(this, f), 0L, 20, TimeUnit.MILLISECONDS);
    }

    public final void valueOf() {
        if (this.HaptikWebView != null) {
            postDelayed(new registerOnSharedPreferenceChangeListener(this), 200L);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.valueOf == null) {
            super.onDraw(canvas);
            return;
        }
        int height = getHeight();
        int i = this.ak;
        int i2 = ((height - i) / 2) - 2;
        float f = i;
        float f2 = this.onXdkEvent * this.getInitSettings;
        this.HaptikSDK$a = ((int) ((f - f2) / 2.0f)) + i2;
        this.ICustomTabsCallback$Default = ((int) ((f + f2) / 2.0f)) + i2;
        String[] strArr = new String[this.getSignupData];
        int i3 = (int) (this.onNavigationEvent / f2);
        this.ag$a = i3;
        int size = this.HaptikSDK$d + (i3 % this.valueOf.size());
        this.ak$a = size;
        if (!this.HaptikSDK$e) {
            if (size < 0) {
                this.ak$a = 0;
            }
            if (this.ak$a > this.valueOf.size() - 1) {
                this.ak$a = this.valueOf.size() - 1;
            }
        } else {
            if (size < 0) {
                this.ak$a = this.valueOf.size() + this.ak$a;
            }
            if (this.ak$a > this.valueOf.size() - 1) {
                this.ak$a -= this.valueOf.size();
            }
        }
        int i4 = (int) (this.onNavigationEvent % (this.getInitSettings * this.onXdkEvent));
        int i5 = 0;
        while (true) {
            int i6 = this.getSignupData;
            if (i5 >= i6) {
                break;
            }
            int i7 = this.ak$a - ((i6 / 2) - i5);
            if (this.HaptikSDK$e) {
                if (i7 < 0) {
                    i7 += this.valueOf.size();
                }
                if (i7 > this.valueOf.size() - 1) {
                    i7 -= this.valueOf.size();
                }
                strArr[i5] = (String) this.valueOf.get(i7);
            } else if (i7 < 0) {
                strArr[i5] = "";
            } else if (i7 > this.valueOf.size() - 1) {
                strArr[i5] = "";
            } else {
                strArr[i5] = (String) this.valueOf.get(i7);
            }
            i5++;
        }
        float f3 = this.HaptikSDK$a;
        canvas.drawLine(0.0f, f3, this.aj$a, f3, this.ak$b);
        float f4 = this.ICustomTabsCallback$Default;
        canvas.drawLine(0.0f, f4, this.aj$a, f4, this.ak$b);
        for (int i8 = 0; i8 < this.getSignupData; i8++) {
            canvas.save();
            float f5 = this.onXdkEvent * this.getInitSettings;
            double d = (((i8 * f5) - i4) * 3.141592653589793d) / this.HaptikSDK$b;
            float f6 = (float) (90.0d - ((d / 3.141592653589793d) * 180.0d));
            if (f6 >= 90.0f || f6 <= -90.0f) {
                canvas.restore();
            } else {
                int cos = ((int) ((this.ICustomTabsCallback - (Math.cos(d) * this.ICustomTabsCallback)) - ((Math.sin(d) * this.onXdkEvent) / 2.0d))) + i2;
                canvas.translate(0.0f, cos);
                canvas.scale(1.0f, (float) Math.sin(d));
                int i9 = this.HaptikSDK$a;
                if (cos <= i9 && this.onXdkEvent + cos >= i9) {
                    canvas.save();
                    canvas.clipRect(0, 0, this.aj$a, this.HaptikSDK$a - cos);
                    ah$a(canvas, this.extraCallback, strArr[i8], this.onXdkEvent);
                    canvas.restore();
                    canvas.save();
                    canvas.clipRect(0, this.HaptikSDK$a - cos, this.aj$a, (int) f5);
                    ah$a(canvas, this.extraCallbackWithResult, strArr[i8], this.onXdkEvent);
                    canvas.restore();
                } else {
                    int i10 = this.ICustomTabsCallback$Default;
                    if (cos <= i10 && this.onXdkEvent + cos >= i10) {
                        canvas.save();
                        canvas.clipRect(0, 0, this.aj$a, this.ICustomTabsCallback$Default - cos);
                        ah$a(canvas, this.extraCallbackWithResult, strArr[i8], this.onXdkEvent);
                        canvas.restore();
                        canvas.save();
                        canvas.clipRect(0, this.ICustomTabsCallback$Default - cos, this.aj$a, (int) f5);
                        ah$a(canvas, this.extraCallback, strArr[i8], this.onXdkEvent);
                        canvas.restore();
                    } else if (cos >= i9 && this.onXdkEvent + cos <= i10) {
                        canvas.clipRect(0, 0, this.aj$a, (int) f5);
                        ah$a(canvas, this.extraCallbackWithResult, strArr[i8], this.onXdkEvent);
                        this.asBinder = this.valueOf.indexOf(strArr[i8]);
                    } else {
                        canvas.clipRect(0, 0, this.aj$a, (int) f5);
                        ah$a(canvas, this.extraCallback, strArr[i8], this.onXdkEvent);
                    }
                }
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    private void ah$a(Canvas canvas, Paint paint, String str, int i) {
        canvas.getClipBounds(this.setDefaultImpl);
        int width = this.setDefaultImpl.width();
        paint.setTextAlign(Paint.Align.LEFT);
        paint.getTextBounds(str, 0, str.length(), this.setDefaultImpl);
        canvas.drawText(str, ((width / 2.0f) - (this.setDefaultImpl.width() / 2.0f)) - this.setDefaultImpl.left, i, paint);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        values();
        this.aj$a = getMeasuredWidth();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int size;
        int i;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.onRelationshipValidationResult = motionEvent.getRawY();
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (action == 2) {
            float rawY = motionEvent.getRawY();
            this.onPostMessage = rawY;
            float f = this.onRelationshipValidationResult - rawY;
            this.HaptikSDK$c = f;
            this.onRelationshipValidationResult = rawY;
            int i2 = (int) (this.onNavigationEvent + f);
            this.onNavigationEvent = i2;
            if (!this.HaptikSDK$e && i2 < (i = ((int) (this.HaptikSDK$d * this.getInitSettings * this.onXdkEvent)) * (-1))) {
                this.onNavigationEvent = i;
            }
        } else {
            if (!this.ICustomTabsCallback$Stub.onTouchEvent(motionEvent) && motionEvent.getAction() == 1) {
                HaptikSDK$c();
            }
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            return true;
        }
        if (!this.HaptikSDK$e && this.onNavigationEvent >= (size = (int) (((this.valueOf.size() - 1) - this.HaptikSDK$d) * this.getInitSettings * this.onXdkEvent))) {
            this.onNavigationEvent = size;
        }
        invalidate();
        if (!this.ICustomTabsCallback$Stub.onTouchEvent(motionEvent) && motionEvent.getAction() == 1) {
            HaptikSDK$c();
        }
        return true;
    }

    public final void setLoop(boolean z) {
        this.HaptikSDK$e = z;
    }

    public final void setTextSize(float f) {
        if (f > 0.0f) {
            this.onMessageChannelReady = (int) (this.invoke.getResources().getDisplayMetrics().density * f);
        }
    }

    public final void setInitPosition(int i) {
        this.HaptikSDK$d = i;
    }

    public final void setListener(EncryptedSharedPreferences.AnonymousClass1 anonymousClass1) {
        this.HaptikWebView = anonymousClass1;
    }

    public final void setArrayList(ArrayList arrayList) {
        this.valueOf = arrayList;
        values();
        invalidate();
    }

    public final void setSelectedItemTextColor(int i) {
        this.extraCallbackWithResult.setColor(i);
    }

    public final void setSelectedItemTextSize(int i) {
        this.extraCallbackWithResult.setTextSize(i * getResources().getDisplayMetrics().scaledDensity);
    }

    public final void setSelectedItemFont(Typeface typeface) {
        this.extraCallbackWithResult.setTypeface(typeface);
    }

    public final void setItemTextColor(int i) {
        this.extraCallback.setColor(i);
    }

    public final void setItemTextSize(int i) {
        this.extraCallback.setTextSize(i * getResources().getDisplayMetrics().scaledDensity);
    }

    public final void setItemFont(Typeface typeface) {
        this.extraCallback.setTypeface(typeface);
    }

    public final void setIndicatorColor(int i) {
        this.ak$b.setColor(i);
    }

    public final void setIndicatorWidth(int i) {
        this.ak$b.setStrokeWidth(i);
    }

    public final void ag$a() {
        this.ak$b.setColor(0);
    }

    public final void setSelectedItem(int i) {
        this.onNavigationEvent = (int) ((i - this.HaptikSDK$d) * this.getInitSettings * this.onXdkEvent);
        invalidate();
        HaptikSDK$c();
    }
}
