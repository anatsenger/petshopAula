public enum RacaCachorro {
    PASTOR_ALEMAO,
    PIT_BULL,
    VIRA_LATA;

    public static RacaCachorro getRacaByNome(String nome){
        for (RacaCachorro racaEnum: RacaCachorro.values()) {
            if (racaEnum.name().equals(nome)){
                return racaEnum;
            }
        }
        return VIRA_LATA;
    }

}
