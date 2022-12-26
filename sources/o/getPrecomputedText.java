package o;

import com.appsamurai.storyly.exoplayer2.extractor.extractor.flv.TagPayloadReader;
import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
final class getPrecomputedText extends TagPayloadReader {
    private long[] toString;
    private long[] valueOf;
    private long values;

    @Override // com.appsamurai.storyly.exoplayer2.extractor.extractor.flv.TagPayloadReader
    public boolean ah$a(C$default$setContentDescription c$default$setContentDescription) {
        return true;
    }

    public getPrecomputedText() {
        super(new markAfter());
        this.values = C.TIME_UNSET;
        this.toString = new long[0];
        this.valueOf = new long[0];
    }

    public long values() {
        return this.values;
    }

    public long[] ag$a() {
        return this.toString;
    }

    public long[] ah$a() {
        return this.valueOf;
    }

    @Override // com.appsamurai.storyly.exoplayer2.extractor.extractor.flv.TagPayloadReader
    public boolean valueOf(C$default$setContentDescription c$default$setContentDescription, long j) {
        if (c$default$setContentDescription.extraCallbackWithResult() == 2 && "onMetaData".equals(HaptikSDK$a(c$default$setContentDescription)) && c$default$setContentDescription.ag$a() != 0 && c$default$setContentDescription.extraCallbackWithResult() == 8) {
            HashMap<String, Object> getprecomputedtext = toString(c$default$setContentDescription);
            Object obj = getprecomputedtext.get("duration");
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > 0.0d) {
                    this.values = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = getprecomputedtext.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.toString = new long[size];
                    this.valueOf = new long[size];
                    for (int i = 0; i < size; i++) {
                        Object obj5 = list.get(i);
                        Object obj6 = list2.get(i);
                        if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                            this.toString[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                            this.valueOf[i] = ((Double) obj5).longValue();
                        } else {
                            this.toString = new long[0];
                            this.valueOf = new long[0];
                            break;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    private static Boolean values(C$default$setContentDescription c$default$setContentDescription) {
        return Boolean.valueOf(c$default$setContentDescription.extraCallbackWithResult() == 1);
    }

    private static Double ag$a(C$default$setContentDescription c$default$setContentDescription) {
        return Double.valueOf(Double.longBitsToDouble(c$default$setContentDescription.isLogoutPending()));
    }

    private static String HaptikSDK$a(C$default$setContentDescription c$default$setContentDescription) {
        int ICustomTabsCallback$Default = c$default$setContentDescription.ICustomTabsCallback$Default();
        int valueOf = c$default$setContentDescription.valueOf();
        c$default$setContentDescription.HaptikSDK$a(ICustomTabsCallback$Default);
        return new String(c$default$setContentDescription.ah$a(), valueOf, ICustomTabsCallback$Default);
    }

    private static ArrayList<Object> HaptikSDK$b(C$default$setContentDescription c$default$setContentDescription) {
        int onNavigationEvent = c$default$setContentDescription.onNavigationEvent();
        ArrayList<Object> arrayList = new ArrayList<>(onNavigationEvent);
        for (int i = 0; i < onNavigationEvent; i++) {
            Object getprecomputedtext = toString(c$default$setContentDescription, c$default$setContentDescription.extraCallbackWithResult());
            if (getprecomputedtext != null) {
                arrayList.add(getprecomputedtext);
            }
        }
        return arrayList;
    }

    private static HashMap<String, Object> invoke(C$default$setContentDescription c$default$setContentDescription) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String HaptikSDK$a = HaptikSDK$a(c$default$setContentDescription);
            int extraCallbackWithResult = c$default$setContentDescription.extraCallbackWithResult();
            if (extraCallbackWithResult == 9) {
                return hashMap;
            }
            Object getprecomputedtext = toString(c$default$setContentDescription, extraCallbackWithResult);
            if (getprecomputedtext != null) {
                hashMap.put(HaptikSDK$a, getprecomputedtext);
            }
        }
    }

    private static HashMap<String, Object> toString(C$default$setContentDescription c$default$setContentDescription) {
        int onNavigationEvent = c$default$setContentDescription.onNavigationEvent();
        HashMap<String, Object> hashMap = new HashMap<>(onNavigationEvent);
        for (int i = 0; i < onNavigationEvent; i++) {
            String HaptikSDK$a = HaptikSDK$a(c$default$setContentDescription);
            Object getprecomputedtext = toString(c$default$setContentDescription, c$default$setContentDescription.extraCallbackWithResult());
            if (getprecomputedtext != null) {
                hashMap.put(HaptikSDK$a, getprecomputedtext);
            }
        }
        return hashMap;
    }

    private static Date valueOf(C$default$setContentDescription c$default$setContentDescription) {
        Date date = new Date((long) ag$a(c$default$setContentDescription).doubleValue());
        c$default$setContentDescription.HaptikSDK$a(2);
        return date;
    }

    private static Object toString(C$default$setContentDescription c$default$setContentDescription, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 8) {
                            if (i != 10) {
                                if (i != 11) {
                                    return null;
                                }
                                return valueOf(c$default$setContentDescription);
                            }
                            return HaptikSDK$b(c$default$setContentDescription);
                        }
                        return toString(c$default$setContentDescription);
                    }
                    return invoke(c$default$setContentDescription);
                }
                return HaptikSDK$a(c$default$setContentDescription);
            }
            return values(c$default$setContentDescription);
        }
        return ag$a(c$default$setContentDescription);
    }
}
