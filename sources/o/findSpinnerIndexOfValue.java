package o;

import java.util.Set;
import o.ZipUtil;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class findSpinnerIndexOfValue implements shouldHandleMeasuredHeightTooSmall {
    private final Set<ZipUtil.CentralDirectory> ag$a;
    private final EditTextPreference toString;
    private final findPreference values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public findSpinnerIndexOfValue(Set<ZipUtil.CentralDirectory> set, findPreference findpreference, EditTextPreference editTextPreference) {
        this.ag$a = set;
        this.values = findpreference;
        this.toString = editTextPreference;
    }

    @Override // o.shouldHandleMeasuredHeightTooSmall
    public <T> adjustChildren<T> ah$a(String str, Class<T> cls, ZipUtil.CentralDirectory centralDirectory, fetchWidthAndHeight<T, byte[]> fetchwidthandheight) {
        if (!this.ag$a.contains(centralDirectory)) {
            throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", centralDirectory, this.ag$a));
        }
        return new setValueIndex(this.values, str, centralDirectory, fetchwidthandheight, this.toString);
    }
}
