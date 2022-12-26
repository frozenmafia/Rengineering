package o;

import com.appsamurai.storyly.StorylyDataSource;
import java.util.List;
import o.Styleable;
/* loaded from: classes3.dex */
public final class abortCreation implements addFontFromBuffer {
    public final boolean ah$a;
    public final excludeObject<List<getFontFamily>, StorylyDataSource, Boolean, setAnimationMatrix> toString;
    public final Styleable.ChangeBounds<String, setAnimationMatrix> values;

    /* JADX WARN: Multi-variable type inference failed */
    public abortCreation(excludeObject<? super List<getFontFamily>, ? super StorylyDataSource, ? super Boolean, setAnimationMatrix> excludeobject, Styleable.ChangeBounds<? super String, setAnimationMatrix> changeBounds, boolean z) {
        runAnimators.ag$a(excludeobject, "onDataLoaded");
        runAnimators.ag$a(changeBounds, "onDataLoadFailed");
        this.toString = excludeobject;
        this.values = changeBounds;
        this.ah$a = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof abortCreation) {
            abortCreation abortcreation = (abortCreation) obj;
            return runAnimators.values(this.toString, abortcreation.toString) && runAnimators.values(this.values, abortcreation.values) && this.ah$a == abortcreation.ah$a;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.toString.hashCode();
        int hashCode2 = this.values.hashCode();
        boolean z = this.ah$a;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public String toString() {
        return "MomentsQueueItem(onDataLoaded=" + this.toString + ", onDataLoadFailed=" + this.values + ", isFromPreview=" + this.ah$a + ')';
    }
}
