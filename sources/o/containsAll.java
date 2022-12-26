package o;

import android.text.Editable;
import androidx.databinding.adapters.TextViewBindingAdapter;
/* loaded from: classes3.dex */
public final class containsAll implements TextViewBindingAdapter.AfterTextChanged {
    final int ag$a;
    final values values;

    /* loaded from: classes3.dex */
    public interface values {
        void valueOf(int i, Editable editable);
    }

    public containsAll(values valuesVar, int i) {
        this.values = valuesVar;
        this.ag$a = i;
    }

    @Override // androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged
    public void afterTextChanged(Editable editable) {
        this.values.valueOf(this.ag$a, editable);
    }
}
