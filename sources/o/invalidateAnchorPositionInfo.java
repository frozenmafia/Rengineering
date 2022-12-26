package o;

import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.sql.SqlDateTypeAdapter;
import com.google.gson.internal.sql.SqlTimeTypeAdapter;
import com.google.gson.internal.sql.SqlTimestampTypeAdapter;
import java.sql.Timestamp;
import java.util.Date;
/* loaded from: classes5.dex */
public final class invalidateAnchorPositionInfo {
    public static final offsetFullSpansForAddition ag$a;
    public static final DefaultDateTypeAdapter.valueOf<? extends Date> ah$a;
    public static final offsetFullSpansForAddition invoke;
    public static final offsetFullSpansForAddition toString;
    public static final DefaultDateTypeAdapter.valueOf<? extends Date> valueOf;
    public static final boolean values;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        values = z;
        if (z) {
            ah$a = new DefaultDateTypeAdapter.valueOf<java.sql.Date>(java.sql.Date.class) { // from class: o.invalidateAnchorPositionInfo.5
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.valueOf
                /* renamed from: values */
                public java.sql.Date ag$a(Date date) {
                    return new java.sql.Date(date.getTime());
                }
            };
            valueOf = new DefaultDateTypeAdapter.valueOf<Timestamp>(Timestamp.class) { // from class: o.invalidateAnchorPositionInfo.2
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.valueOf
                /* renamed from: values */
                public Timestamp ag$a(Date date) {
                    return new Timestamp(date.getTime());
                }
            };
            toString = SqlDateTypeAdapter.valueOf;
            invoke = SqlTimeTypeAdapter.values;
            ag$a = SqlTimestampTypeAdapter.toString;
            return;
        }
        ah$a = null;
        valueOf = null;
        toString = null;
        invoke = null;
        ag$a = null;
    }
}
