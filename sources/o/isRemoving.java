package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.DefaultSpecialEffectsController;
import o.Visibility;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public final class isRemoving {
    private static final String ah$a;
    private static final SharedPreferences ah$b;
    private static final SharedPreferences values;
    public static final isRemoving valueOf = new isRemoving();
    private static final HashMap<String, Method> toString = new HashMap<>();
    private static final HashMap<String, Class<?>> ag$a = new HashMap<>();

    private isRemoving() {
    }

    static {
        DefaultSpecialEffectsController.AnonymousClass8 anonymousClass8 = DefaultSpecialEffectsController.AnonymousClass8.values;
        ah$a = DefaultSpecialEffectsController.AnonymousClass8.ag$a().getPackageName();
        DefaultSpecialEffectsController.AnonymousClass8 anonymousClass82 = DefaultSpecialEffectsController.AnonymousClass8.values;
        ah$b = DefaultSpecialEffectsController.AnonymousClass8.ag$a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
        DefaultSpecialEffectsController.AnonymousClass8 anonymousClass83 = DefaultSpecialEffectsController.AnonymousClass8.values;
        values = DefaultSpecialEffectsController.AnonymousClass8.ag$a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
    }

    public static final Object values(Context context, IBinder iBinder) {
        if (isStateAtLeast.values(isRemoving.class)) {
            return null;
        }
        try {
            runAnimators.ag$a(context, "context");
            return valueOf.toString(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
        } catch (Throwable th) {
            isStateAtLeast.values(th, isRemoving.class);
            return null;
        }
    }

    public static final Map<String, String> values(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        if (isStateAtLeast.values(isRemoving.class)) {
            return null;
        }
        try {
            runAnimators.ag$a(context, "context");
            runAnimators.ag$a(arrayList, "skuList");
            Map<String, String> valueOf2 = valueOf.valueOf(arrayList);
            ArrayList<String> arrayList2 = new ArrayList<>();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!valueOf2.containsKey(next)) {
                    arrayList2.add(next);
                }
            }
            valueOf2.putAll(valueOf.ah$a(context, arrayList2, obj, z));
            return valueOf2;
        } catch (Throwable th) {
            isStateAtLeast.values(th, isRemoving.class);
            return null;
        }
    }

    private final Map<String, String> ah$a(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        int size;
        if (isStateAtLeast.values(this)) {
            return null;
        }
        try {
            Map<String, String> linkedHashMap = new LinkedHashMap<>();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                Object[] objArr = new Object[4];
                int i = 0;
                objArr[0] = 3;
                objArr[1] = ah$a;
                objArr[2] = z ? "subs" : "inapp";
                objArr[3] = bundle;
                Object isremoving = toString(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
                if (isremoving != null) {
                    Bundle bundle2 = (Bundle) isremoving;
                    if (bundle2.getInt("RESPONSE_CODE") == 0) {
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList != null && arrayList.size() == stringArrayList.size() && (size = arrayList.size() - 1) >= 0) {
                            while (true) {
                                int i2 = i + 1;
                                String str = arrayList.get(i);
                                runAnimators.ah$a(str, "skuList[i]");
                                String str2 = stringArrayList.get(i);
                                runAnimators.ah$a(str2, "skuDetailsList[i]");
                                linkedHashMap.put(str, str2);
                                if (i2 > size) {
                                    break;
                                }
                                i = i2;
                            }
                        }
                        toString(linkedHashMap);
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
            return null;
        }
    }

    private final Map<String, String> valueOf(ArrayList<String> arrayList) {
        if (isStateAtLeast.values(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                String string = ah$b.getString(next, null);
                if (string != null) {
                    List mode = Visibility.Mode.toString((CharSequence) string, new String[]{";"}, false, 2, 2, (Object) null);
                    if (currentTimeMillis - Long.parseLong((String) mode.get(0)) < 43200) {
                        runAnimators.ah$a(next, "sku");
                        linkedHashMap.put(next, mode.get(1));
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
            return null;
        }
    }

    private final void toString(Map<String, String> map) {
        if (isStateAtLeast.values(this)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor edit = ah$b.edit();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                edit.putString(entry.getKey(), currentTimeMillis + ';' + entry.getValue());
            }
            edit.apply();
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
        }
    }

    private final boolean ah$a(Context context, Object obj, String str) {
        if (isStateAtLeast.values(this) || obj == null) {
            return false;
        }
        try {
            Object isremoving = toString(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, ah$a, str});
            if (isremoving != null) {
                return ((Integer) isremoving).intValue() == 0;
            }
            return false;
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
            return false;
        }
    }

    public static final ArrayList<String> valueOf(Context context, Object obj) {
        if (isStateAtLeast.values(isRemoving.class)) {
            return null;
        }
        try {
            runAnimators.ag$a(context, "context");
            isRemoving isremoving = valueOf;
            return isremoving.ah$a(isremoving.valueOf(context, obj, "inapp"));
        } catch (Throwable th) {
            isStateAtLeast.values(th, isRemoving.class);
            return null;
        }
    }

    public static final ArrayList<String> values(Context context, Object obj) {
        if (isStateAtLeast.values(isRemoving.class)) {
            return null;
        }
        try {
            runAnimators.ag$a(context, "context");
            isRemoving isremoving = valueOf;
            return isremoving.ah$a(isremoving.valueOf(context, obj, "subs"));
        } catch (Throwable th) {
            isStateAtLeast.values(th, isRemoving.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0064 A[EDGE_INSN: B:61:0x0064->B:55:0x0064 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.ArrayList<java.lang.String> valueOf(android.content.Context r13, java.lang.Object r14, java.lang.String r15) {
        /*
            r12 = this;
            boolean r0 = o.isStateAtLeast.values(r12)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L65
            r0.<init>()     // Catch: java.lang.Throwable -> L65
            if (r14 != 0) goto L10
            return r0
        L10:
            boolean r2 = r12.ah$a(r13, r14, r15)     // Catch: java.lang.Throwable -> L65
            if (r2 == 0) goto L64
            r2 = 0
            r3 = r1
            r4 = 0
        L19:
            r5 = 4
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L65
            r5 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L65
            r11[r2] = r6     // Catch: java.lang.Throwable -> L65
            r6 = 1
            java.lang.String r7 = o.isRemoving.ah$a     // Catch: java.lang.Throwable -> L65
            r11[r6] = r7     // Catch: java.lang.Throwable -> L65
            r6 = 2
            r11[r6] = r15     // Catch: java.lang.Throwable -> L65
            r11[r5] = r3     // Catch: java.lang.Throwable -> L65
            java.lang.String r8 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r9 = "getPurchases"
            r6 = r12
            r7 = r13
            r10 = r14
            java.lang.Object r3 = r6.toString(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto L5d
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch: java.lang.Throwable -> L65
            java.lang.String r5 = "RESPONSE_CODE"
            int r5 = r3.getInt(r5)     // Catch: java.lang.Throwable -> L65
            if (r5 != 0) goto L5d
            java.lang.String r5 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r5 = r3.getStringArrayList(r5)     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L64
            int r6 = r5.size()     // Catch: java.lang.Throwable -> L65
            int r4 = r4 + r6
            java.util.Collection r5 = (java.util.Collection) r5     // Catch: java.lang.Throwable -> L65
            r0.addAll(r5)     // Catch: java.lang.Throwable -> L65
            java.lang.String r5 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Throwable -> L65
            goto L5e
        L5d:
            r3 = r1
        L5e:
            r5 = 30
            if (r4 >= r5) goto L64
            if (r3 != 0) goto L19
        L64:
            return r0
        L65:
            r13 = move-exception
            o.isStateAtLeast.values(r13, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isRemoving.valueOf(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    public final boolean toString(String str) {
        if (isStateAtLeast.values(this)) {
            return false;
        }
        try {
            runAnimators.ag$a(str, "skuDetail");
            try {
                String optString = new JSONObject(str).optString("freeTrialPeriod");
                if (optString != null) {
                    return optString.length() > 0;
                }
                return false;
            } catch (JSONException unused) {
                return false;
            }
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
            return false;
        }
    }

    public static final ArrayList<String> ag$a(Context context, Object obj) {
        isRemoving isremoving;
        Class<?> isremoving2;
        if (isStateAtLeast.values(isRemoving.class)) {
            return null;
        }
        try {
            runAnimators.ag$a(context, "context");
            ArrayList<String> arrayList = new ArrayList<>();
            return (obj == null || (isremoving2 = (isremoving = valueOf).toString(context, "com.android.vending.billing.IInAppBillingService")) == null || isremoving.valueOf(isremoving2, "getPurchaseHistory") == null) ? arrayList : isremoving.ah$a(isremoving.values(context, obj, "inapp"));
        } catch (Throwable th) {
            isStateAtLeast.values(th, isRemoving.class);
            return null;
        }
    }

    private final ArrayList<String> values(Context context, Object obj, String str) {
        ArrayList<String> stringArrayList;
        if (isStateAtLeast.values(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (ah$a(context, obj, str)) {
                String str2 = null;
                boolean z = false;
                int i = 0;
                do {
                    Object isremoving = toString(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, new Object[]{6, ah$a, str, str2, new Bundle()});
                    if (isremoving != null) {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) isremoving;
                        if (bundle.getInt("RESPONSE_CODE") == 0 && (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                            Iterator<String> it = stringArrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String next = it.next();
                                if (currentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / 1000) > 1200) {
                                    z = true;
                                    break;
                                }
                                arrayList.add(next);
                                i++;
                            }
                            str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                            if (i < 30 || str2 == null) {
                                break;
                                break;
                            }
                        }
                    }
                    str2 = null;
                    if (i < 30) {
                        break;
                    }
                } while (!z);
            }
            return arrayList;
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
            return null;
        }
    }

    private final ArrayList<String> ah$a(ArrayList<String> arrayList) {
        if (isStateAtLeast.values(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList2 = new ArrayList<>();
            SharedPreferences.Editor edit = values.edit();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                try {
                    JSONObject jSONObject = new JSONObject(next);
                    String string = jSONObject.getString("productId");
                    long j = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (currentTimeMillis - (j / 1000) <= 86400 && !runAnimators.values((Object) values.getString(string, ""), (Object) string2)) {
                        edit.putString(string, string2);
                        arrayList2.add(next);
                    }
                } catch (JSONException unused) {
                }
            }
            edit.apply();
            return arrayList2;
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final Method valueOf(Class<?> cls, String str) {
        Class[] clsArr;
        Method declaredMethod;
        if (isStateAtLeast.values(this)) {
            return null;
        }
        try {
            HashMap<String, Method> hashMap = toString;
            Method method = hashMap.get(str);
            if (method != null) {
                return method;
            }
            try {
                switch (str.hashCode()) {
                    case -1801122596:
                        if (!str.equals("getPurchases")) {
                            clsArr = null;
                            break;
                        } else {
                            Class cls2 = Integer.TYPE;
                            runAnimators.ah$a(cls2, "TYPE");
                            clsArr = new Class[]{cls2, String.class, String.class, String.class};
                            break;
                        }
                    case -1450694211:
                        if (!str.equals("isBillingSupported")) {
                            clsArr = null;
                            break;
                        } else {
                            Class cls3 = Integer.TYPE;
                            runAnimators.ah$a(cls3, "TYPE");
                            clsArr = new Class[]{cls3, String.class, String.class};
                            break;
                        }
                    case -1123215065:
                        if (!str.equals("asInterface")) {
                            clsArr = null;
                            break;
                        } else {
                            clsArr = new Class[]{IBinder.class};
                            break;
                        }
                    case -594356707:
                        if (!str.equals("getPurchaseHistory")) {
                            clsArr = null;
                            break;
                        } else {
                            Class cls4 = Integer.TYPE;
                            runAnimators.ah$a(cls4, "TYPE");
                            clsArr = new Class[]{cls4, String.class, String.class, String.class, Bundle.class};
                            break;
                        }
                    case -573310373:
                        if (!str.equals("getSkuDetails")) {
                            clsArr = null;
                            break;
                        } else {
                            Class cls5 = Integer.TYPE;
                            runAnimators.ah$a(cls5, "TYPE");
                            clsArr = new Class[]{cls5, String.class, String.class, Bundle.class};
                            break;
                        }
                    default:
                        clsArr = null;
                        break;
                }
                declaredMethod = clsArr == null ? cls.getDeclaredMethod(str, null) : cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                hashMap.put(str, declaredMethod);
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                return declaredMethod;
            }
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
            return null;
        }
    }

    private final Class<?> toString(Context context, String str) {
        Class<?> loadClass;
        if (isStateAtLeast.values(this)) {
            return null;
        }
        try {
            HashMap<String, Class<?>> hashMap = ag$a;
            Class<?> cls = hashMap.get(str);
            if (cls != null) {
                return cls;
            }
            try {
                loadClass = context.getClassLoader().loadClass(str);
                hashMap.put(str, loadClass);
                return loadClass;
            } catch (ClassNotFoundException unused) {
                return loadClass;
            }
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
            return null;
        }
    }

    private final Object toString(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method valueOf2;
        if (isStateAtLeast.values(this)) {
            return null;
        }
        try {
            Class<?> isremoving = toString(context, str);
            if (isremoving == null || (valueOf2 = valueOf(isremoving, str2)) == null) {
                return null;
            }
            if (obj != null) {
                obj = isremoving.cast(obj);
            }
            try {
                return valueOf2.invoke(obj, Arrays.copyOf(objArr, objArr.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
            return null;
        }
    }

    public static final void ag$a() {
        if (isStateAtLeast.values(isRemoving.class)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = ah$b;
            long j = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
            if (j == 0) {
                sharedPreferences.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
            } else if (currentTimeMillis - j > 604800) {
                sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
            }
        } catch (Throwable th) {
            isStateAtLeast.values(th, isRemoving.class);
        }
    }
}
