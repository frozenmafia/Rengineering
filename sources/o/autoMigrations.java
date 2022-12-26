package o;

import com.horcrux.svg.ElementType;
import com.horcrux.svg.RNSVGMarkerType;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes5.dex */
public class autoMigrations {
    private static Dao HaptikSDK$a;
    private static Dao HaptikSDK$b;
    private static Dao HaptikSDK$c;
    private static boolean ah$a;
    private static Dao ah$b;
    private static ArrayList<autoMigrations> invoke;
    private static int valueOf;
    public RNSVGMarkerType ag$a;
    double toString;
    Dao values;

    private static double values(double d) {
        return d * 57.29577951308232d;
    }

    private autoMigrations(RNSVGMarkerType rNSVGMarkerType, Dao dao, double d) {
        this.ag$a = rNSVGMarkerType;
        this.values = dao;
        this.toString = d;
    }

    public static ArrayList<autoMigrations> toString(ArrayList<typeAffinity> arrayList) {
        invoke = new ArrayList<>();
        valueOf = 0;
        HaptikSDK$a = new Dao(0.0d, 0.0d);
        HaptikSDK$b = new Dao(0.0d, 0.0d);
        Iterator<typeAffinity> it = arrayList.iterator();
        while (it.hasNext()) {
            valueOf(it.next());
        }
        valueOf();
        return invoke;
    }

    private static void valueOf() {
        invoke.add(new autoMigrations(RNSVGMarkerType.kEndMarker, HaptikSDK$a, toString(RNSVGMarkerType.kEndMarker)));
    }

    private static double valueOf(double d, double d2) {
        if (Math.abs(d - d2) > 180.0d) {
            d += 360.0d;
        }
        return (d + d2) / 2.0d;
    }

    private static double values(Dao dao) {
        return Math.atan2(dao.values, dao.ah$a);
    }

    private static double toString(RNSVGMarkerType rNSVGMarkerType) {
        double values = values(values(HaptikSDK$c));
        double values2 = values(values(ah$b));
        int i = AnonymousClass4.ah$a[rNSVGMarkerType.ordinal()];
        if (i == 1) {
            return ah$a ? values2 + 180.0d : values2;
        } else if (i != 2) {
            if (i != 3) {
                return 0.0d;
            }
            return values;
        } else {
            return valueOf(values, values2);
        }
    }

    private static Dao valueOf(Dao dao, Dao dao2) {
        return new Dao(dao2.ah$a - dao.ah$a, dao2.values - dao.values);
    }

    private static boolean valueOf(Dao dao) {
        return dao.ah$a == 0.0d && dao.values == 0.0d;
    }

    private static void valueOf(views viewsVar, Dao dao, Dao dao2, Dao dao3) {
        viewsVar.valueOf = valueOf(dao2, dao);
        viewsVar.values = valueOf(dao3, dao2);
        if (valueOf(viewsVar.valueOf)) {
            viewsVar.valueOf = viewsVar.values;
        } else if (valueOf(viewsVar.values)) {
            viewsVar.values = viewsVar.valueOf;
        }
    }

    private static views toString(typeAffinity typeaffinity) {
        views viewsVar = new views();
        Dao[] daoArr = typeaffinity.values;
        int i = AnonymousClass4.values[typeaffinity.valueOf.ordinal()];
        if (i == 1) {
            viewsVar.ah$a = daoArr[2];
            viewsVar.valueOf = valueOf(daoArr[0], HaptikSDK$a);
            viewsVar.values = valueOf(daoArr[2], daoArr[1]);
            if (valueOf(viewsVar.valueOf)) {
                valueOf(viewsVar, daoArr[0], daoArr[1], daoArr[2]);
            } else if (valueOf(viewsVar.values)) {
                valueOf(viewsVar, HaptikSDK$a, daoArr[0], daoArr[1]);
            }
        } else if (i == 2) {
            viewsVar.ah$a = daoArr[1];
            valueOf(viewsVar, HaptikSDK$a, daoArr[0], daoArr[1]);
        } else if (i == 3 || i == 4) {
            viewsVar.ah$a = daoArr[0];
            viewsVar.valueOf = valueOf(viewsVar.ah$a, HaptikSDK$a);
            viewsVar.values = valueOf(viewsVar.ah$a, HaptikSDK$a);
        } else if (i == 5) {
            viewsVar.ah$a = HaptikSDK$b;
            viewsVar.valueOf = valueOf(viewsVar.ah$a, HaptikSDK$a);
            viewsVar.values = valueOf(viewsVar.ah$a, HaptikSDK$a);
        }
        return viewsVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.autoMigrations$4  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] ah$a;
        static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[ElementType.values().length];
            values = iArr;
            try {
                iArr[ElementType.kCGPathElementAddCurveToPoint.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                values[ElementType.kCGPathElementAddQuadCurveToPoint.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                values[ElementType.kCGPathElementMoveToPoint.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                values[ElementType.kCGPathElementAddLineToPoint.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                values[ElementType.kCGPathElementCloseSubpath.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[RNSVGMarkerType.values().length];
            ah$a = iArr2;
            try {
                iArr2[RNSVGMarkerType.kStartMarker.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ah$a[RNSVGMarkerType.kMidMarker.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                ah$a[RNSVGMarkerType.kEndMarker.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private static void valueOf(typeAffinity typeaffinity) {
        views automigrations = toString(typeaffinity);
        ah$b = automigrations.valueOf;
        int i = valueOf;
        if (i > 0) {
            RNSVGMarkerType rNSVGMarkerType = i == 1 ? RNSVGMarkerType.kStartMarker : RNSVGMarkerType.kMidMarker;
            invoke.add(new autoMigrations(rNSVGMarkerType, HaptikSDK$a, toString(rNSVGMarkerType)));
        }
        HaptikSDK$c = automigrations.values;
        HaptikSDK$a = automigrations.ah$a;
        if (typeaffinity.valueOf == ElementType.kCGPathElementMoveToPoint) {
            HaptikSDK$b = typeaffinity.values[0];
        } else if (typeaffinity.valueOf == ElementType.kCGPathElementCloseSubpath) {
            HaptikSDK$b = new Dao(0.0d, 0.0d);
        }
        valueOf++;
    }
}
