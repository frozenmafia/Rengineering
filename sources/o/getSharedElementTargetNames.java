package o;

import android.text.AndroidCharacter;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.TokenParser;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public final class getSharedElementTargetNames {
    private static char HaptikSDK$a = 0;
    private static int HaptikSDK$b = 1;
    private static int HaptikSDK$c;
    private static WeakReference<View> ag$a;
    private static char[] ah$a;
    private static Method toString;
    public static final getSharedElementTargetNames valueOf;
    private static final String values;

    static void ah$a() {
        HaptikSDK$a = (char) 2;
        ah$a = new char[]{2, 13822, 1, 13811};
    }

    private getSharedElementTargetNames() {
    }

    static {
        ah$a();
        valueOf = new getSharedElementTargetNames();
        values = getSharedElementTargetNames.class.getCanonicalName();
        Object[] objArr = null;
        ag$a = new WeakReference<>(null);
        try {
            int i = HaptikSDK$c + 7;
            HaptikSDK$b = i % 128;
            if ((i % 2 == 0 ? (char) 0 : (char) 18) != 18) {
                int length = objArr.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public static final ViewGroup HaptikSDK$a(View view) {
        Object[] objArr = null;
        if ((isStateAtLeast.values(getSharedElementTargetNames.class) ? 'L' : (char) 0) == 'L') {
            int i = HaptikSDK$b + 47;
            HaptikSDK$c = i % 128;
            if (i % 2 != 0) {
                int length = objArr.length;
                return null;
            }
            return null;
        }
        if (view == null) {
            int i2 = HaptikSDK$b + 95;
            HaptikSDK$c = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            int i4 = HaptikSDK$b + 35;
            HaptikSDK$c = i4 % 128;
            if (i4 % 2 != 0) {
                int length2 = objArr.length;
                return viewGroup;
            }
            return viewGroup;
        } catch (Throwable th) {
            isStateAtLeast.values(th, getSharedElementTargetNames.class);
            return null;
        }
    }

    public static final List<View> toString(View view) {
        try {
            int i = 0;
            Object[] objArr = null;
            if (!(!isStateAtLeast.values(getSharedElementTargetNames.class))) {
                int i2 = HaptikSDK$b + 47;
                HaptikSDK$c = i2 % 128;
                if (i2 % 2 != 0) {
                    int length = objArr.length;
                    return null;
                }
                return null;
            }
            try {
                ArrayList arrayList = new ArrayList();
                if (view instanceof ViewGroup) {
                    int childCount = ((ViewGroup) view).getChildCount();
                    if ((childCount > 0 ? (char) 30 : TokenParser.SP) == 30) {
                        while (true) {
                            int i3 = i + 1;
                            arrayList.add(((ViewGroup) view).getChildAt(i));
                            if (i3 >= childCount) {
                                break;
                            }
                            i = i3;
                        }
                    }
                }
                ArrayList arrayList2 = arrayList;
                int i4 = HaptikSDK$b + 23;
                HaptikSDK$c = i4 % 128;
                int i5 = i4 % 2;
                return arrayList2;
            } catch (Throwable th) {
                isStateAtLeast.values(th, getSharedElementTargetNames.class);
                return null;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public static final void values(View view, JSONObject jSONObject) {
        int i = HaptikSDK$c + 61;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        if (isStateAtLeast.values(getSharedElementTargetNames.class)) {
            return;
        }
        try {
            runAnimators.ag$a(view, Promotion.ACTION_VIEW);
            runAnimators.ag$a(jSONObject, "json");
            try {
                getSharedElementTargetNames getsharedelementtargetnames = valueOf;
                String HaptikSDK$b2 = HaptikSDK$b(view);
                String HaptikSDK$c2 = HaptikSDK$c(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                jSONObject.put("classname", view.getClass().getCanonicalName());
                jSONObject.put("classtypebitmask", ag$a(view));
                jSONObject.put(ag$a((byte) AndroidCharacter.getMirror('0'), new char[]{1, 3}, 2 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), view.getId());
                getSharedElementSourceNames getsharedelementsourcenames = getSharedElementSourceNames.valueOf;
                if (!(getSharedElementSourceNames.valueOf(view))) {
                    addRetainedFragment addretainedfragment = addRetainedFragment.valueOf;
                    addRetainedFragment addretainedfragment2 = addRetainedFragment.valueOf;
                    jSONObject.put("text", addRetainedFragment.toString(addRetainedFragment.HaptikSDK$a(HaptikSDK$b2), ""));
                } else {
                    jSONObject.put("text", "");
                    jSONObject.put("is_user_input", true);
                }
                addRetainedFragment addretainedfragment3 = addRetainedFragment.valueOf;
                addRetainedFragment addretainedfragment4 = addRetainedFragment.valueOf;
                jSONObject.put("hint", addRetainedFragment.toString(addRetainedFragment.HaptikSDK$a(HaptikSDK$c2), ""));
                if (tag != null) {
                    addRetainedFragment addretainedfragment5 = addRetainedFragment.valueOf;
                    addRetainedFragment addretainedfragment6 = addRetainedFragment.valueOf;
                    jSONObject.put("tag", addRetainedFragment.toString(addRetainedFragment.HaptikSDK$a(tag.toString()), ""));
                    int i3 = HaptikSDK$b + 3;
                    HaptikSDK$c = i3 % 128;
                    int i4 = i3 % 2;
                }
                if (contentDescription != null) {
                    addRetainedFragment addretainedfragment7 = addRetainedFragment.valueOf;
                    addRetainedFragment addretainedfragment8 = addRetainedFragment.valueOf;
                    jSONObject.put("description", addRetainedFragment.toString(addRetainedFragment.HaptikSDK$a(contentDescription.toString()), ""));
                }
                jSONObject.put("dimension", getsharedelementtargetnames.invoke(view));
            } catch (JSONException e) {
                addRetainedFragment addretainedfragment9 = addRetainedFragment.valueOf;
                addRetainedFragment.valueOf(values, e);
            }
        } catch (Throwable th) {
            isStateAtLeast.values(th, getSharedElementTargetNames.class);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (o.isStateAtLeast.values(o.getSharedElementTargetNames.class) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        if ((!o.isStateAtLeast.values(o.getSharedElementTargetNames.class)) != true) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
        o.runAnimators.ag$a(r8, com.google.android.gms.analytics.ecommerce.Promotion.ACTION_VIEW);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
        if (o.runAnimators.values((java.lang.Object) r8.getClass().getName(), (java.lang.Object) "com.facebook.react.ReactRootView") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
        o.getSharedElementTargetNames.ag$a = new java.lang.ref.WeakReference<>(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        r1 = new org.json.JSONObject();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
        values(r8, r1);
        r2 = new org.json.JSONArray();
        r8 = toString(r8);
        r6 = r8.size() - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
        if (r6 < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
        r7 = '`';
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
        r7 = 'C';
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
        if (r7 == '`') goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
        r4 = r5 + 1;
        r2.put(valueOf(r8.get(r5)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
        if (r4 <= r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
        r8 = o.getSharedElementTargetNames.HaptikSDK$c + 83;
        o.getSharedElementTargetNames.HaptikSDK$b = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
        r1.put("childviews", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
        r5 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0091, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0092, code lost:
        android.util.Log.e(o.getSharedElementTargetNames.values, "Failed to create JSONObject for view.", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009c, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009d, code lost:
        o.isStateAtLeast.values(r8, o.getSharedElementTargetNames.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a0, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final org.json.JSONObject valueOf(android.view.View r8) {
        /*
            java.lang.Class<o.getSharedElementTargetNames> r0 = o.getSharedElementTargetNames.class
            int r1 = o.getSharedElementTargetNames.HaptikSDK$c
            int r1 = r1 + 9
            int r2 = r1 % 128
            o.getSharedElementTargetNames.HaptikSDK$b = r2
            int r1 = r1 % 2
            r2 = 38
            if (r1 != 0) goto L12
            r1 = 5
            goto L14
        L12:
            r1 = 38
        L14:
            r3 = 0
            r4 = 1
            r5 = 0
            if (r1 == r2) goto L24
            boolean r1 = o.isStateAtLeast.values(r0)
            int r2 = r5 / r5
            if (r1 == 0) goto L30
            goto L2f
        L22:
            r8 = move-exception
            throw r8
        L24:
            boolean r1 = o.isStateAtLeast.values(r0)
            if (r1 == 0) goto L2c
            r1 = 0
            goto L2d
        L2c:
            r1 = 1
        L2d:
            if (r1 == r4) goto L30
        L2f:
            return r3
        L30:
            java.lang.String r1 = "view"
            o.runAnimators.ag$a(r8, r1)     // Catch: java.lang.Throwable -> L9c
            java.lang.Class r1 = r8.getClass()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r2 = "com.facebook.react.ReactRootView"
            boolean r1 = o.runAnimators.values(r1, r2)     // Catch: java.lang.Throwable -> L9c
            if (r1 == 0) goto L4c
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L9c
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L9c
            o.getSharedElementTargetNames.ag$a = r1     // Catch: java.lang.Throwable -> L9c
        L4c:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L9c
            r1.<init>()     // Catch: java.lang.Throwable -> L9c
            values(r8, r1)     // Catch: org.json.JSONException -> L91 java.lang.Throwable -> L9c
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> L91 java.lang.Throwable -> L9c
            r2.<init>()     // Catch: org.json.JSONException -> L91 java.lang.Throwable -> L9c
            java.util.List r8 = toString(r8)     // Catch: org.json.JSONException -> L91 java.lang.Throwable -> L9c
            int r6 = r8.size()     // Catch: org.json.JSONException -> L91 java.lang.Throwable -> L9c
            int r6 = r6 - r4
            r4 = 96
            if (r6 < 0) goto L69
            r7 = 96
            goto L6b
        L69:
            r7 = 67
        L6b:
            if (r7 == r4) goto L6e
            goto L89
        L6e:
            int r4 = r5 + 1
            java.lang.Object r5 = r8.get(r5)     // Catch: org.json.JSONException -> L91 java.lang.Throwable -> L9c
            android.view.View r5 = (android.view.View) r5     // Catch: org.json.JSONException -> L91 java.lang.Throwable -> L9c
            org.json.JSONObject r5 = valueOf(r5)     // Catch: org.json.JSONException -> L91 java.lang.Throwable -> L9c
            r2.put(r5)     // Catch: org.json.JSONException -> L91 java.lang.Throwable -> L9c
            if (r4 <= r6) goto L8f
            int r8 = o.getSharedElementTargetNames.HaptikSDK$c
            int r8 = r8 + 83
            int r4 = r8 % 128
            o.getSharedElementTargetNames.HaptikSDK$b = r4
            int r8 = r8 % 2
        L89:
            java.lang.String r8 = "childviews"
            r1.put(r8, r2)     // Catch: org.json.JSONException -> L91 java.lang.Throwable -> L9c
            goto L9b
        L8f:
            r5 = r4
            goto L6e
        L91:
            r8 = move-exception
            java.lang.String r2 = o.getSharedElementTargetNames.values     // Catch: java.lang.Throwable -> L9c
            java.lang.String r4 = "Failed to create JSONObject for view."
            java.lang.Throwable r8 = (java.lang.Throwable) r8     // Catch: java.lang.Throwable -> L9c
            android.util.Log.e(r2, r4, r8)     // Catch: java.lang.Throwable -> L9c
        L9b:
            return r1
        L9c:
            r8 = move-exception
            o.isStateAtLeast.values(r8, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSharedElementTargetNames.valueOf(android.view.View):org.json.JSONObject");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
        if ((r8 instanceof android.widget.Button) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0082, code lost:
        if (r2 != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int ag$a(android.view.View r8) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSharedElementTargetNames.ag$a(android.view.View):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean getInitSettings(android.view.View r5) {
        /*
            java.lang.Class<o.getSharedElementTargetNames> r0 = o.getSharedElementTargetNames.class
            int r1 = o.getSharedElementTargetNames.HaptikSDK$b     // Catch: java.lang.Exception -> L73
            int r1 = r1 + 33
            int r2 = r1 % 128
            o.getSharedElementTargetNames.HaptikSDK$c = r2     // Catch: java.lang.Exception -> L73
            int r1 = r1 % 2
            r2 = 0
            if (r1 == 0) goto L16
            boolean r1 = o.isStateAtLeast.values(r0)
            if (r1 == 0) goto L1d
            goto L1c
        L16:
            boolean r1 = o.isStateAtLeast.values(r0)
            if (r1 == 0) goto L1d
        L1c:
            return r2
        L1d:
            android.view.ViewParent r5 = r5.getParent()     // Catch: java.lang.Throwable -> L6e
            boolean r1 = r5 instanceof android.widget.AdapterView     // Catch: java.lang.Throwable -> L6e
            r3 = 45
            if (r1 == 0) goto L2a
            r1 = 45
            goto L2c
        L2a:
            r1 = 57
        L2c:
            r4 = 1
            if (r1 == r3) goto L6d
            o.getSharedElementTargetNames r1 = o.getSharedElementTargetNames.valueOf     // Catch: java.lang.Throwable -> L6e
            java.lang.String r3 = "android.support.v4.view.NestedScrollingChild"
            java.lang.Class r3 = r1.toString(r3)     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto L45
            boolean r3 = r3.isInstance(r5)     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto L41
            r3 = 1
            goto L42
        L41:
            r3 = 0
        L42:
            if (r3 == 0) goto L45
            return r4
        L45:
            java.lang.String r3 = "androidx.core.view.NestedScrollingChild"
            java.lang.Class r1 = r1.toString(r3)     // Catch: java.lang.Throwable -> L6e
            if (r1 == 0) goto L55
            boolean r5 = r1.isInstance(r5)     // Catch: java.lang.Throwable -> L6e
            if (r5 == 0) goto L55
            r5 = 1
            goto L56
        L55:
            r5 = 0
        L56:
            int r0 = o.getSharedElementTargetNames.HaptikSDK$b
            int r0 = r0 + 3
            int r1 = r0 % 128
            o.getSharedElementTargetNames.HaptikSDK$c = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L63
            r2 = 1
        L63:
            if (r2 == 0) goto L6c
            r0 = 0
            super.hashCode()     // Catch: java.lang.Throwable -> L6a
            return r5
        L6a:
            r5 = move-exception
            throw r5
        L6c:
            return r5
        L6d:
            return r4
        L6e:
            r5 = move-exception
            o.isStateAtLeast.values(r5, r0)
            return r2
        L73:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSharedElementTargetNames.getInitSettings(android.view.View):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
        if ((r10 instanceof android.widget.Switch) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0140, code lost:
        if ((r2 <= 0) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0153, code lost:
        if (r2 > 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0155, code lost:
        r5 = r4 + 1;
        r4 = ((android.widget.RadioGroup) r10).getChildAt(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0162, code lost:
        if (r4.getId() != r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0164, code lost:
        r7 = o.getSharedElementTargetNames.HaptikSDK$c + 3;
        o.getSharedElementTargetNames.HaptikSDK$b = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016c, code lost:
        if ((r7 % 2) != 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016e, code lost:
        r7 = r4 instanceof android.widget.RadioButton;
        r9 = r6.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0171, code lost:
        if (r7 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0176, code lost:
        if ((r4 instanceof android.widget.RadioButton) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0178, code lost:
        r1 = ((android.widget.RadioButton) r4).getText();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x017f, code lost:
        if (r5 < r2) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0181, code lost:
        r10 = o.getSharedElementTargetNames.HaptikSDK$b + 35;
        o.getSharedElementTargetNames.HaptikSDK$c = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018b, code lost:
        r4 = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String HaptikSDK$b(android.view.View r10) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSharedElementTargetNames.HaptikSDK$b(android.view.View):java.lang.String");
    }

    public static final String HaptikSDK$c(View view) {
        CharSequence charSequence;
        if ((isStateAtLeast.values(getSharedElementTargetNames.class) ? (char) 2 : 'D') != 2) {
            try {
                if (!(view instanceof EditText)) {
                    if (!(!(view instanceof TextView))) {
                        int i = HaptikSDK$b + 105;
                        HaptikSDK$c = i % 128;
                        if (i % 2 != 0) {
                            charSequence = ((TextView) view).getHint();
                            int i2 = 15 / 0;
                        } else {
                            charSequence = ((TextView) view).getHint();
                        }
                    } else {
                        charSequence = null;
                    }
                } else {
                    int i3 = HaptikSDK$c + 105;
                    HaptikSDK$b = i3 % 128;
                    int i4 = i3 % 2;
                    charSequence = ((EditText) view).getHint();
                }
                if ((charSequence == null ? 'X' : '9') != 'X') {
                    String obj = charSequence.toString();
                    if (obj != null) {
                        return obj;
                    }
                    try {
                        int i5 = HaptikSDK$b + 41;
                        try {
                            HaptikSDK$c = i5 % 128;
                            int i6 = i5 % 2;
                        } catch (Exception e) {
                            throw e;
                        }
                    } catch (Exception e2) {
                        throw e2;
                    }
                }
                return "";
            } catch (Throwable th) {
                isStateAtLeast.values(th, getSharedElementTargetNames.class);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
        if ((o.isStateAtLeast.values(r6) ? '3' : 'I') != '3') goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
        if ((!o.isStateAtLeast.values(r6)) != true) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002f, code lost:
        r7 = o.getSharedElementTargetNames.HaptikSDK$c + 47;
        o.getSharedElementTargetNames.HaptikSDK$b = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        if ((r7 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
        r7 = org.apache.http.message.TokenParser.SP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
        if (r7 == 1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0044, code lost:
        r7 = 20 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0048, code lost:
        r0 = new org.json.JSONObject();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
        r0.put(com.facebook.react.uimanager.ViewProps.TOP, r7.getTop());
        r0.put("left", r7.getLeft());
        r0.put("width", r7.getWidth());
        r0.put("height", r7.getHeight());
        r0.put("scrollx", r7.getScrollX());
        r0.put("scrolly", r7.getScrollY());
        r0.put("visibility", r7.getVisibility());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
        android.util.Log.e(o.getSharedElementTargetNames.values, "Failed to create JSONObject for dimension.", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
        o.isStateAtLeast.values(r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009c, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final org.json.JSONObject invoke(android.view.View r7) {
        /*
            r6 = this;
            int r0 = o.getSharedElementTargetNames.HaptikSDK$b
            r1 = 73
            int r0 = r0 + r1
            int r2 = r0 % 128
            o.getSharedElementTargetNames.HaptikSDK$c = r2
            int r0 = r0 % 2
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L24
            boolean r0 = o.isStateAtLeast.values(r6)     // Catch: java.lang.Exception -> L22
            r5 = 87
            int r5 = r5 / r3
            r5 = 51
            if (r0 == 0) goto L1d
            r1 = 51
        L1d:
            if (r1 == r5) goto L2f
            goto L48
        L20:
            r7 = move-exception
            throw r7
        L22:
            r7 = move-exception
            throw r7
        L24:
            boolean r0 = o.isStateAtLeast.values(r6)     // Catch: java.lang.Exception -> L9d
            if (r0 == 0) goto L2c
            r0 = 0
            goto L2d
        L2c:
            r0 = 1
        L2d:
            if (r0 == r4) goto L48
        L2f:
            int r7 = o.getSharedElementTargetNames.HaptikSDK$c
            int r7 = r7 + 47
            int r0 = r7 % 128
            o.getSharedElementTargetNames.HaptikSDK$b = r0
            int r7 = r7 % 2
            if (r7 != 0) goto L3d
            r7 = 1
            goto L3f
        L3d:
            r7 = 32
        L3f:
            if (r7 == r4) goto L42
            return r2
        L42:
            r7 = 20
            int r7 = r7 / r3
            return r2
        L46:
            r7 = move-exception
            throw r7
        L48:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L98
            r0.<init>()     // Catch: java.lang.Throwable -> L98
            java.lang.String r1 = "top"
            int r3 = r7.getTop()     // Catch: org.json.JSONException -> L8d java.lang.Throwable -> L98
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L8d java.lang.Throwable -> L98
            java.lang.String r1 = "left"
            int r3 = r7.getLeft()     // Catch: org.json.JSONException -> L8d java.lang.Throwable -> L98
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L8d java.lang.Throwable -> L98
            java.lang.String r1 = "width"
            int r3 = r7.getWidth()     // Catch: org.json.JSONException -> L8d java.lang.Throwable -> L98
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L8d java.lang.Throwable -> L98
            java.lang.String r1 = "height"
            int r3 = r7.getHeight()     // Catch: org.json.JSONException -> L8d java.lang.Throwable -> L98
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L8d java.lang.Throwable -> L98
            java.lang.String r1 = "scrollx"
            int r3 = r7.getScrollX()     // Catch: org.json.JSONException -> L8d java.lang.Throwable -> L98
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L8d java.lang.Throwable -> L98
            java.lang.String r1 = "scrolly"
            int r3 = r7.getScrollY()     // Catch: org.json.JSONException -> L8d java.lang.Throwable -> L98
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L8d java.lang.Throwable -> L98
            java.lang.String r1 = "visibility"
            int r7 = r7.getVisibility()     // Catch: org.json.JSONException -> L8d java.lang.Throwable -> L98
            r0.put(r1, r7)     // Catch: org.json.JSONException -> L8d java.lang.Throwable -> L98
            goto L97
        L8d:
            r7 = move-exception
            java.lang.String r1 = o.getSharedElementTargetNames.values     // Catch: java.lang.Throwable -> L98
            java.lang.String r3 = "Failed to create JSONObject for dimension."
            java.lang.Throwable r7 = (java.lang.Throwable) r7     // Catch: java.lang.Throwable -> L98
            android.util.Log.e(r1, r3, r7)     // Catch: java.lang.Throwable -> L98
        L97:
            return r0
        L98:
            r7 = move-exception
            o.isStateAtLeast.values(r7, r6)
            return r2
        L9d:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSharedElementTargetNames.invoke(android.view.View):org.json.JSONObject");
    }

    public static final View.OnClickListener values(View view) {
        int i = HaptikSDK$b + 81;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        Object[] objArr = null;
        if ((isStateAtLeast.values(getSharedElementTargetNames.class) ? '8' : '1') != '1') {
            return null;
        }
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            runAnimators.ah$a(declaredField, "forName(\"android.view.View\").getDeclaredField(\"mListenerInfo\")");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(view);
            if (obj == null) {
                int i3 = HaptikSDK$b + 87;
                HaptikSDK$c = i3 % 128;
                if (i3 % 2 != 0) {
                    super.hashCode();
                    return null;
                }
                return null;
            }
            Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
            runAnimators.ah$a(declaredField2, "forName(\"android.view.View\\$ListenerInfo\").getDeclaredField(\"mOnClickListener\")");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (obj2 != null) {
                int i4 = HaptikSDK$b + 125;
                HaptikSDK$c = i4 % 128;
                if (i4 % 2 != 0) {
                    View.OnClickListener onClickListener = (View.OnClickListener) obj2;
                    int length = objArr.length;
                    return onClickListener;
                }
                return (View.OnClickListener) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnClickListener");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th) {
            isStateAtLeast.values(th, getSharedElementTargetNames.class);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
        if (r3 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
        if (r3 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        r1 = o.getSharedElementTargetNames.HaptikSDK$b + 51;
        o.getSharedElementTargetNames.HaptikSDK$c = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
        r2.setAccessible(true);
        r3.setAccessible(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
        r2.setAccessible(true);
        r1 = r2.get(r6);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void values(android.view.View r6, android.view.View.OnClickListener r7) {
        /*
            java.lang.Class<o.getSharedElementTargetNames> r0 = o.getSharedElementTargetNames.class
            boolean r1 = o.isStateAtLeast.values(r0)
            if (r1 == 0) goto L9
            return
        L9:
            java.lang.String r1 = "view"
            o.runAnimators.ag$a(r6, r1)     // Catch: java.lang.Throwable -> L87
            r1 = 0
            java.lang.String r2 = "android.view.View"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L86 java.lang.Throwable -> L87
            java.lang.String r3 = "mListenerInfo"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L86 java.lang.Throwable -> L87
            java.lang.String r3 = "android.view.View$ListenerInfo"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L86 java.lang.Throwable -> L87
            java.lang.String r4 = "mOnClickListener"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L86 java.lang.Throwable -> L87
            goto L2a
        L28:
            r2 = r1
        L29:
            r3 = r1
        L2a:
            r4 = 54
            if (r2 == 0) goto L31
            r5 = 32
            goto L33
        L31:
            r5 = 54
        L33:
            if (r5 == r4) goto L83
            int r4 = o.getSharedElementTargetNames.HaptikSDK$b
            int r4 = r4 + 37
            int r5 = r4 % 128
            o.getSharedElementTargetNames.HaptikSDK$c = r5
            int r4 = r4 % 2
            r5 = 12
            if (r4 == 0) goto L46
            r4 = 12
            goto L48
        L46:
            r4 = 36
        L48:
            if (r4 == r5) goto L4d
            if (r3 != 0) goto L5d
            goto L50
        L4d:
            int r4 = r1.length     // Catch: java.lang.Throwable -> L81
            if (r3 != 0) goto L5d
        L50:
            int r1 = o.getSharedElementTargetNames.HaptikSDK$b     // Catch: java.lang.Exception -> L5b
            int r1 = r1 + 51
            int r2 = r1 % 128
            o.getSharedElementTargetNames.HaptikSDK$c = r2     // Catch: java.lang.Exception -> L5b
            int r1 = r1 % 2
            goto L83
        L5b:
            r6 = move-exception
            throw r6
        L5d:
            r4 = 1
            r2.setAccessible(r4)     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> L87
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> L87
            r2.setAccessible(r4)     // Catch: java.lang.IllegalAccessException -> L6c java.lang.Exception -> L86 java.lang.Throwable -> L87
            java.lang.Object r1 = r2.get(r6)     // Catch: java.lang.IllegalAccessException -> L6c java.lang.Exception -> L86 java.lang.Throwable -> L87
            goto L6d
        L6c:
        L6d:
            if (r1 != 0) goto L73
            r6.setOnClickListener(r7)     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> L87
            return
        L73:
            r3.set(r1, r7)     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> L87
            int r6 = o.getSharedElementTargetNames.HaptikSDK$b
            int r6 = r6 + 123
            int r7 = r6 % 128
            o.getSharedElementTargetNames.HaptikSDK$c = r7
            int r6 = r6 % 2
            goto L86
        L81:
            r6 = move-exception
            throw r6
        L83:
            r6.setOnClickListener(r7)     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> L87
        L86:
            return
        L87:
            r6 = move-exception
            o.isStateAtLeast.values(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSharedElementTargetNames.values(android.view.View, android.view.View$OnClickListener):void");
    }

    public static final View.OnTouchListener ah$b(View view) {
        int i = HaptikSDK$b + 11;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        try {
            Object[] objArr = null;
            try {
                if ((isStateAtLeast.values(getSharedElementTargetNames.class) ? '/' : (char) 31) != 31) {
                    return null;
                }
                try {
                    try {
                        Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                        runAnimators.ah$a(declaredField, "forName(\"android.view.View\").getDeclaredField(\"mListenerInfo\")");
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(view);
                        if (obj == null) {
                            return null;
                        }
                        Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
                        runAnimators.ah$a(declaredField2, "forName(\"android.view.View\\$ListenerInfo\").getDeclaredField(\"mOnTouchListener\")");
                        declaredField2.setAccessible(true);
                        Object obj2 = declaredField2.get(obj);
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnTouchListener");
                        }
                        int i3 = HaptikSDK$b + 71;
                        HaptikSDK$c = i3 % 128;
                        if ((i3 % 2 != 0 ? '\t' : '`') != '\t') {
                            return (View.OnTouchListener) obj2;
                        }
                        View.OnTouchListener onTouchListener = (View.OnTouchListener) obj2;
                        int length = objArr.length;
                        return onTouchListener;
                    } catch (NoSuchFieldException e) {
                        addRetainedFragment addretainedfragment = addRetainedFragment.valueOf;
                        addRetainedFragment.valueOf(values, e);
                        return null;
                    }
                } catch (ClassNotFoundException e2) {
                    addRetainedFragment addretainedfragment2 = addRetainedFragment.valueOf;
                    addRetainedFragment.valueOf(values, e2);
                    return null;
                } catch (IllegalAccessException e3) {
                    addRetainedFragment addretainedfragment3 = addRetainedFragment.valueOf;
                    addRetainedFragment.valueOf(values, e3);
                    return null;
                }
            } catch (Throwable th) {
                isStateAtLeast.values(th, getSharedElementTargetNames.class);
                return null;
            }
        } catch (Exception e4) {
            throw e4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
        if ((r8 != null ? '+' : 'b') != 'b') goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007b, code lost:
        if ((r8 == null) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008d, code lost:
        if ((r8 != null ? '7' : 'Q') != 'Q') goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0091, code lost:
        return (android.view.View) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0097, code lost:
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.View");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.view.View valueOf(float[] r8, android.view.View r9) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSharedElementTargetNames.valueOf(float[], android.view.View):android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
        if ((r6.getId() == r5.getId() ? 'T' : ';') != 'T') goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r6.getId() == r5.getId()) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
        r5 = o.getSharedElementTargetNames.HaptikSDK$b + 89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
        o.getSharedElementTargetNames.HaptikSDK$c = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean valueOf(android.view.View r5, android.view.View r6) {
        /*
            r4 = this;
            int r0 = o.getSharedElementTargetNames.HaptikSDK$c
            int r0 = r0 + 55
            int r1 = r0 % 128
            o.getSharedElementTargetNames.HaptikSDK$b = r1
            int r0 = r0 % 2
            boolean r0 = o.isStateAtLeast.values(r4)     // Catch: java.lang.Exception -> L86
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == r1) goto L85
            java.lang.String r0 = "view"
            o.runAnimators.ag$a(r5, r0)     // Catch: java.lang.Throwable -> L81
            java.lang.Class r0 = r5.getClass()     // Catch: java.lang.Throwable -> L81
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L81
            java.lang.String r3 = "view.javaClass.name"
            o.runAnimators.ah$a(r0, r3)     // Catch: java.lang.Throwable -> L81
            java.lang.String r3 = "com.facebook.react.views.view.ReactViewGroup"
            boolean r0 = o.runAnimators.values(r0, r3)     // Catch: java.lang.Throwable -> L81
            r3 = 12
            if (r0 == 0) goto L36
            r0 = 12
            goto L38
        L36:
            r0 = 42
        L38:
            if (r0 == r3) goto L3b
            goto L7f
        L3b:
            float[] r0 = r4.HaptikWebView(r5)     // Catch: java.lang.Throwable -> L81
            android.view.View r6 = r4.valueOf(r0, r6)     // Catch: java.lang.Throwable -> L81
            if (r6 == 0) goto L7f
            int r0 = o.getSharedElementTargetNames.HaptikSDK$b
            int r0 = r0 + 7
            int r3 = r0 % 128
            o.getSharedElementTargetNames.HaptikSDK$c = r3
            int r0 = r0 % 2
            if (r0 == 0) goto L6a
            int r6 = r6.getId()     // Catch: java.lang.Throwable -> L81
            int r5 = r5.getId()     // Catch: java.lang.Throwable -> L81
            r0 = 34
            int r0 = r0 / r2
            r0 = 84
            if (r6 != r5) goto L63
            r5 = 84
            goto L65
        L63:
            r5 = 59
        L65:
            if (r5 == r0) goto L74
            goto L7f
        L68:
            r5 = move-exception
            throw r5
        L6a:
            int r6 = r6.getId()     // Catch: java.lang.Throwable -> L81
            int r5 = r5.getId()     // Catch: java.lang.Throwable -> L81
            if (r6 != r5) goto L7f
        L74:
            int r5 = o.getSharedElementTargetNames.HaptikSDK$b     // Catch: java.lang.Exception -> L86
            int r5 = r5 + 89
            int r6 = r5 % 128
            o.getSharedElementTargetNames.HaptikSDK$c = r6     // Catch: java.lang.Exception -> L86
            int r5 = r5 % 2
            goto L80
        L7f:
            r1 = 0
        L80:
            return r1
        L81:
            r5 = move-exception
            o.isStateAtLeast.values(r5, r4)
        L85:
            return r2
        L86:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSharedElementTargetNames.valueOf(android.view.View, android.view.View):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
        if ((r0 ? 0 : 'D') != 'D') goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
        if ((!o.isStateAtLeast.values(r3)) != true) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0035, code lost:
        r4 = o.getSharedElementTargetNames.HaptikSDK$c + 53;
        o.getSharedElementTargetNames.HaptikSDK$b = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
        return o.runAnimators.values((java.lang.Object) r4.getClass().getName(), (java.lang.Object) "com.facebook.react.ReactRootView");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
        o.isStateAtLeast.values(r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean getSignupData(android.view.View r4) {
        /*
            r3 = this;
            int r0 = o.getSharedElementTargetNames.HaptikSDK$b
            int r0 = r0 + 65
            int r1 = r0 % 128
            o.getSharedElementTargetNames.HaptikSDK$c = r1
            int r0 = r0 % 2
            r1 = 11
            if (r0 == 0) goto L11
            r0 = 73
            goto L13
        L11:
            r0 = 11
        L13:
            r2 = 0
            if (r0 == r1) goto L29
            boolean r0 = o.isStateAtLeast.values(r3)
            r1 = 0
            int r1 = r1.length     // Catch: java.lang.Throwable -> L27
            r1 = 68
            if (r0 == 0) goto L22
            r0 = 0
            goto L24
        L22:
            r0 = 68
        L24:
            if (r0 == r1) goto L40
            goto L35
        L27:
            r4 = move-exception
            throw r4
        L29:
            boolean r0 = o.isStateAtLeast.values(r3)
            r1 = 1
            if (r0 == 0) goto L32
            r0 = 0
            goto L33
        L32:
            r0 = 1
        L33:
            if (r0 == r1) goto L40
        L35:
            int r4 = o.getSharedElementTargetNames.HaptikSDK$c
            int r4 = r4 + 53
            int r0 = r4 % 128
            o.getSharedElementTargetNames.HaptikSDK$b = r0
            int r4 = r4 % 2
            return r2
        L40:
            java.lang.Class r4 = r4.getClass()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = "com.facebook.react.ReactRootView"
            boolean r4 = o.runAnimators.values(r4, r0)     // Catch: java.lang.Throwable -> L4f
            return r4
        L4f:
            r4 = move-exception
            o.isStateAtLeast.values(r4, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSharedElementTargetNames.getSignupData(android.view.View):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
        if (o.isStateAtLeast.values(o.getSharedElementTargetNames.class) != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
        r4 = o.getSharedElementTargetNames.HaptikSDK$b + 67;
        o.getSharedElementTargetNames.HaptikSDK$c = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        if ((r4 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
        r4 = '\n';
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        r4 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
        if (r4 == 16) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
        r4 = r2.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
        if (r4 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
        if (o.getSharedElementTargetNames.valueOf.getSignupData(r4) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
        r1 = 'D';
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004c, code lost:
        r1 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004d, code lost:
        if (r1 == 6) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004f, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
        r4 = r4.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0056, code lost:
        if ((r4 instanceof android.view.View) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        r4 = (android.view.View) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005b, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005c, code lost:
        o.isStateAtLeast.values(r4, o.getSharedElementTargetNames.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r1 != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.view.View ah$a(android.view.View r4) {
        /*
            java.lang.Class<o.getSharedElementTargetNames> r0 = o.getSharedElementTargetNames.class
            int r1 = o.getSharedElementTargetNames.HaptikSDK$b
            int r1 = r1 + 85
            int r2 = r1 % 128
            o.getSharedElementTargetNames.HaptikSDK$c = r2
            int r1 = r1 % 2
            r2 = 0
            if (r1 == 0) goto L1d
            boolean r1 = o.isStateAtLeast.values(r0)     // Catch: java.lang.Exception -> L1b
            super.hashCode()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L3e
            goto L23
        L19:
            r4 = move-exception
            throw r4
        L1b:
            r4 = move-exception
            goto L3d
        L1d:
            boolean r1 = o.isStateAtLeast.values(r0)
            if (r1 == 0) goto L3e
        L23:
            int r4 = o.getSharedElementTargetNames.HaptikSDK$b     // Catch: java.lang.Exception -> L1b
            int r4 = r4 + 67
            int r0 = r4 % 128
            o.getSharedElementTargetNames.HaptikSDK$c = r0     // Catch: java.lang.Exception -> L1b
            int r4 = r4 % 2
            r0 = 16
            if (r4 == 0) goto L34
            r4 = 10
            goto L36
        L34:
            r4 = 16
        L36:
            if (r4 == r0) goto L3c
            int r4 = r2.length     // Catch: java.lang.Throwable -> L3a
            return r2
        L3a:
            r4 = move-exception
            throw r4
        L3c:
            return r2
        L3d:
            throw r4
        L3e:
            if (r4 == 0) goto L5f
            o.getSharedElementTargetNames r1 = o.getSharedElementTargetNames.valueOf     // Catch: java.lang.Throwable -> L5b
            boolean r1 = r1.getSignupData(r4)     // Catch: java.lang.Throwable -> L5b
            r3 = 6
            if (r1 == 0) goto L4c
            r1 = 68
            goto L4d
        L4c:
            r1 = 6
        L4d:
            if (r1 == r3) goto L50
            return r4
        L50:
            android.view.ViewParent r4 = r4.getParent()     // Catch: java.lang.Throwable -> L5b
            boolean r1 = r4 instanceof android.view.View     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L5f
            android.view.View r4 = (android.view.View) r4     // Catch: java.lang.Throwable -> L5b
            goto L3e
        L5b:
            r4 = move-exception
            o.isStateAtLeast.values(r4, r0)
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSharedElementTargetNames.ah$a(android.view.View):android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
        if ((o.isStateAtLeast.values(r6)) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        if (o.isStateAtLeast.values(r6) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
        r0 = new int[2];
        r7.getLocationOnScreen(r0);
        r7 = new float[]{r0[0], r0[1]};
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
        r0 = o.getSharedElementTargetNames.HaptikSDK$c + 29;
        o.getSharedElementTargetNames.HaptikSDK$b = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
        o.isStateAtLeast.values(r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final float[] HaptikWebView(android.view.View r7) {
        /*
            r6 = this;
            int r0 = o.getSharedElementTargetNames.HaptikSDK$b
            int r0 = r0 + 49
            int r1 = r0 % 128
            o.getSharedElementTargetNames.HaptikSDK$c = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 27
            if (r0 == 0) goto L11
            r0 = 60
            goto L13
        L11:
            r0 = 27
        L13:
            r3 = 0
            r4 = 1
            r5 = 0
            if (r0 == r2) goto L29
            boolean r0 = o.isStateAtLeast.values(r6)
            r2 = 71
            int r2 = r2 / r5
            if (r0 == 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            if (r0 == 0) goto L30
            goto L2f
        L27:
            r7 = move-exception
            throw r7
        L29:
            boolean r0 = o.isStateAtLeast.values(r6)
            if (r0 == 0) goto L30
        L2f:
            return r3
        L30:
            int[] r0 = new int[r1]     // Catch: java.lang.Throwable -> L4b
            r7.getLocationOnScreen(r0)     // Catch: java.lang.Throwable -> L4b
            float[] r7 = new float[r1]     // Catch: java.lang.Throwable -> L4b
            r2 = r0[r5]     // Catch: java.lang.Throwable -> L4b
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L4b
            r7[r5] = r2     // Catch: java.lang.Throwable -> L4b
            r0 = r0[r4]     // Catch: java.lang.Throwable -> L4b
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L4b
            r7[r4] = r0     // Catch: java.lang.Throwable -> L4b
            int r0 = o.getSharedElementTargetNames.HaptikSDK$c
            int r0 = r0 + 29
            int r2 = r0 % 128
            o.getSharedElementTargetNames.HaptikSDK$b = r2
            int r0 = r0 % r1
            return r7
        L4b:
            r7 = move-exception
            o.isStateAtLeast.values(r7, r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSharedElementTargetNames.HaptikWebView(android.view.View):float[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (o.isStateAtLeast.values(r6) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
        r0 = o.getSharedElementTargetNames.HaptikSDK$c + 99;
        o.getSharedElementTargetNames.HaptikSDK$b = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        if ((r0 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        r0 = 'M';
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
        r0 = '1';
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r0 == 'M') goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
        if (o.getSharedElementTargetNames.toString == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
        r0 = java.lang.Class.forName("com.facebook.react.uimanager.TouchTargetHelper");
        o.runAnimators.ah$a(r0, "forName(CLASS_TOUCHTARGETHELPER)");
        r0 = r0.getDeclaredMethod("findTouchTargetView", float[].class, android.view.ViewGroup.class);
        o.getSharedElementTargetNames.toString = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
        if (r3 == true) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
        r3 = o.getSharedElementTargetNames.HaptikSDK$b + 85;
        o.getSharedElementTargetNames.HaptikSDK$c = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
        if ((r3 % 2) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0071, code lost:
        r0.setAccessible(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
        throw new java.lang.IllegalStateException("Required value was null.".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0083, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0084, code lost:
        r1 = o.addRetainedFragment.valueOf;
        o.addRetainedFragment.valueOf(o.getSharedElementTargetNames.values, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008e, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008f, code lost:
        r1 = o.addRetainedFragment.valueOf;
        o.addRetainedFragment.valueOf(o.getSharedElementTargetNames.values, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0098, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009a, code lost:
        o.isStateAtLeast.values(r0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009d, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (o.isStateAtLeast.values(r6) != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void valueOf() {
        /*
            r6 = this;
            int r0 = o.getSharedElementTargetNames.HaptikSDK$b
            int r0 = r0 + 47
            int r1 = r0 % 128
            o.getSharedElementTargetNames.HaptikSDK$c = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 0
            if (r0 == 0) goto L19
            boolean r0 = o.isStateAtLeast.values(r6)
            r3 = 57
            int r3 = r3 / r2
            if (r0 == 0) goto L3b
            goto L1f
        L17:
            r0 = move-exception
            throw r0
        L19:
            boolean r0 = o.isStateAtLeast.values(r6)     // Catch: java.lang.Exception -> L9e
            if (r0 == 0) goto L3b
        L1f:
            int r0 = o.getSharedElementTargetNames.HaptikSDK$c
            int r0 = r0 + 99
            int r2 = r0 % 128
            o.getSharedElementTargetNames.HaptikSDK$b = r2
            int r0 = r0 % r1
            r1 = 77
            if (r0 != 0) goto L2f
            r0 = 77
            goto L31
        L2f:
            r0 = 49
        L31:
            if (r0 == r1) goto L34
            return
        L34:
            r0 = 0
            super.hashCode()     // Catch: java.lang.Throwable -> L39
            return
        L39:
            r0 = move-exception
            throw r0
        L3b:
            java.lang.reflect.Method r0 = o.getSharedElementTargetNames.toString     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L40
            return
        L40:
            java.lang.String r0 = "com.facebook.react.uimanager.TouchTargetHelper"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8e java.lang.Throwable -> L99
            java.lang.String r3 = "forName(CLASS_TOUCHTARGETHELPER)"
            o.runAnimators.ah$a(r0, r3)     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8e java.lang.Throwable -> L99
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8e java.lang.Throwable -> L99
            java.lang.Class<float[]> r4 = float[].class
            r3[r2] = r4     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8e java.lang.Throwable -> L99
            java.lang.Class<android.view.ViewGroup> r4 = android.view.ViewGroup.class
            r5 = 1
            r3[r5] = r4     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8e java.lang.Throwable -> L99
            java.lang.String r4 = "findTouchTargetView"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r3)     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8e java.lang.Throwable -> L99
            o.getSharedElementTargetNames.toString = r0     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8e java.lang.Throwable -> L99
            if (r0 == 0) goto L62
            r3 = 0
            goto L63
        L62:
            r3 = 1
        L63:
            if (r3 == r5) goto L75
            int r3 = o.getSharedElementTargetNames.HaptikSDK$b     // Catch: java.lang.Exception -> L9e
            int r3 = r3 + 85
            int r4 = r3 % 128
            o.getSharedElementTargetNames.HaptikSDK$c = r4     // Catch: java.lang.Exception -> L9e
            int r3 = r3 % r1
            if (r3 == 0) goto L71
            r2 = 1
        L71:
            r0.setAccessible(r5)     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8e java.lang.Throwable -> L99
            goto L98
        L75:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8e java.lang.Throwable -> L99
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8e java.lang.Throwable -> L99
            r0.<init>(r1)     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8e java.lang.Throwable -> L99
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8e java.lang.Throwable -> L99
            throw r0     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8e java.lang.Throwable -> L99
        L83:
            r0 = move-exception
            o.addRetainedFragment r1 = o.addRetainedFragment.valueOf     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = o.getSharedElementTargetNames.values     // Catch: java.lang.Throwable -> L99
            java.lang.Exception r0 = (java.lang.Exception) r0     // Catch: java.lang.Throwable -> L99
            o.addRetainedFragment.valueOf(r1, r0)     // Catch: java.lang.Throwable -> L99
            goto L98
        L8e:
            r0 = move-exception
            o.addRetainedFragment r1 = o.addRetainedFragment.valueOf     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = o.getSharedElementTargetNames.values     // Catch: java.lang.Throwable -> L99
            java.lang.Exception r0 = (java.lang.Exception) r0     // Catch: java.lang.Throwable -> L99
            o.addRetainedFragment.valueOf(r1, r0)     // Catch: java.lang.Throwable -> L99
        L98:
            return
        L99:
            r0 = move-exception
            o.isStateAtLeast.values(r0, r6)
            return
        L9e:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSharedElementTargetNames.valueOf():void");
    }

    private final Class<?> toString(String str) {
        Class<?> cls;
        if ((isStateAtLeast.values(this) ? 'H' : (char) 20) != 20) {
            try {
                int i = HaptikSDK$b + 101;
                HaptikSDK$c = i % 128;
                int i2 = i % 2;
                return null;
            } catch (Exception e) {
                throw e;
            }
        }
        try {
            try {
                cls = Class.forName(str);
            } catch (ClassNotFoundException unused) {
                cls = null;
            }
            int i3 = HaptikSDK$c + 87;
            HaptikSDK$b = i3 % 128;
            int i4 = i3 % 2;
            return cls;
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String ag$a(byte b2, char[] cArr, int i) {
        int i2;
        String str;
        synchronized (isFirst.HaptikSDK$b) {
            char[] cArr2 = ah$a;
            char c = HaptikSDK$a;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr3[i2] = (char) (cArr[i2] - b2);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                isFirst.valueOf = 0;
                while (isFirst.valueOf < i2) {
                    isFirst.toString = cArr[isFirst.valueOf];
                    isFirst.ah$a = cArr[isFirst.valueOf + 1];
                    if (isFirst.toString == isFirst.ah$a) {
                        cArr3[isFirst.valueOf] = (char) (isFirst.toString - b2);
                        cArr3[isFirst.valueOf + 1] = (char) (isFirst.ah$a - b2);
                    } else {
                        isFirst.ag$a = isFirst.toString / c;
                        isFirst.invoke = isFirst.toString % c;
                        isFirst.values = isFirst.ah$a / c;
                        isFirst.ah$b = isFirst.ah$a % c;
                        if (isFirst.invoke == isFirst.ah$b) {
                            isFirst.ag$a = ((isFirst.ag$a + c) - 1) % c;
                            isFirst.values = ((isFirst.values + c) - 1) % c;
                            int i3 = (isFirst.ag$a * c) + isFirst.invoke;
                            int i4 = (isFirst.values * c) + isFirst.ah$b;
                            cArr3[isFirst.valueOf] = cArr2[i3];
                            cArr3[isFirst.valueOf + 1] = cArr2[i4];
                        } else if (isFirst.ag$a == isFirst.values) {
                            isFirst.invoke = ((isFirst.invoke + c) - 1) % c;
                            isFirst.ah$b = ((isFirst.ah$b + c) - 1) % c;
                            int i5 = (isFirst.ag$a * c) + isFirst.invoke;
                            int i6 = (isFirst.values * c) + isFirst.ah$b;
                            cArr3[isFirst.valueOf] = cArr2[i5];
                            cArr3[isFirst.valueOf + 1] = cArr2[i6];
                        } else {
                            int i7 = (isFirst.ag$a * c) + isFirst.ah$b;
                            int i8 = (isFirst.values * c) + isFirst.invoke;
                            cArr3[isFirst.valueOf] = cArr2[i7];
                            cArr3[isFirst.valueOf + 1] = cArr2[i8];
                        }
                    }
                    isFirst.valueOf += 2;
                }
            }
            for (int i9 = 0; i9 < i; i9++) {
                cArr3[i9] = (char) (cArr3[i9] ^ 13722);
            }
            str = new String(cArr3);
        }
        return str;
    }
}
