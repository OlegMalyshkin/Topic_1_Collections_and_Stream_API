package entity;

public class Country {

    private Integer numericCode;
    private String name;
    private String capital;
    private Double area;
    private Integer population;
    private String region;

    public Country(Integer numericCode, String name, String capital, Double area, Integer population, String region) {
        this.numericCode = numericCode;
        this.name = name;
        this.capital = capital;
        this.area = area;
        this.population = population;
        this.region = region;
    }
}
