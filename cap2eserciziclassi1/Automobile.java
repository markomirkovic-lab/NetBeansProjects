package cap2eserciziclassi1;

/**
 *
 * @author Laurent Bonvin
 * @version 05.09.2022
 */
public class Automobile {
    
    
    public static final int MIN_CC = 500;
    public static final int MAX_CC = 3000;
    public static final int MIN_PORTS = 2;
    public static final double MIN_PRICE = 10000;

    private static int iterator=0;
    private int idAuto;
    private TipoAuto type;
    private String brand;
    private int displacement;
    private String model;
    private String color;
    private int ports;
    private String serialNumber;
    private int chilometers;
    private double price;
    private boolean roof;
    private boolean hook;

    public Automobile(String brand, String model, TipoAuto type) {
//        this.idAuto=Automobile.iterator;
//        Automobile.iterator++;
        // Post incremento, prima il valore di iterator viene assegnato a idAuto,
        // poi viene incrementato.
        this.idAuto = Automobile.iterator++;
        this.model = model;
        this.brand = brand;
        this.type = type;
        switch (type) {
            case CABRIO:
                this._setCabrio();
                break;
            case BERLINA:
                this._setBerlina();
                break;
            case PICKUP:
                this._setPickup();
                break;
            case LIMOUSINE:
                this._setLimousine();
                break;
            case GT:
                this._setGT();
                break;
            case SUV:
                this._setSUV();
                break;
            case CITYCAR:
                this._setCityCar();
                break;
        }

    }

    private void _setBerlina() {
        this.setPorts(4);
        this.setDisplacement(700);
        this.setColor("grigio");
        this.setSerialNumber("UNASSIGNED");
        this.setChilometers(0);
        this.setPrice(15000);
        this.roof = true;
        this.hook = false;

    }

    private void _setCabrio() {
        this.setPorts(4);
        this.setDisplacement(700);
        this.setColor("blu");
        this.setSerialNumber("UNASSIGNED");
        this.setChilometers(0);
        this.setPrice(20000);
        this.roof = false;
        this.hook = false;
    }

    private void _setPickup() {
        this.setPorts(MIN_PORTS);
        this.setDisplacement(2000);
        this.setColor("giallo");
        this.setSerialNumber("UNASSIGNED");
        this.setChilometers(0);
        this.setPrice(20000);
        this.roof = true;
        this.hook = true;
    }

    private void _setSUV() {
        this.setPorts(4);
        this.setDisplacement(1500);
        this.setColor("rosso");
        this.setSerialNumber("UNASSIGNED");
        this.setChilometers(0);
        this.setPrice(25000);
        this.roof = true;
        this.hook = false;
    }

    private void _setLimousine() {
        this.setPorts(6);
        this.setDisplacement(700);
        this.setColor("bianco");
        this.setSerialNumber("UNASSIGNED");
        this.setChilometers(0);
        this.setPrice(70000);
        this.roof = true;
        this.hook = false;
    }

    private void _setGT() {
        this.setPorts(MIN_PORTS);
        this.setDisplacement(MAX_CC);
        this.setColor("nero");
        this.setSerialNumber("UNASSIGNED");
        this.setChilometers(0);
        this.setPrice(300000);
        this.roof = true;
        this.hook = false;
    }

    private void _setCityCar() {
        this.setPorts(MIN_PORTS);
        this.setDisplacement(MIN_CC);
        this.setColor("verde");
        this.setSerialNumber("UNASSIGNED");
        this.setChilometers(0);
        this.setPrice(MIN_PRICE);
        this.roof = true;
        this.hook = false;
    }

    public int getIdAuto() {
        return idAuto;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        if (displacement >= MIN_CC && displacement <= MAX_CC) {
            this.displacement = displacement;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModello(String model) {
//        if (model.trim().length() > 0)
        if (!model.isBlank()) {
            this.model = model;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand.trim().length() > 0) {
            this.brand = brand;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.trim().length() > 0) {
            this.color = color;
        }
    }

    public int getPorts() {
        return ports;
    }

    public void setPorts(int ports) {
        if (ports >= MIN_PORTS) {
            this.ports = ports;
        }
    }

    public String getSerialNumber() {
        return serialNumber;
    }

//    public void setSerialNumber(String serialNumber) {
//        boolean hasNumber = false;
//        boolean hasLetter = false;
//        if (serialNumber.length() == 17) {
//            for (int i = 0; i < serialNumber.length(); i++) {
//                if (serialNumber.charAt(i) >= '0' && serialNumber.charAt(i) <= '9') {
//                    hasNumber = true;
//                } else if (serialNumber.toLowerCase().charAt(i) >= 'a' && serialNumber.toLowerCase().charAt(i) <= 'z') {
//                    hasLetter = true;
//                } else {
//                    break;
//                }
//
//            }
//            if (hasLetter && hasNumber) {
//                this.serialNumber = serialNumber;
//            }
//
//        }
//
//    }


    public void setSerialNumber(String serialNumber) {
    if (serialNumber.length() == 17) {
        String sn = serialNumber.toLowerCase();  // Converti una sola volta.
        // Definita prima del ciclo for, deve essere visibile anche dopo il ciclo.
        int i;

        for (i = 0; i < sn.length(); i++) {
            char ch = sn.charAt(i);

            // Termina se il carattere corrente ch non è né una cifra, né una lettera.
            if (ch < '0' || (ch > '9' && ch < 'a') || ch > 'z') break;
        }

        // Condizione vera solo se tutti i caratteri sono cifre o lettere.
        if (i >= sn.length()) this.serialNumber = serialNumber;
        }
    }
    
    
    //Se, invece, il codice deve contenere almeno un cifra e almeno una lettera,
    //implementa così:
//    public void setSerialNumber(String serialNumber) {
//    boolean hasNumber = false, hasLetter = false;
//
//    if (serialNumber.length() == 17) {
//        String sn = serialNumber.toLowerCase();  // Converti una sola volta.
//
//        for (int i = 0; i < sn.length(); i++) {
//            char ch = sn.charAt(i);
//
//            if (ch >= '0' && ch <= '9') hasNumber = true;
//            else if (ch >= 'a' && ch <= 'z') hasLetter = true;
//            else {
//                // Se abbiamo già trovato almeno una cifra e almeno una lettera,
//                // possiamo terminare immediatamente.
//                if (hasLetter && hasNumber) break;
//            }
//        }
//
//        if (hasLetter && hasNumber) {
//            this.serialNumber = serialNumber;
//        }
//        }
//    }
        
    
    public int getChilometers() {
        return chilometers;
    }

    public void setChilometers(int chilometers) {
        if (chilometers > 0) {
            this.chilometers = chilometers;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= MIN_PRICE) {
            this.price = price;
        }
    }
    
    
    @Override
    public String toString(){
        return "Caratteristiche auto:\nNr. Auto:\t"+this.idAuto+"\nMarca:\t"+this.brand+
                "\nModello:\t"+this.model+"\nTipo:\t"+this.type+"\nColore:\t"+this.color+
                "\nNr. Porte:\t"+this.ports+"\nCilindrata:\t"+this.displacement+" CC\n"
                + "Chilometri:\t"+this.chilometers+"\nPrezzo:\t"+this.price+"\n";
    }

}
