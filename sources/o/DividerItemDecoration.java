package o;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.io.IOException;
import o.DefaultItemAnimator;
/* loaded from: classes7.dex */
public final class DividerItemDecoration implements DefaultItemAnimator.AnonymousClass6 {
    private final SharedPreferences ag$a;
    private final String ah$a;

    public DividerItemDecoration(Context context, String str, String str2) throws IOException {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.ah$a = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.ag$a = android.preference.PreferenceManager.getDefaultSharedPreferences(applicationContext);
        } else {
            this.ag$a = applicationContext.getSharedPreferences(str2, 0);
        }
    }

    private byte[] ag$a() throws IOException {
        try {
            String string = this.ag$a.getString(this.ah$a, null);
            if (string == null) {
                throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", this.ah$a));
            }
            return LayoutState.valueOf(string);
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", this.ah$a));
        }
    }

    @Override // o.DefaultItemAnimator.AnonymousClass6
    public getColumnCountForAccessibility ah$a() throws IOException {
        return getColumnCountForAccessibility.valueOf(ag$a(), ItemTouchHelper.ah$a());
    }

    @Override // o.DefaultItemAnimator.AnonymousClass6
    public cachePreLayoutSpanMapping values() throws IOException {
        return cachePreLayoutSpanMapping.values(ag$a(), ItemTouchHelper.ah$a());
    }
}
