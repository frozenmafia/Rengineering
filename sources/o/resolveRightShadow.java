package o;

import com.dream11.androidhelpers.adapters.BaseAdapter;
import com.dream11.androidhelpers.adapters.BaseAdapter$ag$a;
/* loaded from: classes4.dex */
public class resolveRightShadow extends BaseAdapter {
    private int ag$a;

    @Override // com.dream11.androidhelpers.adapters.BaseAdapter
    public int values() {
        return 1;
    }

    @Override // com.dream11.androidhelpers.adapters.BaseAdapter
    public void values(BaseAdapter$ag$a baseAdapter$ag$a, int i) {
    }

    public resolveRightShadow(int i) {
        this.ag$a = i;
    }

    @Override // com.dream11.androidhelpers.adapters.BaseAdapter
    public int valueOf(int i) {
        return this.ag$a;
    }
}
