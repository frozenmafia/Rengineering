package org.apache.http.impl.bootstrap;

import java.io.IOException;
import org.apache.http.ExceptionLogger;
import org.apache.http.HttpServerConnection;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpCoreContext;
import org.apache.http.protocol.HttpService;
/* loaded from: classes8.dex */
class Worker implements Runnable {
    private final HttpServerConnection conn;
    private final ExceptionLogger exceptionLogger;
    private final HttpService httpservice;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Worker(HttpService httpService, HttpServerConnection httpServerConnection, ExceptionLogger exceptionLogger) {
        this.httpservice = httpService;
        this.conn = httpServerConnection;
        this.exceptionLogger = exceptionLogger;
    }

    public HttpServerConnection getConnection() {
        return this.conn;
    }

    @Override // java.lang.Runnable
    public void run() {
        HttpServerConnection httpServerConnection;
        try {
            try {
                try {
                    BasicHttpContext basicHttpContext = new BasicHttpContext();
                    HttpCoreContext adapt = HttpCoreContext.adapt(basicHttpContext);
                    while (!Thread.interrupted() && this.conn.isOpen()) {
                        this.httpservice.handleRequest(this.conn, adapt);
                        basicHttpContext.clear();
                    }
                    this.conn.close();
                    httpServerConnection = this.conn;
                } catch (Exception e) {
                    this.exceptionLogger.log(e);
                    httpServerConnection = this.conn;
                }
                httpServerConnection.shutdown();
            } catch (IOException e2) {
                this.exceptionLogger.log(e2);
            }
        } catch (Throwable th) {
            try {
                this.conn.shutdown();
            } catch (IOException e3) {
                this.exceptionLogger.log(e3);
            }
            throw th;
        }
    }
}
