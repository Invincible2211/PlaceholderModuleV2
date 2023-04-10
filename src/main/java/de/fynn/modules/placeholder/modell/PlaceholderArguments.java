package de.fynn.modules.placeholder.modell;

import java.util.HashMap;
import java.util.List;

public class PlaceholderArguments {

    private final HashMap<String,Object> arguments = new HashMap<>();

    public void addArgument(String identifier, Object value){
        arguments.put(identifier, value);
    }

    public void addAllArguments(HashMap<String,Object> arguments){
        this.arguments.putAll(arguments);
    }

    public Object getArgument(String identifier) {
        return arguments.get(identifier);
    }

    private List<String> getAllIdentifiers(){
        return this.arguments.keySet().stream().toList();
    }

    public boolean isFullfilled(PlaceholderArguments arguments){
        return this.getAllIdentifiers().containsAll(arguments.getAllIdentifiers());
    }
}
