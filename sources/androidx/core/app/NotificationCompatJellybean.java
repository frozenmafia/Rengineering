package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import o.getWantsAllOnMoveCalls;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class NotificationCompatJellybean {
    static final String EXTRA_ALLOW_GENERATED_REPLIES = "android.support.allowGeneratedReplies";
    static final String EXTRA_DATA_ONLY_REMOTE_INPUTS = "android.support.dataRemoteInputs";
    private static final String KEY_ACTION_INTENT = "actionIntent";
    private static final String KEY_ALLOWED_DATA_TYPES = "allowedDataTypes";
    private static final String KEY_ALLOW_FREE_FORM_INPUT = "allowFreeFormInput";
    private static final String KEY_CHOICES = "choices";
    private static final String KEY_DATA_ONLY_REMOTE_INPUTS = "dataOnlyRemoteInputs";
    private static final String KEY_EXTRAS = "extras";
    private static final String KEY_ICON = "icon";
    private static final String KEY_LABEL = "label";
    private static final String KEY_REMOTE_INPUTS = "remoteInputs";
    private static final String KEY_RESULT_KEY = "resultKey";
    private static final String KEY_SEMANTIC_ACTION = "semanticAction";
    private static final String KEY_SHOWS_USER_INTERFACE = "showsUserInterface";
    private static final String KEY_TITLE = "title";
    public static final String TAG = "NotificationCompat";
    private static int ah$a = 0;
    private static Field sActionIconField = null;
    private static Field sActionIntentField = null;
    private static Field sActionTitleField = null;
    private static boolean sActionsAccessFailed = false;
    private static Field sActionsField = null;
    private static final Object sActionsLock;
    private static Field sExtrasField = null;
    private static boolean sExtrasFieldAccessFailed = false;
    private static final Object sExtrasLock;
    private static int toString = 1;
    private static long values;

    static void values() {
        values = -1002172753736129284L;
    }

    static {
        values();
        sExtrasLock = new Object();
        sActionsLock = new Object();
        int i = ah$a + 33;
        toString = i % 128;
        if ((i % 2 == 0 ? (char) 18 : 'L') != 'L') {
            int i2 = 27 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.SparseArray<android.os.Bundle> buildActionExtrasMap(java.util.List<android.os.Bundle> r8) {
        /*
            int r0 = r8.size()
            int r1 = androidx.core.app.NotificationCompatJellybean.toString     // Catch: java.lang.Exception -> L62
            int r1 = r1 + 79
            int r2 = r1 % 128
            androidx.core.app.NotificationCompatJellybean.ah$a = r2     // Catch: java.lang.Exception -> L62
            int r1 = r1 % 2
            r1 = 0
            r2 = 0
            r4 = r1
            r3 = 0
        L12:
            r5 = 1
            if (r3 >= r0) goto L17
            r6 = 0
            goto L18
        L17:
            r6 = 1
        L18:
            if (r6 == 0) goto L1b
            return r4
        L1b:
            int r6 = androidx.core.app.NotificationCompatJellybean.ah$a
            int r6 = r6 + 105
            int r7 = r6 % 128
            androidx.core.app.NotificationCompatJellybean.toString = r7
            int r6 = r6 % 2
            if (r6 != 0) goto L3c
            java.lang.Object r5 = r8.get(r3)
            android.os.Bundle r5 = (android.os.Bundle) r5
            int r6 = r1.length     // Catch: java.lang.Throwable -> L3a
            r6 = 11
            if (r5 == 0) goto L35
            r7 = 11
            goto L37
        L35:
            r7 = 99
        L37:
            if (r7 == r6) goto L4b
            goto L55
        L3a:
            r8 = move-exception
            throw r8
        L3c:
            java.lang.Object r6 = r8.get(r3)     // Catch: java.lang.Exception -> L62
            android.os.Bundle r6 = (android.os.Bundle) r6     // Catch: java.lang.Exception -> L62
            if (r6 == 0) goto L46
            r7 = 1
            goto L47
        L46:
            r7 = 0
        L47:
            if (r7 == r5) goto L4a
            goto L55
        L4a:
            r5 = r6
        L4b:
            if (r4 != 0) goto L52
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
        L52:
            r4.put(r3, r5)
        L55:
            int r3 = r3 + 1
            int r5 = androidx.core.app.NotificationCompatJellybean.toString
            int r5 = r5 + 65
            int r6 = r5 % 128
            androidx.core.app.NotificationCompatJellybean.ah$a = r6
            int r5 = r5 % 2
            goto L12
        L62:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompatJellybean.buildActionExtrasMap(java.util.List):android.util.SparseArray");
    }

    public static Bundle getExtras(Notification notification) {
        synchronized (sExtrasLock) {
            if (sExtrasFieldAccessFailed) {
                return null;
            }
            try {
                if (sExtrasField == null) {
                    Field declaredField = Notification.class.getDeclaredField(KEY_EXTRAS);
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e(TAG, "Notification.extras field is not of type Bundle");
                        sExtrasFieldAccessFailed = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    sExtrasField = declaredField;
                }
                Bundle bundle = (Bundle) sExtrasField.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    sExtrasField.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e(TAG, "Unable to access notification extras", e);
                sExtrasFieldAccessFailed = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e(TAG, "Unable to access notification extras", e2);
                sExtrasFieldAccessFailed = true;
                return null;
            }
        }
    }

    public static NotificationCompat.Action readAction(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        RemoteInput[] remoteInputArr;
        RemoteInput[] remoteInputArr2;
        boolean z;
        if ((bundle != null ? (char) 14 : '(') != '(') {
            try {
                int i2 = toString + 75;
                ah$a = i2 % 128;
                int i3 = i2 % 2;
                RemoteInput[] fromBundleArray = fromBundleArray(getBundleArrayFromBundle(bundle, NotificationCompatExtras.EXTRA_REMOTE_INPUTS));
                RemoteInput[] fromBundleArray2 = fromBundleArray(getBundleArrayFromBundle(bundle, EXTRA_DATA_ONLY_REMOTE_INPUTS));
                boolean z2 = bundle.getBoolean(EXTRA_ALLOW_GENERATED_REPLIES);
                int i4 = toString + 23;
                ah$a = i4 % 128;
                int i5 = i4 % 2;
                remoteInputArr = fromBundleArray;
                remoteInputArr2 = fromBundleArray2;
                z = z2;
            } catch (Exception e) {
                throw e;
            }
        } else {
            remoteInputArr = null;
            remoteInputArr2 = null;
            z = false;
        }
        return new NotificationCompat.Action(i, charSequence, pendingIntent, bundle, remoteInputArr, remoteInputArr2, z, 0, true, false);
    }

    public static Bundle writeActionAndGetExtras(Notification.Builder builder, NotificationCompat.Action action) {
        int resId;
        int i = toString + 49;
        ah$a = i % 128;
        int i2 = i % 2;
        IconCompat iconCompat = action.getIconCompat();
        if (iconCompat != null) {
            int i3 = toString + 79;
            ah$a = i3 % 128;
            if ((i3 % 2 != 0 ? 1 : 0) != 1) {
                resId = iconCompat.getResId();
            } else {
                resId = iconCompat.getResId();
                Object[] objArr = null;
                int length = objArr.length;
            }
            r2 = resId;
        }
        try {
            builder.addAction(r2, action.getTitle(), action.getActionIntent());
            Bundle bundle = new Bundle(action.getExtras());
            if (action.getRemoteInputs() != null) {
                bundle.putParcelableArray(NotificationCompatExtras.EXTRA_REMOTE_INPUTS, toBundleArray(action.getRemoteInputs()));
                try {
                    int i4 = toString + 49;
                    ah$a = i4 % 128;
                    int i5 = i4 % 2;
                } catch (Exception e) {
                    throw e;
                }
            }
            if ((action.getDataOnlyRemoteInputs() != null ? (char) 2 : ';') == 2) {
                int i6 = toString + 49;
                ah$a = i6 % 128;
                int i7 = i6 % 2;
                bundle.putParcelableArray(EXTRA_DATA_ONLY_REMOTE_INPUTS, toBundleArray(action.getDataOnlyRemoteInputs()));
                int i8 = ah$a + 115;
                toString = i8 % 128;
                int i9 = i8 % 2;
            }
            bundle.putBoolean(EXTRA_ALLOW_GENERATED_REPLIES, action.getAllowGeneratedReplies());
            return bundle;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static int getActionCount(Notification notification) {
        int length;
        synchronized (sActionsLock) {
            Object[] actionObjectsLocked = getActionObjectsLocked(notification);
            length = actionObjectsLocked != null ? actionObjectsLocked.length : 0;
        }
        return length;
    }

    public static NotificationCompat.Action getAction(Notification notification, int i) {
        SparseArray sparseParcelableArray;
        synchronized (sActionsLock) {
            try {
                try {
                    Object[] actionObjectsLocked = getActionObjectsLocked(notification);
                    if (actionObjectsLocked != null) {
                        Object obj = actionObjectsLocked[i];
                        Bundle extras = getExtras(notification);
                        return readAction(sActionIconField.getInt(obj), (CharSequence) sActionTitleField.get(obj), (PendingIntent) sActionIntentField.get(obj), (extras == null || (sparseParcelableArray = extras.getSparseParcelableArray(NotificationCompatExtras.EXTRA_ACTION_EXTRAS)) == null) ? null : (Bundle) sparseParcelableArray.get(i));
                    }
                } catch (IllegalAccessException e) {
                    Log.e(TAG, "Unable to access notification actions", e);
                    sActionsAccessFailed = true;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static Object[] getActionObjectsLocked(Notification notification) {
        synchronized (sActionsLock) {
            if (ensureActionReflectionReadyLocked()) {
                try {
                    return (Object[]) sActionsField.get(notification);
                } catch (IllegalAccessException e) {
                    Log.e(TAG, "Unable to access notification actions", e);
                    sActionsAccessFailed = true;
                    return null;
                }
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
        if ((!androidx.core.app.NotificationCompatJellybean.sActionsAccessFailed) != true) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
        if (androidx.core.app.NotificationCompatJellybean.sActionsAccessFailed != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002f, code lost:
        if (androidx.core.app.NotificationCompatJellybean.sActionsField != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0031, code lost:
        r2 = java.lang.Class.forName("android.app.Notification$Action");
        androidx.core.app.NotificationCompatJellybean.sActionIconField = r2.getDeclaredField(androidx.core.app.NotificationCompatJellybean.KEY_ICON);
        androidx.core.app.NotificationCompatJellybean.sActionTitleField = r2.getDeclaredField(ag$a(new char[]{30317, 1263, 30233, 41082, 4260, 54707, 58872, 22824, 15147}, 1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern());
        androidx.core.app.NotificationCompatJellybean.sActionIntentField = r2.getDeclaredField(androidx.core.app.NotificationCompatJellybean.KEY_ACTION_INTENT);
        r2 = android.app.Notification.class.getDeclaredField("actions");
        androidx.core.app.NotificationCompatJellybean.sActionsField = r2;
        r2.setAccessible(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
        android.util.Log.e(androidx.core.app.NotificationCompatJellybean.TAG, "Unable to access notification actions", r2);
        androidx.core.app.NotificationCompatJellybean.sActionsAccessFailed = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a5, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a6, code lost:
        android.util.Log.e(androidx.core.app.NotificationCompatJellybean.TAG, "Unable to access notification actions", r2);
        androidx.core.app.NotificationCompatJellybean.sActionsAccessFailed = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean ensureActionReflectionReadyLocked() {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompatJellybean.ensureActionReflectionReadyLocked():boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static NotificationCompat.Action getActionFromBundle(Bundle bundle) {
        boolean z;
        int i = toString + 9;
        ah$a = i % 128;
        int i2 = i % 2;
        Bundle bundle2 = bundle.getBundle(KEY_EXTRAS);
        if ((bundle2 != null ? 'b' : (char) 21) != 21) {
            z = bundle2.getBoolean(EXTRA_ALLOW_GENERATED_REPLIES, false);
        } else {
            int i3 = toString + 69;
            ah$a = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        return new NotificationCompat.Action(bundle.getInt(KEY_ICON), bundle.getCharSequence(ag$a(new char[]{30317, 1263, 30233, 41082, 4260, 54707, 58872, 22824, 15147}, ViewConfiguration.getMinimumFlingVelocity() >> 16).intern()), (PendingIntent) bundle.getParcelable(KEY_ACTION_INTENT), bundle.getBundle(KEY_EXTRAS), fromBundleArray(getBundleArrayFromBundle(bundle, KEY_REMOTE_INPUTS)), fromBundleArray(getBundleArrayFromBundle(bundle, KEY_DATA_ONLY_REMOTE_INPUTS)), z, bundle.getInt(KEY_SEMANTIC_ACTION), bundle.getBoolean(KEY_SHOWS_USER_INTERFACE), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle getBundleForAction(NotificationCompat.Action action) {
        int i;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat iconCompat = action.getIconCompat();
        if ((iconCompat != null ? '%' : '_') != '_') {
            int i2 = toString + 69;
            ah$a = i2 % 128;
            int i3 = i2 % 2;
            i = iconCompat.getResId();
        } else {
            i = 0;
        }
        bundle2.putInt(KEY_ICON, i);
        bundle2.putCharSequence(ag$a(new char[]{30317, 1263, 30233, 41082, 4260, 54707, 58872, 22824, 15147}, View.resolveSize(0, 0)).intern(), action.getTitle());
        bundle2.putParcelable(KEY_ACTION_INTENT, action.getActionIntent());
        if (action.getExtras() != null) {
            bundle = new Bundle(action.getExtras());
            int i4 = ah$a + 87;
            toString = i4 % 128;
            int i5 = i4 % 2;
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean(EXTRA_ALLOW_GENERATED_REPLIES, action.getAllowGeneratedReplies());
        bundle2.putBundle(KEY_EXTRAS, bundle);
        bundle2.putParcelableArray(KEY_REMOTE_INPUTS, toBundleArray(action.getRemoteInputs()));
        bundle2.putBoolean(KEY_SHOWS_USER_INTERFACE, action.getShowsUserInterface());
        bundle2.putInt(KEY_SEMANTIC_ACTION, action.getSemanticAction());
        return bundle2;
    }

    private static RemoteInput fromBundle(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(KEY_ALLOWED_DATA_TYPES);
        HashSet hashSet = new HashSet();
        if (stringArrayList != null) {
            int i = toString + 117;
            ah$a = i % 128;
            int i2 = i % 2;
            try {
                Iterator<String> it = stringArrayList.iterator();
                while (true) {
                    if ((it.hasNext() ? '4' : 'L') != '4') {
                        break;
                    }
                    hashSet.add(it.next());
                    int i3 = toString + 83;
                    ah$a = i3 % 128;
                    int i4 = i3 % 2;
                }
            } catch (Exception e) {
                throw e;
            }
        }
        return new RemoteInput(bundle.getString(KEY_RESULT_KEY), bundle.getCharSequence(KEY_LABEL), bundle.getCharSequenceArray(KEY_CHOICES), bundle.getBoolean(KEY_ALLOW_FREE_FORM_INPUT), 0, bundle.getBundle(KEY_EXTRAS), hashSet);
    }

    private static Bundle toBundle(RemoteInput remoteInput) {
        Bundle bundle = new Bundle();
        try {
            try {
                bundle.putString(KEY_RESULT_KEY, remoteInput.getResultKey());
                bundle.putCharSequence(KEY_LABEL, remoteInput.getLabel());
                bundle.putCharSequenceArray(KEY_CHOICES, remoteInput.getChoices());
                bundle.putBoolean(KEY_ALLOW_FREE_FORM_INPUT, remoteInput.getAllowFreeFormInput());
                bundle.putBundle(KEY_EXTRAS, remoteInput.getExtras());
                Set<String> allowedDataTypes = remoteInput.getAllowedDataTypes();
                if (!(allowedDataTypes == null)) {
                    int i = toString + 37;
                    ah$a = i % 128;
                    int i2 = i % 2;
                    if (!allowedDataTypes.isEmpty()) {
                        ArrayList<String> arrayList = new ArrayList<>(allowedDataTypes.size());
                        Iterator<String> it = allowedDataTypes.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            int i3 = ah$a + 15;
                            toString = i3 % 128;
                            int i4 = i3 % 2;
                            arrayList.add(it.next());
                        }
                        bundle.putStringArrayList(KEY_ALLOWED_DATA_TYPES, arrayList);
                    }
                }
                return bundle;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static RemoteInput[] fromBundleArray(Bundle[] bundleArr) {
        try {
            int i = ah$a + 79;
            toString = i % 128;
            int i2 = 0;
            if (i % 2 != 0) {
                if (!(bundleArr != null)) {
                    return null;
                }
            } else {
                int i3 = 33 / 0;
                if ((bundleArr == null ? '#' : 'E') == '#') {
                    return null;
                }
            }
            try {
                RemoteInput[] remoteInputArr = new RemoteInput[bundleArr.length];
                int i4 = ah$a + 95;
                toString = i4 % 128;
                int i5 = i4 % 2;
                while (i2 < bundleArr.length) {
                    int i6 = toString + 1;
                    ah$a = i6 % 128;
                    if (i6 % 2 != 0) {
                        remoteInputArr[i2] = fromBundle(bundleArr[i2]);
                        i2 += 16;
                    } else {
                        remoteInputArr[i2] = fromBundle(bundleArr[i2]);
                        i2++;
                    }
                }
                return remoteInputArr;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static Bundle[] toBundleArray(RemoteInput[] remoteInputArr) {
        int i = ah$a + 61;
        toString = i % 128;
        int i2 = i % 2;
        if ((remoteInputArr == null ? '4' : (char) 16) == '4') {
            return null;
        }
        Bundle[] bundleArr = new Bundle[remoteInputArr.length];
        int i3 = 0;
        while (true) {
            if ((i3 < remoteInputArr.length ? '&' : '=') != '&') {
                return bundleArr;
            }
            bundleArr[i3] = toBundle(remoteInputArr[i3]);
            i3++;
            int i4 = toString + 97;
            ah$a = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static Bundle[] getBundleArrayFromBundle(Bundle bundle, String str) {
        int i = toString + 125;
        ah$a = i % 128;
        int i2 = i % 2;
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((!(parcelableArray instanceof Bundle[]) ? '3' : (char) 30) != 30) {
            try {
                int i3 = toString + 123;
                ah$a = i3 % 128;
                int i4 = i3 % 2;
                if (parcelableArray != null) {
                    Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
                    bundle.putParcelableArray(str, bundleArr);
                    return bundleArr;
                }
            } catch (Exception e) {
                throw e;
            }
        }
        return (Bundle[]) parcelableArray;
    }

    private NotificationCompatJellybean() {
    }

    private static String ag$a(char[] cArr, int i) {
        String str;
        synchronized (getWantsAllOnMoveCalls.ag$a) {
            char[] getwantsallonmovecalls = getWantsAllOnMoveCalls.toString(values, cArr, i);
            getWantsAllOnMoveCalls.values = 4;
            while (getWantsAllOnMoveCalls.values < getwantsallonmovecalls.length) {
                getWantsAllOnMoveCalls.toString = getWantsAllOnMoveCalls.values - 4;
                getwantsallonmovecalls[getWantsAllOnMoveCalls.values] = (char) ((getwantsallonmovecalls[getWantsAllOnMoveCalls.values] ^ getwantsallonmovecalls[getWantsAllOnMoveCalls.values % 4]) ^ (getWantsAllOnMoveCalls.toString * values));
                getWantsAllOnMoveCalls.values++;
            }
            str = new String(getwantsallonmovecalls, 4, getwantsallonmovecalls.length - 4);
        }
        return str;
    }
}
