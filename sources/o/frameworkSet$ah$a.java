package o;

import com.sendbird.android.constant.StringSet;
import java.io.File;
import java.util.Objects;
import java.util.UUID;
import o.Visibility;
/* loaded from: classes3.dex */
public final class frameworkSet$ah$a {
    private frameworkSet$ah$a() {
    }

    public /* synthetic */ frameworkSet$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    public final String valueOf(long j, String str) {
        runAnimators.valueOf(str, com.apxor.androidsdk.core.ce.Constants.UUID);
        return str + j + "_v2.json";
    }

    public final String values() {
        long currentTimeMillis = System.currentTimeMillis();
        String uuid = UUID.randomUUID().toString();
        runAnimators.toString(uuid, "UUID.randomUUID().toString()");
        return valueOf(currentTimeMillis, uuid);
    }

    public final long toString(File file) {
        runAnimators.valueOf(file, StringSet.file);
        String name = file.getName();
        runAnimators.toString(name, "file.name");
        String name2 = file.getName();
        runAnimators.toString(name2, "file.name");
        int ag$a = Visibility.Mode.ag$a((CharSequence) name2, "_", 0, false, 6, (Object) null);
        Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
        String substring = name.substring(36, ag$a);
        runAnimators.ah$a(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        Long ag$a2 = runAnimators.ag$a(substring, "<this>");
        if (ag$a2 != null) {
            return ag$a2.longValue();
        }
        return -1L;
    }
}
