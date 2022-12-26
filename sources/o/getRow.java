package o;

import com.app.dream11.model.viewmodel.BasePageVM;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class getRow extends BasePageVM {
    private boolean ag$a;
    private increaseTableSize toString;
    private List<String> values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getRow(boolean z, List<String> list, increaseTableSize increasetablesize) {
        ArrayList arrayList = new ArrayList();
        this.values = arrayList;
        this.ag$a = z;
        arrayList.addAll(list);
        this.toString = increasetablesize;
    }

    @androidx.databinding.Bindable
    public boolean ag$a() {
        return this.ag$a;
    }

    public void values(boolean z) {
        if (z == this.ag$a) {
            return;
        }
        this.ag$a = z;
        notifyPropertyChanged(androidx.databinding.library.baseAdapters.BR.whatsAppEnabled);
    }

    @androidx.databinding.Bindable
    public List<String> values() {
        return this.values;
    }

    @androidx.databinding.Bindable
    public increaseTableSize ah$a() {
        return this.toString;
    }
}
