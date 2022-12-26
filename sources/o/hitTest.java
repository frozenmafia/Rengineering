package o;

import com.google.crypto.tink.shaded.protobuf.FieldType;
import java.lang.reflect.Field;
import o.ItemTouchHelper;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class hitTest implements Comparable<hitTest> {
    private final Object HaptikSDK$a;
    private final Field HaptikSDK$b;
    private final Class<?> HaptikSDK$c;
    private final boolean HaptikSDK$d;
    private final int HaptikWebView;
    private final checkSelectForSwipe$ag$a ag$a;
    private final boolean ah$a;
    private final ItemTouchHelper.AnonymousClass5 ah$b;
    private final FieldType getInitSettings;
    private final Class<?> invoke;
    private final Field toString;
    private final Field valueOf;
    private final int values;

    public int values() {
        return this.values;
    }

    public Field ag$a() {
        return this.valueOf;
    }

    public FieldType getInitSettings() {
        return this.getInitSettings;
    }

    public ItemTouchHelper.AnonymousClass5 ah$b() {
        return this.ah$b;
    }

    public checkSelectForSwipe$ag$a ah$a() {
        return this.ag$a;
    }

    @Override // java.lang.Comparable
    /* renamed from: ah$a */
    public int compareTo(hitTest hittest) {
        return this.values - hittest.values;
    }

    public Field invoke() {
        return this.HaptikSDK$b;
    }

    public Object HaptikSDK$a() {
        return this.HaptikSDK$a;
    }

    public int HaptikSDK$b() {
        return this.HaptikWebView;
    }

    public boolean HaptikSDK$e() {
        return this.HaptikSDK$d;
    }

    public boolean getSignupData() {
        return this.ah$a;
    }

    public Field valueOf() {
        return this.toString;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.hitTest$5  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] valueOf;

        static {
            int[] iArr = new int[FieldType.values().length];
            valueOf = iArr;
            try {
                iArr[FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                valueOf[FieldType.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                valueOf[FieldType.MESSAGE_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                valueOf[FieldType.GROUP_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public Class<?> HaptikSDK$c() {
        int i = AnonymousClass5.valueOf[this.getInitSettings.ordinal()];
        if (i == 1 || i == 2) {
            Field field = this.valueOf;
            return field != null ? field.getType() : this.invoke;
        } else if (i == 3 || i == 4) {
            return this.HaptikSDK$c;
        } else {
            return null;
        }
    }
}
