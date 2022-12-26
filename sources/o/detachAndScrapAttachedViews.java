package o;

import android.util.Log;
import com.google.firebase.database.logging.Logger;
import java.util.List;
/* loaded from: classes5.dex */
public class detachAndScrapAttachedViews extends detachAndScrapViewAt {
    @Override // o.detachAndScrapViewAt
    protected String ag$a(Logger.Level level, String str, String str2, long j) {
        return str2;
    }

    public detachAndScrapAttachedViews(Logger.Level level, List<String> list) {
        super(level, list);
    }

    @Override // o.detachAndScrapViewAt
    protected void valueOf(String str, String str2) {
        Log.e(str, str2);
    }

    @Override // o.detachAndScrapViewAt
    protected void toString(String str, String str2) {
        Log.w(str, str2);
    }

    @Override // o.detachAndScrapViewAt
    protected void ag$a(String str, String str2) {
        Log.i(str, str2);
    }

    @Override // o.detachAndScrapViewAt
    protected void values(String str, String str2) {
        Log.d(str, str2);
    }
}
