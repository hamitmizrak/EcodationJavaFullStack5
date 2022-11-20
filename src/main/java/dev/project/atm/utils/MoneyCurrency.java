package dev.project.atm.utils;

// Java 5 ile gelmiş ,
// Type Safe(Tür güvenliği) sağlamak
// Daha yönetebilir bir sistem yapabilmek
// Enumda özellikler: instance olmaması gerekiyor.
// ve sadece GETTER olmalıdır.
public enum MoneyCurrency {
    TR(1,"tr"),EN(2,"en"),GE(3,"ge");

    //final: sabit ve setter yazmamasını sağlamak
    private final Integer number;
    private final String currency;

    //Constructor final olmalıdır. (instance isn't)
    private  MoneyCurrency(Integer number,String currency){
        this.number=number;
        this.currency=currency;
    }

    //Getter
    public Integer getNumber() {
        return number;
    }

    public String getCurrency() {
        return currency;
    }
}
