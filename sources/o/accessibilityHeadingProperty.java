package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
/* loaded from: classes3.dex */
public final class accessibilityHeadingProperty {
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean toString(android.content.Context r7) {
        /*
            java.lang.String r0 = "<this>"
            o.runAnimators.ag$a(r7, r0)
            java.lang.String r0 = "accessibility"
            java.lang.Object r7 = r7.getSystemService(r0)
            boolean r0 = r7 instanceof android.view.accessibility.AccessibilityManager
            r1 = 0
            if (r0 == 0) goto L13
            android.view.accessibility.AccessibilityManager r7 = (android.view.accessibility.AccessibilityManager) r7
            goto L14
        L13:
            r7 = r1
        L14:
            r0 = 0
            if (r7 != 0) goto L18
            return r0
        L18:
            r2 = 1
            java.util.List r7 = r7.getEnabledAccessibilityServiceList(r2)
            if (r7 != 0) goto L20
            goto L5d
        L20:
            java.util.Iterator r7 = r7.iterator()
        L24:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L5b
            java.lang.Object r3 = r7.next()
            r4 = r3
            android.accessibilityservice.AccessibilityServiceInfo r4 = (android.accessibilityservice.AccessibilityServiceInfo) r4
            java.lang.String r5 = r4.getSettingsActivityName()
            if (r5 == 0) goto L40
            int r5 = r5.length()
            if (r5 != 0) goto L3e
            goto L40
        L3e:
            r5 = 0
            goto L41
        L40:
            r5 = 1
        L41:
            if (r5 != 0) goto L57
            java.lang.String r4 = r4.getSettingsActivityName()
            java.lang.String r5 = "it.settingsActivityName"
            o.runAnimators.ah$a(r4, r5)
            r5 = 2
            java.lang.String r6 = "TalkBackPreferencesActivity"
            boolean r4 = o.Visibility.Mode.values(r4, r6, r0, r5, r1)
            if (r4 == 0) goto L57
            r4 = 1
            goto L58
        L57:
            r4 = 0
        L58:
            if (r4 == 0) goto L24
            r1 = r3
        L5b:
            android.accessibilityservice.AccessibilityServiceInfo r1 = (android.accessibilityservice.AccessibilityServiceInfo) r1
        L5d:
            if (r1 == 0) goto L60
            r0 = 1
        L60:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.accessibilityHeadingProperty.toString(android.content.Context):boolean");
    }

    public static final Activity values(Context context) {
        runAnimators.ag$a(context, "<this>");
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            runAnimators.ah$a(baseContext, "this.baseContext");
            return values(baseContext);
        }
        return null;
    }
}
