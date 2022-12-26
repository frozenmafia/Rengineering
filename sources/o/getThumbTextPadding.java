package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TableRow;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public class getThumbTextPadding extends getCompoundPaddingRight {
    private static final ViewDataBinding.IncludedLayouts HaptikSDK$b = null;
    private static final SparseIntArray invoke;
    private final TableRow HaptikWebView;
    private long getInitSettings;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        invoke = sparseIntArray;
        sparseIntArray.put(com.app.dream11Pro.R.id.ll_left, 5);
        sparseIntArray.put(com.app.dream11Pro.R.id.ll_right, 6);
    }

    public getThumbTextPadding(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 7, HaptikSDK$b, invoke));
    }

    private getThumbTextPadding(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[5], (LinearLayout) objArr[6], (CustomTextView) objArr[1], (CustomTextView) objArr[3], (CustomTextView) objArr[2], (CustomTextView) objArr[4]);
        this.getInitSettings = -1L;
        TableRow tableRow = (TableRow) objArr[0];
        this.HaptikWebView = tableRow;
        tableRow.setTag(null);
        this.valueOf.setTag(null);
        this.HaptikSDK$a.setTag(null);
        this.HaptikSDK$c.setTag(null);
        this.ah$b.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.getInitSettings = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.getInitSettings != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        if (189 == i) {
            toString((kotlin.Pair) obj);
        } else if (190 != i) {
            return false;
        } else {
            ag$a((kotlin.Pair) obj);
        }
        return true;
    }

    @Override // o.getCompoundPaddingRight
    public void toString(kotlin.Pair<String, String> pair) {
        this.values = pair;
        synchronized (this) {
            this.getInitSettings |= 1;
        }
        notifyPropertyChanged(189);
        super.requestRebind();
    }

    @Override // o.getCompoundPaddingRight
    public void ag$a(kotlin.Pair<String, String> pair) {
        this.toString = pair;
        synchronized (this) {
            this.getInitSettings |= 2;
        }
        notifyPropertyChanged(190);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        String str;
        String str2;
        String str3;
        synchronized (this) {
            j = this.getInitSettings;
            this.getInitSettings = 0L;
        }
        kotlin.Pair<String, String> pair = this.values;
        kotlin.Pair<String, String> pair2 = this.toString;
        String str4 = null;
        int i = ((5 & j) > 0L ? 1 : ((5 & j) == 0L ? 0 : -1));
        if (i == 0 || pair == null) {
            str = null;
            str2 = null;
        } else {
            str2 = pair.getSecond();
            str = pair.getFirst();
        }
        int i2 = ((j & 6) > 0L ? 1 : ((j & 6) == 0L ? 0 : -1));
        if (i2 == 0 || pair2 == null) {
            str3 = null;
        } else {
            str4 = pair2.getFirst();
            str3 = pair2.getSecond();
        }
        if (i != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.valueOf, str);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.HaptikSDK$c, str2);
        }
        if (i2 != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.HaptikSDK$a, str4);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.ah$b, str3);
        }
    }
}
