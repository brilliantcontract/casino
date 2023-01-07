package bc.rlt.essential.sessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WebsiteSessionsManager {

    private final List<WebsiteSession> websiteSessions = new ArrayList<>();
    private Iterator<WebsiteSession> iterator;
    private static WebsiteSessionsManager websiteSessionsManager = null;

    private WebsiteSessionsManager() {
    }

    public static WebsiteSessionsManager create() {
        if (WebsiteSessionsManager.websiteSessionsManager == null) {
            WebsiteSessionsManager.websiteSessionsManager = new WebsiteSessionsManager();
        }

        return WebsiteSessionsManager.websiteSessionsManager;
    }

    synchronized public WebsiteSession getNextSession() {
        if (this.iterator == null) {
            throw new ExceptionInInitializerError("Sessions manager doesn't have any sessions. Update it with a list of sessinos.");
        }

        if (!this.iterator.hasNext()) {
            this.iterator = this.websiteSessions.iterator();
        }

        return this.iterator.next();
    }

    public void update(List<String> sessionIds) {
        this.websiteSessions.clear();

        for (String sessionId : sessionIds) {
            this.websiteSessions.add(new WebsiteSession(sessionId));
        }

        this.iterator = this.websiteSessions.iterator();
    }

}
