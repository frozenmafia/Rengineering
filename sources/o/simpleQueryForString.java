package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class simpleQueryForString {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int values(AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0 autoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0) {
        return ah$a(autoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0, true) + ah$a(autoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int valueOf(AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0 autoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0) {
        byte[][] ah$a = autoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0.ah$a();
        int values = autoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0.values();
        int ag$a = autoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0.ag$a();
        int i = 0;
        for (int i2 = 0; i2 < ag$a - 1; i2++) {
            byte[] bArr = ah$a[i2];
            int i3 = 0;
            while (i3 < values - 1) {
                byte b2 = bArr[i3];
                int i4 = i3 + 1;
                if (b2 == bArr[i4]) {
                    int i5 = i2 + 1;
                    if (b2 == ah$a[i5][i3] && b2 == ah$a[i5][i4]) {
                        i++;
                    }
                }
                i3 = i4;
            }
        }
        return i * 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int ag$a(AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0 autoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0) {
        byte[][] ah$a = autoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0.ah$a();
        int values = autoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0.values();
        int ag$a = autoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0.ag$a();
        int i = 0;
        for (int i2 = 0; i2 < ag$a; i2++) {
            for (int i3 = 0; i3 < values; i3++) {
                byte[] bArr = ah$a[i2];
                int i4 = i3 + 6;
                if (i4 < values && bArr[i3] == 1 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 1 && bArr[i3 + 3] == 1 && bArr[i3 + 4] == 1 && bArr[i3 + 5] == 0 && bArr[i4] == 1 && (ah$a(bArr, i3 - 4, i3) || ah$a(bArr, i3 + 7, i3 + 11))) {
                    i++;
                }
                int i5 = i2 + 6;
                if (i5 < ag$a && ah$a[i2][i3] == 1 && ah$a[i2 + 1][i3] == 0 && ah$a[i2 + 2][i3] == 1 && ah$a[i2 + 3][i3] == 1 && ah$a[i2 + 4][i3] == 1 && ah$a[i2 + 5][i3] == 0 && ah$a[i5][i3] == 1 && (ag$a(ah$a, i3, i2 - 4, i2) || ag$a(ah$a, i3, i2 + 7, i2 + 11))) {
                    i++;
                }
            }
        }
        return i * 40;
    }

    private static boolean ah$a(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, bArr.length);
        for (int max = Math.max(i, 0); max < min; max++) {
            if (bArr[max] == 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean ag$a(byte[][] bArr, int i, int i2, int i3) {
        int min = Math.min(i3, bArr.length);
        for (int max = Math.max(i2, 0); max < min; max++) {
            if (bArr[max][i] == 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int toString(AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0 autoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0) {
        byte[][] ah$a = autoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0.ah$a();
        int values = autoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0.values();
        int ag$a = autoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0.ag$a();
        int i = 0;
        for (int i2 = 0; i2 < ag$a; i2++) {
            byte[] bArr = ah$a[i2];
            for (int i3 = 0; i3 < values; i3++) {
                if (bArr[i3] == 1) {
                    i++;
                }
            }
        }
        int ag$a2 = autoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0.ag$a() * autoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0.values();
        return ((Math.abs((i << 1) - ag$a2) * 10) / ag$a2) * 10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean values(int i, int i2, int i3) {
        int i4;
        int i5;
        switch (i) {
            case 0:
                i3 += i2;
                i4 = i3 & 1;
                break;
            case 1:
                i4 = i3 & 1;
                break;
            case 2:
                i4 = i2 % 3;
                break;
            case 3:
                i4 = (i3 + i2) % 3;
                break;
            case 4:
                i3 /= 2;
                i2 /= 3;
                i3 += i2;
                i4 = i3 & 1;
                break;
            case 5:
                int i6 = i3 * i2;
                i4 = (i6 & 1) + (i6 % 3);
                break;
            case 6:
                int i7 = i3 * i2;
                i5 = (i7 & 1) + (i7 % 3);
                i4 = i5 & 1;
                break;
            case 7:
                i5 = ((i3 * i2) % 3) + ((i3 + i2) & 1);
                i4 = i5 & 1;
                break;
            default:
                throw new IllegalArgumentException("Invalid mask pattern: ".concat(String.valueOf(i)));
        }
        return i4 == 0;
    }

    private static int ah$a(AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0 autoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0, boolean z) {
        int ag$a = z ? autoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0.ag$a() : autoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0.values();
        int values = z ? autoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0.values() : autoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0.ag$a();
        byte[][] ah$a = autoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0.ah$a();
        int i = 0;
        for (int i2 = 0; i2 < ag$a; i2++) {
            byte b2 = -1;
            int i3 = 0;
            for (int i4 = 0; i4 < values; i4++) {
                byte b3 = z ? ah$a[i2][i4] : ah$a[i4][i2];
                if (b3 == b2) {
                    i3++;
                } else {
                    if (i3 >= 5) {
                        i += (i3 - 5) + 3;
                    }
                    b2 = b3;
                    i3 = 1;
                }
            }
            if (i3 >= 5) {
                i += (i3 - 5) + 3;
            }
        }
        return i;
    }
}
