package o;

import android.content.ContentValues;
import android.content.Context;
/* loaded from: classes.dex */
public abstract class HaptikSDK$a {
    private long ag$a = -1;

    public void ag$a(long j) {
        this.ag$a = j;
    }

    public boolean ag$a(Context context) {
        return ah$a(context).values(values(), valueOf());
    }

    public abstract <K extends HaptikSDK$a> extraCallback<K> ah$a(Context context);

    public String toString() {
        return "rowid = " + values() + "|" + valueOf().toString();
    }

    public boolean toString(Context context) {
        boolean ah$a = ah$a(context).ah$a(values());
        if (ah$a) {
            ag$a(-1L);
        }
        return ah$a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean toString(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public long valueOf(Context context) {
        return ah$a(context).valueOf(this);
    }

    public abstract ContentValues valueOf();

    public long values() {
        return this.ag$a;
    }

    public boolean values(Context context) {
        long values = values();
        extraCallback ah$a = ah$a(context);
        return values == -1 ? ah$a.valueOf(this) != -1 : ah$a.values(values(), valueOf());
    }
}
