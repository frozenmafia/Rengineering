package androidx.core.net;

import android.net.Uri;
import com.sendbird.android.constant.StringSet;
import java.io.File;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class UriKt {
    public static final Uri toUri(String str) {
        runAnimators.ag$a(str, "<this>");
        Uri parse = Uri.parse(str);
        runAnimators.ah$a(parse, "parse(this)");
        return parse;
    }

    public static final Uri toUri(File file) {
        runAnimators.ag$a(file, "<this>");
        Uri fromFile = Uri.fromFile(file);
        runAnimators.ah$a(fromFile, "fromFile(this)");
        return fromFile;
    }

    public static final File toFile(Uri uri) {
        runAnimators.ag$a(uri, "<this>");
        if (!runAnimators.values((Object) uri.getScheme(), (Object) StringSet.file)) {
            throw new IllegalArgumentException(runAnimators.values("Uri lacks 'file' scheme: ", (Object) uri).toString());
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        throw new IllegalArgumentException(runAnimators.values("Uri path is null: ", (Object) uri).toString());
    }
}
