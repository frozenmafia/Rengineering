package o;

import android.text.TextUtils;
import com.appsamurai.storyly.exoplayer2.datasource.upstream.HttpDataSource;
import com.google.android.exoplayer2.util.MimeTypes;
/* loaded from: classes3.dex */
public final /* synthetic */ class getIconAnimationStartMillis {
    static {
        findViewHolder<String> findviewholder = HttpDataSource.valueOf;
    }

    public static /* synthetic */ boolean ag$a(String str) {
        if (str == null) {
            return false;
        }
        String valueOf = postponeAndUpdateViewHolders.valueOf(str);
        if (TextUtils.isEmpty(valueOf)) {
            return false;
        }
        return ((valueOf.contains("text") && !valueOf.contains(MimeTypes.TEXT_VTT)) || valueOf.contains("html") || valueOf.contains("xml")) ? false : true;
    }
}
