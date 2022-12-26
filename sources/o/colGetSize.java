package o;

import android.widget.CompoundButton;
/* loaded from: classes3.dex */
public final class colGetSize implements CompoundButton.OnCheckedChangeListener {
    final int valueOf;
    final valueOf values;

    /* loaded from: classes3.dex */
    public interface valueOf {
        void toString(int i, CompoundButton compoundButton, boolean z);
    }

    public colGetSize(valueOf valueof, int i) {
        this.values = valueof;
        this.valueOf = i;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.values.toString(this.valueOf, compoundButton, z);
    }
}
