package o;

import java.util.Collections;
import java.util.List;
/* loaded from: classes3.dex */
public abstract class getSource implements ParcelableCompatCreatorCallbacks<getSource> {
    public final boolean ICustomTabsCallback;
    public final List<String> ak$a;
    public final String isLogoutPending;

    /* JADX INFO: Access modifiers changed from: protected */
    public getSource(String str, List<String> list, boolean z) {
        this.isLogoutPending = str;
        this.ak$a = Collections.unmodifiableList(list);
        this.ICustomTabsCallback = z;
    }
}
