package de.fynn.placeholder.control;

import de.fynn.placeholder.modell.Placeholder;
import de.fynn.placeholder.modell.PlaceholderArguments;

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
