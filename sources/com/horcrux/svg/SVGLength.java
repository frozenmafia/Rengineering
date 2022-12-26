package com.horcrux.svg;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;
/* loaded from: classes5.dex */
public class SVGLength {
    public final UnitType valueOf;
    public final double values;

    /* loaded from: classes5.dex */
    public enum UnitType {
        UNKNOWN,
        NUMBER,
        PERCENTAGE,
        EMS,
        EXS,
        PX,
        CM,
        MM,
        IN,
        PT,
        PC
    }

    private SVGLength() {
        this.values = 0.0d;
        this.valueOf = UnitType.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SVGLength(double d) {
        this.values = d;
        this.valueOf = UnitType.NUMBER;
    }

    private SVGLength(String str) {
        String trim = str.trim();
        int length = trim.length();
        int i = length - 1;
        if (length == 0 || trim.equals("normal")) {
            this.valueOf = UnitType.UNKNOWN;
            this.values = 0.0d;
        } else if (trim.codePointAt(i) == 37) {
            this.valueOf = UnitType.PERCENTAGE;
            this.values = Double.valueOf(trim.substring(0, i)).doubleValue();
        } else {
            int i2 = length - 2;
            if (i2 > 0) {
                String substring = trim.substring(i2);
                substring.hashCode();
                char c = 65535;
                int hashCode = substring.hashCode();
                if (hashCode != 3178) {
                    if (hashCode != 3240) {
                        if (hashCode != 3251) {
                            if (hashCode != 3365) {
                                if (hashCode != 3488) {
                                    if (hashCode != 3571) {
                                        if (hashCode != 3588) {
                                            if (hashCode == 3592 && substring.equals("px")) {
                                                c = 7;
                                            }
                                        } else if (substring.equals("pt")) {
                                            c = 6;
                                        }
                                    } else if (substring.equals("pc")) {
                                        c = 5;
                                    }
                                } else if (substring.equals("mm")) {
                                    c = 4;
                                }
                            } else if (substring.equals("in")) {
                                c = 3;
                            }
                        } else if (substring.equals("ex")) {
                            c = 2;
                        }
                    } else if (substring.equals("em")) {
                        c = 1;
                    }
                } else if (substring.equals("cm")) {
                    c = 0;
                }
                switch (c) {
                    case 0:
                        this.valueOf = UnitType.CM;
                        length = i2;
                        break;
                    case 1:
                        this.valueOf = UnitType.EMS;
                        length = i2;
                        break;
                    case 2:
                        this.valueOf = UnitType.EXS;
                        length = i2;
                        break;
                    case 3:
                        this.valueOf = UnitType.IN;
                        length = i2;
                        break;
                    case 4:
                        this.valueOf = UnitType.MM;
                        length = i2;
                        break;
                    case 5:
                        this.valueOf = UnitType.PC;
                        length = i2;
                        break;
                    case 6:
                        this.valueOf = UnitType.PT;
                        length = i2;
                        break;
                    case 7:
                        this.valueOf = UnitType.NUMBER;
                        length = i2;
                        break;
                    default:
                        this.valueOf = UnitType.NUMBER;
                        break;
                }
                this.values = Double.valueOf(trim.substring(0, length)).doubleValue();
                return;
            }
            this.valueOf = UnitType.NUMBER;
            this.values = Double.valueOf(trim).doubleValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.horcrux.svg.SVGLength$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ag$a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            ag$a = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ag$a[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ag$a[ReadableType.Array.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static SVGLength ag$a(Dynamic dynamic) {
        int i = AnonymousClass1.ag$a[dynamic.getType().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new SVGLength(dynamic.asString());
            }
            return new SVGLength();
        }
        return new SVGLength(dynamic.asDouble());
    }

    public static String values(Dynamic dynamic) {
        int i = AnonymousClass1.ag$a[dynamic.getType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return dynamic.asString();
        }
        return String.valueOf(dynamic.asDouble());
    }

    public static ArrayList<SVGLength> ah$a(Dynamic dynamic) {
        int i = AnonymousClass1.ag$a[dynamic.getType().ordinal()];
        if (i == 1) {
            ArrayList<SVGLength> arrayList = new ArrayList<>(1);
            arrayList.add(new SVGLength(dynamic.asDouble()));
            return arrayList;
        } else if (i == 2) {
            ArrayList<SVGLength> arrayList2 = new ArrayList<>(1);
            arrayList2.add(new SVGLength(dynamic.asString()));
            return arrayList2;
        } else if (i != 3) {
            return null;
        } else {
            ReadableArray asArray = dynamic.asArray();
            int size = asArray.size();
            ArrayList<SVGLength> arrayList3 = new ArrayList<>(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList3.add(ag$a(asArray.getDynamic(i2)));
            }
            return arrayList3;
        }
    }
}
