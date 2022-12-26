package o;

import java.io.IOException;
import java.io.StringWriter;
import o.StaggeredGridLayoutManager;
/* loaded from: classes5.dex */
public abstract class invalidateSpanAssignments {
    public boolean getSignupData() {
        return this instanceof findLastVisibleItemPositions;
    }

    public boolean HaptikWebView() {
        return this instanceof prepareLayoutStateForDelta;
    }

    public boolean getInitSettings() {
        return this instanceof StaggeredGridLayoutManager.AnonymousClass1;
    }

    public boolean HaptikSDK$e() {
        return this instanceof setGapStrategy;
    }

    public prepareLayoutStateForDelta ah$b() {
        if (HaptikWebView()) {
            return (prepareLayoutStateForDelta) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public findLastVisibleItemPositions HaptikSDK$b() {
        if (getSignupData()) {
            return (findLastVisibleItemPositions) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public StaggeredGridLayoutManager.AnonymousClass1 HaptikSDK$c() {
        if (getInitSettings()) {
            return (StaggeredGridLayoutManager.AnonymousClass1) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public boolean values() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public Number invoke() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String HaptikSDK$a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double ag$a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public long valueOf() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int ah$a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            StaggeredGridLayoutManager.Span span = new StaggeredGridLayoutManager.Span(stringWriter);
            span.ah$a(true);
            offsetForAddition.ah$a(this, span);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
