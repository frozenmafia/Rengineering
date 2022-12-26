package o;

import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.SVGLength;
/* renamed from: o.version  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C0396version {
    C0396version() {
    }

    public static int toString(ReadableArray readableArray, float[] fArr, float f) {
        int size = readableArray.size();
        if (size != 6) {
            return size;
        }
        fArr[0] = (float) readableArray.getDouble(0);
        fArr[1] = (float) readableArray.getDouble(2);
        fArr[2] = ((float) readableArray.getDouble(4)) * f;
        fArr[3] = (float) readableArray.getDouble(1);
        fArr[4] = (float) readableArray.getDouble(3);
        fArr[5] = ((float) readableArray.getDouble(5)) * f;
        return 6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double values(String str, double d, double d2, double d3) {
        double doubleValue;
        String trim = str.trim();
        int length = trim.length();
        int i = length - 1;
        if (length == 0 || trim.equals("normal")) {
            return 0.0d;
        }
        if (trim.codePointAt(i) == 37) {
            return (Double.valueOf(trim.substring(0, i)).doubleValue() / 100.0d) * d;
        }
        int i2 = length - 2;
        if (i2 > 0) {
            String substring = trim.substring(i2);
            substring.hashCode();
            char c = 65535;
            int hashCode = substring.hashCode();
            if (hashCode != 3178) {
                if (hashCode != 3240) {
                    if (hashCode != 3365) {
                        if (hashCode != 3488) {
                            if (hashCode != 3571) {
                                if (hashCode != 3588) {
                                    if (hashCode == 3592 && substring.equals("px")) {
                                        c = 6;
                                    }
                                } else if (substring.equals("pt")) {
                                    c = 5;
                                }
                            } else if (substring.equals("pc")) {
                                c = 4;
                            }
                        } else if (substring.equals("mm")) {
                            c = 3;
                        }
                    } else if (substring.equals("in")) {
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
                    d3 = 35.43307d;
                    break;
                case 1:
                    break;
                case 2:
                    d3 = 90.0d;
                    break;
                case 3:
                    d3 = 3.543307d;
                    break;
                case 4:
                    d3 = 15.0d;
                    break;
                case 5:
                    d3 = 1.25d;
                    break;
                case 6:
                    length = i2;
                default:
                    d3 = 1.0d;
                    i2 = length;
                    break;
            }
            doubleValue = Double.valueOf(trim.substring(0, i2)).doubleValue() * d3;
        } else {
            doubleValue = Double.valueOf(trim).doubleValue();
        }
        return doubleValue * d2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static double valueOf(SVGLength sVGLength, double d, double d2, double d3, double d4) {
        double d5;
        if (sVGLength == null) {
            return d2;
        }
        SVGLength.UnitType unitType = sVGLength.valueOf;
        double d6 = sVGLength.values;
        switch (AnonymousClass4.toString[unitType.ordinal()]) {
            case 1:
            case 2:
                d4 = 1.0d;
                d6 *= d4;
                d5 = d6 * d3;
                break;
            case 3:
                d5 = (d6 / 100.0d) * d;
                break;
            case 4:
                d6 *= d4;
                d5 = d6 * d3;
                break;
            case 5:
                d4 /= 2.0d;
                d6 *= d4;
                d5 = d6 * d3;
                break;
            case 6:
                d4 = 35.43307d;
                d6 *= d4;
                d5 = d6 * d3;
                break;
            case 7:
                d4 = 3.543307d;
                d6 *= d4;
                d5 = d6 * d3;
                break;
            case 8:
                d4 = 90.0d;
                d6 *= d4;
                d5 = d6 * d3;
                break;
            case 9:
                d4 = 1.25d;
                d6 *= d4;
                d5 = d6 * d3;
                break;
            case 10:
                d4 = 15.0d;
                d6 *= d4;
                d5 = d6 * d3;
                break;
            default:
                d5 = d6 * d3;
                break;
        }
        return d5 + d2;
    }

    /* renamed from: o.version$4  reason: invalid class name */
    /* loaded from: classes5.dex */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] toString;

        static {
            int[] iArr = new int[SVGLength.UnitType.values().length];
            toString = iArr;
            try {
                iArr[SVGLength.UnitType.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                toString[SVGLength.UnitType.PX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                toString[SVGLength.UnitType.PERCENTAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                toString[SVGLength.UnitType.EMS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                toString[SVGLength.UnitType.EXS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                toString[SVGLength.UnitType.CM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                toString[SVGLength.UnitType.MM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                toString[SVGLength.UnitType.IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                toString[SVGLength.UnitType.PT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                toString[SVGLength.UnitType.PC.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                toString[SVGLength.UnitType.UNKNOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }
}
