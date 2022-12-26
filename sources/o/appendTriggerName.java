package o;

import java.util.Locale;
import java.util.UUID;
/* loaded from: classes5.dex */
public class appendTriggerName {
    appendTriggerName() {
    }

    public static String valueOf() {
        return "a." + ah$a().toLowerCase(Locale.getDefault());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String values() {
        return ah$a();
    }

    private static String ah$a() {
        return UUID.randomUUID().toString();
    }
}
