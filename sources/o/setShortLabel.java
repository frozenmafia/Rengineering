package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
/* loaded from: classes3.dex */
public class setShortLabel implements LeadingMarginSpan {
    private static Path valueOf;
    private final int ag$a;
    private final boolean ah$a;
    private final int toString;
    private final int values;

    public setShortLabel() {
        this.toString = 2;
        this.ag$a = 4;
        this.ah$a = false;
        this.values = 0;
    }

    public setShortLabel(int i, int i2) {
        this.toString = i2;
        this.ag$a = i;
        this.ah$a = false;
        this.values = 0;
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return (this.ag$a * 2) + this.toString;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint.Style style = paint.getStyle();
            int i8 = 0;
            if (this.ah$a) {
                i8 = paint.getColor();
                paint.setColor(this.values);
            }
            paint.setStyle(Paint.Style.FILL);
            if (canvas.isHardwareAccelerated()) {
                if (valueOf == null) {
                    Path path = new Path();
                    valueOf = path;
                    path.addCircle(0.0f, 0.0f, this.ag$a * 1.2f, Path.Direction.CW);
                }
                canvas.save();
                canvas.translate(i + (i2 * ((this.ag$a * 1.2f) + 1.0f)), (i3 + i5) / 2.0f);
                canvas.drawPath(valueOf, paint);
                canvas.restore();
            } else {
                int i9 = this.ag$a;
                canvas.drawCircle(i + (i2 * (i9 + 1)), (i3 + i5) / 2.0f, i9, paint);
            }
            if (this.ah$a) {
                paint.setColor(i8);
            }
            paint.setStyle(style);
        }
    }
}
