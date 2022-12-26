package o;

import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ShortcutInfoCompat$Builder$ah$a {
    private int ag$a;
    private final WeakReference<ShortcutInfoCompat$Builder$ag$a> toString;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ShortcutInfoCompat$Builder$ah$a(int i, ShortcutInfoCompat$Builder$ag$a shortcutInfoCompat$Builder$ag$a) {
        this.toString = new WeakReference<>(shortcutInfoCompat$Builder$ag$a);
        this.ag$a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean toString(ShortcutInfoCompat$Builder$ag$a shortcutInfoCompat$Builder$ag$a) {
        return shortcutInfoCompat$Builder$ag$a != null && this.toString.get() == shortcutInfoCompat$Builder$ag$a;
    }
}
