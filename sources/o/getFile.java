package o;

import o.ViewPager2;
/* loaded from: classes3.dex */
public final class getFile {
    public final int values;

    public getFile(int i) {
        this.values = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getFile) && this.values == ((getFile) obj).values;
    }

    public int hashCode() {
        return this.values;
    }

    public String toString() {
        return "StorylyTemplateItem(maxStoryCount=" + this.values + ')';
    }

    public /* synthetic */ getFile(int i, int i2) {
        if (1 != (i & 1)) {
            ViewPager2.AnonymousClass4.values(i, 1, getFile$ag$a.ag$a.values());
        }
        this.values = i2;
    }
}
