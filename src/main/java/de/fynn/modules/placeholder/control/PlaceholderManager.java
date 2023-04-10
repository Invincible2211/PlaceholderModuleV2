package de.fynn.modules.placeholder.control;

import de.fynn.modules.placeholder.modell.Placeholder;
import de.fynn.modules.placeholder.modell.PlaceholderArguments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PlaceholderManager {

    private final HashMap<String, Placeholder> placeholderHashMap = new HashMap<>();

    protected PlaceholderManager(){}

    public boolean addPlaceholder(Placeholder placeholder){
        if (placeholderHashMap.containsKey(placeholder.getIdentifier()))
            return false;
        placeholderHashMap.put(placeholder.getIdentifier(), placeholder);
        return true;
    }

    public String resolve(String input, PlaceholderArguments arguments){
        String[] placeholders = this.findPlaceholders(input);
        for (String currentPlaceholder:
             placeholders) {
            Placeholder placeholder = placeholderHashMap.get(currentPlaceholder);
            if (!placeholder.getNeededArguments().isFullfilled(arguments)){
                continue;
            }
            String placeholderValue = placeholder.getPlaceholderResolver().resolve(arguments);
            input = input.replace(currentPlaceholder, placeholderValue);
        }
        return input;
    }

    private String[] findPlaceholders(String input){
        List<String> usedPlaceholders = new ArrayList<>();
        for (String placeholder:
             this.placeholderHashMap.keySet()) {
            if (input.contains(placeholder))
                usedPlaceholders.add(placeholder);
        }
        return usedPlaceholders.toArray(new String[0]);
    }

}
