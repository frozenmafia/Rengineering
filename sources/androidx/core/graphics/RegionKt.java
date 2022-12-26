package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Iterator;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class RegionKt {
    public static final boolean contains(Region region, Point point) {
        runAnimators.ag$a(region, "<this>");
        runAnimators.ag$a(point, TtmlNode.TAG_P);
        return region.contains(point.x, point.y);
    }

    public static final Region plus(Region region, Rect rect) {
        runAnimators.ag$a(region, "<this>");
        runAnimators.ag$a(rect, "r");
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    public static final Region plus(Region region, Region region2) {
        runAnimators.ag$a(region, "<this>");
        runAnimators.ag$a(region2, "r");
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    public static final Region minus(Region region, Rect rect) {
        runAnimators.ag$a(region, "<this>");
        runAnimators.ag$a(rect, "r");
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.DIFFERENCE);
        return region2;
    }

    public static final Region minus(Region region, Region region2) {
        runAnimators.ag$a(region, "<this>");
        runAnimators.ag$a(region2, "r");
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.DIFFERENCE);
        return region3;
    }

    public static final Region unaryMinus(Region region) {
        runAnimators.ag$a(region, "<this>");
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    public static final Region and(Region region, Rect rect) {
        runAnimators.ag$a(region, "<this>");
        runAnimators.ag$a(rect, "r");
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.INTERSECT);
        return region2;
    }

    public static final Region and(Region region, Region region2) {
        runAnimators.ag$a(region, "<this>");
        runAnimators.ag$a(region2, "r");
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.INTERSECT);
        return region3;
    }

    public static final Region xor(Region region, Rect rect) {
        runAnimators.ag$a(region, "<this>");
        runAnimators.ag$a(rect, "r");
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.XOR);
        return region2;
    }

    public static final Region xor(Region region, Region region2) {
        runAnimators.ag$a(region, "<this>");
        runAnimators.ag$a(region2, "r");
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.XOR);
        return region3;
    }

    public static final void forEach(Region region, Styleable.ChangeBounds<? super Rect, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(region, "<this>");
        runAnimators.ag$a(changeBounds, "action");
        RegionIterator regionIterator = new RegionIterator(region);
        while (true) {
            Rect rect = new Rect();
            if (!regionIterator.next(rect)) {
                return;
            }
            changeBounds.invoke(rect);
        }
    }

    public static final Iterator<Rect> iterator(Region region) {
        runAnimators.ag$a(region, "<this>");
        return new RegionKt$iterator$1(region);
    }

    public static final Region not(Region region) {
        runAnimators.ag$a(region, "<this>");
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    public static final Region or(Region region, Rect rect) {
        runAnimators.ag$a(region, "<this>");
        runAnimators.ag$a(rect, "r");
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    public static final Region or(Region region, Region region2) {
        runAnimators.ag$a(region, "<this>");
        runAnimators.ag$a(region2, "r");
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }
}
