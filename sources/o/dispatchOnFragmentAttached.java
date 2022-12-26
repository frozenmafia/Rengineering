package o;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import o.FragmentLayoutInflaterFactory;
/* loaded from: classes4.dex */
public class dispatchOnFragmentAttached extends loadClass implements onFragmentResult {
    private FragmentLayoutInflaterFactory.AnonymousClass1 valueOf;
    Drawable values;

    @Override // o.loadClass, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return -1;
    }

    @Override // o.loadClass, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return -1;
    }

    public dispatchOnFragmentAttached(Drawable drawable) {
        super(drawable);
        this.values = null;
    }

    @Override // o.onFragmentResult
    public void valueOf(FragmentLayoutInflaterFactory.AnonymousClass1 anonymousClass1) {
        this.valueOf = anonymousClass1;
    }

    @Override // o.loadClass, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        FragmentLayoutInflaterFactory.AnonymousClass1 anonymousClass1 = this.valueOf;
        if (anonymousClass1 != null) {
            anonymousClass1.valueOf(z);
        }
        return super.setVisible(z, z2);
    }

    @Override // o.loadClass, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (isVisible()) {
            FragmentLayoutInflaterFactory.AnonymousClass1 anonymousClass1 = this.valueOf;
            if (anonymousClass1 != null) {
                anonymousClass1.valueOf();
            }
            super.draw(canvas);
            Drawable drawable = this.values;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.values.draw(canvas);
            }
        }
    }

    public void toString(Drawable drawable) {
        this.values = drawable;
        invalidateSelf();
    }
}
