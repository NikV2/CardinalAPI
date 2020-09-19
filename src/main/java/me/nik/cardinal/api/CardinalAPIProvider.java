package me.nik.cardinal.api;

public class CardinalAPIProvider {
    private static CardinalAPI cardinalAPI = null;

    public CardinalAPIProvider() {
    }

    public static CardinalAPI getAPI() {
        return cardinalAPI;
    }

    /**
     * Internal use by Cardinal only!
     *
     * @param api CardinalAPI
     */
    @Deprecated
    public static void register(CardinalAPI api) {
        cardinalAPI = api;
    }
}