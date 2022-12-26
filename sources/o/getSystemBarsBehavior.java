package o;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.WindowInsetsControllerCompat;
import o.unregisterListeningView;
@Deprecated
/* loaded from: classes.dex */
public abstract class getSystemBarsBehavior<T extends View, Z> extends navigationBars<Z> {
    private static int ag$a = unregisterListeningView.valueOf.glide_custom_view_target_tag;
    private static boolean values;
    private final valueOf HaptikSDK$b;
    protected final T ah$a;
    private boolean invoke;
    private boolean toString;
    private View.OnAttachStateChangeListener valueOf;

    public getSystemBarsBehavior(T t) {
        this.ah$a = (T) WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(t);
        this.HaptikSDK$b = new valueOf(t);
    }

    @Override // o.navigationBars, o.controlWindowInsetsAnimation
    public void values(Drawable drawable) {
        super.values(drawable);
        HaptikSDK$a();
    }

    private void HaptikSDK$a() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.valueOf;
        if (onAttachStateChangeListener == null || this.toString) {
            return;
        }
        this.ah$a.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.toString = true;
    }

    private void HaptikSDK$c() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.valueOf;
        if (onAttachStateChangeListener == null || !this.toString) {
            return;
        }
        this.ah$a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.toString = false;
    }

    public T values() {
        return this.ah$a;
    }

    @Override // o.controlWindowInsetsAnimation
    public void ag$a(isAppearanceLightNavigationBars isappearancelightnavigationbars) {
        this.HaptikSDK$b.valueOf(isappearancelightnavigationbars);
    }

    @Override // o.controlWindowInsetsAnimation
    public void values(isAppearanceLightNavigationBars isappearancelightnavigationbars) {
        this.HaptikSDK$b.ag$a(isappearancelightnavigationbars);
    }

    @Override // o.navigationBars, o.controlWindowInsetsAnimation
    public void ag$a(Drawable drawable) {
        super.ag$a(drawable);
        this.HaptikSDK$b.values();
        if (this.invoke) {
            return;
        }
        HaptikSDK$c();
    }

    @Override // o.navigationBars, o.controlWindowInsetsAnimation
    public void ah$a(ime imeVar) {
        values(imeVar);
    }

    @Override // o.navigationBars, o.controlWindowInsetsAnimation
    public ime valueOf() {
        Object ah$a = ah$a();
        if (ah$a != null) {
            if (ah$a instanceof ime) {
                return (ime) ah$a;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    public String toString() {
        return "Target for: " + this.ah$a;
    }

    private void values(Object obj) {
        values = true;
        this.ah$a.setTag(ag$a, obj);
    }

    private Object ah$a() {
        return this.ah$a.getTag(ag$a);
    }

    @Deprecated
    public static void toString(int i) {
        if (values) {
            throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
        }
        ag$a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class valueOf {
        static Integer values;
        boolean ag$a;
        private final List<isAppearanceLightNavigationBars> ah$a = new ArrayList();
        private final View toString;
        private toString valueOf;

        private boolean valueOf(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        valueOf(View view) {
            this.toString = view;
        }

        private static int toString(Context context) {
            if (values == null) {
                Display defaultDisplay = ((WindowManager) WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                values = Integer.valueOf(Math.max(point.x, point.y));
            }
            return values.intValue();
        }

        private void valueOf(int i, int i2) {
            Iterator it = new ArrayList(this.ah$a).iterator();
            while (it.hasNext()) {
                ((isAppearanceLightNavigationBars) it.next()).values(i, i2);
            }
        }

        void valueOf() {
            if (this.ah$a.isEmpty()) {
                return;
            }
            int ag$a = ag$a();
            int ah$a = ah$a();
            if (ah$a(ag$a, ah$a)) {
                valueOf(ag$a, ah$a);
                values();
            }
        }

        void valueOf(isAppearanceLightNavigationBars isappearancelightnavigationbars) {
            int ag$a = ag$a();
            int ah$a = ah$a();
            if (ah$a(ag$a, ah$a)) {
                isappearancelightnavigationbars.values(ag$a, ah$a);
                return;
            }
            if (!this.ah$a.contains(isappearancelightnavigationbars)) {
                this.ah$a.add(isappearancelightnavigationbars);
            }
            if (this.valueOf == null) {
                ViewTreeObserver viewTreeObserver = this.toString.getViewTreeObserver();
                toString tostring = new toString(this);
                this.valueOf = tostring;
                viewTreeObserver.addOnPreDrawListener(tostring);
            }
        }

        void ag$a(isAppearanceLightNavigationBars isappearancelightnavigationbars) {
            this.ah$a.remove(isappearancelightnavigationbars);
        }

        void values() {
            ViewTreeObserver viewTreeObserver = this.toString.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.valueOf);
            }
            this.valueOf = null;
            this.ah$a.clear();
        }

        private boolean ah$a(int i, int i2) {
            return valueOf(i) && valueOf(i2);
        }

        private int ah$a() {
            int paddingTop = this.toString.getPaddingTop();
            int paddingBottom = this.toString.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.toString.getLayoutParams();
            return toString(this.toString.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop + paddingBottom);
        }

        private int ag$a() {
            int paddingLeft = this.toString.getPaddingLeft();
            int paddingRight = this.toString.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.toString.getLayoutParams();
            return toString(this.toString.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft + paddingRight);
        }

        private int toString(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.ag$a && this.toString.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.toString.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return toString(this.toString.getContext());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class toString implements ViewTreeObserver.OnPreDrawListener {
            private final WeakReference<valueOf> toString;

            toString(valueOf valueof) {
                this.toString = new WeakReference<>(valueof);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                valueOf valueof = this.toString.get();
                if (valueof != null) {
                    valueof.valueOf();
                    return true;
                }
                return true;
            }
        }
    }
}
