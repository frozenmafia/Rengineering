package o;

import java.util.Locale;
/* loaded from: classes.dex */
public class stop {
    private final getMediaController ah$a;

    public boolean valueOf() {
        return this.ah$a.ah$a();
    }

    public String toString() {
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", getClass().getName(), Integer.toHexString(hashCode()), Boolean.toString(this.ah$a.ah$a()));
    }
}
