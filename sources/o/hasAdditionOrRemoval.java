package o;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import o.DefaultItemAnimator;
/* loaded from: classes7.dex */
public final class hasAdditionOrRemoval implements DefaultItemAnimator.ChangeInfo {
    private final String valueOf;
    private final SharedPreferences.Editor values;

    public hasAdditionOrRemoval(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.valueOf = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.values = android.preference.PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.values = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    @Override // o.DefaultItemAnimator.ChangeInfo
    public void ah$a(getColumnCountForAccessibility getcolumncountforaccessibility) throws IOException {
        if (!this.values.putString(this.valueOf, LayoutState.ag$a(getcolumncountforaccessibility.HaptikSDK$d())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // o.DefaultItemAnimator.ChangeInfo
    public void toString(cachePreLayoutSpanMapping cacheprelayoutspanmapping) throws IOException {
        if (!this.values.putString(this.valueOf, LayoutState.ag$a(cacheprelayoutspanmapping.HaptikSDK$d())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
