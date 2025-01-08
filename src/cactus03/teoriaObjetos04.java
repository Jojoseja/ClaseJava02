package cactus03;

public class teoriaObjetos04 {
    //Un constructor sirve para establecer una forma de crear un objeto
    public class Coche{
        String marca;
        String modelo;
        int cv;

         public Coche(String marca, String modelo, int cv){
            this.marca = marca;
            this.modelo = modelo;
            this.cv = cv;
        }

    }
    public void main(String[] args) {
        Coche ob1 = new Coche("Ford", "Mustang", 200);
        System.out.println(ob1.marca);
        System.out.println(ob1.modelo);
        System.out.println(ob1.cv);
    }


}
