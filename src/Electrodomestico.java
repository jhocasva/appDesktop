public class Electrodomestico {

    private float precioBase;
    private String color;
    private float peso;
    private String tipo;
    private String consumoEnergetico;

    public Electrodomestico(String color,float peso,String consumoEnergetico){
        this.color = color;
        this.peso = peso;
        this.consumoEnergetico = consumoEnergetico;

    }

    public Electrodomestico(String color,float peso,String tipo,String consumoEnergetico){
        this.color = color;
        this.peso = peso;
        this.tipo = tipo;
        this.consumoEnergetico = consumoEnergetico;
    }

    public float getPrecioBase(){
        return precioBase;
    }

    //public void setPrecioBase(float precioBase){
       // this.precioBase = precioBase;
   // }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public float getPeso(){
        return peso;
    }

    public void setPeso(float peso){
      if(peso >= 0 ){
        this.peso = peso;
      }else{
          System.out.println("el peso es negativo");
      }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public boolean validarConsumoEnergitico(){
        if("abcdefABCDEF".contains(consumoEnergetico)){
            return  true;
        } else{
            return false;
        }
    }

    public boolean validarColor(){
        if("grisblanconegroazulGRISBLANCONEGROAZUL".contains(color)){
            return true;
        }else {
            return false;
        }
    }
// retorna 0 = no se puede calcular precio final por valores invalidos
    public float calcularPrecioFinal(){
        if(consumoEnergetico.equals("a") || consumoEnergetico.equals("A")){
            precioBase = 100;
        } else if (consumoEnergetico.equals("b") || consumoEnergetico.equals("B")){
            precioBase = 80;
        } else if(consumoEnergetico.equals("c") || consumoEnergetico.equals("C")){
            precioBase = 60;
        } else if(consumoEnergetico.equals("d") || consumoEnergetico.equals("D")){
            precioBase = 50;
        }else if(consumoEnergetico.equals("e") || consumoEnergetico.equals("E")){
            precioBase= 30;
        } else if(consumoEnergetico.equals("f") || consumoEnergetico.equals("F")){
            precioBase = 10;
        }else{
            return 0;
        }

        if(peso >= 0 && peso <= 19){
            precioBase = precioBase + 10;
        }else if(peso >= 20 && peso <= 49){
            precioBase= precioBase + 50;
        }else if(peso >= 50 && peso <= 79){
            precioBase = precioBase + 80;
        }else{
            precioBase = precioBase + 100;
        }
        return precioBase;

    }

    @Override
    public String toString(){
        String texto =  "el electrodomestico es de tipo: " + tipo + ", el precio del Electrodomestico es: " + precioBase + ", el color es "+ color + ", su peso es " + peso + " y su consumo energetico es: " + consumoEnergetico;
        return texto;
    }



}
