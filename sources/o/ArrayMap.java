package o;

import android.view.View;
/* loaded from: classes3.dex */
public final /* synthetic */ class ArrayMap implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ ArrayMap valueOf = new ArrayMap();

    private /* synthetic */ ArrayMap() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        return RoundRectDrawable.toString((Throwable) obj);
    }

    /* renamed from: o.ArrayMap$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 implements View.OnFocusChangeListener {
        final valueOf ah$a;
        final int toString;

        /* renamed from: o.ArrayMap$1$valueOf */
        /* loaded from: classes3.dex */
        public interface valueOf {
            void ag$a(int i, View view, boolean z);
        }

        public AnonymousClass1(valueOf valueof, int i) {
            this.ah$a = valueof;
            this.toString = i;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            this.ah$a.ag$a(this.toString, view, z);
        }
    }
}
