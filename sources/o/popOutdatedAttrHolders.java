package o;

import o.AppCompatViewInflater;
import o.ToolbarActionBar;
/* loaded from: classes.dex */
public final class popOutdatedAttrHolders {
    private final ToolbarActionBar.ToolbarCallbackWrapper ag$a;
    private final ToolbarActionBar.ToolbarCallbackWrapper ah$a;
    private final AppCompatViewInflater.DeclaredOnClickListener values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof popOutdatedAttrHolders) {
            popOutdatedAttrHolders popoutdatedattrholders = (popOutdatedAttrHolders) obj;
            return runAnimators.values(this.ah$a, popoutdatedattrholders.ah$a) && runAnimators.values(this.ag$a, popoutdatedattrholders.ag$a) && runAnimators.values(this.values, popoutdatedattrholders.values);
        }
        return false;
    }

    public int hashCode() {
        return (((this.ah$a.hashCode() * 31) + this.ag$a.hashCode()) * 31) + this.values.hashCode();
    }

    public String toString() {
        ToolbarActionBar.ToolbarCallbackWrapper toolbarCallbackWrapper = this.ah$a;
        ToolbarActionBar.ToolbarCallbackWrapper toolbarCallbackWrapper2 = this.ag$a;
        AppCompatViewInflater.DeclaredOnClickListener declaredOnClickListener = this.values;
        return "TeamCompareSummaryData(userTeam=" + toolbarCallbackWrapper + ", competitorTeam=" + toolbarCallbackWrapper2 + ", highlightedSectionVM=" + declaredOnClickListener + ")";
    }

    public popOutdatedAttrHolders(ToolbarActionBar.ToolbarCallbackWrapper toolbarCallbackWrapper, ToolbarActionBar.ToolbarCallbackWrapper toolbarCallbackWrapper2, AppCompatViewInflater.DeclaredOnClickListener declaredOnClickListener) {
        runAnimators.ag$a(toolbarCallbackWrapper, "userTeam");
        runAnimators.ag$a(toolbarCallbackWrapper2, "competitorTeam");
        runAnimators.ag$a(declaredOnClickListener, "highlightedSectionVM");
        this.ah$a = toolbarCallbackWrapper;
        this.ag$a = toolbarCallbackWrapper2;
        this.values = declaredOnClickListener;
    }

    public final ToolbarActionBar.ToolbarCallbackWrapper ah$a() {
        return this.ag$a;
    }

    public final ToolbarActionBar.ToolbarCallbackWrapper valueOf() {
        return this.ah$a;
    }

    public final AppCompatViewInflater.DeclaredOnClickListener values() {
        return this.values;
    }
}
