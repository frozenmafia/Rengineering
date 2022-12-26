package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.PointF;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class PointKt {
    public static final int component1(Point point) {
        runAnimators.ag$a(point, "<this>");
        return point.x;
    }

    public static final int component2(Point point) {
        runAnimators.ag$a(point, "<this>");
        return point.y;
    }

    public static final float component1(PointF pointF) {
        runAnimators.ag$a(pointF, "<this>");
        return pointF.x;
    }

    public static final float component2(PointF pointF) {
        runAnimators.ag$a(pointF, "<this>");
        return pointF.y;
    }

    public static final Point plus(Point point, Point point2) {
        runAnimators.ag$a(point, "<this>");
        runAnimators.ag$a(point2, TtmlNode.TAG_P);
        Point point3 = new Point(point.x, point.y);
        point3.offset(point2.x, point2.y);
        return point3;
    }

    public static final PointF plus(PointF pointF, PointF pointF2) {
        runAnimators.ag$a(pointF, "<this>");
        runAnimators.ag$a(pointF2, TtmlNode.TAG_P);
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(pointF2.x, pointF2.y);
        return pointF3;
    }

    public static final Point plus(Point point, int i) {
        runAnimators.ag$a(point, "<this>");
        Point point2 = new Point(point.x, point.y);
        point2.offset(i, i);
        return point2;
    }

    public static final PointF plus(PointF pointF, float f) {
        runAnimators.ag$a(pointF, "<this>");
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(f, f);
        return pointF2;
    }

    public static final Point minus(Point point, Point point2) {
        runAnimators.ag$a(point, "<this>");
        runAnimators.ag$a(point2, TtmlNode.TAG_P);
        Point point3 = new Point(point.x, point.y);
        point3.offset(-point2.x, -point2.y);
        return point3;
    }

    public static final PointF minus(PointF pointF, PointF pointF2) {
        runAnimators.ag$a(pointF, "<this>");
        runAnimators.ag$a(pointF2, TtmlNode.TAG_P);
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(-pointF2.x, -pointF2.y);
        return pointF3;
    }

    public static final Point minus(Point point, int i) {
        runAnimators.ag$a(point, "<this>");
        Point point2 = new Point(point.x, point.y);
        int i2 = -i;
        point2.offset(i2, i2);
        return point2;
    }

    public static final PointF minus(PointF pointF, float f) {
        runAnimators.ag$a(pointF, "<this>");
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        float f2 = -f;
        pointF2.offset(f2, f2);
        return pointF2;
    }

    public static final Point unaryMinus(Point point) {
        runAnimators.ag$a(point, "<this>");
        return new Point(-point.x, -point.y);
    }

    public static final PointF unaryMinus(PointF pointF) {
        runAnimators.ag$a(pointF, "<this>");
        return new PointF(-pointF.x, -pointF.y);
    }

    public static final PointF toPointF(Point point) {
        runAnimators.ag$a(point, "<this>");
        return new PointF(point);
    }

    public static final Point toPoint(PointF pointF) {
        runAnimators.ag$a(pointF, "<this>");
        return new Point((int) pointF.x, (int) pointF.y);
    }
}
