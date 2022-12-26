package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import com.apxor.androidsdk.core.ce.Constants;
import o.Visibility;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class MatcherUtils {
    public static final MatcherUtils INSTANCE = new MatcherUtils();
    public static final boolean sDebugMatchers = false;
    public static final String sMatchersTag = "SplitRuleResolution";

    private MatcherUtils() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean areComponentsMatching$window_release(android.content.ComponentName r7, android.content.ComponentName r8) {
        /*
            r6 = this;
            java.lang.String r0 = "ruleComponent"
            o.runAnimators.ag$a(r8, r0)
            java.lang.String r0 = "*"
            r1 = 0
            r2 = 1
            if (r7 != 0) goto L21
            java.lang.String r7 = r8.getPackageName()
            boolean r7 = o.runAnimators.values(r7, r0)
            if (r7 == 0) goto L20
            java.lang.String r7 = r8.getClassName()
            boolean r7 = o.runAnimators.values(r7, r0)
            if (r7 == 0) goto L20
            r1 = 1
        L20:
            return r1
        L21:
            java.lang.String r3 = r7.toString()
            java.lang.String r4 = "activityComponent.toString()"
            o.runAnimators.ah$a(r3, r4)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r4 = 2
            r5 = 0
            boolean r0 = o.Visibility.Mode.values(r3, r0, r1, r4, r5)
            r0 = r0 ^ r2
            if (r0 == 0) goto L91
            java.lang.String r0 = r7.getPackageName()
            java.lang.String r3 = r8.getPackageName()
            boolean r0 = o.runAnimators.values(r0, r3)
            if (r0 != 0) goto L60
            java.lang.String r0 = r7.getPackageName()
            java.lang.String r3 = "activityComponent.packageName"
            o.runAnimators.ah$a(r0, r3)
            java.lang.String r3 = r8.getPackageName()
            java.lang.String r4 = "ruleComponent.packageName"
            o.runAnimators.ah$a(r3, r4)
            boolean r0 = r6.wildcardMatch(r0, r3)
            if (r0 == 0) goto L5e
            goto L60
        L5e:
            r0 = 0
            goto L61
        L60:
            r0 = 1
        L61:
            java.lang.String r3 = r7.getClassName()
            java.lang.String r4 = r8.getClassName()
            boolean r3 = o.runAnimators.values(r3, r4)
            if (r3 != 0) goto L8a
            java.lang.String r7 = r7.getClassName()
            java.lang.String r3 = "activityComponent.className"
            o.runAnimators.ah$a(r7, r3)
            java.lang.String r8 = r8.getClassName()
            java.lang.String r3 = "ruleComponent.className"
            o.runAnimators.ah$a(r8, r3)
            boolean r7 = r6.wildcardMatch(r7, r8)
            if (r7 == 0) goto L88
            goto L8a
        L88:
            r7 = 0
            goto L8b
        L8a:
            r7 = 1
        L8b:
            if (r0 == 0) goto L90
            if (r7 == 0) goto L90
            r1 = 1
        L90:
            return r1
        L91:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Wildcard can only be part of the rule."
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.MatcherUtils.areComponentsMatching$window_release(android.content.ComponentName, android.content.ComponentName):boolean");
    }

    public final boolean areActivityOrIntentComponentsMatching$window_release(Activity activity, ComponentName componentName) {
        ComponentName component;
        runAnimators.ag$a(activity, Constants.ACTIVITY);
        runAnimators.ag$a(componentName, "ruleComponent");
        if (areComponentsMatching$window_release(activity.getComponentName(), componentName)) {
            return true;
        }
        Intent intent = activity.getIntent();
        if (intent == null || (component = intent.getComponent()) == null) {
            return false;
        }
        return INSTANCE.areComponentsMatching$window_release(component, componentName);
    }

    private final boolean wildcardMatch(String str, String str2) {
        String str3 = str2;
        if (Visibility.Mode.values((CharSequence) str3, (CharSequence) "*", false, 2, (Object) null)) {
            if (runAnimators.values((Object) str2, (Object) "*")) {
                return true;
            }
            if (!(Visibility.Mode.ag$a((CharSequence) str3, "*", 0, false, 6, (Object) null) == Visibility.Mode.toString((CharSequence) str3, "*", 0, false, 6, (Object) null) && Visibility.Mode.ag$a(str2, "*", false, 2, (Object) null))) {
                throw new IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end".toString());
            }
            String substring = str2.substring(0, str2.length() - 1);
            runAnimators.ah$a(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return Visibility.Mode.ah$a(str, substring, false, 2, (Object) null);
        }
        return false;
    }
}
