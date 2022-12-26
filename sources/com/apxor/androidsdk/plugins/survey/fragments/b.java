package com.apxor.androidsdk.plugins.survey.fragments;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.google.logging.type.LogSeverity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes6.dex */
public class b extends ViewGroup {
    private static final String f0 = "b";
    static final int[] g0 = {16842931};
    private static final Comparator<e> h0 = new a();
    private static final Interpolator i0 = new animation.InterpolatorC0280b();
    private static final l j0 = new l();
    private int A;
    private int B;
    private float C;
    private float D;
    private float E;
    private float F;
    private int G;
    private VelocityTracker H;
    private int I;
    private int J;
    private int K;
    private int L;
    private boolean M;
    private EdgeEffect N;
    private EdgeEffect O;
    private boolean P;
    private boolean Q;
    private int R;
    private List<h> S;
    private h T;
    private h U;
    private List<g> V;
    private i W;
    private int a;
    private int a0;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<e> f381b;
    private int b0;
    private final e c;
    private ArrayList<View> c0;
    private final Rect d;
    private final Runnable d0;
    com.apxor.androidsdk.plugins.survey.fragments.f e;
    private int e0;
    int f;
    private int g;
    private Parcelable h;
    private ClassLoader i;
    private Scroller j;
    private boolean k;
    private j l;
    private int m;
    private Drawable n;

    /* renamed from: o  reason: collision with root package name */
    private int f382o;
    private int p;
    private float q;
    private float r;
    private int s;
    private boolean t;
    private boolean u;
    private boolean v;
    private int w;
    private boolean x;
    private boolean y;
    private int z;

    /* loaded from: classes6.dex */
    class a implements Comparator<e> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(e eVar, e eVar2) {
            return eVar.f384b - eVar2.f384b;
        }
    }

    /* renamed from: com.apxor.androidsdk.plugins.survey.fragments.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    class animation.InterpolatorC0280b implements Interpolator {
        animation.InterpolatorC0280b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* loaded from: classes6.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.setScrollState(0);
            b.this.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class d implements View.OnApplyWindowInsetsListener {
        private final Rect a = new Rect();

        d() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
            if (Build.VERSION.SDK_INT < 21 || !onApplyWindowInsets.isConsumed()) {
                Rect rect = this.a;
                rect.left = onApplyWindowInsets.getSystemWindowInsetLeft();
                rect.top = onApplyWindowInsets.getSystemWindowInsetTop();
                rect.right = onApplyWindowInsets.getSystemWindowInsetRight();
                rect.bottom = onApplyWindowInsets.getSystemWindowInsetBottom();
                int childCount = b.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    WindowInsets onApplyWindowInsets2 = b.this.getChildAt(i).onApplyWindowInsets(onApplyWindowInsets);
                    rect.left = Math.min(Build.VERSION.SDK_INT >= 21 ? onApplyWindowInsets2.getSystemWindowInsetLeft() : 0, rect.left);
                    rect.top = Math.min(Build.VERSION.SDK_INT >= 21 ? onApplyWindowInsets2.getSystemWindowInsetTop() : 0, rect.top);
                    rect.right = Math.min(Build.VERSION.SDK_INT >= 21 ? onApplyWindowInsets2.getSystemWindowInsetRight() : 0, rect.right);
                    rect.bottom = Math.min(Build.VERSION.SDK_INT >= 21 ? onApplyWindowInsets2.getSystemWindowInsetBottom() : 0, rect.bottom);
                }
                return onApplyWindowInsets.replaceSystemWindowInsets(rect.left, rect.top, rect.right, rect.bottom);
            }
            return onApplyWindowInsets;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class e {
        Object a;

        /* renamed from: b  reason: collision with root package name */
        int f384b;
        boolean c;
        float d;
        float e;

        e() {
        }
    }

    /* loaded from: classes6.dex */
    public static class f extends ViewGroup.LayoutParams {
        public boolean a;

        /* renamed from: b  reason: collision with root package name */
        public int f385b;
        float c;
        boolean d;
        int e;
        int f;

        public f() {
            super(-1, -1);
            this.c = 0.0f;
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.g0);
            this.f385b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes6.dex */
    public interface g {
        void a(b bVar, com.apxor.androidsdk.plugins.survey.fragments.f fVar, com.apxor.androidsdk.plugins.survey.fragments.f fVar2);
    }

    /* loaded from: classes6.dex */
    public interface h {
        void a(int i);

        void a(int i, float f, int i2);

        void b(int i);
    }

    /* loaded from: classes6.dex */
    public interface i {
        void a(View view, float f);
    }

    /* loaded from: classes6.dex */
    class j extends DataSetObserver {
        j() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            b.this.a();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            b.this.a();
        }
    }

    /* loaded from: classes6.dex */
    public static class k extends com.apxor.androidsdk.plugins.survey.fragments.a {
        public static final Parcelable.Creator<k> CREATOR = new a();
        int c;
        Parcelable d;
        ClassLoader e;

        /* loaded from: classes6.dex */
        class a implements Parcelable.ClassLoaderCreator<k> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: a */
            public k createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new k(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public k[] newArray(int i) {
                return new k[i];
            }
        }

        k(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? k.class.getClassLoader() : classLoader;
            this.c = parcel.readInt();
            this.d = parcel.readParcelable(classLoader);
            this.e = classLoader;
        }

        public k(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.c + "}";
        }

        @Override // com.apxor.androidsdk.plugins.survey.fragments.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeParcelable(this.d, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class l implements Comparator<View> {
        l() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            f fVar = (f) view.getLayoutParams();
            f fVar2 = (f) view2.getLayoutParams();
            boolean z = fVar.a;
            return z != fVar2.a ? z ? 1 : -1 : fVar.e - fVar2.e;
        }
    }

    public b(Context context) {
        super(context);
        this.f381b = new ArrayList<>();
        this.c = new e();
        this.d = new Rect();
        this.g = -1;
        this.h = null;
        this.i = null;
        this.q = -3.4028235E38f;
        this.r = Float.MAX_VALUE;
        this.w = 1;
        this.G = -1;
        this.P = true;
        this.d0 = new c();
        this.e0 = 0;
        d();
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f381b = new ArrayList<>();
        this.c = new e();
        this.d = new Rect();
        this.g = -1;
        this.h = null;
        this.i = null;
        this.q = -3.4028235E38f;
        this.r = Float.MAX_VALUE;
        this.w = 1;
        this.G = -1;
        this.P = true;
        this.d0 = new c();
        this.e0 = 0;
        d();
    }

    private int a(int i2, float f2, int i3, int i4) {
        if (Math.abs(i4) <= this.K || Math.abs(i3) <= this.I) {
            i2 += (int) (f2 + (i2 >= this.f ? 0.4f : 0.6f));
        } else if (i3 <= 0) {
            i2++;
        }
        if (this.f381b.size() > 0) {
            ArrayList<e> arrayList = this.f381b;
            return Math.max(this.f381b.get(0).f384b, Math.min(i2, arrayList.get(arrayList.size() - 1).f384b));
        }
        return i2;
    }

    private Rect a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private void a(int i2, float f2, int i3) {
        h hVar = this.T;
        if (hVar != null) {
            hVar.a(i2, f2, i3);
        }
        List<h> list = this.S;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                h hVar2 = this.S.get(i4);
                if (hVar2 != null) {
                    hVar2.a(i2, f2, i3);
                }
            }
        }
        h hVar3 = this.U;
        if (hVar3 != null) {
            hVar3.a(i2, f2, i3);
        }
    }

    private void a(int i2, int i3, int i4, int i5) {
        int min;
        if (i3 <= 0 || this.f381b.isEmpty()) {
            e d2 = d(this.f);
            min = (int) ((d2 != null ? Math.min(d2.e, this.r) : 0.0f) * ((i2 - getPaddingLeft()) - getPaddingRight()));
            if (min == getScrollX()) {
                return;
            }
            a(false);
        } else if (!this.j.isFinished()) {
            this.j.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            min = (int) ((getScrollX() / (((i3 - getPaddingLeft()) - getPaddingRight()) + i5)) * (((i2 - paddingLeft) - paddingRight) + i4));
        }
        scrollTo(min, getScrollY());
    }

    private void a(int i2, boolean z, int i3, boolean z2) {
        e d2 = d(i2);
        int clientWidth = d2 != null ? (int) (getClientWidth() * Math.max(this.q, Math.min(d2.e, this.r))) : 0;
        if (z) {
            a(clientWidth, 0, i3);
            if (z2) {
                b(i2);
                return;
            }
            return;
        }
        if (z2) {
            b(i2);
        }
        a(false);
        scrollTo(clientWidth, 0);
        e(clientWidth);
    }

    private void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.G) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.C = motionEvent.getX(i2);
            this.G = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.H;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void a(e eVar, int i2, e eVar2) {
        int i3;
        int i4;
        e eVar3;
        e eVar4;
        int a2 = this.e.a();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? this.m / clientWidth : 0.0f;
        if (eVar2 != null) {
            int i5 = eVar2.f384b;
            int i6 = eVar.f384b;
            if (i5 < i6) {
                int i7 = 0;
                float f3 = eVar2.e + eVar2.d + f2;
                while (true) {
                    i5++;
                    if (i5 > eVar.f384b || i7 >= this.f381b.size()) {
                        break;
                    }
                    while (true) {
                        eVar4 = this.f381b.get(i7);
                        if (i5 <= eVar4.f384b || i7 >= this.f381b.size() - 1) {
                            break;
                        }
                        i7++;
                    }
                    while (i5 < eVar4.f384b) {
                        f3 += this.e.a(i5) + f2;
                        i5++;
                    }
                    eVar4.e = f3;
                    f3 += eVar4.d + f2;
                }
            } else if (i5 > i6) {
                int size = this.f381b.size() - 1;
                float f4 = eVar2.e;
                while (true) {
                    i5--;
                    if (i5 < eVar.f384b || size < 0) {
                        break;
                    }
                    while (true) {
                        eVar3 = this.f381b.get(size);
                        if (i5 >= eVar3.f384b || size <= 0) {
                            break;
                        }
                        size--;
                    }
                    while (i5 > eVar3.f384b) {
                        f4 -= this.e.a(i5) + f2;
                        i5--;
                    }
                    f4 -= eVar3.d + f2;
                    eVar3.e = f4;
                }
            }
        }
        int size2 = this.f381b.size();
        float f5 = eVar.e;
        int i8 = eVar.f384b;
        int i9 = i8 - 1;
        this.q = i8 == 0 ? f5 : -3.4028235E38f;
        int i10 = a2 - 1;
        this.r = eVar.f384b == i10 ? (eVar.e + eVar.d) - 1.0f : Float.MAX_VALUE;
        int i11 = i2 - 1;
        while (i11 >= 0) {
            e eVar5 = this.f381b.get(i11);
            while (true) {
                i4 = eVar5.f384b;
                if (i9 <= i4) {
                    break;
                }
                f5 -= this.e.a(i9) + f2;
                i9--;
            }
            f5 -= eVar5.d + f2;
            eVar5.e = f5;
            if (i4 == 0) {
                this.q = f5;
            }
            i11--;
            i9--;
        }
        float f6 = eVar.e + eVar.d + f2;
        int i12 = eVar.f384b + 1;
        int i13 = i2 + 1;
        while (i13 < size2) {
            e eVar6 = this.f381b.get(i13);
            while (true) {
                i3 = eVar6.f384b;
                if (i12 >= i3) {
                    break;
                }
                f6 += this.e.a(i12) + f2;
                i12++;
            }
            if (i3 == i10) {
                this.r = (eVar6.d + f6) - 1.0f;
            }
            eVar6.e = f6;
            f6 += eVar6.d + f2;
            i13++;
            i12++;
        }
    }

    private void a(boolean z) {
        boolean z2 = this.e0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.j.isFinished()) {
                this.j.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.j.getCurrX();
                int currY = this.j.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        e(currX);
                    }
                }
            }
        }
        this.v = false;
        for (int i2 = 0; i2 < this.f381b.size(); i2++) {
            e eVar = this.f381b.get(i2);
            if (eVar.c) {
                eVar.c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                postOnAnimation(this.d0);
            } else {
                this.d0.run();
            }
        }
    }

    private boolean a(float f2, float f3) {
        return (f2 < ((float) this.A) && f3 > 0.0f) || (f2 > ((float) (getWidth() - this.A)) && f3 < 0.0f);
    }

    private void b() {
        this.x = false;
        this.y = false;
        VelocityTracker velocityTracker = this.H;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.H = null;
        }
    }

    private void b(int i2) {
        h hVar = this.T;
        if (hVar != null) {
            hVar.b(i2);
        }
        List<h> list = this.S;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                h hVar2 = this.S.get(i3);
                if (hVar2 != null) {
                    hVar2.b(i2);
                }
            }
        }
        h hVar3 = this.U;
        if (hVar3 != null) {
            hVar3.b(i2);
        }
    }

    private void b(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).setLayerType(z ? this.a0 : 0, null);
        }
    }

    private boolean b(float f2) {
        boolean z;
        boolean z2;
        float f3 = this.C;
        this.C = f2;
        float scrollX = getScrollX() + (f3 - f2);
        float clientWidth = getClientWidth();
        float f4 = this.q * clientWidth;
        float f5 = this.r * clientWidth;
        boolean z3 = false;
        e eVar = this.f381b.get(0);
        ArrayList<e> arrayList = this.f381b;
        e eVar2 = arrayList.get(arrayList.size() - 1);
        if (eVar.f384b != 0) {
            f4 = eVar.e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (eVar2.f384b != this.e.a() - 1) {
            f5 = eVar2.e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f4) {
            if (z) {
                this.N.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z2) {
                this.O.onPull(Math.abs(scrollX - f5) / clientWidth);
                scrollX = f5;
                z3 = true;
            } else {
                scrollX = f5;
            }
        }
        int i2 = (int) scrollX;
        this.C += scrollX - i2;
        scrollTo(i2, getScrollY());
        e(i2);
        return z3;
    }

    private e c() {
        int i2;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f3 = clientWidth > 0 ? this.m / clientWidth : 0.0f;
        e eVar = null;
        float f4 = 0.0f;
        int i3 = -1;
        int i4 = 0;
        boolean z = true;
        while (i4 < this.f381b.size()) {
            e eVar2 = this.f381b.get(i4);
            if (!z && eVar2.f384b != (i2 = i3 + 1)) {
                eVar2 = this.c;
                eVar2.e = f2 + f4 + f3;
                eVar2.f384b = i2;
                eVar2.d = this.e.a(i2);
                i4--;
            }
            f2 = eVar2.e;
            float f5 = eVar2.d;
            if (!z && scrollX < f2) {
                return eVar;
            }
            if (scrollX < f5 + f2 + f3 || i4 == this.f381b.size() - 1) {
                return eVar2;
            }
            i3 = eVar2.f384b;
            f4 = eVar2.d;
            i4++;
            eVar = eVar2;
            z = false;
        }
        return eVar;
    }

    private void c(int i2) {
        h hVar = this.T;
        if (hVar != null) {
            hVar.a(i2);
        }
        List<h> list = this.S;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                h hVar2 = this.S.get(i3);
                if (hVar2 != null) {
                    hVar2.a(i2);
                }
            }
        }
        h hVar3 = this.U;
        if (hVar3 != null) {
            hVar3.a(i2);
        }
    }

    private void c(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private static boolean c(View view) {
        return false;
    }

    private boolean e(int i2) {
        if (this.f381b.size() == 0) {
            if (this.P) {
                return false;
            }
            this.Q = false;
            b(0, 0.0f, 0);
            if (this.Q) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        e c2 = c();
        int clientWidth = getClientWidth();
        int i3 = this.m;
        float f2 = clientWidth;
        int i4 = c2.f384b;
        float f3 = ((i2 / f2) - c2.e) / (c2.d + (i3 / f2));
        this.Q = false;
        b(i4, f3, (int) ((clientWidth + i3) * f3));
        if (this.Q) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void h() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((f) getChildAt(i2).getLayoutParams()).a) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    private boolean i() {
        this.G = -1;
        b();
        this.N.onRelease();
        this.O.onRelease();
        return this.N.isFinished() || this.O.isFinished();
    }

    private void j() {
        if (this.b0 != 0) {
            ArrayList<View> arrayList = this.c0;
            if (arrayList == null) {
                this.c0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.c0.add(getChildAt(i2));
            }
            Collections.sort(this.c0, j0);
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.u != z) {
            this.u = z;
        }
    }

    float a(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    e a(int i2, int i3) {
        e eVar = new e();
        eVar.f384b = i2;
        eVar.a = this.e.a(this, i2);
        eVar.d = this.e.a(i2);
        if (i3 < 0 || i3 >= this.f381b.size()) {
            this.f381b.add(eVar);
        } else {
            this.f381b.add(i3, eVar);
        }
        return eVar;
    }

    e a(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return b(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    void a() {
        int a2 = this.e.a();
        this.a = a2;
        boolean z = this.f381b.size() < (this.w * 2) + 1 && this.f381b.size() < a2;
        int i2 = this.f;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < this.f381b.size()) {
            e eVar = this.f381b.get(i3);
            int a3 = this.e.a(eVar.a);
            if (a3 != -1) {
                if (a3 == -2) {
                    this.f381b.remove(i3);
                    i3--;
                    if (!z2) {
                        this.e.b((ViewGroup) this);
                        z2 = true;
                    }
                    this.e.a((ViewGroup) this, eVar.f384b, eVar.a);
                    int i4 = this.f;
                    if (i4 == eVar.f384b) {
                        i2 = Math.max(0, Math.min(i4, a2 - 1));
                    }
                } else {
                    int i5 = eVar.f384b;
                    if (i5 != a3) {
                        if (i5 == this.f) {
                            i2 = a3;
                        }
                        eVar.f384b = a3;
                    }
                }
                z = true;
            }
            i3++;
        }
        if (z2) {
            this.e.a((ViewGroup) this);
        }
        Collections.sort(this.f381b, h0);
        if (z) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                f fVar = (f) getChildAt(i6).getLayoutParams();
                if (!fVar.a) {
                    fVar.c = 0.0f;
                }
            }
            a(i2, false, true);
            requestLayout();
        }
    }

    void a(int i2, int i3, int i4) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.j;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.k ? this.j.getCurrX() : this.j.getStartX();
            this.j.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i5 = scrollX;
        int scrollY = getScrollY();
        int i6 = i2 - i5;
        int i7 = i3 - scrollY;
        if (i6 == 0 && i7 == 0) {
            a(false);
            g();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i8 = clientWidth / 2;
        float f2 = clientWidth;
        float f3 = i8;
        float a2 = a(Math.min(1.0f, (Math.abs(i6) * 1.0f) / f2));
        int abs = Math.abs(i4);
        int min = Math.min(abs > 0 ? Math.round(Math.abs((f3 + (a2 * f3)) / abs) * 1000.0f) * 4 : (int) (((Math.abs(i6) / ((f2 * this.e.a(this.f)) + this.m)) + 1.0f) * 100.0f), (int) LogSeverity.CRITICAL_VALUE);
        this.k = false;
        this.j.startScroll(i5, scrollY, i6, i7, min);
        postInvalidateOnAnimation();
    }

    public void a(int i2, boolean z) {
        this.v = false;
        a(i2, z, false);
    }

    void a(int i2, boolean z, boolean z2) {
        a(i2, z, z2, 0);
    }

    void a(int i2, boolean z, boolean z2, int i3) {
        com.apxor.androidsdk.plugins.survey.fragments.f fVar = this.e;
        if (fVar == null || fVar.a() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f != i2 || this.f381b.size() == 0) {
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 >= this.e.a()) {
                i2 = this.e.a() - 1;
            }
            int i4 = this.w;
            int i5 = this.f;
            if (i2 > i5 + i4 || i2 < i5 - i4) {
                for (int i6 = 0; i6 < this.f381b.size(); i6++) {
                    this.f381b.get(i6).c = true;
                }
            }
            boolean z3 = this.f != i2;
            if (!this.P) {
                f(i2);
                a(i2, z, i3, z3);
                return;
            }
            this.f = i2;
            if (z3) {
                b(i2);
            }
            requestLayout();
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    public void a(h hVar) {
        if (this.S == null) {
            this.S = new ArrayList();
        }
        this.S.add(hVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
        if (r1 >= r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
        if (r1 <= r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b2, code lost:
        if (r7 != 2) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            if (r0 != r6) goto L9
            goto L66
        L9:
            if (r0 == 0) goto L67
            android.view.ViewParent r3 = r0.getParent()
        Lf:
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L1c
            if (r3 != r6) goto L17
            r3 = 1
            goto L1d
        L17:
            android.view.ViewParent r3 = r3.getParent()
            goto Lf
        L1c:
            r3 = 0
        L1d:
            if (r3 != 0) goto L67
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            android.view.ViewParent r0 = r0.getParent()
        L33:
            boolean r4 = r0 instanceof android.view.ViewGroup
            if (r4 == 0) goto L4c
            java.lang.String r4 = " => "
            r3.append(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            android.view.ViewParent r0 = r0.getParent()
            goto L33
        L4c:
            java.lang.String r0 = com.apxor.androidsdk.plugins.survey.fragments.b.f0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "arrowScroll tried to find focus based on non-child current focused view "
            r4.append(r5)
            java.lang.String r3 = r3.toString()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.e(r0, r3)
        L66:
            r0 = 0
        L67:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto Laa
            if (r3 == r0) goto Laa
            if (r7 != r5) goto L8e
            android.graphics.Rect r1 = r6.d
            android.graphics.Rect r1 = r6.a(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.d
            android.graphics.Rect r2 = r6.a(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto La5
            if (r1 < r2) goto La5
            goto Lb9
        L8e:
            if (r7 != r4) goto Lbd
            android.graphics.Rect r1 = r6.d
            android.graphics.Rect r1 = r6.a(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.d
            android.graphics.Rect r2 = r6.a(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto La5
            if (r1 > r2) goto La5
            goto Lb4
        La5:
            boolean r2 = r3.requestFocus()
            goto Lbd
        Laa:
            if (r7 == r5) goto Lb9
            if (r7 != r1) goto Laf
            goto Lb9
        Laf:
            if (r7 == r4) goto Lb4
            r0 = 2
            if (r7 != r0) goto Lbd
        Lb4:
            boolean r2 = r6.f()
            goto Lbd
        Lb9:
            boolean r2 = r6.e()
        Lbd:
            if (r2 == 0) goto Lc6
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        Lc6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.plugins.survey.fragments.b.a(int):boolean");
    }

    public boolean a(KeyEvent keyEvent) {
        int i2;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return a(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return a(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return f();
                } else {
                    i2 = 66;
                }
            } else if (keyEvent.hasModifiers(2)) {
                return e();
            } else {
                i2 = 17;
            }
            return a(i2);
        }
        return false;
    }

    protected boolean a(View view, boolean z, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && a(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        e b2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (b2 = b(childAt)) != null && b2.f384b == this.f) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if (((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        e b2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (b2 = b(childAt)) != null && b2.f384b == this.f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        f fVar = (f) layoutParams;
        boolean c2 = fVar.a | c(view);
        fVar.a = c2;
        if (!this.t) {
            super.addView(view, i2, layoutParams);
        } else if (fVar != null && c2) {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        } else {
            fVar.d = true;
            addViewInLayout(view, i2, layoutParams);
        }
    }

    e b(View view) {
        for (int i2 = 0; i2 < this.f381b.size(); i2++) {
            e eVar = this.f381b.get(i2);
            if (this.e.a(view, eVar.a)) {
                return eVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void b(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.R
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            com.apxor.androidsdk.plugins.survey.fragments.b$f r9 = (com.apxor.androidsdk.plugins.survey.fragments.b.f) r9
            boolean r10 = r9.a
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.f385b
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            r12.a(r13, r14, r15)
            com.apxor.androidsdk.plugins.survey.fragments.b$i r13 = r12.W
            if (r13 == 0) goto L9f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            com.apxor.androidsdk.plugins.survey.fragments.b$f r0 = (com.apxor.androidsdk.plugins.survey.fragments.b.f) r0
            boolean r0 = r0.a
            if (r0 == 0) goto L8b
            goto L9c
        L8b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            com.apxor.androidsdk.plugins.survey.fragments.b$i r3 = r12.W
            r3.a(r15, r0)
        L9c:
            int r1 = r1 + 1
            goto L7a
        L9f:
            r12.Q = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.plugins.survey.fragments.b.b(int, float, int):void");
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        if (this.e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i2 < 0 ? scrollX > ((int) (((float) clientWidth) * this.q)) : i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.r));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.k = true;
        if (this.j.isFinished() || !this.j.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.j.getCurrX();
        int currY = this.j.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!e(currX)) {
                this.j.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    e d(int i2) {
        for (int i3 = 0; i3 < this.f381b.size(); i3++) {
            e eVar = this.f381b.get(i3);
            if (eVar.f384b == i2) {
                return eVar;
            }
        }
        return null;
    }

    void d() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.j = new Scroller(context, i0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.B = viewConfiguration.getScaledPagingTouchSlop();
        this.I = (int) (400.0f * f2);
        this.J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.N = new EdgeEffect(context);
        this.O = new EdgeEffect(context);
        this.K = (int) (25.0f * f2);
        this.L = (int) (2.0f * f2);
        this.z = (int) (f2 * 16.0f);
        if (Build.VERSION.SDK_INT >= 20) {
            setOnApplyWindowInsetsListener(new d());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || a(keyEvent);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        com.apxor.androidsdk.plugins.survey.fragments.f fVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (fVar = this.e) != null && fVar.a() > 1)) {
            if (!this.N.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.q * width);
                this.N.setSize(height, width);
                z = false | this.N.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.O.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.r + 1.0f)) * width2);
                this.O.setSize((height2 - paddingTop) - paddingBottom, width2);
                z |= this.O.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.N.finish();
            this.O.finish();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.n;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    boolean e() {
        int i2 = this.f;
        if (i2 > 0) {
            a(i2 - 1, true);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        if (r9 == r10) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c0, code lost:
        if (r10 >= 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ce, code lost:
        if (r10 >= 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00dc, code lost:
        if (r10 >= 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00de, code lost:
        r11 = r17.f381b.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e8, code lost:
        r11 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void f(int r18) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.plugins.survey.fragments.b.f(int):void");
    }

    boolean f() {
        com.apxor.androidsdk.plugins.survey.fragments.f fVar = this.e;
        if (fVar == null || this.f >= fVar.a() - 1) {
            return false;
        }
        a(this.f + 1, true);
        return true;
    }

    void g() {
        f(this.f);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public com.apxor.androidsdk.plugins.survey.fragments.f getAdapter() {
        return this.e;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        if (this.b0 == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((f) this.c0.get(i3).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.f;
    }

    public int getOffscreenPageLimit() {
        return this.w;
    }

    public int getPageMargin() {
        return this.m;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.d0);
        Scroller scroller = this.j;
        if (scroller != null && !scroller.isFinished()) {
            this.j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.m <= 0 || this.n == null || this.f381b.size() <= 0 || this.e == null) {
            return;
        }
        int scrollX = getScrollX();
        float width2 = getWidth();
        float f4 = this.m / width2;
        int i2 = 0;
        e eVar = this.f381b.get(0);
        float f5 = eVar.e;
        int size = this.f381b.size();
        int i3 = eVar.f384b;
        int i4 = this.f381b.get(size - 1).f384b;
        while (i3 < i4) {
            while (i3 > eVar.f384b && i2 < size) {
                i2++;
                eVar = this.f381b.get(i2);
            }
            if (i3 == eVar.f384b) {
                float f6 = eVar.e + eVar.d;
                f2 = f6 * width2;
                f5 = f6 + f4;
            } else {
                float a2 = this.e.a(i3);
                float f7 = a2 + f4 + f5;
                f2 = (f5 + a2) * width2;
                f5 = f7;
            }
            if (this.m + f2 > scrollX) {
                f3 = f4;
                this.n.setBounds(Math.round(f2), this.f382o, Math.round(this.m + f2), this.p);
                this.n.draw(canvas);
            } else {
                f3 = f4;
            }
            if (f2 > scrollX + width) {
                return;
            }
            i3++;
            f4 = f3;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            i();
            return false;
        }
        if (action != 0) {
            if (this.x) {
                return true;
            }
            if (this.y) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.E = x;
            this.C = x;
            float y = motionEvent.getY();
            this.F = y;
            this.D = y;
            this.G = motionEvent.getPointerId(0);
            this.y = false;
            this.k = true;
            this.j.computeScrollOffset();
            if (this.e0 != 2 || Math.abs(this.j.getFinalX() - this.j.getCurrX()) <= this.L) {
                a(false);
                this.x = false;
            } else {
                this.j.abortAnimation();
                this.v = false;
                g();
                this.x = true;
                c(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.G;
            if (i2 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i2);
                float x2 = motionEvent.getX(findPointerIndex);
                float f2 = x2 - this.C;
                float abs = Math.abs(f2);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.F);
                int i3 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                if (i3 != 0 && !a(this.C, f2) && a(this, false, (int) f2, (int) x2, (int) y2)) {
                    this.C = x2;
                    this.D = y2;
                    this.y = true;
                    return false;
                }
                float f3 = this.B;
                if (abs > f3 && abs * 0.5f > abs2) {
                    this.x = true;
                    c(true);
                    setScrollState(1);
                    float f4 = this.E;
                    float f5 = this.B;
                    this.C = i3 > 0 ? f4 + f5 : f4 - f5;
                    this.D = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > f3) {
                    this.y = true;
                }
                if (this.x && b(x2)) {
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            a(motionEvent);
        }
        if (this.H == null) {
            this.H = VelocityTracker.obtain();
        }
        this.H.addMovement(motionEvent);
        return this.x;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean z2;
        e b2;
        int max;
        int max2;
        int i6;
        int childCount = getChildCount();
        int i7 = i4 - i2;
        int i8 = i5 - i3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a) {
                    int i11 = fVar.f385b;
                    int i12 = i11 & 7;
                    int i13 = i11 & 112;
                    if (i12 == 1) {
                        max = Math.max((i7 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else if (i12 == 3) {
                        max = paddingLeft;
                        paddingLeft = childAt.getMeasuredWidth() + paddingLeft;
                    } else if (i12 != 5) {
                        max = paddingLeft;
                    } else {
                        max = (i7 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                    }
                    if (i13 != 16) {
                        if (i13 == 48) {
                            i6 = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i13 != 80) {
                            i6 = paddingTop;
                        } else {
                            max2 = (i8 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i14 = max + scrollX;
                        childAt.layout(i14, paddingTop, childAt.getMeasuredWidth() + i14, paddingTop + childAt.getMeasuredHeight());
                        i9++;
                        paddingTop = i6;
                    } else {
                        max2 = Math.max((i8 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i15 = max2;
                    i6 = paddingTop;
                    paddingTop = i15;
                    int i142 = max + scrollX;
                    childAt.layout(i142, paddingTop, childAt.getMeasuredWidth() + i142, paddingTop + childAt.getMeasuredHeight());
                    i9++;
                    paddingTop = i6;
                }
            }
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (childAt2.getVisibility() != 8) {
                f fVar2 = (f) childAt2.getLayoutParams();
                if (!fVar2.a && (b2 = b(childAt2)) != null) {
                    float f2 = (i7 - paddingLeft) - paddingRight;
                    int i17 = ((int) (b2.e * f2)) + paddingLeft;
                    if (fVar2.d) {
                        fVar2.d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f2 * fVar2.c), 1073741824), View.MeasureSpec.makeMeasureSpec((i8 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i17, paddingTop, childAt2.getMeasuredWidth() + i17, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f382o = paddingTop;
        this.p = i8 - paddingBottom;
        this.R = i9;
        if (this.P) {
            z2 = false;
            a(this.f, false, 0, false);
        } else {
            z2 = false;
        }
        this.P = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
        if (r10 != (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008b, code lost:
        if (r3 != (-1)) goto L31;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.plugins.survey.fragments.b.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        e b2;
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i3 = 0;
            i4 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
        }
        while (i3 != i5) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (b2 = b(childAt)) != null && b2.f384b == this.f && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.a());
        com.apxor.androidsdk.plugins.survey.fragments.f fVar = this.e;
        if (fVar != null) {
            fVar.a(kVar.d, kVar.e);
            a(kVar.c, false, true);
            return;
        }
        this.g = kVar.c;
        this.h = kVar.d;
        this.i = kVar.e;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        k kVar = new k(super.onSaveInstanceState());
        kVar.c = this.f;
        com.apxor.androidsdk.plugins.survey.fragments.f fVar = this.e;
        if (fVar != null) {
            kVar.d = fVar.c();
        }
        return kVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.m;
            a(i2, i4, i6, i6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0151  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.plugins.survey.fragments.b.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.t) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(com.apxor.androidsdk.plugins.survey.fragments.f fVar) {
        com.apxor.androidsdk.plugins.survey.fragments.f fVar2 = this.e;
        if (fVar2 != null) {
            fVar2.a((DataSetObserver) null);
            this.e.b((ViewGroup) this);
            for (int i2 = 0; i2 < this.f381b.size(); i2++) {
                e eVar = this.f381b.get(i2);
                this.e.a((ViewGroup) this, eVar.f384b, eVar.a);
            }
            this.e.a((ViewGroup) this);
            this.f381b.clear();
            h();
            this.f = 0;
            scrollTo(0, 0);
        }
        com.apxor.androidsdk.plugins.survey.fragments.f fVar3 = this.e;
        this.e = fVar;
        this.a = 0;
        if (fVar != null) {
            if (this.l == null) {
                this.l = new j();
            }
            this.e.a((DataSetObserver) this.l);
            this.v = false;
            boolean z = this.P;
            this.P = true;
            this.a = this.e.a();
            if (this.g >= 0) {
                this.e.a(this.h, this.i);
                a(this.g, false, true);
                this.g = -1;
                this.h = null;
                this.i = null;
            } else if (z) {
                requestLayout();
            } else {
                g();
            }
        }
        List<g> list = this.V;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.V.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.V.get(i3).a(this, fVar3, fVar);
        }
    }

    public void setCurrentItem(int i2) {
        this.v = false;
        a(i2, !this.P, false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            String str = f0;
            Log.w(str, "Requested offscreen page limit " + i2 + " too small; defaulting to 1");
            i2 = 1;
        }
        if (i2 != this.w) {
            this.w = i2;
            g();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(h hVar) {
        this.T = hVar;
    }

    public void setPageMargin(int i2) {
        int i3 = this.m;
        this.m = i2;
        int width = getWidth();
        a(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i2));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.n = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    void setScrollState(int i2) {
        if (this.e0 == i2) {
            return;
        }
        this.e0 = i2;
        if (this.W != null) {
            b(i2 != 0);
        }
        c(i2);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.n;
    }
}
