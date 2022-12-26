package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
/* loaded from: classes4.dex */
public class MediatorLiveData extends removeSource {
    private static final ViewDataBinding.IncludedLayouts ag$a = null;
    private static final SparseIntArray valueOf;
    private final RelativeLayout ah$b;
    private long toString;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        return true;
    }

    /* loaded from: classes4.dex */
    public class Source extends LiveDataKt$observe$wrappedObserver$1 {
        private static final ViewDataBinding.IncludedLayouts ag$a = null;
        private static final SparseIntArray valueOf;
        private final LinearLayout ah$a;
        private long toString;

        @Override // androidx.databinding.ViewDataBinding
        public boolean onFieldChange(int i, Object obj, int i2) {
            return false;
        }

        @Override // androidx.databinding.ViewDataBinding
        public boolean setVariable(int i, Object obj) {
            return true;
        }

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            valueOf = sparseIntArray;
            sparseIntArray.put(isSynced$ag$a.progressBar, 1);
        }

        public Source(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
            this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, ag$a, valueOf));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private Source(final androidx.databinding.DataBindingComponent r5, final android.view.View r6, java.lang.Object[] r7) {
            /*
                r4 = this;
                r0 = 1
                r0 = r7[r0]
                android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
                r1 = 0
                r4.<init>(r5, r6, r1, r0)
                r2 = -1
                r4.toString = r2
                r5 = r7[r1]
                android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
                r4.ah$a = r5
                r7 = 0
                r5.setTag(r7)
                r4.setRootTag(r6)
                r4.invalidateAll()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.MediatorLiveData.Source.<init>(androidx.databinding.DataBindingComponent, android.view.View, java.lang.Object[]):void");
        }

        @Override // androidx.databinding.ViewDataBinding
        public void invalidateAll() {
            synchronized (this) {
                this.toString = 1L;
            }
            requestRebind();
        }

        @Override // androidx.databinding.ViewDataBinding
        public boolean hasPendingBindings() {
            synchronized (this) {
                return this.toString != 0;
            }
        }

        @Override // androidx.databinding.ViewDataBinding
        public void executeBindings() {
            synchronized (this) {
                this.toString = 0L;
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        valueOf = sparseIntArray;
        sparseIntArray.put(isSynced$ag$a.powered_by_title, 1);
        sparseIntArray.put(isSynced$ag$a.fancode_logo, 2);
    }

    public MediatorLiveData(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, ag$a, valueOf));
    }

    private MediatorLiveData(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[2], (TextView) objArr[1]);
        this.toString = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.ah$b = relativeLayout;
        relativeLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.toString = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.toString != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.toString = 0L;
        }
    }
}
