package nl.gridshore.ff2015;

/**
 * Created by jettrocoenradie on 05/11/14.
 */
public class Welcome {
    private String version;
    private String message;

    public Welcome(String version, String message) {
        this.version = version;
        this.message = message;
    }

    public String getVersion() {
        return version;
    }

    public String getMessage() {
        return message;
    }
}
