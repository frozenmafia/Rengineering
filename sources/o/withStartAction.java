package o;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import o.WindowInsetsControllerCompat;
/* loaded from: classes3.dex */
public class withStartAction implements translationXBy {
    private static final Bitmap.Config[] ag$a;
    private static final Bitmap.Config[] ah$a;
    private static final Bitmap.Config[] toString;
    private static final Bitmap.Config[] valueOf;
    private static final Bitmap.Config[] values;
    private final valueOf invoke = new valueOf();
    private final withLayer<withStartAction$ag$a, Bitmap> HaptikSDK$b = new withLayer<>();
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> HaptikSDK$a = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        valueOf = configArr;
        ag$a = configArr;
        ah$a = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        values = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        toString = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    @Override // o.translationXBy
    public void ah$a(Bitmap bitmap) {
        withStartAction$ag$a ag$a2 = this.invoke.ag$a(WindowInsetsControllerCompat.Impl30.AnonymousClass1.valueOf(bitmap), bitmap.getConfig());
        this.HaptikSDK$b.values(ag$a2, bitmap);
        NavigableMap<Integer, Integer> withstartaction = toString(bitmap.getConfig());
        Integer num = (Integer) withstartaction.get(Integer.valueOf(ag$a2.ah$a));
        withstartaction.put(Integer.valueOf(ag$a2.ah$a), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // o.translationXBy
    public Bitmap toString(int i, int i2, Bitmap.Config config) {
        withStartAction$ag$a withstartaction = toString(WindowInsetsControllerCompat.Impl30.AnonymousClass1.ah$a(i, i2, config), config);
        Bitmap ag$a2 = this.HaptikSDK$b.ag$a((withLayer<withStartAction$ag$a, Bitmap>) withstartaction);
        if (ag$a2 != null) {
            valueOf(Integer.valueOf(withstartaction.ah$a), ag$a2);
            ag$a2.reconfigure(i, i2, config);
        }
        return ag$a2;
    }

    private withStartAction$ag$a toString(int i, Bitmap.Config config) {
        Bitmap.Config[] values2;
        withStartAction$ag$a ag$a2 = this.invoke.ag$a(i, config);
        for (Bitmap.Config config2 : values(config)) {
            Integer ceilingKey = toString(config2).ceilingKey(Integer.valueOf(i));
            if (ceilingKey != null && ceilingKey.intValue() <= i * 8) {
                if (ceilingKey.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return ag$a2;
                        }
                    } else if (config2.equals(config)) {
                        return ag$a2;
                    }
                }
                this.invoke.ag$a(ag$a2);
                return this.invoke.ag$a(ceilingKey.intValue(), config2);
            }
        }
        return ag$a2;
    }

    @Override // o.translationXBy
    public Bitmap ah$a() {
        Bitmap ag$a2 = this.HaptikSDK$b.ag$a();
        if (ag$a2 != null) {
            valueOf(Integer.valueOf(WindowInsetsControllerCompat.Impl30.AnonymousClass1.valueOf(ag$a2)), ag$a2);
        }
        return ag$a2;
    }

    private void valueOf(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> withstartaction = toString(bitmap.getConfig());
        Integer num2 = (Integer) withstartaction.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + ag$a(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            withstartaction.remove(num);
        } else {
            withstartaction.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    private NavigableMap<Integer, Integer> toString(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.HaptikSDK$a.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.HaptikSDK$a.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    @Override // o.translationXBy
    public String ag$a(Bitmap bitmap) {
        return values(WindowInsetsControllerCompat.Impl30.AnonymousClass1.valueOf(bitmap), bitmap.getConfig());
    }

    @Override // o.translationXBy
    public String valueOf(int i, int i2, Bitmap.Config config) {
        return values(WindowInsetsControllerCompat.Impl30.AnonymousClass1.ah$a(i, i2, config), config);
    }

    @Override // o.translationXBy
    public int toString(Bitmap bitmap) {
        return WindowInsetsControllerCompat.Impl30.AnonymousClass1.valueOf(bitmap);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.HaptikSDK$b);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.HaptikSDK$a.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.HaptikSDK$a.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class valueOf extends scaleYBy<withStartAction$ag$a> {
        valueOf() {
        }

        public withStartAction$ag$a ag$a(int i, Bitmap.Config config) {
            withStartAction$ag$a values = values();
            values.toString(i, config);
            return values;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.scaleYBy
        /* renamed from: ah$a */
        public withStartAction$ag$a ag$a() {
            return new withStartAction$ag$a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String values(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    private static Bitmap.Config[] values(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return ag$a;
        }
        int i = AnonymousClass3.ah$a[config.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return i != 4 ? new Bitmap.Config[]{config} : toString;
                }
                return values;
            }
            return ah$a;
        }
        return valueOf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.withStartAction$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] ah$a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            ah$a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ah$a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ah$a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ah$a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }
}
