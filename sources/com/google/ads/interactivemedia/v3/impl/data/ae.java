package com.google.ads.interactivemedia.v3.impl.data;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ae extends bp {
    private final String message;
    private final String name;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ae(String str, String str2) {
        this.name = str;
        this.message = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bp) {
            bp bpVar = (bp) obj;
            String str = this.name;
            if (str == null) {
                if (bpVar.name() != null) {
                    return false;
                }
            } else if (!str.equals(bpVar.name())) {
                return false;
            }
            String str2 = this.message;
            if (str2 == null) {
                if (bpVar.message() != null) {
                    return false;
                }
            } else if (!str2.equals(bpVar.message())) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bp
    public String message() {
        return this.message;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bp
    public String name() {
        return this.name;
    }

    public String toString() {
        String str = this.name;
        String str2 = this.message;
        return "LoggableException{name=" + str + ", message=" + str2 + "}";
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.message;
        return ((hashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }
}
