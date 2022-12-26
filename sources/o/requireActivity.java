package o;

import android.net.Uri;
/* loaded from: classes4.dex */
public interface requireActivity {
    boolean containsUri(Uri uri);

    boolean equals(Object obj);

    String getUriString();

    int hashCode();

    boolean isResourceIdForDebugging();
}
