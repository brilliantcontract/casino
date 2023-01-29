package bc.csn.observer.settings;

import bc.csn.observer.utils.Settings;
import bc.csn.strategies.RouletteMirrorStrategy;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ejb.EJB;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;

@Path("/settings")
public class SettingsRest {

    @EJB(beanName = "roulette-mirror-strategy")
    RouletteMirrorStrategy rouletteMirrorStrategy;
    
    private final Settings settings = new Settings();

    public SettingsRest() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/default-settings")
    public String getDefaultSettings() throws URISyntaxException, IOException {
        return settings.readDefaultSettings();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/current-settings")
    public String getCurrentSettings() throws URISyntaxException, IOException {
        String currentSetting = settings.readCurrentSettings();

        if (currentSetting.isEmpty()) {
            currentSetting = getDefaultSettings();
        }

        return currentSetting;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/current-settings")
    public void setCurrentSettings(String currentSettings) throws URISyntaxException, IOException {
        settings.writeCurrentSettings(currentSettings);
    }

}
