package org.apache.http.conn;

import java.net.InetAddress;
import java.net.UnknownHostException;
/* loaded from: classes5.dex */
public interface DnsResolver {
    InetAddress[] resolve(String str) throws UnknownHostException;
}
