package bc.roulette.face;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import bc.roulette.Config;

public class ArgumentsParser {

    private final Config config = Config.create();

    /**
     * Arguments will be parsed and Config call updated.
     * @param args 
     */
    void parse(String[] args) {
        Options options = new Options();

        Option roulette = new Option("r", "roulette", true, "Roulette name. Specify a list delimited with comma.");
        roulette.setRequired(true);
        options.addOption(roulette);

        Option session = new Option("s", "session", true, "Session ID");
        session.setRequired(true);
        options.addOption(session);

        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();
        CommandLine cmd = null;//not a good practice, it serves it purpose 

        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            formatter.printHelp("Roulette", options);

            System.exit(1);
        }

        config.setRouletteNameForMonitoring(cmd.getOptionValue("roulette"));
        config.setRouletteWebsiteSessionId(cmd.getOptionValue("session"));
    }
}
