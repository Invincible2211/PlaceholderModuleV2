package de.fynn.placeholder.modell;

public class Placeholder {

    private final String identifier;
    private final PlaceholderResolver placeholderResolver;
    private final PlaceholderArguments neededArguments;

    public Placeholder(String identifier, PlaceholderResolver placeholderResolver, PlaceholderArguments neededArguments) {
        this.identifier = identifier;
        this.placeholderResolver = placeholderResolver;
        this.neededArguments = neededArguments;
    }

    public PlaceholderArguments getNeededArguments() {
        return neededArguments;
    }

    public PlaceholderResolver getPlaceholderResolver() {
        return placeholderResolver;
    }

    public String getIdentifier() {
        return identifier;
    }

}
