package o;

import com.dream11.androidhelpers.adapters.BaseAdapter$ag$a;
/* loaded from: classes2.dex */
public class setAutoMirrored extends getTransformedMotionEvent {
    private final setDither ah$a;

    @Override // com.dream11.androidhelpers.adapters.BaseAdapter
    public int valueOf(int i) {
        return com.app.dream11Pro.R.layout.res_0x7f0d031b;
    }

    public setAutoMirrored(setDither setdither) {
        this.ah$a = setdither;
    }

    @Override // com.dream11.androidhelpers.adapters.BaseAdapter
    public void values(BaseAdapter$ag$a baseAdapter$ag$a, int i) {
        androidx.databinding.DataBindingUtil.getBinding(baseAdapter$ag$a.itemView).setVariable(263, this.ah$a);
    }
}
