package o;
/* loaded from: classes5.dex */
public final class endTransaction {
    private static final int[] toString = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private static int ah$a(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }

    public static lambda$update$6 valueOf(byte[] bArr, int i, int i2) {
        getMaximumSize getmaximumsize;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        getMaximumSize ah$a = new execSQL(bArr).ah$a();
        int ah$a2 = ((ah$a.ah$a() * i) / 100) + 11;
        int ah$a3 = ah$a.ah$a();
        int i7 = 0;
        int i8 = 1;
        if (i2 != 0) {
            z = i2 < 0;
            i4 = Math.abs(i2);
            if (i4 > (z ? 4 : 32)) {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i2)));
            }
            i5 = ah$a(i4, z);
            i3 = toString[i4];
            getmaximumsize = values(ah$a, i3);
            if (getmaximumsize.ah$a() + ah$a2 > i5 - (i5 % i3)) {
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
            if (z && getmaximumsize.ah$a() > (i3 << 6)) {
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
        } else {
            getMaximumSize getmaximumsize2 = null;
            int i9 = 0;
            int i10 = 0;
            while (i9 <= 32) {
                boolean z2 = i9 <= 3;
                int i11 = z2 ? i9 + 1 : i9;
                int ah$a4 = ah$a(i11, z2);
                if (ah$a3 + ah$a2 <= ah$a4) {
                    if (getmaximumsize2 == null || i10 != toString[i11]) {
                        int i12 = toString[i11];
                        i10 = i12;
                        getmaximumsize2 = values(ah$a, i12);
                    }
                    if ((!z2 || getmaximumsize2.ah$a() <= (i10 << 6)) && getmaximumsize2.ah$a() + ah$a2 <= ah$a4 - (ah$a4 % i10)) {
                        getmaximumsize = getmaximumsize2;
                        i3 = i10;
                        z = z2;
                        i4 = i11;
                        i5 = ah$a4;
                    }
                }
                i9++;
                i7 = 0;
                i8 = 1;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        getMaximumSize ag$a = ag$a(getmaximumsize, i5, i3);
        int ah$a5 = getmaximumsize.ah$a() / i3;
        getMaximumSize ah$a6 = ah$a(z, i4, ah$a5);
        int i13 = (z ? 11 : 14) + (i4 << 2);
        int[] iArr = new int[i13];
        int i14 = 2;
        if (z) {
            for (int i15 = 0; i15 < i13; i15++) {
                iArr[i15] = i15;
            }
            i6 = i13;
        } else {
            int i16 = i13 / 2;
            i6 = i13 + 1 + (((i16 - 1) / 15) * 2);
            int i17 = i6 / 2;
            for (int i18 = 0; i18 < i16; i18++) {
                int i19 = (i18 / 15) + i18;
                iArr[(i16 - i18) - i8] = (i17 - i19) - 1;
                iArr[i16 + i18] = i19 + i17 + i8;
            }
        }
        inTransaction intransaction = new inTransaction(i6);
        int i20 = 0;
        int i21 = 0;
        while (i20 < i4) {
            int i22 = ((i4 - i20) << i14) + (z ? 9 : 12);
            int i23 = 0;
            while (i23 < i22) {
                int i24 = i23 << 1;
                while (i7 < i14) {
                    if (ag$a.values(i21 + i24 + i7)) {
                        int i25 = i20 << 1;
                        intransaction.values(iArr[i25 + i7], iArr[i25 + i23]);
                    }
                    if (ag$a.values((i22 << 1) + i21 + i24 + i7)) {
                        int i26 = i20 << 1;
                        intransaction.values(iArr[i26 + i23], iArr[((i13 - 1) - i26) - i7]);
                    }
                    if (ag$a.values((i22 << 2) + i21 + i24 + i7)) {
                        int i27 = (i13 - 1) - (i20 << 1);
                        intransaction.values(iArr[i27 - i7], iArr[i27 - i23]);
                    }
                    if (ag$a.values((i22 * 6) + i21 + i24 + i7)) {
                        int i28 = i20 << 1;
                        intransaction.values(iArr[((i13 - 1) - i28) - i23], iArr[i28 + i7]);
                    }
                    i7++;
                    i14 = 2;
                }
                i23++;
                i7 = 0;
                i14 = 2;
            }
            i21 += i22 << 3;
            i20++;
            i7 = 0;
            i14 = 2;
        }
        ah$a(intransaction, z, i6, ah$a6);
        if (z) {
            ah$a(intransaction, i6 / 2, 5);
        } else {
            int i29 = i6 / 2;
            ah$a(intransaction, i29, 7);
            int i30 = 0;
            int i31 = 0;
            while (i31 < (i13 / 2) - 1) {
                for (int i32 = i29 & 1; i32 < i6; i32 += 2) {
                    int i33 = i29 - i30;
                    intransaction.values(i33, i32);
                    int i34 = i29 + i30;
                    intransaction.values(i34, i32);
                    intransaction.values(i32, i33);
                    intransaction.values(i32, i34);
                }
                i31 += 15;
                i30 += 16;
            }
        }
        lambda$update$6 lambda_update_6 = new lambda$update$6();
        lambda_update_6.values(z);
        lambda_update_6.valueOf(i6);
        lambda_update_6.ah$a(i4);
        lambda_update_6.toString(ah$a5);
        lambda_update_6.ah$a(intransaction);
        return lambda_update_6;
    }

    private static void ah$a(inTransaction intransaction, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    intransaction.values(i5, i4);
                    intransaction.values(i5, i6);
                    intransaction.values(i4, i5);
                    intransaction.values(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        intransaction.values(i7, i7);
        int i8 = i7 + 1;
        intransaction.values(i8, i7);
        intransaction.values(i7, i8);
        int i9 = i + i2;
        intransaction.values(i9, i7);
        intransaction.values(i9, i8);
        intransaction.values(i9, i9 - 1);
    }

    static getMaximumSize ah$a(boolean z, int i, int i2) {
        getMaximumSize getmaximumsize = new getMaximumSize();
        if (z) {
            getmaximumsize.valueOf(i - 1, 2);
            getmaximumsize.valueOf(i2 - 1, 6);
            return ag$a(getmaximumsize, 28, 4);
        }
        getmaximumsize.valueOf(i - 1, 5);
        getmaximumsize.valueOf(i2 - 1, 11);
        return ag$a(getmaximumsize, 40, 4);
    }

    private static void ah$a(inTransaction intransaction, boolean z, int i, getMaximumSize getmaximumsize) {
        int i2 = i / 2;
        int i3 = 0;
        if (z) {
            while (i3 < 7) {
                int i4 = (i2 - 3) + i3;
                if (getmaximumsize.values(i3)) {
                    intransaction.values(i4, i2 - 5);
                }
                if (getmaximumsize.values(i3 + 7)) {
                    intransaction.values(i2 + 5, i4);
                }
                if (getmaximumsize.values(20 - i3)) {
                    intransaction.values(i4, i2 + 5);
                }
                if (getmaximumsize.values(27 - i3)) {
                    intransaction.values(i2 - 5, i4);
                }
                i3++;
            }
            return;
        }
        while (i3 < 10) {
            int i5 = (i2 - 5) + i3 + (i3 / 5);
            if (getmaximumsize.values(i3)) {
                intransaction.values(i5, i2 - 7);
            }
            if (getmaximumsize.values(i3 + 10)) {
                intransaction.values(i2 + 7, i5);
            }
            if (getmaximumsize.values(29 - i3)) {
                intransaction.values(i5, i2 + 7);
            }
            if (getmaximumsize.values(39 - i3)) {
                intransaction.values(i2 - 7, i5);
            }
            i3++;
        }
    }

    private static getMaximumSize ag$a(getMaximumSize getmaximumsize, int i, int i2) {
        isWriteAheadLoggingEnabled iswriteaheadloggingenabled = new isWriteAheadLoggingEnabled(ah$a(i2));
        int i3 = i / i2;
        int[] values = values(getmaximumsize, i2, i3);
        iswriteaheadloggingenabled.valueOf(values, i3 - (getmaximumsize.ah$a() / i2));
        getMaximumSize getmaximumsize2 = new getMaximumSize();
        getmaximumsize2.valueOf(0, i % i2);
        for (int i4 : values) {
            getmaximumsize2.valueOf(i4, i2);
        }
        return getmaximumsize2;
    }

    private static int[] values(getMaximumSize getmaximumsize, int i, int i2) {
        int[] iArr = new int[i2];
        int ah$a = getmaximumsize.ah$a() / i;
        for (int i3 = 0; i3 < ah$a; i3++) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i4 |= getmaximumsize.values((i3 * i) + i5) ? 1 << ((i - i5) - 1) : 0;
            }
            iArr[i3] = i4;
        }
        return iArr;
    }

    private static getPageSize ah$a(int i) {
        if (i != 4) {
            if (i != 6) {
                if (i != 8) {
                    if (i != 10) {
                        if (i == 12) {
                            return getPageSize.ag$a;
                        }
                        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i)));
                    }
                    return getPageSize.values;
                }
                return getPageSize.ah$a;
            }
            return getPageSize.valueOf;
        }
        return getPageSize.toString;
    }

    static getMaximumSize values(getMaximumSize getmaximumsize, int i) {
        getMaximumSize getmaximumsize2 = new getMaximumSize();
        int ah$a = getmaximumsize.ah$a();
        int i2 = (1 << i) - 2;
        int i3 = 0;
        while (i3 < ah$a) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i3 + i5;
                if (i6 >= ah$a || getmaximumsize.values(i6)) {
                    i4 |= 1 << ((i - 1) - i5);
                }
            }
            int i7 = i4 & i2;
            if (i7 == i2) {
                getmaximumsize2.valueOf(i7, i);
            } else if (i7 == 0) {
                getmaximumsize2.valueOf(i4 | 1, i);
            } else {
                getmaximumsize2.valueOf(i4, i);
                i3 += i;
            }
            i3--;
            i3 += i;
        }
        return getmaximumsize2;
    }
}
