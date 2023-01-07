package bc.rlt.essential.sessions;

public class WebsiteSession {

    private final String id;

    public WebsiteSession(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id;
    }

}
