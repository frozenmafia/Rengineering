package o;

import android.view.View;
import android.widget.AdapterView;
import androidx.databinding.adapters.AdapterViewBindingAdapter;
/* loaded from: classes3.dex */
public final class colGetEntry implements AdapterViewBindingAdapter.OnItemSelected {
    final int valueOf;
    final valueOf values;

    /* loaded from: classes3.dex */
    public interface valueOf {
        void values(int i, AdapterView adapterView, View view, int i2, long j);
    }

    public colGetEntry(valueOf valueof, int i) {
        this.values = valueof;
        this.valueOf = i;
    }

    @Override // androidx.databinding.adapters.AdapterViewBindingAdapter.OnItemSelected
    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.values.values(this.valueOf, adapterView, view, i, j);
    }
}
