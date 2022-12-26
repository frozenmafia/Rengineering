package o;

import java.util.AbstractSet;
import java.util.Map;
import o.PrintHelper;
/* loaded from: classes7.dex */
public final class PrintHelper$OnPrintFinishCallback$ag$a extends AbstractSet<Map.Entry<String, Object>> {
    final /* synthetic */ PrintHelper.OnPrintFinishCallback ah$a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PrintHelper$OnPrintFinishCallback$ag$a(PrintHelper.OnPrintFinishCallback onPrintFinishCallback) {
        this.ah$a = onPrintFinishCallback;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: ah$a */
    public PrintHelper.OnPrintFinishCallback.values iterator() {
        return new PrintHelper.OnPrintFinishCallback.values();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        int i = 0;
        for (String str : this.ah$a.ag$a.toString) {
            if (this.ah$a.ag$a.ag$a(str).ah$a(this.ah$a.values) != null) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        for (String str : this.ah$a.ag$a.toString) {
            this.ah$a.ag$a.ag$a(str).toString(this.ah$a.values, null);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        for (String str : this.ah$a.ag$a.toString) {
            if (this.ah$a.ag$a.ag$a(str).ah$a(this.ah$a.values) != null) {
                return false;
            }
        }
        return true;
    }
}
