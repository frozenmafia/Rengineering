package com.app.dream11.spotlight;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import com.app.dream11Pro.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class TextDrawer {
    private static final int INDEX_TEXT_START_X = 0;
    private static final int INDEX_TEXT_START_Y = 1;
    private static final int INDEX_TEXT_WIDTH = 2;
    private final float actionBarOffset;
    private final Context context;
    private boolean hasRecalculated;
    private final float padding;
    private DynamicLayout textLayout;
    private final TextPaint textPaint;
    private final float textSize;
    private MetricAffectingSpan textSpan;
    private SpannableString textString;
    private DynamicLayout titleLayout;
    private final TextPaint titlePaint;
    private MetricAffectingSpan titleSpan;
    private SpannableString titleString;
    private Layout.Alignment textAlignment = Layout.Alignment.ALIGN_NORMAL;
    private Layout.Alignment titleAlignment = Layout.Alignment.ALIGN_NORMAL;
    private float[] mBestTextPosition = new float[3];
    private int forcedTextPosition = -1;

    public TextDrawer(Resources resources, Context context) {
        this.padding = resources.getDimension(R.dimen.res_0x7f0705d7);
        this.textSize = resources.getDimension(R.dimen.res_0x7f070525);
        this.actionBarOffset = resources.getDimension(R.dimen.res_0x7f070053);
        this.context = context;
        TextPaint textPaint = new TextPaint();
        this.titlePaint = textPaint;
        textPaint.setAntiAlias(true);
        TextPaint textPaint2 = new TextPaint();
        this.textPaint = textPaint2;
        textPaint2.setAntiAlias(true);
    }

    public void draw(Canvas canvas) {
        if (shouldDrawText()) {
            float[] bestTextPosition = getBestTextPosition();
            int max = Math.max(0, (int) this.mBestTextPosition[2]);
            if (!TextUtils.isEmpty(this.titleString)) {
                canvas.save();
                if (this.hasRecalculated) {
                    this.titleLayout = new DynamicLayout(this.titleString, this.titlePaint, max, this.titleAlignment, 1.0f, 1.0f, true);
                }
                if (this.titleLayout != null) {
                    canvas.translate(bestTextPosition[0], bestTextPosition[1]);
                    this.titleLayout.draw(canvas);
                    canvas.restore();
                }
            }
            if (!TextUtils.isEmpty(this.textString)) {
                canvas.save();
                if (this.hasRecalculated) {
                    this.textLayout = new DynamicLayout(this.textString, this.textPaint, max, this.textAlignment, 1.2f, 1.0f, true);
                }
                DynamicLayout dynamicLayout = this.titleLayout;
                float height = dynamicLayout != null ? dynamicLayout.getHeight() + 10 : 0.0f;
                if (this.textLayout != null) {
                    canvas.translate(bestTextPosition[0], bestTextPosition[1] + height);
                    this.textLayout.draw(canvas);
                    canvas.restore();
                }
            }
        }
        this.hasRecalculated = false;
    }

    public void setContentText(CharSequence charSequence) {
        if (charSequence != null) {
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(this.textSpan, 0, spannableString.length(), 0);
            this.textString = spannableString;
            this.hasRecalculated = true;
        }
    }

    public void setContentTitle(CharSequence charSequence) {
        if (charSequence != null) {
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(this.titleSpan, 0, spannableString.length(), 0);
            this.titleString = spannableString;
            this.hasRecalculated = true;
        }
    }

    public void calculateTextPosition(int i, int i2, boolean z, Rect rect) {
        int centerX;
        int[] iArr = {rect.left * i2, rect.top * i, (i - rect.right) * i2, (i2 - rect.bottom) * i};
        int i3 = 0;
        for (int i4 = 1; i4 < 4; i4++) {
            if (iArr[i4] > iArr[i3]) {
                i3 = i4;
            }
        }
        int i5 = this.forcedTextPosition;
        if (i5 != -1) {
            i3 = i5;
        }
        if (i3 == 0) {
            this.textPaint.setTextAlign(Paint.Align.RIGHT);
            this.titlePaint.setTextAlign(Paint.Align.RIGHT);
            this.mBestTextPosition[0] = rect.left - this.padding;
            this.mBestTextPosition[1] = rect.top + (this.padding * 2.0f);
            this.mBestTextPosition[2] = rect.left - (this.padding * 2.0f);
        } else if (i3 == 1) {
            float f = this.padding;
            if (rect.centerX() > i / 2) {
                centerX = i / 3;
            } else {
                centerX = rect.centerX() - (rect.width() / 2);
            }
            float f2 = f + centerX;
            float[] fArr = this.mBestTextPosition;
            fArr[0] = f2;
            float centerY = rect.centerY() - (rect.height() / 2);
            float f3 = this.textSize;
            float f4 = this.padding;
            fArr[1] = (centerY - f3) - f4;
            this.mBestTextPosition[2] = i - ((f4 * 2.0f) + Math.max(f2, i / 3));
            if (z) {
                float[] fArr2 = this.mBestTextPosition;
                fArr2[0] = i / 4;
                fArr2[2] = (i * 50) / 100;
            }
        } else if (i3 == 2) {
            this.textPaint.setTextAlign(Paint.Align.LEFT);
            this.titlePaint.setTextAlign(Paint.Align.LEFT);
            if (rect.centerX() > i / 2) {
                Log.d("centerX", "centerX: " + ((Object) this.titleString));
                int i6 = i / 3;
            } else {
                Log.d("centerX", "centerX: " + ((Object) this.titleString));
                rect.centerX();
                int width = rect.width() / 2;
            }
            this.mBestTextPosition[0] = rect.right + this.padding;
            this.mBestTextPosition[1] = rect.top + (this.padding * 2.0f);
            float[] fArr3 = this.mBestTextPosition;
            float f5 = this.padding;
            fArr3[2] = i - ((rect.right + f5) + f5);
        } else if (i3 == 3) {
            float f6 = this.padding;
            if (rect.centerX() > (i * 2) / 3) {
                float f7 = i;
                float f8 = this.padding;
                this.textPaint.setTextAlign(Paint.Align.RIGHT);
                this.titlePaint.setTextAlign(Paint.Align.RIGHT);
                this.mBestTextPosition[2] = f7 - (this.padding * 2.0f);
                f6 = f7 - f8;
            } else if (rect.centerX() > i / 2) {
                this.textPaint.setTextAlign(Paint.Align.CENTER);
                this.titlePaint.setTextAlign(Paint.Align.CENTER);
                this.mBestTextPosition[2] = i - (this.padding * 2.0f);
            } else {
                this.textPaint.setTextAlign(Paint.Align.LEFT);
                this.titlePaint.setTextAlign(Paint.Align.LEFT);
                f6 += rect.centerX() - (rect.width() / 2);
                this.mBestTextPosition[2] = i - ((this.padding * 2.0f) + Math.max(f6, i / 3));
            }
            float[] fArr4 = this.mBestTextPosition;
            fArr4[0] = f6;
            fArr4[1] = this.padding + rect.centerY() + (rect.height() / 2);
            if (z) {
                float[] fArr5 = this.mBestTextPosition;
                fArr5[0] = i / 4;
                fArr5[2] = (i * 60) / 100;
            }
            Log.d("calculateTextPosition", "calculateTextPosition: " + this.mBestTextPosition[0] + " y " + this.mBestTextPosition[1]);
            Log.d("calculateTextPosition", "showcase x: " + rect.centerX() + " y " + rect.centerY());
        } else if (i3 == 4) {
            float f9 = this.padding;
            this.textPaint.setTextAlign(Paint.Align.LEFT);
            this.titlePaint.setTextAlign(Paint.Align.LEFT);
            float centerX2 = f9 + (rect.centerX() - (rect.width() / 2));
            float[] fArr6 = this.mBestTextPosition;
            fArr6[0] = centerX2;
            fArr6[1] = this.padding + rect.centerY() + (rect.height() / 2);
            this.mBestTextPosition[2] = i - ((this.padding * 2.0f) + Math.max(centerX2, i / 3));
            if (z) {
                float[] fArr7 = this.mBestTextPosition;
                fArr7[0] = i / 4;
                fArr7[2] = (i * 40) / 100;
            }
        }
        this.hasRecalculated = true;
    }

    public void setTitleStyling(int i) {
        this.titleSpan = new TextAppearanceSpan(this.context, i);
        setContentTitle(this.titleString);
    }

    public void setDetailStyling(int i) {
        this.textSpan = new TextAppearanceSpan(this.context, i);
        setContentText(this.textString);
    }

    public float[] getBestTextPosition() {
        return this.mBestTextPosition;
    }

    public boolean shouldDrawText() {
        return (TextUtils.isEmpty(this.titleString) && TextUtils.isEmpty(this.textString)) ? false : true;
    }

    public void setContentPaint(TextPaint textPaint) {
        this.textPaint.set(textPaint);
        SpannableString spannableString = this.textString;
        if (spannableString != null) {
            spannableString.removeSpan(this.textSpan);
        }
        this.textSpan = new NoOpSpan();
        setContentText(this.textString);
    }

    public void setTitlePaint(TextPaint textPaint) {
        this.titlePaint.set(textPaint);
        SpannableString spannableString = this.titleString;
        if (spannableString != null) {
            spannableString.removeSpan(this.titleSpan);
        }
        this.titleSpan = new NoOpSpan();
        setContentTitle(this.titleString);
    }

    public void setDetailTextAlignment(Layout.Alignment alignment) {
        this.textAlignment = alignment;
    }

    public void setTitleTextAlignment(Layout.Alignment alignment) {
        this.titleAlignment = alignment;
    }

    public void forceTextPosition(int i) {
        if (i > 4 || i < -1) {
            throw new IllegalArgumentException("ShowcaseView text was forced with an invalid position");
        }
        this.forcedTextPosition = i;
    }

    /* loaded from: classes3.dex */
    static class NoOpSpan extends MetricAffectingSpan {
        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }

        @Override // android.text.style.MetricAffectingSpan
        public void updateMeasureState(TextPaint textPaint) {
        }

        private NoOpSpan() {
        }
    }
}
