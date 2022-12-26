package com.apxor.androidsdk.plugins.realtimeui.h;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.view.View;
import java.io.InputStream;
/* loaded from: classes3.dex */
public class c extends View {
    private Movie a;

    /* renamed from: b  reason: collision with root package name */
    private long f328b;

    public c(Context context) {
        super(context);
        this.f328b = 0L;
        setFocusable(true);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        long currentTimeMillis = System.currentTimeMillis();
        canvas.drawColor(0);
        if (this.f328b == 0) {
            this.f328b = currentTimeMillis;
        }
        Movie movie = this.a;
        if (movie != null) {
            int duration = movie.duration();
            if (duration == 0) {
                duration = 1000;
            }
            this.a.setTime((int) ((currentTimeMillis - this.f328b) % duration));
            int width = getWidth();
            int height = getHeight();
            canvas.scale(width / this.a.width(), height / this.a.height());
            this.a.draw(canvas, 1.0f, 1.0f);
            invalidate();
        }
    }

    public void setMovie(InputStream inputStream) {
        this.a = Movie.decodeStream(inputStream);
        invalidate();
    }
}
