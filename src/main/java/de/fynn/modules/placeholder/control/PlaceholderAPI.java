package de.fynn.modules.placeholder.control;

import de.fynn.modules.placeholder.modell.Placeholder;
import de.fynn.modules.placeholder.modell.PlaceholderArguments;

public class PlaceholderAPI {

    private final static PlaceholderManager placeholderManager = new PlaceholderManager();

    private PlaceholderAPI(){}

    public static boolean addPlaceholder(Placeholder placeholder){
        return placeholderManager.addPlaceholder(placeholder);
    }

    public static String resolve(String input, PlaceholderArguments placeholderArguments){
        return placeholderManager.resolve(input, placeholderArguments);
    }

}
