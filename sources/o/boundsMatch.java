package o;

import com.google.protobuf.FieldType;
import java.lang.reflect.Field;
import o.ViewTypeStorage;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class boundsMatch implements Comparable<boundsMatch> {
    private final ViewTypeStorage.SharedIdRangeViewTypeStorage.WrapperViewTypeLookup HaptikSDK$a;
    private final Object HaptikSDK$b;
    private final Class<?> HaptikSDK$c;
    private final int HaptikSDK$d;
    private final FieldType HaptikSDK$e;
    private final int ag$a;
    private final Field ah$a;
    private final Field ah$b;
    private final boolean getInitSettings;
    private final Class<?> invoke;
    private final ViewInfoStore$ag$a toString;
    private final boolean valueOf;
    private final Field values;

    public int valueOf() {
        return this.ag$a;
    }

    public Field ag$a() {
        return this.values;
    }

    public FieldType getInitSettings() {
        return this.HaptikSDK$e;
    }

    public ViewTypeStorage.SharedIdRangeViewTypeStorage.WrapperViewTypeLookup ah$b() {
        return this.HaptikSDK$a;
    }

    public ViewInfoStore$ag$a ah$a() {
        return this.toString;
    }

    @Override // java.lang.Comparable
    /* renamed from: valueOf */
    public int compareTo(boundsMatch boundsmatch) {
        return this.ag$a - boundsmatch.ag$a;
    }

    public Field HaptikSDK$b() {
        return this.ah$b;
    }

    public Object HaptikSDK$c() {
        return this.HaptikSDK$b;
    }

    public int HaptikSDK$a() {
        return this.HaptikSDK$d;
    }

    public boolean HaptikSDK$d() {
        return this.getInitSettings;
    }

    public boolean HaptikSDK$e() {
        return this.valueOf;
    }

    public Field values() {
        return this.ah$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.boundsMatch$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ag$a;

        static {
            int[] iArr = new int[FieldType.values().length];
            ag$a = iArr;
            try {
                iArr[FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ag$a[FieldType.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ag$a[FieldType.MESSAGE_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ag$a[FieldType.GROUP_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public Class<?> invoke() {
        int i = AnonymousClass1.ag$a[this.HaptikSDK$e.ordinal()];
        if (i == 1 || i == 2) {
            Field field = this.values;
            return field != null ? field.getType() : this.invoke;
        } else if (i == 3 || i == 4) {
            return this.HaptikSDK$c;
        } else {
            return null;
        }
    }
}
