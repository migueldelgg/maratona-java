package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Objects;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
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
    // Reflexivo? x.equals(x) tem que ser true para tudo que for diferente de null
    // Simétrico: para x e y diferentes de null, se x.equals(y) == true, logo, y.equals(x) == true
    // Transitividade: para x,y,z diferentes de null, se x.equals(y) == true, e x.equals(z) == true, logo, y.equals(z) == true
    // para x diferente de null, x.equals(null) tem que retornar false
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
        // Nesse caso deve se tomar cuidado com a regra de negocio
        // Como voce considera que dois objetos são os mesmos?
        // Quando todos os atributos são iguais ? Ou quando apenas o id é igual? (nesse caso fizemos pelo serialNumber)
    }
}
