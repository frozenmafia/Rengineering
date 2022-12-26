package com.clevertap.android.sdk.validation;

import androidx.databinding.library.baseAdapters.BR;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import o.InputConnectionCompat;
import o.performPrivateCommand;
import o.setBoundsInScreen;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public final class Validator {
    private ArrayList<String> ag$a;
    private static final String[] values = {".", ":", "$", "'", "\"", "\\"};
    private static final String[] toString = {".", ":", "$", "'", "\"", "\\"};
    private static final String[] ah$a = {"'", "\"", "\\"};
    private static final String[] valueOf = {"Stayed", "Notification Clicked", "Notification Viewed", "UTM Visited", "Notification Sent", "App Launched", "wzrk_d", "App Uninstalled", "Notification Bounced", "Geocluster Entered", "Geocluster Exited", "SCOutgoing", "SCIncoming", "SCEnd"};

    /* loaded from: classes6.dex */
    enum RestrictedMultiValueFields {
        Name,
        Email,
        Education,
        Married,
        DOB,
        Gender,
        Phone,
        Age,
        FBID,
        GPID,
        Birthday
    }

    /* loaded from: classes4.dex */
    public enum ValidationContext {
        Profile,
        Event
    }

    public performPrivateCommand valueOf(String str) {
        performPrivateCommand performprivatecommand = new performPrivateCommand();
        String trim = str.trim();
        for (String str2 : values) {
            trim = trim.replace(str2, "");
        }
        if (trim.length() > 512) {
            trim = trim.substring(0, 511);
            performPrivateCommand ah$a2 = InputConnectionCompat.AnonymousClass2.ah$a(510, 11, trim.trim(), "512");
            performprivatecommand.ag$a(ah$a2.ah$a());
            performprivatecommand.ah$a(ah$a2.ag$a());
        }
        performprivatecommand.ah$a(trim.trim());
        return performprivatecommand;
    }

    public performPrivateCommand values(String str) {
        performPrivateCommand validator = toString(str);
        String str2 = (String) validator.valueOf();
        try {
            if (RestrictedMultiValueFields.valueOf(str2) != null) {
                performPrivateCommand ah$a2 = InputConnectionCompat.AnonymousClass2.ah$a(BR.userInfo, 24, str2);
                validator.ag$a(ah$a2.ah$a());
                validator.ah$a(ah$a2.ag$a());
                validator.ah$a((Object) null);
            }
        } catch (Throwable unused) {
        }
        return validator;
    }

    public performPrivateCommand ag$a(String str) {
        performPrivateCommand performprivatecommand = new performPrivateCommand();
        String lowerCase = str.trim().toLowerCase();
        for (String str2 : ah$a) {
            lowerCase = lowerCase.replace(str2, "");
        }
        try {
            if (lowerCase.length() > 512) {
                lowerCase = lowerCase.substring(0, 511);
                performPrivateCommand ah$a2 = InputConnectionCompat.AnonymousClass2.ah$a(BR.userContactVM, 11, lowerCase, "512");
                performprivatecommand.ag$a(ah$a2.ah$a());
                performprivatecommand.ah$a(ah$a2.ag$a());
            }
        } catch (Exception unused) {
        }
        performprivatecommand.ah$a(lowerCase);
        return performprivatecommand;
    }

    public performPrivateCommand toString(String str) {
        performPrivateCommand performprivatecommand = new performPrivateCommand();
        String trim = str.trim();
        for (String str2 : toString) {
            trim = trim.replace(str2, "");
        }
        if (trim.length() > 120) {
            trim = trim.substring(0, 119);
            performPrivateCommand ah$a2 = InputConnectionCompat.AnonymousClass2.ah$a(BR.user, 11, trim.trim(), "120");
            performprivatecommand.ag$a(ah$a2.ah$a());
            performprivatecommand.ah$a(ah$a2.ag$a());
        }
        performprivatecommand.ah$a(trim.trim());
        return performprivatecommand;
    }

    public performPrivateCommand values(Object obj, ValidationContext validationContext) throws IllegalArgumentException {
        String str;
        performPrivateCommand performprivatecommand = new performPrivateCommand();
        if ((obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Boolean) || (obj instanceof Double) || (obj instanceof Long)) {
            performprivatecommand.ah$a(obj);
            return performprivatecommand;
        }
        if ((obj instanceof String) || (obj instanceof Character)) {
            if (obj instanceof Character) {
                str = String.valueOf(obj);
            } else {
                str = (String) obj;
            }
            String trim = str.trim();
            for (String str2 : ah$a) {
                trim = trim.replace(str2, "");
            }
            try {
                if (trim.length() > 512) {
                    trim = trim.substring(0, 511);
                    performPrivateCommand ah$a2 = InputConnectionCompat.AnonymousClass2.ah$a(BR.userContactVM, 11, trim.trim(), "512");
                    performprivatecommand.ag$a(ah$a2.ah$a());
                    performprivatecommand.ah$a(ah$a2.ag$a());
                }
            } catch (Exception unused) {
            }
            performprivatecommand.ah$a(trim.trim());
            return performprivatecommand;
        } else if (obj instanceof Date) {
            performprivatecommand.ah$a("$D_" + (((Date) obj).getTime() / 1000));
            return performprivatecommand;
        } else {
            boolean z = obj instanceof String[];
            if ((z || (obj instanceof ArrayList)) && validationContext.equals(ValidationContext.Profile)) {
                ArrayList arrayList = obj instanceof ArrayList ? (ArrayList) obj : null;
                String[] strArr = z ? (String[]) obj : null;
                ArrayList arrayList2 = new ArrayList();
                if (strArr != null) {
                    for (String str3 : strArr) {
                        try {
                            arrayList2.add(str3);
                        } catch (Exception unused2) {
                        }
                    }
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList2.add((String) it.next());
                        } catch (Exception unused3) {
                        }
                    }
                }
                String[] strArr2 = (String[]) arrayList2.toArray(new String[0]);
                if (strArr2.length > 0 && strArr2.length <= 100) {
                    JSONArray jSONArray = new JSONArray();
                    JSONObject jSONObject = new JSONObject();
                    for (String str4 : strArr2) {
                        jSONArray.put(str4);
                    }
                    try {
                        jSONObject.put("$set", jSONArray);
                    } catch (JSONException unused4) {
                    }
                    performprivatecommand.ah$a(jSONObject);
                } else {
                    performPrivateCommand ah$a3 = InputConnectionCompat.AnonymousClass2.ah$a(BR.userContactVM, 13, strArr2.length + "", "100");
                    performprivatecommand.ag$a(ah$a3.ah$a());
                    performprivatecommand.ah$a(ah$a3.ag$a());
                }
                return performprivatecommand;
            }
            throw new IllegalArgumentException("Not a String, Boolean, Long, Integer, Float, Double, or Date");
        }
    }

    public performPrivateCommand ah$a(String str) {
        performPrivateCommand performprivatecommand = new performPrivateCommand();
        if (str == null) {
            performPrivateCommand ah$a2 = InputConnectionCompat.AnonymousClass2.ah$a(510, 14, new String[0]);
            performprivatecommand.ah$a(ah$a2.ag$a());
            performprivatecommand.ag$a(ah$a2.ah$a());
            return performprivatecommand;
        }
        if (values() != null) {
            Iterator<String> it = values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (str.equalsIgnoreCase(it.next())) {
                    performPrivateCommand ah$a3 = InputConnectionCompat.AnonymousClass2.ah$a(513, 17, str);
                    performprivatecommand.ah$a(ah$a3.ag$a());
                    performprivatecommand.ag$a(ah$a3.ah$a());
                    setBoundsInScreen.ag$a(str + " s a discarded event name as per CleverTap. Dropping event at SDK level. Check discarded events in CleverTap Dashboard settings.");
                    break;
                }
            }
        }
        return performprivatecommand;
    }

    public performPrivateCommand invoke(String str) {
        performPrivateCommand performprivatecommand = new performPrivateCommand();
        if (str == null) {
            performPrivateCommand ah$a2 = InputConnectionCompat.AnonymousClass2.ah$a(510, 14, new String[0]);
            performprivatecommand.ah$a(ah$a2.ag$a());
            performprivatecommand.ag$a(ah$a2.ah$a());
            return performprivatecommand;
        }
        for (String str2 : valueOf) {
            if (str.equalsIgnoreCase(str2)) {
                performPrivateCommand ah$a3 = InputConnectionCompat.AnonymousClass2.ah$a(513, 16, str);
                performprivatecommand.ah$a(ah$a3.ag$a());
                performprivatecommand.ag$a(ah$a3.ah$a());
                setBoundsInScreen.values(ah$a3.ah$a());
                return performprivatecommand;
            }
        }
        return performprivatecommand;
    }

    public performPrivateCommand values(JSONArray jSONArray, JSONArray jSONArray2, String str, String str2) {
        return ah$a(str2, jSONArray, jSONArray2, "multiValuePropertyRemoveValues".equals(str), new performPrivateCommand());
    }

    private performPrivateCommand ah$a(String str, JSONArray jSONArray, JSONArray jSONArray2, boolean z, performPrivateCommand performprivatecommand) {
        if (jSONArray == null) {
            performprivatecommand.ah$a((Object) null);
            return performprivatecommand;
        } else if (jSONArray2 == null) {
            performprivatecommand.ah$a(jSONArray);
            return performprivatecommand;
        } else {
            JSONArray jSONArray3 = new JSONArray();
            HashSet hashSet = new HashSet();
            int length = jSONArray.length();
            int length2 = jSONArray2.length();
            BitSet bitSet = z ? null : new BitSet(length + length2);
            int valueOf2 = valueOf(jSONArray2, hashSet, bitSet, length);
            int valueOf3 = (z || hashSet.size() >= 100) ? 0 : valueOf(jSONArray, hashSet, bitSet, 0);
            for (int i = valueOf3; i < length; i++) {
                if (z) {
                    try {
                        String str2 = (String) jSONArray.get(i);
                        if (!hashSet.contains(str2)) {
                            jSONArray3.put(str2);
                        }
                    } catch (Throwable unused) {
                    }
                } else if (!bitSet.get(i)) {
                    jSONArray3.put(jSONArray.get(i));
                }
            }
            if (!z && jSONArray3.length() < 100) {
                for (int i2 = valueOf2; i2 < length2; i2++) {
                    try {
                        if (!bitSet.get(i2 + length)) {
                            jSONArray3.put(jSONArray2.get(i2));
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
            if (valueOf2 > 0 || valueOf3 > 0) {
                performPrivateCommand ah$a2 = InputConnectionCompat.AnonymousClass2.ah$a(BR.userContactVM, 12, str, "100");
                performprivatecommand.ah$a(ah$a2.ag$a());
                performprivatecommand.ag$a(ah$a2.ah$a());
            }
            performprivatecommand.ah$a(jSONArray3);
            return performprivatecommand;
        }
    }

    private ArrayList<String> values() {
        return this.ag$a;
    }

    public void ah$a(ArrayList<String> arrayList) {
        this.ag$a = arrayList;
    }

    private int valueOf(JSONArray jSONArray, Set<String> set, BitSet bitSet, int i) {
        if (jSONArray != null) {
            for (int length = jSONArray.length() - 1; length >= 0; length--) {
                try {
                    Object obj = jSONArray.get(length);
                    String obj2 = obj != null ? obj.toString() : null;
                    if (bitSet != null) {
                        if (obj2 != null && !set.contains(obj2)) {
                            set.add(obj2);
                            if (set.size() == 100) {
                                return length;
                            }
                        }
                        bitSet.set(length + i, true);
                    } else if (obj2 != null) {
                        set.add(obj2);
                    }
                } catch (Throwable unused) {
                }
            }
            return 0;
        }
        return 0;
    }
}
