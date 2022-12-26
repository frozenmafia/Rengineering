package o;

import o.ComponentActivity;
/* loaded from: classes4.dex */
public final class isDrawerView<T> {
    private final startActivityForResult<T> toString;
    private final ComponentActivity.NonConfigurationInstances valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof isDrawerView) {
            isDrawerView isdrawerview = (isDrawerView) obj;
            return runAnimators.values(this.valueOf, isdrawerview.valueOf) && runAnimators.values(this.toString, isdrawerview.toString);
        }
        return false;
    }

    public int hashCode() {
        return (this.valueOf.hashCode() * 31) + this.toString.hashCode();
    }

    public String toString() {
        ComponentActivity.NonConfigurationInstances nonConfigurationInstances = this.valueOf;
        startActivityForResult<T> startactivityforresult = this.toString;
        return "GraphQLAdapterInfo(scalarType=" + nonConfigurationInstances + ", adapter=" + startactivityforresult + ")";
    }

    public isDrawerView(ComponentActivity.NonConfigurationInstances nonConfigurationInstances, startActivityForResult<T> startactivityforresult) {
        runAnimators.ag$a(nonConfigurationInstances, "scalarType");
        runAnimators.ag$a(startactivityforresult, "adapter");
        this.valueOf = nonConfigurationInstances;
        this.toString = startactivityforresult;
    }

    public final ComponentActivity.NonConfigurationInstances ah$a() {
        return this.valueOf;
    }

    public final startActivityForResult<T> valueOf() {
        return this.toString;
    }
}
