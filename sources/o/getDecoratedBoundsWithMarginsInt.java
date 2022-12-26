package o;

import java.io.File;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class getDecoratedBoundsWithMarginsInt {
    private final String toString;
    private final getRecycledViewPool valueOf;

    public getDecoratedBoundsWithMarginsInt(String str, getRecycledViewPool getrecycledviewpool) {
        this.toString = str;
        this.valueOf = getrecycledviewpool;
    }

    public boolean values() {
        createScroller createscroller;
        try {
            return valueOf().createNewFile();
        } catch (IOException e) {
            createscroller = createScroller.valueOf;
            createscroller.ag$a("Error creating marker: " + this.toString, e);
            return false;
        }
    }

    public boolean ag$a() {
        return valueOf().exists();
    }

    public boolean ah$a() {
        return valueOf().delete();
    }

    private File valueOf() {
        return this.valueOf.ag$a(this.toString);
    }
}
