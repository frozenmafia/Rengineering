package o;

import com.appsamurai.storyly.StoryType;
import java.util.List;
import o.PathParser;
/* loaded from: classes3.dex */
public final class PathSegment {
    private final StoryType ag$a;
    private String ah$a;
    private final String toString;
    private final List<String> valueOf;
    private final List<PathParser.ExtractFloatResult> values;

    /* JADX WARN: Multi-variable type inference failed */
    public PathSegment(StoryType storyType, List<? extends PathParser.ExtractFloatResult> list, List<String> list2, String str, String str2) {
        runAnimators.ag$a(storyType, "type");
        this.ag$a = storyType;
        this.values = list;
        this.valueOf = list2;
        this.toString = str;
        this.ah$a = str2;
    }

    public final List<PathParser.ExtractFloatResult> ag$a() {
        return this.values;
    }

    public final void ag$a(String str) {
        this.ah$a = str;
    }

    public final String ah$a() {
        return this.toString;
    }

    public final StoryType ah$b() {
        return this.ag$a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PathSegment) {
            PathSegment pathSegment = (PathSegment) obj;
            return this.ag$a == pathSegment.ag$a && runAnimators.values(this.values, pathSegment.values) && runAnimators.values(this.valueOf, pathSegment.valueOf) && runAnimators.values((Object) this.toString, (Object) pathSegment.toString) && runAnimators.values((Object) this.ah$a, (Object) pathSegment.ah$a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.ag$a.hashCode();
        List<PathParser.ExtractFloatResult> list = this.values;
        int hashCode2 = list == null ? 0 : list.hashCode();
        List<String> list2 = this.valueOf;
        int hashCode3 = list2 == null ? 0 : list2.hashCode();
        String str = this.toString;
        int hashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.ah$a;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "StoryMedia(type=" + this.ag$a + ", storyComponentList=" + this.values + ", actionUrlList=" + this.valueOf + ", actionUrl=" + ((Object) this.toString) + ", previewUrl=" + ((Object) this.ah$a) + ')';
    }

    public final String valueOf() {
        return this.ah$a;
    }

    public final List<String> values() {
        return this.valueOf;
    }
}
