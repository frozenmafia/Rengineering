package o;

import java.util.Date;
import java.util.List;
import o.ViewPager2;
/* loaded from: classes3.dex */
public final class RegionKt$iterator$1 {
    public String ag$a;
    public String ah$a;
    public final String toString;
    public final Long valueOf;
    public List<TypefaceCompat> values;

    public RegionKt$iterator$1() {
        this(null, null, null, 7);
    }

    public /* synthetic */ RegionKt$iterator$1(int i, List list, String str, String str2, Long l, String str3) {
        Date parse;
        if ((i & 0) != 0) {
            ViewPager2.AnonymousClass4.values(i, 0, RegionKt$iterator$1$ag$a.ag$a.values());
        }
        if ((i & 1) == 0) {
            this.values = null;
        } else {
            this.values = list;
        }
        if ((i & 2) == 0) {
            this.ag$a = null;
        } else {
            this.ag$a = str;
        }
        if ((i & 4) == 0) {
            this.toString = null;
        } else {
            this.toString = str2;
        }
        if ((i & 8) == 0) {
            String str4 = this.toString;
            Long valueOf = (str4 == null || (parse = addAccessibilityAction.values().parse(str4)) == null) ? null : Long.valueOf(parse.getTime());
            this.valueOf = valueOf == null ? null : valueOf;
        } else {
            this.valueOf = l;
        }
        if ((i & 16) == 0) {
            this.ah$a = null;
        } else {
            this.ah$a = str3;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegionKt$iterator$1) {
            RegionKt$iterator$1 regionKt$iterator$1 = (RegionKt$iterator$1) obj;
            return runAnimators.values(this.values, regionKt$iterator$1.values) && runAnimators.values((Object) this.ag$a, (Object) regionKt$iterator$1.ag$a) && runAnimators.values((Object) this.toString, (Object) regionKt$iterator$1.toString);
        }
        return false;
    }

    public int hashCode() {
        List<TypefaceCompat> list = this.values;
        int hashCode = list == null ? 0 : list.hashCode();
        String str = this.ag$a;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.toString;
        return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "StorylyMediaItem(layers=" + this.values + ", layersUrl=" + ((Object) this.ag$a) + ", createDate=" + ((Object) this.toString) + ')';
    }

    public RegionKt$iterator$1(List<TypefaceCompat> list, String str, String str2) {
        Date parse;
        this.values = list;
        this.ag$a = str;
        this.toString = str2;
        Long valueOf = (str2 == null || (parse = addAccessibilityAction.values().parse(str2)) == null) ? null : Long.valueOf(parse.getTime());
        this.valueOf = valueOf != null ? valueOf : null;
    }

    public /* synthetic */ RegionKt$iterator$1(List list, String str, String str2, int i) {
        this(null, null, null);
    }
}
