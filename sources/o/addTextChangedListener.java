package o;

import android.graphics.Color;
import android.os.Process;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class addTextChangedListener implements getViewHorizontalDragRange {
    private final SearchViewBindingAdapter ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof addTextChangedListener) && runAnimators.values(this.ag$a, ((addTextChangedListener) obj).ag$a);
    }

    public int hashCode() {
        return this.ag$a.hashCode();
    }

    public String toString() {
        return "FomoToolTipShown(_screenName=" + this.ag$a + ')';
    }

    public addTextChangedListener(SearchViewBindingAdapter searchViewBindingAdapter) {
        runAnimators.ag$a(searchViewBindingAdapter, "_screenName");
        this.ag$a = searchViewBindingAdapter;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "FomoToolTipShown");
        hashMap.put("screenName", this.ag$a.ag$a());
        return hashMap;
    }

    /* renamed from: o.addTextChangedListener$default  reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class Cdefault implements getViewHorizontalDragRange {
        private static int ag$a = 0;
        private static int toString = 1;
        private static char valueOf = 3;
        private static char[] values = {13813, 13823, 13814, 13817, 13801, 13815, 13800, 13807, 13816};
        private final setCurrentTabTag ah$a;

        public boolean equals(Object obj) {
            if (this == obj) {
                try {
                    int i = ag$a + 37;
                    toString = i % 128;
                    int i2 = i % 2;
                    return true;
                } catch (Exception e) {
                    throw e;
                }
            }
            if (obj instanceof Cdefault) {
                try {
                    if ((!runAnimators.values(this.ah$a, ((Cdefault) obj).ah$a) ? '*' : (char) 24) != 24) {
                        return false;
                    }
                    int i3 = toString + 21;
                    ag$a = i3 % 128;
                    if (i3 % 2 == 0) {
                        return true;
                    }
                    Object[] objArr = null;
                    int length = objArr.length;
                    return true;
                } catch (Exception e2) {
                    throw e2;
                }
            }
            return false;
        }

        public int hashCode() {
            int i = ag$a + 41;
            toString = i % 128;
            int i2 = i % 2;
            try {
                try {
                    int hashCode = this.ah$a.hashCode();
                    int i3 = toString + 21;
                    ag$a = i3 % 128;
                    if ((i3 % 2 != 0 ? ')' : 'Y') != ')') {
                        return hashCode;
                    }
                    int i4 = 67 / 0;
                    return hashCode;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }

        public String toString() {
            String str = "FollowingListPageLoaded(_source=" + this.ah$a + ')';
            try {
                int i = toString + 67;
                try {
                    ag$a = i % 128;
                    int i2 = i % 2;
                    return str;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }

        public Cdefault(setCurrentTabTag setcurrenttabtag) {
            runAnimators.ag$a(setcurrenttabtag, "_source");
            this.ah$a = setcurrenttabtag;
        }

        @Override // o.getViewHorizontalDragRange
        public Map<String, Object> values() {
            HashMap hashMap = new HashMap();
            hashMap.put("eventName", "FollowingListPageLoaded");
            hashMap.put(ag$a((byte) ((Process.myPid() >> 22) + 76), new char[]{3, 1, '\b', 7, 4, 0}, Color.red(0) + 6).intern(), this.ah$a.ah$a());
            int i = toString + 1;
            ag$a = i % 128;
            int i2 = i % 2;
            return hashMap;
        }

        private static String ag$a(byte b2, char[] cArr, int i) {
            int i2;
            String str;
            synchronized (isFirst.HaptikSDK$b) {
                char[] cArr2 = values;
                char c = valueOf;
                char[] cArr3 = new char[i];
                if (i % 2 != 0) {
                    i2 = i - 1;
                    cArr3[i2] = (char) (cArr[i2] - b2);
                } else {
                    i2 = i;
                }
                if (i2 > 1) {
                    isFirst.valueOf = 0;
                    while (isFirst.valueOf < i2) {
                        isFirst.toString = cArr[isFirst.valueOf];
                        isFirst.ah$a = cArr[isFirst.valueOf + 1];
                        if (isFirst.toString == isFirst.ah$a) {
                            cArr3[isFirst.valueOf] = (char) (isFirst.toString - b2);
                            cArr3[isFirst.valueOf + 1] = (char) (isFirst.ah$a - b2);
                        } else {
                            isFirst.ag$a = isFirst.toString / c;
                            isFirst.invoke = isFirst.toString % c;
                            isFirst.values = isFirst.ah$a / c;
                            isFirst.ah$b = isFirst.ah$a % c;
                            if (isFirst.invoke == isFirst.ah$b) {
                                isFirst.ag$a = ((isFirst.ag$a + c) - 1) % c;
                                isFirst.values = ((isFirst.values + c) - 1) % c;
                                int i3 = (isFirst.ag$a * c) + isFirst.invoke;
                                int i4 = (isFirst.values * c) + isFirst.ah$b;
                                cArr3[isFirst.valueOf] = cArr2[i3];
                                cArr3[isFirst.valueOf + 1] = cArr2[i4];
                            } else if (isFirst.ag$a == isFirst.values) {
                                isFirst.invoke = ((isFirst.invoke + c) - 1) % c;
                                isFirst.ah$b = ((isFirst.ah$b + c) - 1) % c;
                                int i5 = (isFirst.ag$a * c) + isFirst.invoke;
                                int i6 = (isFirst.values * c) + isFirst.ah$b;
                                cArr3[isFirst.valueOf] = cArr2[i5];
                                cArr3[isFirst.valueOf + 1] = cArr2[i6];
                            } else {
                                int i7 = (isFirst.ag$a * c) + isFirst.ah$b;
                                int i8 = (isFirst.values * c) + isFirst.invoke;
                                cArr3[isFirst.valueOf] = cArr2[i7];
                                cArr3[isFirst.valueOf + 1] = cArr2[i8];
                            }
                        }
                        isFirst.valueOf += 2;
                    }
                }
                for (int i9 = 0; i9 < i; i9++) {
                    cArr3[i9] = (char) (cArr3[i9] ^ 13722);
                }
                str = new String(cArr3);
            }
            return str;
        }
    }
}
