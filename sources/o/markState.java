package o;

import com.facebook.common.internal.ImmutableMap;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Locale;
import java.util.Map;
import o.Fragment;
/* loaded from: classes4.dex */
public class markState {
    public static final Map<String, String> ag$a = ImmutableMap.of("mkv", MimeTypes.VIDEO_MATROSKA, "glb", "model/gltf-binary");

    public static boolean ag$a(String str) {
        return str != null && str.startsWith("video/");
    }

    public static String values(String str) {
        String valueOf = valueOf(str);
        if (valueOf == null) {
            return null;
        }
        String lowerCase = valueOf.toLowerCase(Locale.US);
        String values = Fragment.SavedState.values(lowerCase);
        return values == null ? ag$a.get(lowerCase) : values;
    }

    private static String valueOf(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0 || lastIndexOf == str.length() - 1) {
            return null;
        }
        return str.substring(lastIndexOf + 1);
    }
}
