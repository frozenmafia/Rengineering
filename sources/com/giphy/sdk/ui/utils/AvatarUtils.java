package com.giphy.sdk.ui.utils;

import com.sendbird.android.constant.StringSet;
import java.util.Objects;
import o.Visibility;
import o.runAnimators;
/* loaded from: classes7.dex */
public final class AvatarUtils {
    public static final AvatarUtils ag$a = new AvatarUtils();

    private AvatarUtils() {
    }

    public final String ag$a(String str, Dimension dimension) {
        String str2;
        runAnimators.ag$a(dimension, StringSet.size);
        String str3 = str;
        if (str3 == null || str3.length() == 0) {
            return null;
        }
        int mode = Visibility.Mode.toString((CharSequence) str3, ".", 0, false, 6, (Object) null);
        if (mode >= 0) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            str2 = str.substring(mode);
            runAnimators.ah$a(str2, "(this as java.lang.String).substring(startIndex)");
        } else {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder();
        if (mode < 0) {
            mode = str.length();
        }
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(0, mode);
        runAnimators.ah$a(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append("/");
        sb.append(dimension.getSize());
        sb.append(str2);
        return sb.toString();
    }

    /* loaded from: classes7.dex */
    public enum Dimension {
        Small("36h"),
        Medium("80h"),
        Big("200h");
        
        private final String size;

        Dimension(String str) {
            this.size = str;
        }

        public final String getSize() {
            return this.size;
        }
    }
}
