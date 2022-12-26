package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.ArrayList;
import o.PreferenceFragmentCompat;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class PreferenceFragmentCompat$2$ag$a extends ViewGroup {
    static Method toString;
    ArrayList<Drawable> ag$a;
    PreferenceFragmentCompat.AnonymousClass2 ah$a;
    private boolean ah$b;
    ViewGroup valueOf;
    View values;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    static {
        try {
            toString = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", Integer.TYPE, Integer.TYPE, Rect.class);
        } catch (NoSuchMethodException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PreferenceFragmentCompat$2$ag$a(Context context, ViewGroup viewGroup, View view, PreferenceFragmentCompat.AnonymousClass2 anonymousClass2) {
        super(context);
        this.ag$a = null;
        this.valueOf = viewGroup;
        this.values = view;
        setRight(viewGroup.getWidth());
        setBottom(viewGroup.getHeight());
        viewGroup.addView(this);
        this.ah$a = anonymousClass2;
    }

    public void ag$a(Drawable drawable) {
        ah$a();
        if (this.ag$a == null) {
            this.ag$a = new ArrayList<>();
        }
        if (this.ag$a.contains(drawable)) {
            return;
        }
        this.ag$a.add(drawable);
        invalidate(drawable.getBounds());
        drawable.setCallback(this);
    }

    public void values(Drawable drawable) {
        ArrayList<Drawable> arrayList = this.ag$a;
        if (arrayList != null) {
            arrayList.remove(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(null);
            ag$a();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        ArrayList<Drawable> arrayList;
        return super.verifyDrawable(drawable) || ((arrayList = this.ag$a) != null && arrayList.contains(drawable));
    }

    private void ah$a() {
        if (this.ah$b) {
            throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
        }
    }

    private void ag$a() {
        if (getChildCount() == 0) {
            ArrayList<Drawable> arrayList = this.ag$a;
            if (arrayList == null || arrayList.size() == 0) {
                this.ah$b = true;
                this.valueOf.removeView(this);
            }
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidate(drawable.getBounds());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        this.valueOf.getLocationOnScreen(iArr);
        this.values.getLocationOnScreen(iArr2);
        canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
        canvas.clipRect(new Rect(0, 0, this.values.getWidth(), this.values.getHeight()));
        super.dispatchDraw(canvas);
        ArrayList<Drawable> arrayList = this.ag$a;
        int size = arrayList == null ? 0 : arrayList.size();
        for (int i = 0; i < size; i++) {
            this.ag$a.get(i).draw(canvas);
        }
    }

    private void toString(int[] iArr) {
        int[] iArr2 = new int[2];
        int[] iArr3 = new int[2];
        this.valueOf.getLocationOnScreen(iArr2);
        this.values.getLocationOnScreen(iArr3);
        iArr[0] = iArr3[0] - iArr2[0];
        iArr[1] = iArr3[1] - iArr2[1];
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        if (this.valueOf != null) {
            rect.offset(iArr[0], iArr[1]);
            if (this.valueOf != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                toString(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }
        return null;
    }
}
