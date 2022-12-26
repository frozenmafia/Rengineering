package o;
/* loaded from: classes4.dex */
public final class performActivityCreated {
    public static final performActivityCreated ag$a = new performActivityCreated();

    private performActivityCreated() {
    }

    public static final void values(onViewCreated onviewcreated, onViewCreated onviewcreated2) {
        if (isStateAtLeast.values(performActivityCreated.class)) {
            return;
        }
        try {
            runAnimators.ag$a(onviewcreated, "x");
            runAnimators.ag$a(onviewcreated2, "b");
            int valueOf = onviewcreated.valueOf(0);
            int valueOf2 = onviewcreated.valueOf(1);
            int valueOf3 = onviewcreated.valueOf(2);
            float[] values = onviewcreated.values();
            float[] values2 = onviewcreated2.values();
            if (valueOf <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (valueOf2 > 0) {
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        if (valueOf3 > 0) {
                            int i5 = 0;
                            while (true) {
                                int i6 = i5 + 1;
                                int i7 = (i * valueOf2 * valueOf3) + (i3 * valueOf3) + i5;
                                values[i7] = values[i7] + values2[i5];
                                if (i6 >= valueOf3) {
                                    break;
                                }
                                i5 = i6;
                            }
                        }
                        if (i4 >= valueOf2) {
                            break;
                        }
                        i3 = i4;
                    }
                }
                if (i2 >= valueOf) {
                    return;
                }
                i = i2;
            }
        } catch (Throwable th) {
            isStateAtLeast.values(th, performActivityCreated.class);
        }
    }

    public static final onViewCreated ah$a(onViewCreated onviewcreated, onViewCreated onviewcreated2) {
        if (isStateAtLeast.values(performActivityCreated.class)) {
            return null;
        }
        try {
            runAnimators.ag$a(onviewcreated, "x");
            runAnimators.ag$a(onviewcreated2, "w");
            int valueOf = onviewcreated.valueOf(0);
            int valueOf2 = onviewcreated2.valueOf(0);
            int valueOf3 = onviewcreated2.valueOf(1);
            onViewCreated onviewcreated3 = new onViewCreated(new int[]{valueOf, valueOf3});
            float[] values = onviewcreated.values();
            float[] values2 = onviewcreated2.values();
            float[] values3 = onviewcreated3.values();
            if (valueOf > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (valueOf3 > 0) {
                        int i3 = 0;
                        while (true) {
                            int i4 = i3 + 1;
                            int i5 = (i * valueOf3) + i3;
                            values3[i5] = 0.0f;
                            if (valueOf2 > 0) {
                                int i6 = 0;
                                while (true) {
                                    int i7 = i6 + 1;
                                    values3[i5] = values3[i5] + (values[(i * valueOf2) + i6] * values2[(i6 * valueOf3) + i3]);
                                    if (i7 >= valueOf2) {
                                        break;
                                    }
                                    i6 = i7;
                                }
                            }
                            if (i4 >= valueOf3) {
                                break;
                            }
                            i3 = i4;
                        }
                    }
                    if (i2 >= valueOf) {
                        break;
                    }
                    i = i2;
                }
            }
            return onviewcreated3;
        } catch (Throwable th) {
            isStateAtLeast.values(th, performActivityCreated.class);
            return null;
        }
    }

    public static final void valueOf(onViewCreated onviewcreated) {
        if (isStateAtLeast.values(performActivityCreated.class)) {
            return;
        }
        try {
            runAnimators.ag$a(onviewcreated, "x");
            float[] values = onviewcreated.values();
            int i = 0;
            int length = values.length - 1;
            if (length < 0) {
                return;
            }
            while (true) {
                int i2 = i + 1;
                if (values[i] < 0.0f) {
                    values[i] = 0.0f;
                }
                if (i2 > length) {
                    return;
                }
                i = i2;
            }
        } catch (Throwable th) {
            isStateAtLeast.values(th, performActivityCreated.class);
        }
    }

    public static final void toString(onViewCreated onviewcreated, int i) {
        if (isStateAtLeast.values(performActivityCreated.class)) {
            return;
        }
        try {
            runAnimators.ag$a(onviewcreated, "x");
            if (i >= onviewcreated.ag$a()) {
                return;
            }
            int ag$a2 = onviewcreated.ag$a();
            int i2 = 1;
            if (i < ag$a2) {
                int i3 = i;
                while (true) {
                    int i4 = i3 + 1;
                    i2 *= onviewcreated.valueOf(i3);
                    if (i4 >= ag$a2) {
                        break;
                    }
                    i3 = i4;
                }
            }
            int[] iArr = new int[i + 1];
            int i5 = 0;
            if (i > 0) {
                while (true) {
                    int i6 = i5 + 1;
                    iArr[i5] = onviewcreated.valueOf(i5);
                    if (i6 >= i) {
                        break;
                    }
                    i5 = i6;
                }
            }
            iArr[i] = i2;
            onviewcreated.ah$a(iArr);
        } catch (Throwable th) {
            isStateAtLeast.values(th, performActivityCreated.class);
        }
    }

    public static final onViewCreated valueOf(onViewCreated[] onviewcreatedArr) {
        int i;
        if (isStateAtLeast.values(performActivityCreated.class)) {
            return null;
        }
        try {
            runAnimators.ag$a(onviewcreatedArr, "tensors");
            int valueOf = onviewcreatedArr[0].valueOf(0);
            int length = onviewcreatedArr.length - 1;
            if (length >= 0) {
                int i2 = 0;
                i = 0;
                while (true) {
                    int i3 = i2 + 1;
                    i += onviewcreatedArr[i2].valueOf(1);
                    if (i3 > length) {
                        break;
                    }
                    i2 = i3;
                }
            } else {
                i = 0;
            }
            onViewCreated onviewcreated = new onViewCreated(new int[]{valueOf, i});
            float[] values = onviewcreated.values();
            if (valueOf > 0) {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    int i6 = i4 * i;
                    int length2 = onviewcreatedArr.length - 1;
                    if (length2 >= 0) {
                        int i7 = 0;
                        while (true) {
                            int i8 = i7 + 1;
                            float[] values2 = onviewcreatedArr[i7].values();
                            int valueOf2 = onviewcreatedArr[i7].valueOf(1);
                            System.arraycopy(values2, i4 * valueOf2, values, i6, valueOf2);
                            i6 += valueOf2;
                            if (i8 > length2) {
                                break;
                            }
                            i7 = i8;
                        }
                    }
                    if (i5 >= valueOf) {
                        break;
                    }
                    i4 = i5;
                }
            }
            return onviewcreated;
        } catch (Throwable th) {
            isStateAtLeast.values(th, performActivityCreated.class);
            return null;
        }
    }

    public static final void ag$a(onViewCreated onviewcreated) {
        if (isStateAtLeast.values(performActivityCreated.class)) {
            return;
        }
        try {
            runAnimators.ag$a(onviewcreated, "x");
            int i = 0;
            int valueOf = onviewcreated.valueOf(0);
            int valueOf2 = onviewcreated.valueOf(1);
            float[] values = onviewcreated.values();
            if (valueOf <= 0) {
                return;
            }
            while (true) {
                int i2 = i + 1;
                int i3 = i * valueOf2;
                int i4 = i3 + valueOf2;
                float f = Float.MIN_VALUE;
                if (i3 < i4) {
                    int i5 = i3;
                    while (true) {
                        int i6 = i5 + 1;
                        if (values[i5] > f) {
                            f = values[i5];
                        }
                        if (i6 >= i4) {
                            break;
                        }
                        i5 = i6;
                    }
                }
                float f2 = 0.0f;
                if (i3 < i4) {
                    int i7 = i3;
                    while (true) {
                        int i8 = i7 + 1;
                        values[i7] = (float) Math.exp(values[i7] - f);
                        f2 += values[i7];
                        if (i8 >= i4) {
                            break;
                        }
                        i7 = i8;
                    }
                }
                if (i3 < i4) {
                    while (true) {
                        int i9 = i3 + 1;
                        values[i3] = values[i3] / f2;
                        if (i9 >= i4) {
                            break;
                        }
                        i3 = i9;
                    }
                }
                if (i2 >= valueOf) {
                    return;
                }
                i = i2;
            }
        } catch (Throwable th) {
            isStateAtLeast.values(th, performActivityCreated.class);
        }
    }

    public static final onViewCreated toString(onViewCreated onviewcreated, onViewCreated onviewcreated2, onViewCreated onviewcreated3) {
        if (isStateAtLeast.values(performActivityCreated.class)) {
            return null;
        }
        try {
            runAnimators.ag$a(onviewcreated, "x");
            runAnimators.ag$a(onviewcreated2, "w");
            runAnimators.ag$a(onviewcreated3, "b");
            int valueOf = onviewcreated.valueOf(0);
            int valueOf2 = onviewcreated3.valueOf(0);
            onViewCreated ah$a = ah$a(onviewcreated, onviewcreated2);
            float[] values = onviewcreated3.values();
            float[] values2 = ah$a.values();
            if (valueOf > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (valueOf2 > 0) {
                        int i3 = 0;
                        while (true) {
                            int i4 = i3 + 1;
                            int i5 = (i * valueOf2) + i3;
                            values2[i5] = values2[i5] + values[i3];
                            if (i4 >= valueOf2) {
                                break;
                            }
                            i3 = i4;
                        }
                    }
                    if (i2 >= valueOf) {
                        break;
                    }
                    i = i2;
                }
            }
            return ah$a;
        } catch (Throwable th) {
            isStateAtLeast.values(th, performActivityCreated.class);
            return null;
        }
    }

    public static final onViewCreated ah$a(String[] strArr, int i, onViewCreated onviewcreated) {
        if (isStateAtLeast.values(performActivityCreated.class)) {
            return null;
        }
        try {
            runAnimators.ag$a(strArr, "texts");
            runAnimators.ag$a(onviewcreated, "w");
            int length = strArr.length;
            int valueOf = onviewcreated.valueOf(1);
            onViewCreated onviewcreated2 = new onViewCreated(new int[]{length, i, valueOf});
            float[] values = onviewcreated2.values();
            float[] values2 = onviewcreated.values();
            if (length > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    int[] valueOf2 = performCreate.ah$a.valueOf(strArr[i2], i);
                    if (i > 0) {
                        int i4 = 0;
                        while (true) {
                            int i5 = i4 + 1;
                            System.arraycopy(values2, valueOf2[i4] * valueOf, values, (valueOf * i * i2) + (i4 * valueOf), valueOf);
                            if (i5 >= i) {
                                break;
                            }
                            i4 = i5;
                        }
                    }
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return onviewcreated2;
        } catch (Throwable th) {
            isStateAtLeast.values(th, performActivityCreated.class);
            return null;
        }
    }

    public static final onViewCreated values(onViewCreated onviewcreated) {
        if (isStateAtLeast.values(performActivityCreated.class)) {
            return null;
        }
        try {
            runAnimators.ag$a(onviewcreated, "x");
            int valueOf = onviewcreated.valueOf(0);
            int valueOf2 = onviewcreated.valueOf(1);
            onViewCreated onviewcreated2 = new onViewCreated(new int[]{valueOf2, valueOf});
            float[] values = onviewcreated.values();
            float[] values2 = onviewcreated2.values();
            if (valueOf > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (valueOf2 > 0) {
                        int i3 = 0;
                        while (true) {
                            int i4 = i3 + 1;
                            values2[(i3 * valueOf) + i] = values[(i * valueOf2) + i3];
                            if (i4 >= valueOf2) {
                                break;
                            }
                            i3 = i4;
                        }
                    }
                    if (i2 >= valueOf) {
                        break;
                    }
                    i = i2;
                }
            }
            return onviewcreated2;
        } catch (Throwable th) {
            isStateAtLeast.values(th, performActivityCreated.class);
            return null;
        }
    }

    public static final onViewCreated ah$a(onViewCreated onviewcreated) {
        if (isStateAtLeast.values(performActivityCreated.class)) {
            return null;
        }
        try {
            runAnimators.ag$a(onviewcreated, "x");
            int valueOf = onviewcreated.valueOf(0);
            int valueOf2 = onviewcreated.valueOf(1);
            int valueOf3 = onviewcreated.valueOf(2);
            onViewCreated onviewcreated2 = new onViewCreated(new int[]{valueOf3, valueOf2, valueOf});
            float[] values = onviewcreated.values();
            float[] values2 = onviewcreated2.values();
            if (valueOf > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (valueOf2 > 0) {
                        int i3 = 0;
                        while (true) {
                            int i4 = i3 + 1;
                            if (valueOf3 > 0) {
                                int i5 = 0;
                                while (true) {
                                    int i6 = i5 + 1;
                                    values2[(i5 * valueOf * valueOf2) + (i3 * valueOf) + i] = values[(i * valueOf2 * valueOf3) + (i3 * valueOf3) + i5];
                                    if (i6 >= valueOf3) {
                                        break;
                                    }
                                    i5 = i6;
                                }
                            }
                            if (i4 >= valueOf2) {
                                break;
                            }
                            i3 = i4;
                        }
                    }
                    if (i2 >= valueOf) {
                        break;
                    }
                    i = i2;
                }
            }
            return onviewcreated2;
        } catch (Throwable th) {
            isStateAtLeast.values(th, performActivityCreated.class);
            return null;
        }
    }

    public static final onViewCreated ag$a(onViewCreated onviewcreated, onViewCreated onviewcreated2) {
        Class<performActivityCreated> cls;
        onViewCreated onviewcreated3;
        Class<performActivityCreated> cls2 = performActivityCreated.class;
        if (isStateAtLeast.values(cls2)) {
            return null;
        }
        try {
            runAnimators.ag$a(onviewcreated, "x");
            runAnimators.ag$a(onviewcreated2, "w");
            int valueOf = onviewcreated.valueOf(0);
            int valueOf2 = onviewcreated.valueOf(1);
            int valueOf3 = onviewcreated.valueOf(2);
            int valueOf4 = onviewcreated2.valueOf(0);
            int i = (valueOf2 - valueOf4) + 1;
            int valueOf5 = onviewcreated2.valueOf(2);
            onViewCreated onviewcreated4 = new onViewCreated(new int[]{valueOf, i, valueOf5});
            float[] values = onviewcreated.values();
            float[] values2 = onviewcreated4.values();
            float[] values3 = onviewcreated2.values();
            if (valueOf <= 0) {
                return onviewcreated4;
            }
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (valueOf5 > 0) {
                    int i4 = 0;
                    while (true) {
                        int i5 = i4 + 1;
                        if (i > 0) {
                            int i6 = 0;
                            while (true) {
                                int i7 = i6 + 1;
                                float f = 0.0f;
                                if (valueOf4 > 0) {
                                    int i8 = 0;
                                    while (true) {
                                        cls = cls2;
                                        int i9 = i8 + 1;
                                        if (valueOf3 > 0) {
                                            int i10 = 0;
                                            while (true) {
                                                onviewcreated3 = onviewcreated4;
                                                int i11 = i10 + 1;
                                                try {
                                                    f += values[(valueOf2 * valueOf3 * i2) + ((i8 + i6) * valueOf3) + i10] * values3[(((i8 * valueOf3) + i10) * valueOf5) + i4];
                                                    if (i11 >= valueOf3) {
                                                        break;
                                                    }
                                                    i10 = i11;
                                                    onviewcreated4 = onviewcreated3;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    isStateAtLeast.values(th, cls);
                                                    return null;
                                                }
                                            }
                                        } else {
                                            onviewcreated3 = onviewcreated4;
                                        }
                                        if (i9 >= valueOf4) {
                                            break;
                                        }
                                        i8 = i9;
                                        cls2 = cls;
                                        onviewcreated4 = onviewcreated3;
                                    }
                                } else {
                                    cls = cls2;
                                    onviewcreated3 = onviewcreated4;
                                }
                                values2[(i * valueOf5 * i2) + (i6 * valueOf5) + i4] = f;
                                if (i7 >= i) {
                                    break;
                                }
                                i6 = i7;
                                cls2 = cls;
                                onviewcreated4 = onviewcreated3;
                            }
                        } else {
                            cls = cls2;
                            onviewcreated3 = onviewcreated4;
                        }
                        if (i5 >= valueOf5) {
                            break;
                        }
                        i4 = i5;
                        cls2 = cls;
                        onviewcreated4 = onviewcreated3;
                    }
                } else {
                    cls = cls2;
                    onviewcreated3 = onviewcreated4;
                }
                if (i3 >= valueOf) {
                    return onviewcreated3;
                }
                i2 = i3;
                cls2 = cls;
                onviewcreated4 = onviewcreated3;
            }
        } catch (Throwable th2) {
            th = th2;
            cls = cls2;
        }
    }

    public static final onViewCreated values(onViewCreated onviewcreated, int i) {
        Class<performActivityCreated> cls;
        Class<performActivityCreated> cls2;
        int i2;
        Class<performActivityCreated> cls3 = performActivityCreated.class;
        if (isStateAtLeast.values(cls3)) {
            return null;
        }
        try {
            runAnimators.ag$a(onviewcreated, "x");
            int valueOf = onviewcreated.valueOf(0);
            int valueOf2 = onviewcreated.valueOf(1);
            int valueOf3 = onviewcreated.valueOf(2);
            int i3 = (valueOf2 - i) + 1;
            onViewCreated onviewcreated2 = new onViewCreated(new int[]{valueOf, i3, valueOf3});
            float[] values = onviewcreated.values();
            float[] values2 = onviewcreated2.values();
            if (valueOf > 0) {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    if (valueOf3 > 0) {
                        int i6 = 0;
                        while (true) {
                            int i7 = i6 + 1;
                            if (i3 > 0) {
                                int i8 = 0;
                                while (true) {
                                    int i9 = i8 + 1;
                                    int i10 = i8 * valueOf3;
                                    int i11 = (i4 * i3 * valueOf3) + i10 + i6;
                                    values2[i11] = Float.MIN_VALUE;
                                    if (i > 0) {
                                        int i12 = 0;
                                        while (true) {
                                            int i13 = i12 + 1;
                                            cls2 = cls3;
                                            try {
                                                int i14 = (i4 * valueOf2 * valueOf3) + i10 + i6 + (i12 * valueOf3);
                                                i2 = valueOf2;
                                                values2[i11] = Math.max(values2[i11], values[i14]);
                                                if (i13 >= i) {
                                                    break;
                                                }
                                                valueOf2 = i2;
                                                cls3 = cls2;
                                                i12 = i13;
                                            } catch (Throwable th) {
                                                th = th;
                                                cls = cls2;
                                                isStateAtLeast.values(th, cls);
                                                return null;
                                            }
                                        }
                                    } else {
                                        cls2 = cls3;
                                        i2 = valueOf2;
                                    }
                                    if (i9 >= i3) {
                                        break;
                                    }
                                    i8 = i9;
                                    valueOf2 = i2;
                                    cls3 = cls2;
                                }
                            } else {
                                cls2 = cls3;
                                i2 = valueOf2;
                            }
                            if (i7 >= valueOf3) {
                                break;
                            }
                            i6 = i7;
                            valueOf2 = i2;
                            cls3 = cls2;
                        }
                    } else {
                        cls2 = cls3;
                        i2 = valueOf2;
                    }
                    if (i5 >= valueOf) {
                        break;
                    }
                    i4 = i5;
                    valueOf2 = i2;
                    cls3 = cls2;
                }
            }
            return onviewcreated2;
        } catch (Throwable th2) {
            th = th2;
            cls = cls3;
        }
    }
}
