package app.enums;

public enum StrategyType {
    REPOSITORIES_AND_SERVICES,
    SERVICES,
    REPOSITORIES,
    CONTROLLERS,
    CONTROLLERS_EXAM,
    SERVICES_EXAM,
    EXAM;

    @Override
    public String toString() {
        String[] split = this.name().split("_");
        StringBuilder result = new StringBuilder();
        for (String s : split) {
            result.append(s.charAt(0)).append(s.toLowerCase().substring(1));
        }
        return result.toString();
    }


}
