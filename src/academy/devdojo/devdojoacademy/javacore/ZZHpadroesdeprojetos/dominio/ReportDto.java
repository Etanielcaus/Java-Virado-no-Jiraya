package academy.devdojo.devdojoacademy.javacore.ZZHpadroesdeprojetos.dominio;

public class ReportDto {
    private String aircraftName;
    private Country country;
    private Currency currency;
    private String personName;


    @Override
    public String toString() {
        return "ReportDto{" +
                "aircraftName='" + aircraftName + '\'' +
                ", country=" + country +
                ", currency=" + currency.getSymbol() +
                ", personName='" + personName + '\'' +
                '}';
    }

    public static final class ReportDtoBuilder {
        private String aircraftName;
        private Country country;
        private Currency currency;
        private String personName;

        private ReportDtoBuilder() {
        }

        public static ReportDtoBuilder builder() {
            return new ReportDtoBuilder();
        }

        public ReportDtoBuilder withAircraftName(String aircraftName) {
            this.aircraftName = aircraftName;
            return this;
        }

        public ReportDtoBuilder withCountry(Country country) {
            this.country = country;
            return this;
        }

        public ReportDtoBuilder withCurrency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public ReportDtoBuilder withPersonName(String personName) {
            this.personName = personName;
            return this;
        }

        public ReportDto build() {
            ReportDto reportDto = new ReportDto();
            reportDto.personName = this.personName;
            reportDto.currency = this.currency;
            reportDto.country = this.country;
            reportDto.aircraftName = this.aircraftName;
            return reportDto;
        }
    }
}
