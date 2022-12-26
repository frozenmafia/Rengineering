package o;

import android.graphics.drawable.Drawable;
/* loaded from: classes4.dex */
public abstract class onProgressUpdateSent {
    private Object ah$a;
    private Drawable toString;
    private float values;

    public onProgressUpdateSent() {
        this.values = 0.0f;
        this.ah$a = null;
        this.toString = null;
    }

    public onProgressUpdateSent(float f) {
        this.values = 0.0f;
        this.ah$a = null;
        this.toString = null;
        this.values = f;
    }

    public onProgressUpdateSent(float f, Object obj) {
        this(f);
        this.ah$a = obj;
    }

    public onProgressUpdateSent(float f, Drawable drawable) {
        this(f);
        this.toString = drawable;
    }

    public float ah$b() {
        return this.values;
    }

    public Drawable HaptikSDK$c() {
        return this.toString;
    }

    public void values(float f) {
        this.values = f;
    }

    public Object HaptikSDK$a() {
        return this.ah$a;
    }

    public void valueOf(Object obj) {
        this.ah$a = obj;
    }
}
