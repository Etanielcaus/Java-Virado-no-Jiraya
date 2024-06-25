package academy.devdojo.devdojoacademy.javacore.YColections.dominio;

public class SmartPhone {
    private String serialNumber;
    private String marca;

    public SmartPhone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

//    Reflexio> x.equal(x) true para tudo que for diferente de null
//    sinético: para xe y diferentes de null, se x.equals(y) == true logo, y.equals(x) == true
//    Transitividade: para x,y,z diferentes de null, se x.equals(y) == true logo, y.equals(x) == true, logo, y.equals(z) == true
//    Consistente: x.equals(x) sempre retorna true se x for deiferente de null
//    para x diferente de true retorna false
    @Override
    public boolean equals(Object obj) {
         if (obj == null) return false;
         if (this == obj) return true;
         if (this.getClass() != obj.getClass()) return false;
         SmartPhone smartPhone = (SmartPhone) obj;
         return serialNumber != null && serialNumber.equals(smartPhone.serialNumber);
    }

//    Se x.equals(y) == true, y.hashCode() == x.haschCode()
//    y.hashCode() == x.hashCode() não necessariamente o equals de y.equals(x) tem que ser true
//    x.equals(y) == false
//    y.hashCode() != x.hashCode() então x.equals(y) devera ser false
    @Override
    public int hashCode() {
        return serialNumber == null ? 0: this.serialNumber.hashCode();
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
