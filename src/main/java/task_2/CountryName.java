package task_2;

public enum CountryName {
    England, USA, France;
    public String toString(){
        return switch (this) {
            case England -> "England";
            case USA -> "USA";
            case France -> "France";
        };
    }
}
