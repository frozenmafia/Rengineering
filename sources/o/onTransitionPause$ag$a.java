package o;

import java.util.Collections;
import java.util.List;
/* loaded from: classes3.dex */
public final class onTransitionPause$ag$a {
    public final int ag$a;
    public final String ah$a;
    public final List<onTransitionPause$ah$a> valueOf;
    public final byte[] values;

    public onTransitionPause$ag$a(int i, String str, List<onTransitionPause$ah$a> list, byte[] bArr) {
        List<onTransitionPause$ah$a> unmodifiableList;
        this.ag$a = i;
        this.ah$a = str;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.valueOf = unmodifiableList;
        this.values = bArr;
    }
}
