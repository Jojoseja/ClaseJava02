package cactus03;

/*Encapsulación*/

public class teoriaObjetos03 {
    public class Coche{
        /*
        Al poner los atributos privados no pueden ser modificados directamente,
        se requiere de un metodo para modificarlo
        */
        private String marca;
        private String modelo;
        private int cv;

        /*Getter*/
        public String getMarca(){
            return marca;
        }
        public String getModelo(){
            return modelo;
        }
        public int getCv(){
            return cv;
        }
        /*Setter*/

        public void setMarca(String marca) {
            this.marca = marca;
        }
        public void setModelo(String modelo) {
            this.modelo = modelo;
        }
        public void setCv(int cv) {
            this.cv = cv;
        }
    }
}
