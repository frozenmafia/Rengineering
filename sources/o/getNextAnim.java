package o;
/* loaded from: classes4.dex */
public class getNextAnim {
    public static int ah$a(int i, int i2) {
        return ((i + 31) * 31) + i2;
    }

    public static int toString(int i, int i2, int i3, int i4, int i5, int i6) {
        return ((((((((((i + 31) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i6;
    }

    public static int values(Object obj, Object obj2) {
        return ah$a(obj == null ? 0 : obj.hashCode(), obj2 != null ? obj2.hashCode() : 0);
    }

    public static int valueOf(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return toString(obj == null ? 0 : obj.hashCode(), obj2 == null ? 0 : obj2.hashCode(), obj3 == null ? 0 : obj3.hashCode(), obj4 == null ? 0 : obj4.hashCode(), obj5 == null ? 0 : obj5.hashCode(), obj6 == null ? 0 : obj6.hashCode());
    }
}
